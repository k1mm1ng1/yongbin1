package com.dion.todo.domain.auth.domain.repository;

import com.dion.todo.domain.auth.domain.Auth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthRepository extends JpaRepository<Auth,Long> {
}
