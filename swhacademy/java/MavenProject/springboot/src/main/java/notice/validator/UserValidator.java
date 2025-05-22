package notice.validator;

import lombok.RequiredArgsConstructor;
import notice.dto.User;
import notice.repository.UserRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class UserValidator {
  private final UserRepository userRepository;

  public void validdateForSignup(User user) {
    List<String> errors = new ArrayList<>();
    if (user.getId() == null || user.getId().isBlank()) {
      errors.add("아이디를 입력하세요.");
    } else if (userRepository.existsById(user.getId())) {
      
    }
  }
}
