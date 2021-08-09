public class Assignment6 {
    
    private String bookingID;
    private String departureDate;
    private int numberOfTickets;
    private float price;
    private String cabinType;
    private float totalPrice;
    private String destination;

    public Assignment6(String bookingID,String departureDate, int numberOfTickets,float price, String cabinType, String destination  ){
        this.bookingID = bookingID;
        this.departureDate = departureDate;
        this.numberOfTickets = numberOfTickets;
        this.price = price;
        this.cabinType = cabinType;
        this.destination = destination;

    }

    public static void main(String[] args){
        Assignment6 booking_1 = new Assignment6("B001", "12/3/2021", 45,34000 , "big", "Ha Noi");
        Assignment6 booking_2 = new Assignment6("B001", "12/3/2021", 45,34000 , "big", "Ha Noi");
        // total price
        // display all the information about tickets booked
    }
}
