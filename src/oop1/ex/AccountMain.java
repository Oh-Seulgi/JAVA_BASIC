package oop1.ex;

/*
 * 객체 지향 프로그래밍
 * */
public class AccountMain {

    public static void main(String[] args) {
        Account account = new Account();
        // 계좌 입금
        account.deposit(10000);
        // 계좌 출금
        account.withdraw(9000);
        // 계좌 출금
        account.withdraw(2000);
        System.out.println("잔고: " + account.balance);
    }
}
