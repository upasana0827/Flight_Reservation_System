public class Passenger {

    private static  int idCount;

    private static class Adress{   //nested class

        String streetName,cityName,stateName;


        public Adress(String streetName,String cityName,String stateName){

            this.streetName=streetName;
            this.cityName=cityName;
            this.stateName=stateName;
        }
    }

    private Adress adress;

    private class Contact{
        String name,phone,emailId;


        public Contact(String name,String phone,String emailID){
            this.name= name;
            this.phone=phone;
            this.emailId=emailID;
        }
    }

    private Contact contact;

    public Passenger(String streetName,String cityName,String stateName,String name,String phone,String emailID){
        this.idCount=idCount++;
        this.adress= new Adress(streetName, cityName, stateName);
        this.contact=new Contact(name,phone,emailID);

    }
    String getAdressDetails(){
        return adress.streetName+ ", " +adress.cityName+","+adress.stateName;
    }
    String getContactDetails(){
        return contact.name+", "+contact.phone+", "+contact.emailId;
    }

    public int getPassengerCount(){
        return idCount;
    }
}
