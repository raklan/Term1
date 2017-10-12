public class Employee {

    private static int numOfEmployees = 0;
    private final int ID;

    public Employee(){

        numOfEmployees++;
        ID = numOfEmployees;

    }
    //After running first time change to String return type and send reply message
    public String email(String s){
        System.out.println("ID "+ID+" has been emailed:\n "+ s);
        return "I'll be there from ID: "+ID;
    }
}
