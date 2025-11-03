package br.com.myappquarkus.service;

import br.com.myappquarkus.model.User;
import br.com.myappquarkus.repository.UserRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class UserService {

    @Inject
    UserRepository repo;


    public List<User> listAll() {
        return repo.listAll();
    }

    @Transactional
    public void create (User user){
        user.persist();
    }

}
