package xx;
import Droids.*;
import Weapons.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstAmount, secondAmount;
        ArrayList<Droid> firstTeamOfDroid = new ArrayList<>();
        ArrayList<Droid> secondTeamOfDroid = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter # of droids in 1 team:\t");
        firstAmount = in.nextInt();
        for (int i = 0; i < firstAmount; i++){
            System.out.print("Choose your droid:\n" +
                    "1 - Default\n"+
                    "2 - Attacker\n" +
                    "3 - Dodger\n" +
                    "4 - Tank\n");
            int type = in.nextInt();
            if (type == 1){
                firstTeamOfDroid.add(new Droid());
            }
            if (type == 2){
                firstTeamOfDroid.add(new DroidAttacker());
            }
            else if (type == 3){
                firstTeamOfDroid.add(new DroidDodger());
            }
            else if (type == 4){
                firstTeamOfDroid.add(new DroidTank());
            }
        }
        System.out.print("Enter # of droids in 2 team:\t");
        secondAmount = in.nextInt();
        for (int i = 0; i < secondAmount; i++){
            System.out.print("Choose your droid:\n" +
                    "1 - Default\n" +
                    "2 - Attacker\n" +
                    "3 - Dodger\n" +
                    "4 - Tank\n");
            int type = in.nextInt();
            if (type == 1){
                secondTeamOfDroid.add(new Droid());
            }
            else if (type == 2){
                secondTeamOfDroid.add(new DroidAttacker());
            }
            else if (type == 3){
                secondTeamOfDroid.add(new DroidDodger());
            }
            else if (type == 4){
                secondTeamOfDroid.add(new DroidTank());
            }
        }
        Battle battle = new Battle(firstTeamOfDroid, secondTeamOfDroid);
        battle.startBattle();

    }
}
