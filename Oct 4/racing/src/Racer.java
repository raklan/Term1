

public class Racer extends EzImage{

    private int count;
    private int deltaX;
    private int deltaY;
    boolean isDone;
    int leg;

    public Racer(int x, int y, int w, int h, String i){

        super(x,y,w,h,i);
        count = 0;
        deltaX = 20;
        deltaY = 20;
        isDone = false;
        leg = 1;

    }
    public void move() {
        int x = this.getX();
        int y = this.getY();
        boolean done = this.isDone;
        int leg = this.getLeg();

        if(leg==1) {
            this.setLocation(x + deltaX, y);
            count ++;
        }
        else if(leg==2) {
            this.setLocation(x, y + deltaY);
            count ++;
        }
        else if(leg==3) {
            this.setLocation(x - deltaX, y);
            count ++;
        }
        else if(leg==4) {
            this.setLocation(x, y - deltaY);
            count ++;
        }

        if(count%20==0)
            this.setLeg(leg+1);



    }
    public int getLeg(){
        return leg;
    }
    public void setLeg(int l){
        leg = l;
    }

}
