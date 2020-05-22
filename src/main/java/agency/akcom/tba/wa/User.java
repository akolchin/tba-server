package agency.akcom.tba.wa;

import lombok.Data;
import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;
import org.springframework.data.annotation.Id;

@Entity(name = "users")
@Data
public class User {

  @Id
  // @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String name;
  private String email;
}
