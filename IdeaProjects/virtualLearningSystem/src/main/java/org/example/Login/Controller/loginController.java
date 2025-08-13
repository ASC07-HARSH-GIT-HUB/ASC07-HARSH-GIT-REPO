package org.example.Login.Controller;

import org.example.Login.Service.loginServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/apis")
public class loginController {

    private loginServiceInterface loginService;

    @Autowired
    public loginController(loginServiceInterface loginService) {
        this.loginService = loginService;
    }

    @PostMapping("/login")
    public String login(@RequestBody Map<String, String> payload) {
        String username = payload.get("username");
        String password = payload.get("password");

        boolean success = loginService.validLogin(username, password);
        return success ? "Login successful" : "Invalid credentials";
    }
}
