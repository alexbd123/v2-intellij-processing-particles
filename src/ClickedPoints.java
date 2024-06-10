import processing.core.PApplet;

public class ClickedPoints {
    private int x;
    private int y;
    private String myNum;
    private final PApplet p5;

    public ClickedPoints(PApplet p5, int x, int y, String myNum){
        this.p5 = p5;
        this.x = x;
        this.y = y;
        this.myNum = myNum;
    }

    public static void mousePressed(){
//        new ClickedPoints()
    }
}
