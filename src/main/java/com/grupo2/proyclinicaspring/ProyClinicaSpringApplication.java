package com.grupo2.proyclinicaspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class ProyClinicaSpringApplication implements CommandLineRunner {

    public static void main(String[] args) {


        SpringApplication.run(ProyClinicaSpringApplication.class, args)

        ;
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    public void run(String... args) throws Exception {

        String password = "12345";

        for(int i=0; i<2; i++) {
            String bcryptPassword = passwordEncoder().encode(password);
            System.out.println(bcryptPassword);
        }
    }


}
