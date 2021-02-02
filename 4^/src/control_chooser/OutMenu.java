package control_chooser;


public class OutMenu implements CommandChooser {
    private Menu menu;

    public OutMenu(Menu menu) {
        this.menu = menu;
    }

    @Override
    public void execute() {
        this.menu.outMenu();
    }
}
