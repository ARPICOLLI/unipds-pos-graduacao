package br.com.exercicio2.events.repo;

import br.com.exercicio2.events.model.Session;
import org.springframework.data.repository.ListCrudRepository;

public interface SessionRepo extends ListCrudRepository<Session,Integer> {
}
