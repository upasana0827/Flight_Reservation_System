public class Contact {

    String name;
    String phone;
    String emailID;



    Contact(String name,String phone,String emailID){  //Contrutor-Parameterized
        this.name=name;
        this.phone=phone;
        this.emailID=emailID;

    }
    String getContactDetails(){
        return name + ", " + phone + ", " + emailID;
    }

}


