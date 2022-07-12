package br.com.example.amqp.balance.service;

import br.com.example.amqp.balance.model.Balance;

public interface BalanceService {

    void save(Balance balance);
    Balance findById(Integer id);

}
