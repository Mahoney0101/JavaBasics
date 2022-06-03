public class Customer {
    private int number = 0;
    private String name = "";
    private String[] names = {};

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
        String returnValue = "";
        for(int i=0;i<this.names.length; i++){
            returnValue+=names[i]+" ";
        }
        return returnValue;
    }
}
