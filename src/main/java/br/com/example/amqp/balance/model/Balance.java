package br.com.example.amqp.balance.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Balance extends PanacheEntityBase {

    @Id
    private Integer id;
    private String name;
    private BigDecimal value;

    public Balance() {
    }

    public Balance(Integer id, String name, BigDecimal value) {
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
