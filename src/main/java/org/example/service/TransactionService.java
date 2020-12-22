package org.example.service;

import org.example.model.Transaction;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TransactionService {

    private List<Transaction> transactions = new CopyOnWriteArrayList<>(); // (1)

    public TransactionService() {
    }

    public List<Transaction> findAll() {
        // Debugging : System.out.println("in findAll");
        return transactions;
    }
    public Transaction create(Integer amount, String reference){
        if (amount < 0) {
            throw new IllegalStateException();
        }
        Transaction transaction = new Transaction(amount, reference);

        transactions.add(transaction);
        return transaction;
    }
}
