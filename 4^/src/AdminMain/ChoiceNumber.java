package AdminMain;

import AdminController.LoaderAdmin;
public enum ChoiceNumber implements Choiceable{
    FIRST_CHOICE{
        @Override
        public void actingUserChoice(LoaderAdmin loaderAdmin) {
            loaderAdmin.ageReport();
        }
    },
    SECOND_CHOICE{
        @Override
        public void actingUserChoice(LoaderAdmin loaderAdmin) {
            loaderAdmin.costAllToys();
        }
    },
    THIRD_CHOICE{
        @Override
        public void actingUserChoice(LoaderAdmin loaderAdmin) {
            loaderAdmin.listToyCategory();
        }
    }
}
