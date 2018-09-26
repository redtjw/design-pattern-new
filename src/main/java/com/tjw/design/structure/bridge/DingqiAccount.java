package com.tjw.design.structure.bridge;

/**
 * @author Mr.Tang
 * @date 2018/9/19
 */
public class DingqiAccount implements Account {
    private DingqiAccount icbcAccount;
    public Account openAccount() {
        System.out.println("打开定期帐号");
        return this.icbcAccount;
    }

    public void showAccountType() {
        System.out.println("这是定期帐号");
    }
}
