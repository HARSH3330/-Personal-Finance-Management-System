package com.example.FinanceManager.repository;

import com.example.FinanceManager.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByTransactionType(String transactionType);
    List<Transaction> findByUserId(Long userId);
}
