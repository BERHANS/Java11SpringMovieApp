package com.berhan.Java11SpringMovieApp.repository.entity;

import com.berhan.Java11SpringMovieApp.repository.enums.EUserType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tbl_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String name;
    @Column(length = 50)
    private String surname;
    @Column(length = 50)
    private String email;
    @Column(length = 15)
    private String phone;
    @Column(length = 32)
    private String password;
    @Enumerated(EnumType.STRING)
    @Builder.Default
    private EUserType userType = EUserType.USER;
    @ElementCollection
    private List<Long> favMovieId;
    @ElementCollection
    private List<Long> favGenre;
    @ElementCollection
    private List<Long> comments;



}
