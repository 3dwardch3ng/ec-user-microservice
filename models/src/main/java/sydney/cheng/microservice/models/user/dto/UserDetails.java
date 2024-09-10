package sydney.cheng.microservice.models.user.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Builder
@Getter
public class UserDetails {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String country;
    private String city;
    private String address;
    private String postalCode;
    private String aboutMe;
    private String profilePicture;
}
