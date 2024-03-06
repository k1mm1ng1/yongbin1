package com.dion.todo.domain.auth.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_auth")
@Builder
@Getter
public class Auth {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    @Column(nullable = false)
    private String id;
    @Column(nullable = false)
    private String pw;

}
