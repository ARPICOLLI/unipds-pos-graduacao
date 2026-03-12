package br.com.exercicio2.events.service;

import br.com.exercicio2.events.model.Session;
import br.com.exercicio2.events.model.Subscription;
import br.com.exercicio2.events.model.User;

import java.util.List;

public interface ISubscriptionService {
    public Subscription addSubscription(Subscription subscription);
    public List<Subscription> getAllByUser(User user);
    public List<Subscription> getAllBySession(Session session);
}
