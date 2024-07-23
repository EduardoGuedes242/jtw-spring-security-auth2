package com.eguedes.jwt.service.user;

import com.eguedes.jwt.domain.user.User;
import com.eguedes.jwt.repository.user.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

  private UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public List<User> getAllUsers() {
    return userRepository.findAll();
  }

  public void createNewUser(User user) {
    userRepository.save(user);
  }

}
