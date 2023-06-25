package com.fundamentosnuevos.springboot.fundamentosNuevos.repository;

import com.fundamentosnuevos.springboot.fundamentosNuevos.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
