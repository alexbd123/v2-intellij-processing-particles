import processing.core.PApplet;

public class Main extends PApplet {

    //The data stored in an instance of this Main class.
    private Spark[] sparks;

    public static void main(String[] args) {
        //You don't need to know what this does
        PApplet.main(new String[]{"Main"});
    }

    @Override
    public void settings() {
        size(800, 600);
        //fullScreen();
    }

    @Override
    public void setup() {
        int[] palette = createPalette();
        //Call the createSparks method, passing a reference to this PApplet (for all the Processing functions like circle)
        sparks = Spark.createSparks(this, 100, palette);
        background(Utils.pickFromArray(palette));
        showBigMessage("Press escape to exit");
    }

    @Override
    public void draw() {
        //background(100);
        for (Spark s : sparks){
            s.display();
        }
        for (Spark s : sparks){
            s.update();
        }
    }

    @Override
    public void mousePressed() {
        for(Spark s:sparks){
            s.reactToClick(mouseX, mouseY);
        }
    }

    private void showBigMessage(String msg) {
        textSize(80);
        fill(60);
        textAlign(CENTER, CENTER);
        text(msg, width/2f, height/2f);
    }

    private int[] createPalette(){
        return new int[]{
                color(141, 204, 173),
                color(152, 136, 100),
                color(254, 166, 162),
                color(249, 214, 172),
                color(255, 233, 175)
        };
    }
}
