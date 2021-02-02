package Client;

import PlayRoom.MainPlayroom;
import toy.Toy;

import java.util.Scanner;

import static Main.Main.logger;

public class ClientMain {
    private static int age;
    private static int amount;
    private static double money;
    public void Start(){
        logger.info("Logged into client menu");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Age of your children (<7 are Babies, 7<13 Preteens, 13 and more - Teens)");
        age= scanner.nextInt();
        System.out.println("Enter amount of toys");
        amount= scanner.nextInt();
        System.out.println("Enter money, you are ready to spend");
        money=scanner.nextDouble();
        MainPlayroom One = new MainPlayroom();
        One.PrintListToys(age,amount,money);
        logger.info("Main class successfully ended");
        System.exit(0);
    }
}
