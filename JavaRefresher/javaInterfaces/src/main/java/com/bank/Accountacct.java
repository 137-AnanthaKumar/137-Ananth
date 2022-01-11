package com.bank;

public class Accountacct {
    private Account acct;
    public Account getAcct() {
    	return acct;
    }
    public void setAcct(Account acct) {
    	this.acct=acct;
    	
    }
    public void AccountDetails() {
    	acct.withdrawmoney();
    }
}
