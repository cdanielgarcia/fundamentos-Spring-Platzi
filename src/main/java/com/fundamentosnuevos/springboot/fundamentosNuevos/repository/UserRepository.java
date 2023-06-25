package com.fundamentosnuevos.springboot.fundamentosNuevos.repository;

import com.fundamentosnuevos.springboot.fundamentosNuevos.dto.UserDto;
import com.fundamentosnuevos.springboot.fundamentosNuevos.entity.User;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("Select u from User u where u.email=?1")
    Optional<User> findByUserEmail(String email);

    @Query("Select u from User u where u.name like ?1%")
    List<User> findAndSort(String name,Sort sort);

//   @Query("Select u from User u where u.name like ?1%")
      List<User> findByName(String name);

//    @Query("Select u from User u where u.name=?1 and u.email=?1")

    Optional<User> findByNameAndEmail(String name, String email);


    List<User> findByNameLike(String name);

    List<User> findByEmailLike(String email);


    List<User> findByNameOrEmail(String name, String email);

    List<User> findBybirthDayBetween(LocalDate begin, LocalDate end);

    //List<User> findByNameLikeOrderByIdDesc(String name);

    List<User> findByNameContainingOrderByIdDesc(String name);

    @Query("Select new com.fundamentosnuevos.springboot.fundamentosNuevos.dto.UserDto(u.id, u.name, u.birthDay)" +
            " From User u" +
            " where u.birthDay=:parametroFecha " +
            " and u.email=:parametroEmail ")
    Optional<UserDto> getAllBybirthDayAndEmail(@Param("parametroFecha")LocalDate date, @Param("parametroEmail")String email);





}
