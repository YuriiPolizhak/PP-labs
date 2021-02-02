package control_chooser;

public class Loader {
    private CommandChooser takeAdminCommand;
    private CommandChooser takeClientCommand;
    private CommandChooser helpCommand;
    private CommandChooser outMenu;
    private CommandChooser printListCommand;


    public Loader(  CommandChooser takeAdminCommand,
             CommandChooser takeClientCommand,
             CommandChooser helpCommand,
                    CommandChooser outMenu,
                    CommandChooser printListCommand) {
        this.takeAdminCommand = takeAdminCommand;
        this.takeClientCommand = takeClientCommand;
        this.helpCommand = helpCommand;
        this.printListCommand= printListCommand;
        this.outMenu=outMenu;
    }
    public void outMenu(){this.outMenu.execute();}
    public void printList(){
        this.printListCommand.execute();
    }
    public void help(){ this.helpCommand.execute(); }
    public void takeAdmin(){this.takeAdminCommand.execute(); }
    public void takeClient(){ this.takeClientCommand.execute(); }

}
