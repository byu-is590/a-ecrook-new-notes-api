package edu.byuis590r.ecrooknewapi.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

//Gives you public getters and setters upon build thanks to Lombo boiler-plate coding
@Getter
@Setter
//In order to create instance of this object, create constructor with no paramaters
@NoArgsConstructor
//Requires args/params to call a specific constructor
@RequiredArgsConstructor
@Entity

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotEmpty(message = "first name is required")
    @NonNull
    @Column(length = 30)
    private String firstName;
}
