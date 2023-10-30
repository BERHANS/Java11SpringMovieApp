package com.berhan.Java11SpringMovieApp.repository;

import com.berhan.Java11SpringMovieApp.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

    List<User> findAllByOrderByName();
}
