package control_chooser;

public class TakeClientCommand implements CommandChooser{
    private Menu menu;

    public TakeClientCommand(Menu menu) {
        this.menu = menu;
    }

    @Override
    public void execute() {
        this.menu.takeClient();
    }
}
