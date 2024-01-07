package oop1.ex;

/*
 * 객체 지향 프로그래밍(캡슐화)
 * 속성과 기능을 한 파일로 묶기
 * */
public class Account {
    int balance;    // 잔액

    // 입금
    void deposit(int amount) {
        balance += amount;
    }
    // 출금
    void withdraw(int amount) {
        if(balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("잔액 부족");
        }
    }
}
