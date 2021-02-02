package Main;

import control_chooser.*;
import chooser.*;
import static chooser.ChoiseNumberChooser.*;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import java.util.Scanner;
public class Main {
    public static Logger logger;
    public static void main(String[] args) throws IOException {
        logger = Logger.getLogger("lab.logger");
        String loggerPath="C:\\Users\\Yura\\Desktop\\KH-203\\PP\\4^\\logger.log";
        FileHandler fh = new FileHandler(loggerPath);
        logger.addHandler(fh);
        logger.setUseParentHandlers(false);

        SimpleFormatter simpleFormatter = new SimpleFormatter();
        fh.setFormatter(simpleFormatter);


        Menu menu = new Menu();
        int currentChoice;
        ChoiseNumberChooser[] choiceNumberChooser = {
                FIRST_CHOICE, SECOND_CHOICE,
                THIRD_CHOICE, FOURTH_CHOICE
        };
        Loader loader = new Loader(
                new TakeAdminCommand(menu),
                new TakeClientCommand(menu),
                new HelpCommand(menu),
                new OutMenu(menu),
                new PrintListCommand(menu)
        );
        logger.info("Main class before running menu");
        while(true) {
            loader.outMenu();
            System.out.print("Type:");
            Scanner scanner = new Scanner(System.in);
            currentChoice = scanner.nextInt();
            if(currentChoice == 5){
                break;
            }
            if(currentChoice >5){continue;}
            else{
                choiceNumberChooser[currentChoice-1].actingUserChoice(loader);
            }
        }
        logger.info("Main class successfully ended");
        System.out.println("Bye!");
    }

}
