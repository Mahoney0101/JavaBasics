import java.util.Scanner;
public class Customer {
    private int number;
    private String name;
    private String[] names;

    public Customer(){
    }

    public Customer(int num, String customerName, String[] names){
        this.number = num;
        this.name = customerName;
        this.names = names;
    }

    public int GetNumber(){
        return this.number;
    }

    public String GetName(){
        return this.name;
    }

    public String[] GetNames(){
        return this.names;
    }

    public void SetNumber(int num){
        this.number = num;
    }

    public void SetName(String customerName){
        this.name = customerName;
    }

    public void SetNames(String[] names){
        this.names = names;
    }

    public String NamesToString(){
        int i=0;

        String returnValue = "";
        //for
//        for(int i=0;i<this.names.length; i++){
//            returnValue+=names[i]+" ";
//        }
        //foreach
//        for (String name: names) {
//            returnValue+=name+" ";
//        }
        //while
//        while(i<this.names.length){
//            returnValue+=names[i]+" ";
//            i++;
//        }

        //do while
        do {
            returnValue+=names[i]+" ";
            i++;
        }while (i<this.names.length);

        return returnValue;
    }
}
