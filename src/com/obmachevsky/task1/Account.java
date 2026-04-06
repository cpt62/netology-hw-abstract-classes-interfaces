package com.obmachevsky.task1;

public abstract class Account {
    protected long amount;

    public Account(long amount) {
        this.amount = amount;
    }

    protected abstract boolean add(long amount);

    protected boolean pay(long amount) {
        if (this.amount >= amount) {
            this.amount -= amount;
            return true;
        }
        return false;
    }


    protected long getBalance() {
        return amount;
    }

    protected abstract boolean transfer(Account account, long amount);

}
