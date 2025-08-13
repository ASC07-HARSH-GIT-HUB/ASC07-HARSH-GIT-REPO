package org.example.Login.Service;

import org.example.Login.Entity.Login;
import org.example.Login.Repository.loginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class loginServiceImplementation implements loginServiceInterface {

    private loginRepository loginRepo;

    @Autowired
    public loginServiceImplementation(loginRepository loginRepo) {
        this.loginRepo = loginRepo;
    }

    @Override
    public boolean validLogin(String username, String password) {
        Login user = loginRepo.findByUsernameAndPassword(username, password);
        return user != null;
    }
}
