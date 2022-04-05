package com.fundamentosnuevos.springboot.fundamentosNuevos.component;

import org.springframework.stereotype.Component;

@Component
public class ImplementaSegundoComponente implements ComponenteDependencia{
    @Override
    public void saluda() {
        System.out.println("hola michael");
    }
}
