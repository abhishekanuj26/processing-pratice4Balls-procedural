import processing.core.PApplet;
public class processing4Balls extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int Diameter = 10;
    int x1=0,x2=0,x3=0,x4=0;
    public static void main(String[] args) {
        PApplet.main("processing4Balls",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }




    @Override
    public void draw() {

        ellipse(x1,HEIGHT/5, Diameter, Diameter);
        ellipse(x2,HEIGHT/5*2, Diameter, Diameter);
        ellipse(x3,HEIGHT/5*3, Diameter, Diameter);
        ellipse(x4,HEIGHT/5*4, Diameter, Diameter);
        x1++;
        x2+=2;
        x3+=3;
        x4+=4;

    }
}
