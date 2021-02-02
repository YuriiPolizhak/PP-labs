package control_chooser;

public class HelpCommand implements CommandChooser{
    private Menu menu;

    public HelpCommand(Menu menu) {
        this.menu = menu;
    }

    @Override
    public void execute() {
        this.menu.help();
    }
}
