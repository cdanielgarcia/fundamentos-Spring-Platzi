package com.fundamentosnuevos.springboot.fundamentosNuevos.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table (name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_post", nullable = false, unique = true)
    private Long id;
    @Column(name="descripcion", length = 255)
    private String descripcion;

    @ManyToOne
    private User user;
}



