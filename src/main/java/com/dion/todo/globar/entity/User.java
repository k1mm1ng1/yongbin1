package com.dion.todo.globar.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;

    private String password;
    private String name;

    // 1:N 관계로 설정된 투두 리스트
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Todo> todos;
}
