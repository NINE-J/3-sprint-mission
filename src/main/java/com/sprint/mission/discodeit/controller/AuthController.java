package com.sprint.mission.discodeit.controller;

import com.sprint.mission.discodeit.dto.request.LoginRequest;
import com.sprint.mission.discodeit.dto.response.UserResponse;
import com.sprint.mission.discodeit.service.AuthService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Auth", description = "인증 API")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {

  private final AuthService authService;

  @Operation(summary = "로그인")
  @ApiResponses(value = {
      @ApiResponse(
          responseCode = "200",
          description = "로그인 성공",
          content = @Content(schema = @Schema(implementation = UserResponse.class))
      ),
      @ApiResponse(
          responseCode = "400",
          description = "비밀번호가 일치하지 않음",
          content = @Content(examples = @ExampleObject(value = "Wrong password"))
      ),
      @ApiResponse(
          responseCode = "404",
          description = "사용자를 찾을 수 없음",
          content = @Content(examples = @ExampleObject(value = "User with username {username} not found"))
      )
  })
  @PostMapping("/login")
  public ResponseEntity<UserResponse> login(@RequestBody LoginRequest request) {
    UserResponse response = authService.login(request);
    return ResponseEntity.ok(response);
  }
}
