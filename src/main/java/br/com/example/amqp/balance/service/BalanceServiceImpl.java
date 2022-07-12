package br.com.example.amqp.balance.service;

import br.com.example.amqp.balance.model.Balance;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

@ApplicationScoped
public class BalanceServiceImpl implements BalanceService{

    @Override
    @Transactional
    public void save(Balance balance) {
        Balance.persist(balance);
    }

    @Override
    public Balance findById(Integer id) {
        return Balance.findById(id);

    }
}
