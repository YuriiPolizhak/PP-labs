package AdminController;

public class OutAdminMenu implements Command{
    private AdminMenu adminMenu;

    public OutAdminMenu(AdminMenu adminMenu) {
        this.adminMenu = adminMenu;
    }

    @Override
    public void execute() {
        this.adminMenu.outAdminMenu();
    }
}
