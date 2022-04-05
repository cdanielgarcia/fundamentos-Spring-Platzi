package com.fundamentosnuevos.springboot.fundamentosNuevos;

import com.fundamentosnuevos.springboot.fundamentosNuevos.bean.BeanPrueba;
import com.fundamentosnuevos.springboot.fundamentosNuevos.bean.MiBean;
import com.fundamentosnuevos.springboot.fundamentosNuevos.bean.MiBeanConPropiedades;
import com.fundamentosnuevos.springboot.fundamentosNuevos.bean.NewDependency;
import com.fundamentosnuevos.springboot.fundamentosNuevos.component.ComponenteDependencia;
import com.fundamentosnuevos.springboot.fundamentosNuevos.pojo.UserPojo;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@SpringBootApplication
public class FundamentosNuevosApplication implements CommandLineRunner {

	private ComponenteDependencia componenteDependencia;
	private MiBean miBean;
	private BeanPrueba beanPrueba;
	private NewDependency newDependency;
	private MiBeanConPropiedades miBeanConPropiedades;
	private UserPojo userPojo;


	public FundamentosNuevosApplication (@Qualifier("implementaSegundoComponente") ComponenteDependencia componenteDependencia,
										 MiBean miBean, BeanPrueba beanPrueba, NewDependency newDependency,
										 MiBeanConPropiedades miBeanConPropiedades, UserPojo userPojo){
		this.componenteDependencia = componenteDependencia;
		this.miBean = miBean;
		this.beanPrueba = beanPrueba;
		this.newDependency = newDependency;
		this.miBeanConPropiedades = miBeanConPropiedades;
		this.userPojo = userPojo;
	}


	public static void main(String[] args) {
		SpringApplication.run(FundamentosNuevosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		componenteDependencia.saluda();
		miBean.print();
		beanPrueba.prueba();
		newDependency.printNewWithDependency();
		System.out.println(miBeanConPropiedades.function());
		System.out.println(userPojo.getEmail() + "--"+ userPojo.getPassword() +"--"+ userPojo.getAge());




	}



}
