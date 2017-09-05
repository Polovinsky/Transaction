package me.polovinskycode.domain.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

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
    private LocalDate event;

    @Column
    @Temporal(value = TIMESTAMP)
    private LocalDate due;
}
