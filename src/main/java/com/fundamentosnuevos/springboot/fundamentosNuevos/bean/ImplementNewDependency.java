package com.fundamentosnuevos.springboot.fundamentosNuevos.bean;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;

public class ImplementNewDependency implements NewDependency{

    Log LOGGER = LogFactory.getLog(ImplementNewDependency.class);

    private OperacionSuma operacionSuma;

    public ImplementNewDependency(OperacionSuma operacionSuma) {
        this.operacionSuma = operacionSuma;
    }

    @Override
    public void printNewWithDependency() {
        LOGGER.info("hemos ingresado al metodo de resultados numericos");
        int num = 5;
        int num2 = 3;
        int resul = num * num2;
        LOGGER.debug("el numero o resultado es: "+ resul);
        System.out.println(operacionSuma.sum(resul));
        System.out.println("hola desde la implementacion de dependencia ");
    }
}
