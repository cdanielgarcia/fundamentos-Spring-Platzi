package com.fundamentosnuevos.springboot.fundamentosNuevos.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

    @Getter
    @Setter
    @NoArgsConstructor
    @ToString
    @Entity
    @Table(name = "departamento")
    public class Departamento {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "id_user", nullable = false, unique = true)
        private Long id;

        @Column(length = 50)
        private String name;

        @Column(name= "habitantes")
        private Integer habitantes;

        @Column
        private Double salde;

        public Departamento(String name, Integer habitantes, Double salde) {
            this.name = name;
            this.habitantes = habitantes;
            this.salde = salde;
        }

        @OneToMany(mappedBy = "departamento", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
        @JsonManagedReference
        private List<Ciudad> ciudades = new ArrayList<>();



    }

