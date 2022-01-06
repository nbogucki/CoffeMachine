package logic.components;

import logic.view.UserInterface;
import model.Storage;
import model.exceptions.EmptyBoxException;

abstract class Component {
    Storage storage;
    UserInterface userInterface;

    Component(Storage storage, UserInterface userInterface) {
        this.storage = storage;
        this.userInterface = userInterface;
    }

    public final boolean addComponent() {
        boolean status = false;
        try {
            tryAddComponent();
            status = true;
        } catch (EmptyBoxException ebe) {
            userInterface.showError("Brak produktu " + ebe.getMessage());
        } finally {
            userInterface.playSound();
        }
        return status;
    }

    abstract void tryAddComponent() throws EmptyBoxException, EmptyBoxException;

}
