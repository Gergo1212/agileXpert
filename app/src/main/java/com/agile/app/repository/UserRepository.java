package com.agile.app.repository;

import com.agile.app.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Long, Person> {
}
