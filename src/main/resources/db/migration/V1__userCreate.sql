DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
                        `id` bigint(20) NOT NULL AUTO_INCREMENT,
                        `first_name` varchar(50) NOT NULL,
                        `email` varchar(100) NOT NULL UNIQUE,
                        `password_hash` varchar(64) NOT NULL,
                        `created_at` timestamp,
                        PRIMARY KEY (`id`)
);