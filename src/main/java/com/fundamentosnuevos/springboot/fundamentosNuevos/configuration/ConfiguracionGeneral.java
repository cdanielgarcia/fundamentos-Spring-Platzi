package com.fundamentosnuevos.springboot.fundamentosNuevos.configuration;

import com.fundamentosnuevos.springboot.fundamentosNuevos.bean.MiBeanConPropiedades;
import com.fundamentosnuevos.springboot.fundamentosNuevos.bean.MiBeanConPropiedadesImplementadas;
import com.fundamentosnuevos.springboot.fundamentosNuevos.pojo.UserPojo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(UserPojo.class)

public class ConfiguracionGeneral {
    @Value("${value.name}")
    private String name;

    @Value("${value.apellido}")
    private String apellido;


    @Value("${value.random}")
    private String random;

    @Bean
    public MiBeanConPropiedades function(){
        return new MiBeanConPropiedadesImplementadas(name, apellido);
    }



}
