package br.com.example.amqp.balance.model;

public enum Type {

    CREDIT("CREDIT"),
    DEBIT("DEBIT");
    private String type;

    private Type(String type) {
        this.type = type;
    }

}
