package br.com.example.amqp.balance.model;

import java.math.BigDecimal;

public class Transaction {

    private String type;
    private BigDecimal value;
    private Integer userId;

    public Transaction() {
    }

    public Transaction(BigDecimal value, Integer userId, String type) {
        this.type = type;
        this.value = value;
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }


    @Override
    public String toString() {
        return "Transaction{" +
                "type='" + type + '\'' +
                ", value=" + value +
                ", userId=" + userId +
                '}';
    }
}
