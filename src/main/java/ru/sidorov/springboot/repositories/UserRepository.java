package ru.sidorov.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sidorov.springboot.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
