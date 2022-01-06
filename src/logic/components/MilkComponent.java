package logic.components;

import logic.view.UserInterface;
import model.Storage;
import model.exceptions.EmptyBoxException;

import java.awt.*;

public class MilkComponent extends Component {
    public MilkComponent(Storage storage, UserInterface userInterface) {
        super(storage, userInterface);
    }

    @Override
    void tryAddComponent() throws EmptyBoxException {
        storage.getMilk();
        userInterface.showStep("Mleko");
    }
}
