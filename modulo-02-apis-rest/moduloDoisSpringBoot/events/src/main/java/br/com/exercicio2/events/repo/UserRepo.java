package br.com.exercicio2.events.repo;

import br.com.exercicio2.events.model.User;
import org.springframework.data.repository.ListCrudRepository;

public interface UserRepo extends ListCrudRepository<User, Integer> {
}
