package me.polovinskycode.domain.repository;

import me.polovinskycode.domain.model.Transaction;

import java.util.List;

public class TransactionRepository implements Repository<Transaction> {

    @Override
    public Transaction findById(Long id) {
        return null;
    }

    @Override
    public List<Transaction> findAll() {
        return null;
    }

    @Override
    public void save(Transaction transaction) {

    }

    @Override
    public void update(Transaction transaction) {

    }

    @Override
    public void delete(Transaction transaction) {

    }
}
