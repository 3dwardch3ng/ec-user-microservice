package sydney.cheng.microservice.models.user.dto;

import lombok.Builder;
import lombok.Data;
import sydney.cheng.microservice.models.user.enums.Active;
import sydney.cheng.microservice.models.user.enums.Role;

@Data
@Builder
public class AuthUser {
    private String id;
    private String username;
    private String password;
    private Role role;
    private Active active;
}
