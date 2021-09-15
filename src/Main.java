public class Main {
    public static void printTicketDetails(Ticket ticket){
        System.out.println(ticket.getPnr());
    }

    public static void main(String[] args) {


        Flight flight  = new Flight("7894","Indigo",110,105);


        Passenger p1;
        p1 = new Passenger("Wakad","Pune","Maharashtra","Upasana","987456123",
                "upasana@gmail.com");


        Passenger p2 ;
        p2 = new Passenger("Charoda" , "Bhilai","Chhatigarh", "Abhishek","8602125755"
                ,"abhihek31@yahoo.com");
        flight.getCapacity();



        RegularTicket regTicket = new RegularTicket(1,"Delhi","Rajasthan","29/09/21,6",
                "29/11/20,10",flight,"18A",p1,false,"food,water,snacks");



        TouristTicket tourTicket = new TouristTicket(2,"Mumbai" , "Kerla","29/09/21,6 ",
                "29/11/20,10",flight,"18C",p2,false,"Hotel Vue,Beach Ave,Mumbai");

        System.out.println(regTicket.getPnr());
        System.out.println(tourTicket.getPnr());
    }
}

