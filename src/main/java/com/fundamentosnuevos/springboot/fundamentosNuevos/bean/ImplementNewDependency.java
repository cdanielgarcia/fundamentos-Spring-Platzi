package com.fundamentosnuevos.springboot.fundamentosNuevos.bean;

public class ImplementNewDependency implements NewDependency{

    private OperacionSuma operacionSuma;

    public ImplementNewDependency(OperacionSuma operacionSuma) {
        this.operacionSuma = operacionSuma;
    }

    @Override
    public void printNewWithDependency() {
        int num = 5;
        int num2 = 3;
        int resul = num * num2;
        System.out.println(operacionSuma.sum(resul));
        System.out.println("hola desde la implementacion de dependencia ");
    }
}
