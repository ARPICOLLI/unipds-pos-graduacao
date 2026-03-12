package br.com.exercicio2.events.repo;

import br.com.exercicio2.events.model.Session;
import br.com.exercicio2.events.model.Subscription;
import br.com.exercicio2.events.model.SubscriptionID;
import br.com.exercicio2.events.model.User;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface SubscriptionRepo extends ListCrudRepository<Subscription, SubscriptionID> {
    public List<Subscription> findByUser(User user);
    public List<Subscription> findBySession(Session session);

}
