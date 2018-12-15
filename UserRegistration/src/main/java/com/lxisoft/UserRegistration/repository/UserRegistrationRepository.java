package com.lxisoft.UserRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lxisoft.UserRegistration.model.UserRegistration;

public interface UserRegistrationRepository extends JpaRepository<UserRegistration, Integer> {

}
