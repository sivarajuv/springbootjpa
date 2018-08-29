package com.siva.springboot.jpa.springbootjpa;

import java.io.IOException;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.siva.springboot.jpa.domain.User;
import com.siva.springboot.jpa.service.UserService;

@SpringBootApplication(scanBasePackages={"com.siva.springboot.jpa","com.siva.springboot.jpa.domain","com.siva.springboot.jpa.service","com.siva.springboot.jpa.service.impl","com.siva.springboot.jpa.dao","com.siva.springboot.jpa.dao.impl"})
public class SpringbootjpaApplication implements CommandLineRunner {
 
    @Autowired
    UserService userService;
 
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringbootjpaApplication.class);
        app.run(args);
    }
 
    @Override
    public void run(String... arg0) throws IOException, URISyntaxException {
        User user = this.userService.findById(1);
        System.out.println("User Details: " + user.getId() + ", " + user.getName()+ ", " + user.getPassword()+ ", " + user.getGender()+ ", " + user.getCountry());
        User user2 = this.userService.findById(2);
        System.out.println("User Details: " + user2.getId() + ", " + user2.getName()+ ", " + user2.getPassword()+ ", " + user2.getGender()+ ", " + user2.getCountry());
        User user3 = this.userService.findById(3);
        System.out.println("User Details: " + user3.getId() + ", " + user3.getName()+ ", " + user3.getPassword()+ ", " + user3.getGender()+ ", " + user.getCountry());
        User user4 = this.userService.findById(4);
        System.out.println("User Details: " + user4.getId() + ", " + user4.getName()+ ", " + user4.getPassword()+ ", " + user4.getGender()+ ", " + user4.getCountry());
        User user5 = this.userService.findById(5);
        System.out.println("User Details: " + user5.getId() + ", " + user5.getName()+ ", " + user5.getPassword()+ ", " + user5.getGender()+ ", " + user5.getCountry());
    }
}
