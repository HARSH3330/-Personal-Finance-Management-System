package com.example.FinanceManager.controller;

import com.example.FinanceManager.model.Transaction;
import com.example.FinanceManager.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionRepository transactionRepository;

    @PostMapping("/add")
    public ResponseEntity<String> addTransaction(@RequestBody Transaction transaction) {
        transactionRepository.save(transaction);
        return ResponseEntity.ok("Transaction added successfully!");
    }

    @GetMapping("/expenses")
    public ResponseEntity<List<Transaction>> getExpenses() {
        return ResponseEntity.ok(transactionRepository.findByTransactionType("Expense"));
    }

    @GetMapping("/incomes")
    public ResponseEntity<List<Transaction>> getIncomes() {
        return ResponseEntity.ok(transactionRepository.findByTransactionType("Income"));
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Transaction>> getUserTransactions(@PathVariable Long userId) {
        return ResponseEntity.ok(transactionRepository.findByUserId(userId));
    }
}
