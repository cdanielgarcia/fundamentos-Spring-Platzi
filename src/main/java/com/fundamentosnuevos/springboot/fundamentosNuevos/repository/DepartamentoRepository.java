package com.fundamentosnuevos.springboot.fundamentosNuevos.repository;

import com.fundamentosnuevos.springboot.fundamentosNuevos.entity.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {


    //@Query("Select d from Departamento d where d.saldoPromedio=?1")
    //List<Departamento> findBySalde(Double salde);
}
