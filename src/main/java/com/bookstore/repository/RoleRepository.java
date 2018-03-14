package com.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.domain.security.UserRole;

public interface RoleRepository extends CrudRepository<UserRole, Long> {

}
