package notice.dto;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class User {
  @Id
  private String uid;

  @Column(unique = true, nullable = false)
  private String id;

  private String name;

  private String password;
}
