package br.com.example.amqp.balance.service;

import br.com.example.amqp.balance.model.Balance;
import io.quarkus.rabbit.client.RabbitListenerConfiguration;

import javax.enterprise.context.Dependent;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

@Dependent
public class BalanceConsumer {
    @Inject
    BalanceService balanceService;

    public void listenOther(@Observes @RabbitListenerConfiguration(queue = "balance", type = Balance.class) Balance balance){
        System.out.println("Message read from Balance queue: " + balance);
        balanceService.save(balance);
    }
}
