package com.fundamentosnuevos.springboot.fundamentosNuevos.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties(prefix = "user")
@Getter
@Setter
@AllArgsConstructor

public class UserPojo {
    private String email;
    private String password;
    private int age;

}
