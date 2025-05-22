package notice.controller;

import lombok.RequiredArgsConstructor;
import notice.dto.User;
import notice.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

  private final UserRepository userRepository;
  private final PasswordEncoder passwordEncoder;

  @PostMapping("/signup")
  public ResponseEntity<?> signup(@RequestBody User user) {
    System.out.println(user);
//    user.setPassword(passwordEncoder.encode(user.getPassword()));
//    userRepository.save(user);
    return ResponseEntity.ok("회원가입 성공");
  }
}
