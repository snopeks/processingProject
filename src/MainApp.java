import processing.core.PApplet;
public class MainApp extends PApplet {
    public static void main(String[] args){
        PApplet.main("MainApp", args);
    }

    public void settings(){
        size(600, 600);
    }

    public void setup(){
        smooth();
        background(0);
    }

    public void draw(){
        noFill();

        stroke(0, random(128, 255), 0, 64);
        strokeWeight(random(1, 4) );

//        fill(255, 0, 255);
        ellipse(random (width), random(height), 30, 30);
    }
}