package me.polovinskycode.domain.repository;

import me.polovinskycode.domain.model.Transaction;
import me.polovinskycode.infrastructure.persistence.JPAUtil;
import org.hibernate.Session;

import java.util.List;

public class TransactionRepository implements Repository<Transaction> {

    private Session session;

    public TransactionRepository() {
        this.session = JPAUtil.getSession();
    }

    public TransactionRepository(Session session) {
        this.session = session;
    }

    @Override
    public Transaction findById(Long id) {
        return this.session.find(Transaction.class, id);
    }

    @Override
    public List<Transaction> findAll() {
        return null;
    }

    @Override
    public void save(Transaction transaction) {
        this.session.save(transaction);
    }

    @Override
    public void update(Transaction transaction) {

    }

    @Override
    public void delete(Transaction transaction) {

    }
}
