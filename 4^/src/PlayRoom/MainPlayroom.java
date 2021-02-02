package PlayRoom;

import toy.Toy;
import static Main.Main.logger;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public class MainPlayroom {
    // % of toys Big, Medium, Small in different age group
    private static double[] Babies =   {0.2, 0.3, 0.5};
    private static double[] Preteens = {0.5, 0.3, 0.2};
    private static double[] Teens =    {0.7, 0.3, 0.0};
    ////
    private static int NumOfToys;
    private static String fileName = "1.txt";

    public static double getBabies(int a) { return Babies[a]; }

    public static double getPreteens(int a) {
        return Preteens[a];
    }

    public static double getTeens(int a) {
        return Teens[a];
    }

    public static void Enters(String fileName, Toy[] obj) //From a file into object of Class Toy
    {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String buff;

            while ((buff = reader.readLine()) != null) {
                String[] split_string;
                split_string = buff.split(", ( *\\t*)");
                obj[NumOfToys] = new Toy(split_string);
                NumOfToys++;
                logger.info("File loaded from: C:\\Users\\Yura\\Desktop\\KH-203\\PP\\1.txt");
            }
            reader.close();
        } catch (IOException e) {
            logger.info("Error with a file");
            System.out.println("Error with a file");
            System.exit(1);
        }
    }

    public static void PrintHead() {
        System.out.println("===========================================" +
                "================================================");
        System.out.println("ID\tName\t\t\t\tSize\t\t\t\t\tCategory\t\t\t\t" +
                "Cost\t\tAmount");
    }

    public static void PrintFullList(Toy[] obj) {


        PrintHead();
        Enters(fileName, obj);

        for (int i = 0; i < NumOfToys; i++) {
            obj[i].Print();
        }
        NumOfToys = 0;
        System.out.println("===========================================" +
                "================================================");

    }

    public static double PrintCostOfToys(Toy[] obj) {
        double temp = 0, temp2;
        Enters(fileName, obj);
        for (int i = 0; i < NumOfToys; i++) {
            temp2 = obj[i].getAmount() * obj[i].getCost();
            temp += temp2;
        }
        NumOfToys = 0;
        System.out.println("===========================================" +
                "================================================");
        System.out.println("Cost of all toys in a storage: " + temp);
        System.out.println("===========================================" +
                "================================================");
        return temp;
    }

    public static void PrintListOfCategory(Toy[] obj, String category) {
        PrintHead();
        Enters(fileName, obj);
        for (int i = 0; i < NumOfToys; i++) {
            if (Objects.equals(category, obj[i].getCategory())||Objects.equals(category, obj[i].getSize())) {
                obj[i].Print();
            }

        }
        System.out.println("===========================================" +
                "================================================");
        NumOfToys = 0;
    }

    public static void PrintAgeReport() {
        System.out.println("Age group \\ % of toys       Big ,   Medium,  Small");
        System.out.print("Babies\t\t\t\t\t");
        for (int i = 0; i < 3; i++) {
            System.out.print("\t" + Babies[i] * 100 + "%");
        }
        System.out.print("\nPreteens\t\t\t\t");
        for (int i = 0; i < 3; i++) {
            System.out.print("\t" + Preteens[i] * 100 + "%");
        }
        System.out.print("\nTeens\t\t\t\t\t");
        for (int i = 0; i < 3; i++) {
            System.out.print("\t" + Teens[i] * 100 + "%");
        }
        System.out.println("\n===========================================" +
                "================================================");
    }
    public static int PrintListToys(int age, int amount, double money) {               //for Client
    logger.info("Given numbers: "+age+"; "+amount+"; "+money);
     int amount_big, amount_medium, amount_small;
     int [] amountOfCertain= new int[500];
        if (age < 7) { amount_big=(int)(amount*getBabies(0)+0.5);
                       amount_medium=(int)(amount*getBabies(1)+0.5);
                       amount_small=(int)(amount*getBabies(2)+0.5);
        }else if (age >= 7 && age < 13) {amount_big=(int)(amount*getPreteens(0)+0.5);
            amount_medium=(int)(amount*getPreteens(1)+0.5);
            amount_small=(int)(amount*getPreteens(2)+0.5);
        } else {amount_big=(int)(amount*getTeens(0)+0.5);
            amount_medium=(int)(amount*getTeens(1)+0.5);
            amount_small=(int)(amount*getTeens(2)+0.5);
        }

        Toy[] obj=new Toy[100];

        Enters(fileName, obj);
        int i = 0;
        while(money>0&&amount_small>0)
        {
            if( i == NumOfToys){ i=0;}
            if (Objects.equals("Мала", obj[i].getSize()) && obj[i].getAmount()>amountOfCertain[i]) {
                money=money-obj[i].getCost();
                amountOfCertain[i]++;
                amount_small--;
            }
            i++;
        }
        i=0;
        while(money>0&&amount_medium>0)
        {  if( i == NumOfToys){ i=0;}
            if (Objects.equals("Середня", obj[i].getSize()) && obj[i].getAmount()>amountOfCertain[i]) {
                money=money-obj[i].getCost();
                amountOfCertain[i]++;
                amount_medium--;
            }
            i++;
        }
        i = 0;
        while(money>0&&amount_big>0)
        {
            if( i == NumOfToys){ i=0;}
            if (Objects.equals("Велика", obj[i].getSize()) && obj[i].getAmount()>amountOfCertain[i]) {
                money=money-obj[i].getCost();
                amountOfCertain[i]++;
                amount_big--;
            }
            i++;
        }

        System.out.println("\t\t\tВаша ігрова кімната має наступні іграшки:");
        PrintHead();
        int amount2=0;
        for(i=0;i<50;i++)
        { if (amountOfCertain[i]!=0){
            amount2 += amountOfCertain[i];
            obj[i].Print(amountOfCertain[i]);
        }
        }
        System.out.println("\n===========================================" +
                "================================================");
        return amount2;
    }}