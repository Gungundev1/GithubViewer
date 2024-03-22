import java.util.Random;
import java.util.Scanner;
class User extends Thread {
    int count;
    int moneyCollected = 0;
    int item;
    int money;
    int recieve;
    int stock = 50;
    int returnMoney;
    String manufacturer="Gungun";
    Scanner scanner = new Scanner(System.in);
    public void itemSelection() {
        System.out.println("        "+"--------------------------");
        System.out.println("        "+"|           Menu         |");
        System.out.println("        "+"| Water 🥛       Rs. 15  |");
        System.out.println("        "+"| Cold drink 🍷  Rs. 20  |");
        System.out.println("        "+"| Tea 🍵         Rs. 10  |");
        System.out.println("        "+"--------------------------");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("which drink do you like:) ");
        System.out.println("Enter the code");
        System.out.println("1 for Water & 2 for Cold drink & 3 for Tea");
        item = scanner.nextInt();
        System.out.println("How many:");
        count = scanner.nextInt();
    }
    public void calculatingMoney() {
        if (item == 1) {
            money = 15 * count;
            System.out.println("your amount is :) " + money);
        } else if (item==2) {
            money=20*count;
            System.out.println("your amount is :) " + money);
        } else if (item==3) {
            money=10*count;
            System.out.println("your amount is :) " + money);
        }
        else {
            System.out.println("Enter valid code");
        }
    }

}
class paymentGateway extends User{
    public void gateway() {
        Random random = new Random();
        System.out.println("How do you want to pay? Cash OR Online..");
        String gateway = scanner.next().toLowerCase();
        switch (gateway) {
            case "cash":
                System.out.println("Enter the price: " + money);
                recieve = scanner.nextInt();
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                if (money == recieve) {
                    System.out.println("Here, is your Drink. Take it & Enjoy. Thank you...");
                } else if (money < recieve) {
                    returnMoney = recieve - money;
                    System.out.println("Here is your change" + returnMoney);
                    System.out.println("Here, is your Drink. Take it & Enjoy. Thank you...");
                } else {
                    System.out.println("Enter sufficient amount");
                    recieve = scanner.nextInt();
                    if (money == recieve) {
                        System.out.println("Here, is your Drink. Take it & Enjoy. Thank you...");

                    } else if (money < recieve) {
                        returnMoney = recieve - money;
                        System.out.println("Here is your change" + returnMoney);
                        System.out.println("Here, is your Drink. Take it & Enjoy. Thank you...");
                    }

                }
                stock -= count;
                moneyCollected += money;
                break;
            case "online":
                Scanner input = new Scanner(System.in);
                System.out.println("Scan the QR code");
                System.out.println("        "+"--------------");
                System.out.println("        "+"|************|");
                System.out.println("        "+"|############|");
                System.out.println("        "+"|************|");
                System.out.println("        "+"|############|");
                System.out.println("        "+"--------------");
               int code= random.nextInt(1000);
                System.out.println(code);
                System.out.println("Please Enter Above code ");
                int code1 = input.nextInt();

                if(code1==code){
                    System.out.println("Payment Successfully Done!");
                    System.out.println("Here, is your Drink. Take it & Enjoy. Thank you...");
                    stock -=count;
                    moneyCollected += money;
                }
                else{
                    System.out.println("Invallid code");
                }
                break;
            default:
                System.out.println("Enter valid Gateway");
        }
    }
    public void notification () {
        if (stock == 10) {
            notify();
        }
    }

}
class Admin extends User{
    void check(int stock, int moneyCollected, String manufacturer){
        this.stock=stock;
        this.moneyCollected = moneyCollected;
        this.manufacturer = manufacturer;
        System.out.println("Manufactured by "+ manufacturer);
        System.out.println("Stock=" + stock);
        System.out.println("Amount="+moneyCollected);
    }
}
public class VendingMachine {
    public static void main(String[] args) {
        Admin admin = new Admin();
        paymentGateway pg=new paymentGateway();
        pg.itemSelection();
        pg.calculatingMoney();
        pg.gateway();
        pg.notification();
        int stock = pg.stock;
        int moneyCollected = pg.moneyCollected;
        String manufacturer  = pg.manufacturer;
        admin.check(stock, moneyCollected,manufacturer);
    }
}
