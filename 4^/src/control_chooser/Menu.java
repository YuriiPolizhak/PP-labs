package control_chooser;
import AdminMain.AdminRunner;
import PlayRoom.MainPlayroom;
import Client.ClientMain;
import toy.Toy;

public class Menu {
    public void outMenu(){
        System.out.println("1 - Take admin rights." +
                "\n2 - Take client rights" +
                "\n3 - Help" +
                "\n4 - Print all list of toys"+
                "\n5 - Exit");
    }
    public void takeAdmin(){
        System.out.println("Loading admin menu");
        System.out.println("===========================================" +
                "================================================");
        AdminRunner admin = new AdminRunner();
        admin.Start();
    }
    public void takeClient(){
        System.out.println("Loading client menu");
        System.out.println("===========================================" +
                "================================================");
        ClientMain client = new ClientMain();
        client.Start();
    }
    public void help(){
        System.out.println("===========================================" +
                "================================================");
        System.out.println("Help menu: \nYou can choose which role of users you want to test"+
                "\nIn main menu you can check out all enable toys and their characteristics ");
        System.out.println("===========================================" +
                "================================================");
        }
    public  void printList(){
        Toy[] obj = new Toy[100];
        MainPlayroom One = new MainPlayroom();
        One.PrintFullList(obj);
    }
}
