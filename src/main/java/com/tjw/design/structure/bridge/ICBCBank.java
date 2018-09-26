package com.tjw.design.structure.bridge;

/**
 * @author Mr.Tang
 * @date 2018/9/19
 */
public class ICBCBank extends Bank {
    public ICBCBank(Account account) {
        super(account);
    }

    Account openAccount() {
        System.out.println("打开工商银行");
        account.openAccount();
        return account;
    }
}
