package notice.excaption;

import java.util.List;

public class ValidationException extends RuntimeException {
  private final List<String> errors;

  public ValidationException(List<String> errors) {
    super("입력값 오류가 발생했습니다.");
    this.errors = errors;
  }

  public List<String> getErrors() {
    return this.errors;
  }
}
