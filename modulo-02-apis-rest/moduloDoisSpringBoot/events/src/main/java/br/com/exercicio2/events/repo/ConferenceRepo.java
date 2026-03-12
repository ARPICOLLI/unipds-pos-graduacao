package br.com.exercicio2.events.repo;

import br.com.exercicio2.events.model.Conference;
import org.springframework.data.repository.ListCrudRepository;

public interface ConferenceRepo extends ListCrudRepository<Conference, Integer> {
}
