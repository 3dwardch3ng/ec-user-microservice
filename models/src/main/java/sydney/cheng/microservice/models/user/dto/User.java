package sydney.cheng.microservice.models.user.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import sydney.cheng.microservice.models.user.enums.Active;
import sydney.cheng.microservice.models.user.enums.Role;

import java.time.LocalDateTime;

@Data
@Builder
@Getter
public class User {
    private String id;
    private LocalDateTime creationTimestamp;
    private LocalDateTime updateTimestamp;

    private String username;
    private String password;
    private String email;
    private Role role;
    private Active active;

    private UserDetails userDetails;
}
