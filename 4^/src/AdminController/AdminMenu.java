package AdminController;

import PlayRoom.MainPlayroom;
import toy.Toy;

import java.util.Scanner;

public class AdminMenu {
    Toy[] obj = new Toy[100];
    MainPlayroom One = new MainPlayroom();
     public void outAdminMenu(){
         System.out.println(
                 "1 - Age report" +
                 "\n2 - Cost of all toy" +
                 "\n3 - List of toys of a certain category or size" +
                 "\n4 - Exit to a choose role menu" +
                 "\n5 - Exit");
     }
     public void ageReport(){
         System.out.println("===========================================" +
                 "================================================");
         System.out.println("Age report: ");
         One.PrintAgeReport();
     }
     public double costAllToys(){
        return One.PrintCostOfToys(obj);
     }
     public void listToysCategory(){
         System.out.println("Type category or size to sort toys: ");
         Scanner scanner = new Scanner(System.in);
         String category = scanner.nextLine();
         One.PrintListOfCategory(obj, category);
     }
}
