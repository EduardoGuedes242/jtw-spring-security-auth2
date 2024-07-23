package com.eguedes.jwt.repository.user;

import com.eguedes.jwt.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
