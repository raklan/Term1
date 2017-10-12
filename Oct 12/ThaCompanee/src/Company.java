public class Company {
    private Employee a, b, c;

    public Company() {

        a = new Employee();
        b = new Employee();
        c = new Employee();

    }
    public void email(String s){
        System.out.println("RSVP " + s);
    }
    public void dailyEmail(){
        System.out.println(a.email("Scrum meeting at 9:00 AM. RSVP"));
        System.out.println(b.email("Scrum meeting at 9:00 AM. RSVP"));
        System.out.println(c.email("Scrum meeting at 9:00 AM. RSVP"));
    }
    public static void main(String[]args){
        Company egor = new Company();
        egor.dailyEmail();
    }
}
