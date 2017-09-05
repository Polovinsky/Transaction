package me.polovinskycode.domain.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

import static javax.persistence.TemporalType.TIMESTAMP;

@Entity
public class Transaction implements Serializable {

    @Id
    @GeneratedValue(generator = "transaction")
    @GenericGenerator(name = "transaction", strategy = "increment")
    private Long id;

    @Column
    private Long idAccount;

    @Column
    private Long idOperation;

    @Column
    private Double amount;

    @Column
    private Double balance;

    @Column
    @Temporal(value = TIMESTAMP)
    private Date event;

    @Column
    @Temporal(value = TIMESTAMP)
    private Date due;

    Transaction() {

    }

    public Transaction(Long idAccount, Long idOperation, Double amount, Double balance, Date event, Date due) {
        this.idAccount = idAccount;
        this.idOperation = idOperation;
        this.amount = amount;
        this.balance = balance;
        this.event = event;
        this.due = due;
    }

    public Long getId() {
        return id;
    }

    public Long getIdAccount() {
        return idAccount;
    }

    public Long getIdOperation() {
        return idOperation;
    }

    public Double getAmount() {
        return amount;
    }

    public Double getBalance() {
        return balance;
    }

    public Date getEvent() {
        return event;
    }

    public Date getDue() {
        return due;
    }
}
