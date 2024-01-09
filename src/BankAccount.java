public class BankAccount {

    int accountNumber;
    String ownerName;
    double balance;

    //Этот метод пополняет наш счет
    void deposit(double amount) {
        balance += amount;
        System.out.println("Вы успешно пополнили счет на сумму: " + amount);
    }

    //Этот метод помогает снять деньги с нашего аккаунта
    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Вы успешно сняли " + amount + " рублей!!!");
    }

    //Этот метод помогает получить полную информацию о нашем аккаунте
    void accountInfo() {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Здравствуйте!!!!");
        System.out.println("Ваш лицевой счет : " + accountNumber);
        System.out.println("Имя владельца : " + ownerName);
        System.out.println("На вашем аккаунте баланс состовляет " + balance + " рублей!!!");
    }
}
