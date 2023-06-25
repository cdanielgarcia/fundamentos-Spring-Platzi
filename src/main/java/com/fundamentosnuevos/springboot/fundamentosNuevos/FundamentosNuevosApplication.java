package com.fundamentosnuevos.springboot.fundamentosNuevos;

import com.fundamentosnuevos.springboot.fundamentosNuevos.bean.*;
import com.fundamentosnuevos.springboot.fundamentosNuevos.component.ComponenteDependencia;
import com.fundamentosnuevos.springboot.fundamentosNuevos.entity.Ciudad;
import com.fundamentosnuevos.springboot.fundamentosNuevos.entity.Departamento;
import com.fundamentosnuevos.springboot.fundamentosNuevos.entity.User;
import com.fundamentosnuevos.springboot.fundamentosNuevos.pojo.UserPojo;
import com.fundamentosnuevos.springboot.fundamentosNuevos.repository.DepartamentoRepository;
import com.fundamentosnuevos.springboot.fundamentosNuevos.repository.PostRepository;
import com.fundamentosnuevos.springboot.fundamentosNuevos.repository.UserRepository;
import com.fundamentosnuevos.springboot.fundamentosNuevos.service.UserService;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class FundamentosNuevosApplication implements CommandLineRunner {

	private final Log LOGGER = LogFactory.getLog(FundamentosNuevosApplication.class);


	private ComponenteDependencia componenteDependencia;
	private MiBean miBean;
	private BeanPrueba beanPrueba;
	private NewDependency newDependency;
	private MiBeanConPropiedades miBeanConPropiedades;
	private UserPojo userPojo;
	private UserRepository userRepository;

	private UserService userService;



	public FundamentosNuevosApplication (@Qualifier("implementaSegundoComponente") ComponenteDependencia componenteDependencia,
										 MiBean miBean, BeanPrueba beanPrueba, NewDependency newDependency,
										 MiBeanConPropiedades miBeanConPropiedades, UserPojo userPojo, UserRepository userRepository,
										 UserService userService){
		this.componenteDependencia = componenteDependencia;
		this.miBean = miBean;
		this.beanPrueba = beanPrueba;
		this.newDependency = newDependency;
		this.miBeanConPropiedades = miBeanConPropiedades;
		this.userPojo = userPojo;
		this.userRepository = userRepository;
		this.userService = userService;
	}


	public static void main(String[] args) {
		SpringApplication.run(FundamentosNuevosApplication.class, args);
        Algoritmo prueba = new Algoritmo();
        //System.out.println("el factorial es: "+prueba.factorial(4));
		//System.out.println("el fibonacci es: "+prueba.fibonacci(3));
	}

	@Override
	public void run(String... args) throws Exception {
//		ejemplosAnteriores();
		saveUsersDatabase();
		//saveCityDatabase();
		getInformationJpqlFromUser();
		//getInfoDepartamentoJpql();
		saveWithErrorTransaction();


	}

	private void getInformationJpqlFromUser(){
		/*LOGGER.info("finByUserEmail "+userRepository.findByUserEmail("daniela@domain.com")
				.orElseThrow(()->new RuntimeException("no se encontro el usuario")));

		userRepository.findAndSort("Carl",Sort.by("id").descending())
				.stream()
				.forEach(user-> LOGGER.info("findAndSort " + user));

		userRepository.findByName("Carlos")
				.stream()
				.forEach(user-> LOGGER.info("findByName " + user));

		LOGGER.info(userRepository.findByNameAndEmail("Karen","karen@domain.co")
				.orElseThrow(()-> new RuntimeException("no se encontro usuario")));

		userRepository.findByNameLike("%a%")
				.stream()
				.forEach(user -> LOGGER.info("findByNameLike " + user));

		userRepository.findByEmailLike("%.com%")
				.stream()
				.forEach(user -> LOGGER.info("findByEmailLike " + user));

		userRepository.findByNameOrEmail(null, "daniela@domain.com")
				.stream()
				.forEach(user -> LOGGER.info("usuario con or " + user));*/

		userRepository.findBybirthDayBetween(LocalDate.of(2021, 02, 10), LocalDate.of(2021, 04, 15))
				.stream()
				.forEach(user -> LOGGER.info(("birthday "+ user)));

		userRepository.findByNameContainingOrderByIdDesc("Carl")
				.stream()
				.forEach(user -> LOGGER.info("userIDesc"+ user));

		LOGGER.info("usuario "+ userRepository.getAllBybirthDayAndEmail(LocalDate.of(2021, 7, 7), "carlos@domain.com")
				.orElseThrow(() -> new RuntimeException("no se encontraron los datos")));
	}

    /*private void getInfoDepartamentoJpql(){
		departamentoRepository.findBySalde(45.000)
				.stream()
				.forEach(departamento -> LOGGER.info("Valor encontrado: " + departamento));
    }*/

	private void saveWithErrorTransaction(){
		User test1 = new User("TestTransactional1", "TestTransactional1@domain.com", LocalDate.now());
		User test2 = new User("TestTransactional2", "TestTransactional2@domain.com", LocalDate.now());
		User test3 = new User("TestTransactional3", "TestTransactional1@domain.com", LocalDate.now());
		User test4 = new User("TestTransactional4", "TestTransactional4@domain.com", LocalDate.now());

		List<User> users = Arrays.asList(test1, test2, test3, test4);
        try {
            userService.saveTransaction(users);
        }catch (Exception e){
            LOGGER.error("esto es una excepcion dentro de transaction "+ e);
        }
		userService.getListUser().stream()
				.forEach(user -> LOGGER.info("usuario transaction " + user));
	}
	private void saveUsersDatabase(){
		User user1 = new User("John", "john@domain.com", LocalDate.of(2021, 3, 13));
		User user2 = new User("Carl", "marco@domain.co", LocalDate.of(2021, 12, 8));
		User user3 = new User("Daniela", "daniela@domain.com", LocalDate.of(2021, 9, 8));
		User user4 = new User("Carl", "marilos@domain.com", LocalDate.of(2021, 6, 18));
		User user5 = new User("Karen", "karen@domain.co", LocalDate.of(2021, 1, 1));
		User user6 = new User("Carl", "carlos@domain.com", LocalDate.of(2021, 7, 7));
		User user7 = new User("Enrique", "enrilos@domain.com", LocalDate.of(2021, 11, 12));
		User user8 = new User("Luis", "luis@domain.co", LocalDate.of(2021, 2, 27));
		User user9 = new User("Maola", "paola@domain.co", LocalDate.of(2021, 4, 10));
		List<User> list = Arrays.asList(user1,user2,user3,user4,user5,user6,user7,user8,user9);
		list.forEach(userRepository::save);
	}

    /*private void saveCityDatabase(){
        Departamento one = new Departamento("tolima", 450000, 45.000);
        Departamento two = new Departamento("amazonas", 750000, 15.000);
        Departamento three = new Departamento("arauca", 250000, 27.000);
        Departamento four = new Departamento("manizales", 660000, 75.000);
        Departamento five = new Departamento("antioquia", 890000, 115.000);
		List<Departamento> listD = Arrays.asList(one,two,three,four,five);
		listD.forEach(departamentoRepository::save);

    }*/

	private void ejemplosAnteriores(){
		componenteDependencia.saluda();
		miBean.print();
		beanPrueba.prueba();
		newDependency.printNewWithDependency();
		System.out.println(miBeanConPropiedades.function());
		System.out.println(userPojo.getEmail() + "--"+ userPojo.getPassword() +"--"+ userPojo.getAge());

		//profundizar dentro del curso lo que son las excepciones
		try{
			//error
			int value = 5/0;
			LOGGER.debug("mi valor es: "+ value);
		}catch(Exception e){
			LOGGER.error("esto es un error" + e.getStackTrace());
		}
	}



}
