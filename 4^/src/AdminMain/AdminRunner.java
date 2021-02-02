package AdminMain;

import AdminController.*;
import static Main.Main.logger;

import java.util.Scanner;
import static AdminMain.ChoiceNumber.*;

public class AdminRunner {
    public void Start() {
        logger.info("Logged into admin menu");
        AdminMenu adminMenu = new AdminMenu();
        int currentChoice;
        ChoiceNumber[] choiceNumber = {
                    FIRST_CHOICE, SECOND_CHOICE,
                    THIRD_CHOICE
        };
        LoaderAdmin loaderAdmin = new LoaderAdmin(
                new AgeReportCommand(adminMenu),
                new CostAllToysCommand(adminMenu),
                new ListToysCategoryCommand(adminMenu),
                new OutAdminMenu(adminMenu)
        );

        while(true) {
            loaderAdmin.outAdminMenu();
            System.out.print("Type:");
            Scanner scanner = new Scanner(System.in);
            currentChoice = scanner.nextInt();

            if(currentChoice == 5){
                logger.info("Main class successfully ended");
                System.out.println("Bye!");
                System.exit(0);
            }
            if(currentChoice == 4){
                break;
            }
            if(currentChoice >5){continue;}
            else{
                choiceNumber[currentChoice-1].actingUserChoice(loaderAdmin);
            }
        }
    }
}
