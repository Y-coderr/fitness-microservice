package com.fitness.userservice.controller;

import com.fitness.userservice.UserRepository;
import com.fitness.userservice.dto.RegisterRequest;
import com.fitness.userservice.dto.UserResponse;
import com.fitness.userservice.services.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")   // defines base url for all the requests within this controller
@AllArgsConstructor   //Lombok annotation It automatically generates a constructor with parameters for all fields.
public class UserController {
    private UserService userService;

    @GetMapping("/{userId}")
    public ResponseEntity<UserResponse> getUserProfile(@PathVariable String userId){
         return ResponseEntity.ok(userService.getUserProfile(userId));
    }


    @PostMapping("/register")
    public ResponseEntity<UserResponse> register( @Valid @RequestBody RegisterRequest request){
        return ResponseEntity.ok(userService.register(request));
    }

}
