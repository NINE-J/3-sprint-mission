package com.sprint.mission.discodeit.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sprint.mission.discodeit.controller.api.AuthApi;
import com.sprint.mission.discodeit.dto.request.LoginRequest;
import com.sprint.mission.discodeit.dto.response.UserResponse;
import com.sprint.mission.discodeit.service.AuthService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController implements AuthApi {

  private final AuthService authService;

  @PostMapping("/login")
  public ResponseEntity<UserResponse> login(@RequestBody @Valid LoginRequest request) {
    UserResponse response = authService.login(request.username(), request.password());
    return ResponseEntity.ok(response);
  }
}
