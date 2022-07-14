package br.com.example.amqp.balance.service;

import br.com.example.amqp.balance.model.Transaction;
import br.com.example.amqp.balance.model.Balance;
import io.quarkus.rabbit.client.RabbitListenerConfiguration;

import javax.enterprise.context.Dependent;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

@Dependent
public class BalanceConsumer {
    @Inject
    BalanceService balanceService;

    public void listenUser(@Observes @RabbitListenerConfiguration(queue = "add-user", type = Balance.class) Balance balance){
        System.out.println("Message read from Balance queue: " + balance);
        balanceService.save(balance);
    }

    public void listenTransaction(@Observes @RabbitListenerConfiguration(queue = "user-transaction", type = Transaction.class) Transaction transaction){
        System.out.println("Message read from Balance queue: " + transaction);
        balanceService.updateBalance(transaction);
    }
}
