import processing.core.PApplet;

public class MainApp extends PApplet {
    public static void main(String[] args){
        PApplet.main("MainApp", args);
    }
    float x = 0;
    float y = 100;
    float speed = 2;
    float c = color(0);
    Car car1;
    Car car2;

    public void settings(){
        size(600, 600);
    }

    public void setup(){
        smooth();
        background(225);
    }
    public void display(){
        fill(200);
        rect(x, y,100, 30, 10);

    }

    public void move() {
        x = x + speed;
        if (x > width) {
            x = 0;
        }
    }

    public void draw(){
        noFill();
        move();
        display();

        stroke(0, random(128, 255), 0);
//        strokeWeight(random(1, 4) );
//        ellipse(mouseX, mouseY, 33, 33);
//        ellipse(mouseX, mouseY, 130, 130);    // Top circle
//        ellipse(mouseX+20, mouseY, 50, 50); // Middle circle
    }
}



