package com.khaleesi.springbootmicroservicetransaction.service;

import com.khaleesi.springbootmicroservicetransaction.model.Transaction;
import com.khaleesi.springbootmicroservicetransaction.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TransactionService {

    private final TransactionRepository transactionRepository;

    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public Transaction saveTransaction(Transaction transaction){
        transaction.setTransactionTime(LocalDateTime.now());
        return transactionRepository.save(transaction);
    }

    public void deleteTransaction(Long transactionId){
        transactionRepository.deleteById(transactionId);
    }

    public List<Transaction> findAllTransactionOfUser(Long userId){
        return transactionRepository.findAllByUserId(userId);
    }
}
