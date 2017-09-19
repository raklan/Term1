public class TV {

    private int screenSize;
    private String screenType;
    private boolean isOn;
    private int volume;


    public TV(){

        screenSize = 35;
        screenType = "CRT";
        isOn = false;
        volume = 0;

    }
    public TV(int s, String m){

        screenSize = s;
        screenType = m;
        isOn = false;
        volume = 0;

    }
    public TV(int s, String m, boolean o, int v){

        screenSize = s;
        screenType = m;
        isOn = o;
        volume = v;

    }

    public void printTV(){

        System.out.println("This "+screenSize+" inch "+screenType+" TV has a volume of "+volume);
        System.out.println("It is "+isOn+" that the TV is on.");

    }
    public static void main(String[]args){

        TV myTV = new TV();
        myTV.printTV();
        System.out.println();
        TV myOtherTV = new TV(5000,"Plasma");
        myOtherTV.printTV();
        System.out.println();
        TV myOtherOtherTV = new TV(9001,"Holographic", false, 9001);
        myOtherOtherTV.printTV();
    }
}
