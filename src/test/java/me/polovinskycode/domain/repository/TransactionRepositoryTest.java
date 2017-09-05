package me.polovinskycode.domain.repository;

import me.polovinskycode.domain.builder.TransactionBuilder;
import me.polovinskycode.domain.model.Transaction;
import me.polovinskycode.infrastructure.persistence.JPAUtil;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

public class TransactionRepositoryTest {

    private TransactionRepository repository;

    @Before
    public void setUp() throws Exception {
        repository = new TransactionRepository(JPAUtil.getSession());
    }

    @Test
    public void save_withTransaction_shouldReturnNewTransactions() throws Exception {
        Transaction transaction =
                new TransactionBuilder()
                        .idAccount(1L)
                        .idOperation(1L)
                        .amount(50d)
                        .balance(50d)
                        .event(new Date())
                        .due(new Date())
                        .build();

        repository.save(transaction);
        Transaction t = repository.findById(1L);
        assertThat("Not null value", t, notNullValue());
    }
}