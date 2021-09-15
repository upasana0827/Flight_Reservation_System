public class Adress {

    String streetName;
    String cityName;
    String stateName;

    String getAdressDetails() {

        return streetName + "," + cityName + "," + stateName;

    }


    public Adress(String streetName,String cityName,String stateName){   //Contrutor-Parameterized
       this.streetName=streetName;  // "this" keyword to refer current object in the constructor.
        this.stateName=stateName;
        this.stateName=stateName;
    }

}
