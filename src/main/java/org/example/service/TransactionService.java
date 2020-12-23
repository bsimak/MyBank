package org.example.service;

import org.example.model.Transaction;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TransactionService {

    private List<Transaction> transactions = new CopyOnWriteArrayList<>(); // (1)

    public TransactionService() {
        System.out.println("default");
    }

    public List<Transaction> findAll() {
        // System.out.println("in findAll");
        return transactions;
    }
    public Transaction create(Integer amount, String reference){
        System.out.println("in Create");
        System.out.println(amount);
        if (amount < 0) {
            throw new IllegalStateException();
        }
        Transaction transaction = new Transaction(amount, reference);

        System.out.println("before add");
        transactions.add(transaction);
        return transaction;
    }
}
