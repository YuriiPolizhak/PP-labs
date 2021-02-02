package AdminController;

public class AgeReportCommand implements Command{
    private AdminMenu adminMenu;

    public AgeReportCommand(AdminMenu adminMenu) {
        this.adminMenu = adminMenu;
    }

    @Override
    public void execute() {
        this.adminMenu.ageReport();
    }
}
