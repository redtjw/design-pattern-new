package com.tjw.design.structure.bridge;

/**
 * @author Mr.Tang
 * @date 2018/9/19
 */
public class Test {
    public static void main(String[] args) {
        Bank icbc = new ICBCBank(new HuoqiAcount());
        Account account = icbc.openAccount();
        account.showAccountType();

        Bank abc = new ABCBank(new HuoqiAcount());
        Account account1 = abc.openAccount();
        account1.showAccountType();
    }
}
