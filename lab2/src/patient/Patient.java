package patient;
import org.apache.commons.lang3.StringUtils;
public class Patient {
    private  int id;
    private  String lastName;
    private  String name;
    private  String middleName;
    private  String address;
    private  int phoneNumber;
    private  int cardNumber;
    private  String diagnose;
   public Patient(String[] data){
        id=Integer.parseInt(data[0]);
        lastName=data[1];
        name=data[2];
        middleName= data[3];
        address=data[4];
        phoneNumber=Integer.parseInt(data[5]);
        cardNumber=Integer.parseInt(data[6]);
        diagnose=data[7];
    }
    ///////////////
    public String getDiagnose(){ return diagnose;}
    public int getCardNumber(){return cardNumber;}
    public int getPhoneNumber(){return phoneNumber;}
    public  void Print()

    {
        System.out.print(id+".\t");
        System.out.print(StringUtils.rightPad(lastName+",", 20, ' ')+"\t");
        System.out.print(StringUtils.rightPad(name+",", 20, ' ')+"\t");
        System.out.print(StringUtils.rightPad(middleName+",", 20, ' ')+"\t");
        System.out.print(StringUtils.rightPad(address+",", 20, ' ')+"\t");
        System.out.print(phoneNumber+";\t");
        System.out.print("\t\t\t"+cardNumber+";\t");
        System.out.println("\t\t\t"+diagnose);
    }
}

