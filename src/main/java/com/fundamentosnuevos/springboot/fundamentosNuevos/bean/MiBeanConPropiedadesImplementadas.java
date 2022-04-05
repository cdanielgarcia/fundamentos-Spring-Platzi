package com.fundamentosnuevos.springboot.fundamentosNuevos.bean;

public class MiBeanConPropiedadesImplementadas implements MiBeanConPropiedades{

    private String name;
    private String apellido;
    private int a;
    private int b;

    public MiBeanConPropiedadesImplementadas(String name, String apellido) {
        this.name = name;
        this.apellido = apellido;

    }


    @Override
    public String function() {

        return name + "---" + apellido ;
    }



}
