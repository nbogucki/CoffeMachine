package logic.components;

import logic.view.UserInterface;
import model.Storage;
import model.exceptions.EmptyBoxException;

public class CoffeeComponent extends Component{
    public CoffeeComponent(Storage storage, UserInterface userInterface) {
        super(storage, userInterface);
    }

    @Override
    void tryAddComponent() throws EmptyBoxException {
        storage.getCoffee();
        userInterface.showStep("Kawa");
    }
}
