package lucasmatricarde.com.springsecurityjwt.Controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping
    public String welcome() {
        return "Welcome to Spring Security JWT";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Welcome to Spring Security JWT Admin";
    }

    @GetMapping("/user")
    public String user() {
        return "Welcome to Spring Security JWT User";
    }
}
