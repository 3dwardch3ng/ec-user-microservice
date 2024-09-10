package sydney.cheng.microservice.feignclient.user;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import sydney.cheng.microservice.models.user.dto.User;

@FeignClient(name = "user-service", path = "/v1/user")
public interface ECUserMicroserviceFeignClient {
    @GetMapping("/{username}")
    ResponseEntity<User> getUserByUsername(@PathVariable String username);
}
