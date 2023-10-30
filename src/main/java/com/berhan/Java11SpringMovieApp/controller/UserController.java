package com.berhan.Java11SpringMovieApp.controller;

import com.berhan.Java11SpringMovieApp.dto.request.UserRegisterDto;
import com.berhan.Java11SpringMovieApp.repository.entity.User;
import com.berhan.Java11SpringMovieApp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
   "UserRepository" ve "UserService"
   katmanlarını yazalim.Bir register(kayit)
   islemi gerceklestirelim.kullanicidan alinmasi gereken veriler;
   name, surname, email, passwordBu verileri DB'de bir kullanici olusturmak icin kullanalim.

   bir request dto olusturalım

   register methodunun mapperini olusturalım
  */
@RestController
@RequestMapping("/usercontroller")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @GetMapping("/save")
    public ResponseEntity<User> createUser(String name, String surname, String email,String password){
        return ResponseEntity.ok(service.createUser(name,surname,email,password));
        //parametre içine @RequiredParam() anatasyonunu kullanmak istediğimiz parametreden önce yazarak
        //gerekli özelleştirmeleri yapabilirz
    }

    @GetMapping("/register")
    public ResponseEntity<User> register(UserRegisterDto dto){
        return ResponseEntity.ok(service.register(dto));
    }

    @PostMapping("/register2")
    public ResponseEntity<User> register2(@RequestBody UserRegisterDto dto) {
        return ResponseEntity.ok(service.register2(dto));


    }

    @GetMapping("/findAllByOrderByName")
    public ResponseEntity<List<User>> findAllByOrderByName(){
        return ResponseEntity.ok(service.findAllByOrderByName());
    }

    
}
