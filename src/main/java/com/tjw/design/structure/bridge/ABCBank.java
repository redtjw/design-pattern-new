package com.tjw.design.structure.bridge;

/**
 * @author Mr.Tang
 * @date 2018/9/19
 */
public class ABCBank extends Bank {
    public ABCBank(Account account) {
        super(account);
    }

    Account openAccount() {
        System.out.println("打开农业银行");
        account.openAccount();
        return account;
    }
}
