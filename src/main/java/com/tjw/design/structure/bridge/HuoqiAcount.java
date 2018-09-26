package com.tjw.design.structure.bridge;

/**
 * @author Mr.Tang
 * @date 2018/9/19
 */
public class HuoqiAcount implements Account {
    private HuoqiAcount abcAcount;
    public Account openAccount() {
        System.out.println("打开活期帐号");
        return this.abcAcount;
    }

    public void showAccountType() {
        System.out.println("这是活期帐号");
    }
}
