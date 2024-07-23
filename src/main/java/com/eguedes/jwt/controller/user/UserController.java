package com.eguedes.jwt.controller.user;

import com.eguedes.jwt.domain.user.User;
import com.eguedes.jwt.repository.user.UserRepository;
import com.eguedes.jwt.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
  @Autowired
  private UserService userService;

  @GetMapping
  public List<User> getAllUsers() {
    return userService.getAllUsers();
  }

  @PostMapping
  public String createNewUser(@RequestBody User body) {
    userService.createNewUser(body);
    return "Usuario criado com sucesso";
  }


}
