package com.obmachevsky.task1;

public class Main {
    public static void main(String[] args) {
        Account debitCardVisa = new SimpleAccount(1000L);
        Account debitCardMasterCard = new SimpleAccount(1000L);
        Account creditCard = new CreditAccount(2000L);

        while (debitCardVisa.transfer(debitCardMasterCard, 500)) {
            System.out.printf("Счет дебетовой карты VISA: %d", debitCardVisa.getBalance());
            System.out.println();
            System.out.printf("Счет дебетовой карты MC:   %d", debitCardMasterCard.getBalance());
            System.out.println();
        }
        System.out.println();

        System.out.printf("Счет кредитной карты:    %d", creditCard.getBalance());
        System.out.println();
        System.out.printf("Счет дебетовой карты MC: %d", debitCardMasterCard.getBalance());
        System.out.println();
        System.out.println();


        System.out.printf("Счет дебетовой карты VISA: %d", debitCardVisa.getBalance());
        System.out.println();
        System.out.println("Переводим с кредитной карты на VISA");
        System.out.println(creditCard.transfer(debitCardVisa, 1000L));
        System.out.printf("Счет дебетовой карты VISA: %d", debitCardVisa.getBalance());
        System.out.println();
        System.out.printf("Счет кредитной карты:      %d", creditCard.getBalance());
        System.out.println();

        System.out.println("Имитация пополнения кредитной карты");

        while (creditCard.add(300)) {
            System.out.printf("Баланс кредитной карты %d", creditCard.getBalance());
            System.out.println();
        }
        System.out.println();
        System.out.println("Имитация покупок до минимума на кредитной карте");
        while (creditCard.pay(500)) {
            System.out.printf("Баланс кредитной карты %d", creditCard.getBalance());
            System.out.println();
        }

        System.out.println(creditCard.transfer(debitCardMasterCard, 500));
    }
}
