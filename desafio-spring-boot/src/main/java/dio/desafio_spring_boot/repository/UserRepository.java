package dio.desafio_spring_boot.repository;

import dio.desafio_spring_boot.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(User user) {
        if (user.getId()==null)
            System.out.println("SAVE - Recebendo o usuario na camada repositorio");
        else
            System.out.println("UPDATE - Recebendo o usuario na camada de repositorio");

        System.out.println(user);
    }
    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuario"));
        System.out.println(id);
    }
    public List<User> findAll() {
        System.out.println("LIST - Listando  os usuarios do sistema");
        List<User> users = new ArrayList<>();
        users.add(new User("Lazaro", "password"));
        users.add(new User("Eduarda","masterpass"));
        return users;
    }
    public User findById(Integer id) {
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um", id));
        return  new User("Lazaro","password");
    }
    public User findByUsername(String username) {
        System.out.println(String.format("FIND/username - Recebendo o username: %s para", username));
        return new User("Lazaro", "password");
    }
}
