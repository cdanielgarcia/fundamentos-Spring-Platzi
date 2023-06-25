package com.fundamentosnuevos.springboot.fundamentosNuevos.service;


import com.fundamentosnuevos.springboot.fundamentosNuevos.entity.User;
import com.fundamentosnuevos.springboot.fundamentosNuevos.repository.UserRepository;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserService {
    private final Log LOG = LogFactory.getLog(UserService.class);

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // se utiliza para hacer rollback si no quiero tener registros a nivel de bd
    // si no estuviera, si se registran los datos
    @Transactional
    public void saveTransaction(List<User> users){
        users.stream()
                .peek(user -> LOG.info("usuario insertado" + user))
                .forEach(userRepository::save);

    }

    public List<User> getListUser(){
        return userRepository.findAll();
    }
}
