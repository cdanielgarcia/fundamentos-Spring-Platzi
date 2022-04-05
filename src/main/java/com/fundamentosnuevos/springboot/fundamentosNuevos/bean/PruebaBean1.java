package com.fundamentosnuevos.springboot.fundamentosNuevos.bean;


public class PruebaBean1 implements BeanPrueba{

    @Override
    public void prueba() {
        System.out.println("hola desde mi prueba");
    }
}
