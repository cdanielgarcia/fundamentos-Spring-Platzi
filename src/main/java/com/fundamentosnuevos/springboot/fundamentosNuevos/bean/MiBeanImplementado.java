package com.fundamentosnuevos.springboot.fundamentosNuevos.bean;


public class MiBeanImplementado implements MiBean{
    @Override
    public void print(){
        System.out.println("mi bean implementado");
    }
}
