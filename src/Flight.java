public class Flight {

    private String flightNo;
    private String airplane;
    private int capacity;
    private int booked;

    public String getFlightDetails(){
        return flightNo + "," +airplane;
    }

    public boolean CheckAvailable(){
        if(booked < capacity){
            return true;
        }
        return false;
}

    public void incremenetBooking(int i){
        booked +=i;
        capacity -= i;
    }


    public Flight(String flightNo,String airplane,int capacity,int booked){   //Contrutor-Parameterized
        this.flightNo=flightNo;
        this.airplane=airplane;
        this.capacity=capacity;
        this.booked = booked;
    }

    public String getFlightNo(){  // getter and setter
        return flightNo;
}
    public void setFlightNo(){
        this.flightNo=flightNo;
    }


    public String getAirplane(){
        return airplane;
    }
    public void setAirplane(){
        this.airplane=airplane;
    }


    public int getCapacity(){
        return capacity;
    }
    public void setCapacity(){
        this.capacity=capacity;
    }


    public int getBooked(){
        return booked;
    }
    public void setBooked() {
        this.booked = booked;
    }
}



