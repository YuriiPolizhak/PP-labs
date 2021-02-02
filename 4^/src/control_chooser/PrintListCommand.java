package control_chooser;

public class PrintListCommand implements CommandChooser{
    private Menu menu;

    public PrintListCommand(Menu menu) {
        this.menu = menu;
    }

    @Override
    public void execute() {
        this.menu.printList();
    }
}
