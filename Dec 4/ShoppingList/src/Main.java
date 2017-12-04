import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("IPad");
        list.add("Laptop");
        list.add("You");
        list.add("Dragon");

        System.out.println(list);

        list.add(1,"Gaming Monitor");

        System.out.println(list);

        list.add(list.set(2,"Better GPU"));

        System.out.println(list);

        int num = (list.indexOf("IPad"));

        System.out.println(list.remove(1));
        System.out.println(list.remove("You"));

        list.add(list.set(0,"Coat"));

        System.out.println(list);

    }
}
