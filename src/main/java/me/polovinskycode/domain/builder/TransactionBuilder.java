package me.polovinskycode.domain.builder;

import me.polovinskycode.domain.model.Transaction;

import java.util.Date;

public class TransactionBuilder {

    private Long idAccount;
    private Long idOperation;
    private Double amount;
    private Double balance;
    private Date event;
    private Date due;

    public TransactionBuilder idAccount(Long idAccount) {
        this.idAccount = idAccount;
        return this;
    }

    public TransactionBuilder idOperation(Long idOperation) {
        this.idOperation = idOperation;
        return this;
    }

    public TransactionBuilder amount(Double amount) {
        this.amount = amount;
        return this;
    }

    public TransactionBuilder balance(Double balance) {
        this.balance = balance;
        return this;
    }

    public TransactionBuilder event(Date event) {
        this.event = event;
        return this;
    }

    public TransactionBuilder due(Date due) {
        this.due = due;
        return this;
    }

    public Transaction build() {
        return new Transaction(idAccount, idOperation, amount, balance, event, due);
    }
}
