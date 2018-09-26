package com.tjw.design.structure.bridge;

/**
 * @author Mr.Tang
 * @date 2018/9/19
 */
public abstract class Bank {
    Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract Account openAccount();
}
