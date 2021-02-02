package Tests;

import AdminController.AdminMenu;
import org.junit.Assert;
import org.junit.Test;
public class AllToysCostTest {
    @Test
            public void CostTest(){
    AdminMenu adminMenu= new AdminMenu();
    Assert.assertEquals(700,adminMenu.costAllToys());
}
}
