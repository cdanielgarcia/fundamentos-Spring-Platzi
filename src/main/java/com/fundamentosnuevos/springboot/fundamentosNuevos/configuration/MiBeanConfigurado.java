package com.fundamentosnuevos.springboot.fundamentosNuevos.configuration;

import com.fundamentosnuevos.springboot.fundamentosNuevos.bean.MiBean;
import com.fundamentosnuevos.springboot.fundamentosNuevos.bean.MiBean2Implementado;
import com.fundamentosnuevos.springboot.fundamentosNuevos.bean.MiBeanImplementado;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MiBeanConfigurado {

//    @Bean
//    public MiBean beanOperacion(){
//        return new MiBeanImplementado();
//    }

    // estoy instanciando MiBean2Implementado
    @Bean
    public MiBean beanOperation2(){
        return new MiBean2Implementado();
    }
}
