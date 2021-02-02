package AdminController;

public class ListToysCategoryCommand implements Command{
    private AdminMenu adminMenu;

    public ListToysCategoryCommand(AdminMenu adminMenu) {
        this.adminMenu = adminMenu;
    }

    @Override
    public void execute() {
        this.adminMenu.listToysCategory();
    }
}
