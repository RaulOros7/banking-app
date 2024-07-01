package org.example.banking.entity;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Transaction {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private BigDecimal amount;
    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;
    private LocalDateTime timestamp;
}
