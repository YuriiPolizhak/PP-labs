package control_chooser;

public class TakeAdminCommand implements CommandChooser{
    private Menu menu;

    public TakeAdminCommand(Menu menu) {
        this.menu = menu;
    }

    @Override
    public void execute() {
        this.menu.takeAdmin();
    }
}
