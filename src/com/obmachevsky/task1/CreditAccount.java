package com.obmachevsky.task1;

public class CreditAccount extends Account {
    final long LIMIT;

    public CreditAccount(long amount) {
        super(amount);
        LIMIT = this.amount;
    }

    @Override
    protected boolean add(long amount) {
        if (this.amount + amount < LIMIT) {
            this.amount += amount;
            return true;
        }
        return false;
    }

    @Override
    protected boolean transfer(Account account, long amount) {
        if (this.amount >= amount) {
            if (this.pay(amount)) {
                return account.add(amount);
            }
        }
        return false;
    }
}
