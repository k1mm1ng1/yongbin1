package com.dion.todo.globar.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;
    private boolean checked;

    // 유저와의 연관관계 설정
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // 투두 생성일자
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    // Getter and Setter
}