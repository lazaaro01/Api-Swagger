package dio.desafio_spring_boot.controller;

import dio.desafio_spring_boot.model.User;
import dio.desafio_spring_boot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository repository;
    @GetMapping()
    public List<User>getUsers() {
        repository.findAll();
        return repository.findAll();
    }
    @GetMapping("/{username}")
    public User getOne(@PathVariable("username") String username) {
        return repository.findByUsername(username);
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id")  Integer id) {
         repository.deleteById(id);
    }
    @PostMapping()
    public void postUser(@RequestBody User user) {
        repository.save(user);
    }
    @PutMapping ()
    public void putUser(@RequestBody User user) {
        repository.save(user);
    }
}
