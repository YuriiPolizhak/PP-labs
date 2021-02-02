package AdminController;

public class LoaderAdmin {
    private Command ageReportCommand;
    private Command costAllToysCommand;

    private Command listToysCategoryCommand;
    private Command outAdminMenu;

    public LoaderAdmin(Command ageReportCommand, Command costAllToysCommand,
                        Command listToysCategoryCommand,
                        Command outAdminMenu) {
        this.ageReportCommand = ageReportCommand;
        this.costAllToysCommand = costAllToysCommand;
        this.listToysCategoryCommand = listToysCategoryCommand;
        this.outAdminMenu=outAdminMenu;
    }
    public void outAdminMenu(){
        this.outAdminMenu.execute();
    }
    public void ageReport(){
        this.ageReportCommand.execute();
    }
    public void costAllToys(){
        this.costAllToysCommand.execute();
    }
    public void listToyCategory(){
        this.listToysCategoryCommand.execute();
    }
}
