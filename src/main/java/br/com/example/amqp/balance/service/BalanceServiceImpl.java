package br.com.example.amqp.balance.service;

import br.com.example.amqp.balance.model.Balance;
import br.com.example.amqp.balance.model.Transaction;
import br.com.example.amqp.balance.model.Type;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

import static io.quarkus.hibernate.orm.panache.PanacheEntityBase.persist;

@ApplicationScoped
public class BalanceServiceImpl implements BalanceService{

    @Override
    @Transactional
    public void save(Balance balance) {
        persist(balance);
    }

    @Override
    public Balance findById(Integer id){
        return Balance.findById(id);
    }

    @Override
    public void updateBalance(Transaction transaction) {
        Balance balance = findById(transaction.getUserId());

        if (transaction.getType().equals(Type.CREDIT.name())){
            balance.setValue(transaction.getValue().add(balance.getValue()));
        }else if(transaction.getType().equals(Type.DEBIT.name())){
            balance.setValue(balance.getValue().subtract(transaction.getValue()));
        }

        persist(balance);
    }
}
