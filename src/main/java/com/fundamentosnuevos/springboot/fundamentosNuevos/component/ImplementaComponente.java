package com.fundamentosnuevos.springboot.fundamentosNuevos.component;

import org.springframework.stereotype.Component;

@Component
public class ImplementaComponente implements ComponenteDependencia {
    @Override
    public void saluda() {
        System.out.println("hola mundo desde mi componente");
    }
}
