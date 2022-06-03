public class Main {
    public static void main(String[] args) {
        String[] names = {"index1","index2","index3"};
        Customer defaultConstructor = new Customer();
        Customer constructor = new Customer(20, "James", new String[]{"me", "you"});

        System.out.println("Default (empty constructor): "+defaultConstructor.GetName()+": "+defaultConstructor.GetNumber()+": "+defaultConstructor.GetNames());

        System.out.println("Passing parameters to constructor: "+constructor.GetName()+": "+constructor.GetNumber()+":"+constructor.GetNames()+":"+constructor.NamesToString());

        defaultConstructor.SetName("Margaret");
        defaultConstructor.SetNumber(500);
        defaultConstructor.SetNames(names);
        System.out.println("Default (empty constructor after using setters): "+defaultConstructor.GetName()+": "+defaultConstructor.GetNumber()+":"+constructor.GetNames()+":"+defaultConstructor.NamesToString());
    }
}
