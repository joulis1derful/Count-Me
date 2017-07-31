package com.joulis1derful.countme.repository;

import com.joulis1derful.countme.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
