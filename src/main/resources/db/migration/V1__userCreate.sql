DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`
(
    `id`            bigint       NOT NULL AUTO_INCREMENT,
    `first_name`    varchar(50)  NOT NULL,
    `last_name`     varchar(50)  NOT NULL,
    `email`         varchar(100) NOT NULL UNIQUE,
    `password_hash` varchar(64)  NOT NULL,
    `created_at`    timestamp(6),
    PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `course`;
CREATE TABLE `course`
(
    `id`              bigint(20)   NOT NULL AUTO_INCREMENT,
    `name`            varchar(100) NOT NULL,
    `instructor_name` varchar(100) NOT NULL,
    `course_number`   varchar(100) NOT NULL,
    `created_at`      timestamp,
    PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `note`;
CREATE TABLE `note`
(
    `id`         bigint(20)   NOT NULL AUTO_INCREMENT,
    `name`       varchar(100) NOT NULL,
    `status`     int          NOT NULL,
    `data`       json         NOT NULL,
    `owner_id`   bigint(20)   NOT NULL,
    `course_id`  bigint(20)   NOT NULL,
    `created_at` timestamp,
    FOREIGN KEY (`course_id`) REFERENCES `course` (`id`),
    FOREIGN KEY (`owner_id`) REFERENCES `user` (`id`),
    PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `note_role`;
CREATE TABLE `note_role`
(
    `id`   bigint(20)   NOT NULL AUTO_INCREMENT,
    `role` varchar(100) NOT NULL,
    PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `user_note`;
CREATE TABLE `user_note`
(
    `user_id`    bigint(20) NOT NULL,
    `note_id`    bigint(20) NOT NULL,
    `role_id`    bigint(20) NOT NULL,
    `created_at` timestamp,
    FOREIGN KEY (`role_id`) REFERENCES `note_role` (`id`),
    FOREIGN KEY (`note_id`) REFERENCES `note` (`id`),
    FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
    PRIMARY KEY (`user_id`, `note_id`)
);

CREATE UNIQUE INDEX UK_user_email_unique
    ON user (email);