package notice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
  @Id
  private String uuid;
  @Column(unique = true, nullable = false)
  private String id;
  private String name;
  private String password;
  @Transient
  private String passwordCheck;
  @Column(nullable = false, updatable = false)
  private LocalDateTime createdAt;

  @PrePersist
  protected void onCreate() {
    if (this.uuid == null) {
      this.uuid = UUID.randomUUID().toString();
    }
    this.createdAt = LocalDateTime.now();
  }
}
