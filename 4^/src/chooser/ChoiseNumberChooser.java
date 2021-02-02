package chooser;
import control_chooser.Loader;

public enum ChoiseNumberChooser implements ChoiseableChooser {
    FIRST_CHOICE{
        @Override
        public void actingUserChoice(Loader loader) {
            loader.takeAdmin();
        }
    },
    SECOND_CHOICE{
        @Override
        public void actingUserChoice(Loader loader) {loader.takeClient();        }
    },
    THIRD_CHOICE{
        @Override
        public void actingUserChoice(Loader loader) {
            loader.help();
        }
    },
    FOURTH_CHOICE{
        @Override
        public void actingUserChoice(Loader loader) {
            loader.printList();
        }
    };
}
