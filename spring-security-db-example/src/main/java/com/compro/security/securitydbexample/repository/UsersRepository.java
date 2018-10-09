package com.compro.security.securitydbexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.compro.security.securitydbexample.model.Users;

import java.util.Optional;

/**
 * @author Robin-Pooppillikudiyil
 */
public interface UsersRepository extends JpaRepository<Users, Integer> {
	Optional<Users> findByName(String username);
}
