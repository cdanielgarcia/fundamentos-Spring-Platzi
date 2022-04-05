package com.fundamentosnuevos.springboot.fundamentosNuevos.bean;

public class ImplementaSuma implements OperacionSuma{
    @Override
    public int sum(int number) {
        return number + 1;
    }
}
