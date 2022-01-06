package logic.components;

import logic.view.UserInterface;
import model.Storage;
import model.exceptions.EmptyBoxException;

public class ChocolateComponent extends Component{
    public ChocolateComponent(Storage storage, UserInterface userInterface) {
        super(storage, userInterface);
    }

    @Override
    void tryAddComponent() throws EmptyBoxException {
        storage.getChocolate();
        userInterface.showStep("Czekolada");
    }
}
