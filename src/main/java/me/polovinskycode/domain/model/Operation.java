package me.polovinskycode.domain.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

public class Operation implements Serializable {

    @Id
    @GeneratedValue(generator = "operation")
    @GenericGenerator(name = "operation", strategy = "increment")
    private Long id;

    @Column
    private String description;

    @Column
    private Integer chargeOrder;
}
