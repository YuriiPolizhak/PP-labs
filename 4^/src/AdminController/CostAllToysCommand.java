package AdminController;

public class CostAllToysCommand implements Command{
    private AdminMenu adminMenu;

    public CostAllToysCommand(AdminMenu adminMenu) {
        this.adminMenu = adminMenu;
    }


    @Override
    public void execute() {
        this.adminMenu.costAllToys();
    }
}
