package com.berg.repository;

import org.springframework.data.repository.CrudRepository;

import com.berg.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
