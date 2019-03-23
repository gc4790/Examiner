package login;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LoginController {
    
    @RequestMapping("/initial")
    public String index() {
        return "app.component";
    }
    
}
