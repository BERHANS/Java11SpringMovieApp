package com.berhan.Java11SpringMovieApp.service;

import com.berhan.Java11SpringMovieApp.dto.request.UserRegisterDto;
import com.berhan.Java11SpringMovieApp.mapper.RegisterMapper;
import com.berhan.Java11SpringMovieApp.repository.UserRepository;
import com.berhan.Java11SpringMovieApp.repository.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public User createUser(String name, String surname, String email,String password){
       return repository.save(User.builder()
                        .password(password)
                        .email(email)
                        .surname(surname)
                        .name(name)
                .build());

    }

    public User register(UserRegisterDto dto) {
        return repository.save(User.builder()
                        .name(dto.getName())
                        .surname(dto.getSurname())
                        .email(dto.getEmail())
                        .password(dto.getPassword())
                .build());
    }

    public User register2( UserRegisterDto dto) {
        User user = RegisterMapper.INSTANCE.userFromDto(dto);
        return repository.save(user);
    }

    public List<User> findAllByOrderByName(){
        return repository.findAllByOrderByName();
    }
}
