package br.com.example.amqp.balance.service;

import br.com.example.amqp.balance.model.Balance;
import br.com.example.amqp.balance.model.Transaction;

public interface BalanceService {

    void save(Balance balance);
    Balance findById(Integer id);
    void updateBalance(Transaction transaction);

}
