package com.javatodev.finance.model.dto;

import lombok.Data;
import com.javatodev.finance.model.entity.AccountStatus;
import com.javatodev.finance.model.entity.AccountType;

import java.math.BigDecimal;

@Data
public class BankAccount {

    private Long id;
    private String number;
    private AccountType type;
    private AccountStatus status;
    private BigDecimal availableBalance;
    private BigDecimal actualBalance;
    private User user;

}
