package hotel;

public class RoomsNotAvailableException extends Exception{
    public RoomsNotAvailableException(){
        super();
    }
    public RoomsNotAvailableException(int roomsAvailable){
        super("Currently there are" + roomsAvailable + "rooms available");
    }
}
