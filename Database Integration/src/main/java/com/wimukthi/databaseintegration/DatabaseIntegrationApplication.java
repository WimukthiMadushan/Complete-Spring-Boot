package com.wimukthi.databaseintegration;

import com.wimukthi.databaseintegration.models.Address;
import com.wimukthi.databaseintegration.models.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabaseIntegrationApplication {

    public static void main(String[] args) {
        //SpringApplication.run(DatabaseIntegrationApplication.class, args);

        var user = User.builder()
                .email("Email")
                .password("Password")
                .name("Name")
                .build();

        var address = Address.builder()
                .street("street")
                .city("city")
                .state("state")
                .zip("zipcode")
                .build();

        user.addAddress(address);
        System.out.println(user);

    }

}
