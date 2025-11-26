package com.wimukthi.databaseintegration.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="profiles")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "bio")
    private String bio;
    @Column(name = "phone_number")
    private String phone_number;
    @Column(name = "date_of_birth")
    private String date_of_birth;
    @Column(name = "loyalty_points")
    private int loyalty_points;

}
