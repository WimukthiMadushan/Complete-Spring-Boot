package com.wimukthi.databaseintegration.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,name="id")
    private long id;
    @Column(name="street")
    private String street;
    @Column(name="city")
    private String city;
    @Column(name="zip")
    private String zip;
    @Column(name="state")
    private String state;
}
