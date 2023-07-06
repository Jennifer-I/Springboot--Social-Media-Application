package com.jennifer.controllers;

import com.jennifer.entity.FbUser;
import com.jennifer.repositories.UserRepository;
import com.jennifer.services.UserService;
import com.jennifer.services.implementation.PostServiceImpl;
import com.jennifer.services.implementation.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/SignUp")
public class UserController {
    private final UserRepository userRepository;
    private final UserServiceImpl userServiceImpl;

    private final PostServiceImpl postService;


    public UserController(UserRepository userRepository, UserServiceImpl userServiceImpl, PostServiceImpl postService) {
        this.userRepository = userRepository;
        this.userServiceImpl = userServiceImpl;
        this.postService = postService;
    }
    @GetMapping("SignUp")
    public String ShowForm(Model model){
        model.addAttribute("FbUser", new FbUser());
        return "SignUp";
    }
    @PostMapping("/SignUp")
    public String createUser(@ModelAttribute("user") FbUser user){
        userRepository.;
        return "SignUp";
    }
}
