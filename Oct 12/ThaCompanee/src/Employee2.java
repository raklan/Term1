public class Employee2 {

    private static int numOfEmployees = 0;
    private final int ID;
    private Company2 boss;

    public Employee2(Company2 b){

        numOfEmployees++;
        ID = numOfEmployees;
        boss = b;

    }
    //After running first time change to String return type and send reply message
    public void email(String s){
        System.out.println("ID "+ID+" has been emailed:\n "+ s);
        reply();
    }
    public void reply(){
        boss.email("\"I'll be there\" from ID: "+ID);
    }
}
