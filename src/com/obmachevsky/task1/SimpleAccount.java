package com.obmachevsky.task1;

public class SimpleAccount extends Account {

    public SimpleAccount(long amount) {
        super(amount);
    }

    @Override
    protected boolean add(long amount) {
        this.amount += amount;
        //Момент какой-то спорный. Лимит на пополнение работает - всегда возвращаем true.
        return true;
    }

    @Override
    protected boolean transfer(Account account, long amount) {
        if (this.getBalance() >= amount) {
            if (this.pay(amount) && account.add(amount)) {
                return true;
            } else this.add(amount); // имитация роллбэк
        }
        return false;
    }
}
