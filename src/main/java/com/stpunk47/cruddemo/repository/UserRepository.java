package com.stpunk47.cruddemo.repository;

import com.stpunk47.cruddemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
