package com.khaleesi.springbootmicroservicetransaction.repository;

import com.khaleesi.springbootmicroservicetransaction.model.Transaction;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TransactionRepository extends CrudRepository<Transaction,Long> {
    List<Transaction> findAllByUserId(Long userId);
}
