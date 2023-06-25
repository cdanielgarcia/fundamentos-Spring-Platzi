package com.fundamentosnuevos.springboot.fundamentosNuevos.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "ciudad")
public class Ciudad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_post", nullable = false, unique = true)
    private Long id;
    @Column(name="descripcion", length = 255)
    private String descripcion;
    @Column(name= "habitantes")
    private Integer habitantes;

    @ManyToOne
    private Departamento departamento;


}
