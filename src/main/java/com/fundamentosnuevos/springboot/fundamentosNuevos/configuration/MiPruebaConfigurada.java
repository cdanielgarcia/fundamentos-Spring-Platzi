package com.fundamentosnuevos.springboot.fundamentosNuevos.configuration;

import com.fundamentosnuevos.springboot.fundamentosNuevos.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MiPruebaConfigurada {

    @Bean
    public BeanPrueba pruebaBean(){
        return new PruebaBean1();
    }

    @Bean
    public OperacionSuma sumaOpera(){
        return new ImplementaSuma();
    }

    @Bean
    public NewDependency beanOperationNewDependency(OperacionSuma operacionSuma){
        return new ImplementNewDependency(operacionSuma);
    }
}
