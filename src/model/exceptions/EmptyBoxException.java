package model.exceptions;


    public class EmptyBoxException extends Exception {

        public EmptyBoxException(String nameOfProduct){
            super("Brak produktu: "+ nameOfProduct);
        }
}
