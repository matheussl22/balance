package br.com.example.amqp.balance.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.math.BigDecimal;

@Entity
public class Balance extends PanacheEntityBase {

    @Id
    private Integer id;
    private String name;
    private BigDecimal value;
    @Transient
    private BigDecimal initialBalance;

    public Balance() {
    }

    public Balance(Integer userId, String name, BigDecimal value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getValue() {
        return value;
    }

    public BigDecimal getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(BigDecimal initialBalance) {
        this.value = initialBalance;
        this.initialBalance = initialBalance;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return "balance{" +
                "id='" + id + '\'' +
                "product='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
