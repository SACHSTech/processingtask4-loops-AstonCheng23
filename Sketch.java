import processing.core.PApplet;

public class Sketch extends PApplet {
	int widthScale = 1;
  int heightScale = 1;

  int x = 0;

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(800*widthScale, 800*heightScale);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255, 255, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  stroke(0);
    line (0, 400, 800, 400);
    
	  stroke(0);
    line (400, 0, 400, 800);

    // first quadrant
    for (x = 45; x < 400*widthScale; x += 45*widthScale){
      stroke(0);
      line(x*widthScale, 0*heightScale, x*widthScale, 400*heightScale);
//      if (x > 399){
//        x = 0;
//      }

      stroke(0);
      line(0*widthScale, x*heightScale, 400*widthScale, x*heightScale);
        }
    // second quadrant

    // third quadrant
    for (x = 0; x < 400*widthScale; x += 1*widthScale){
      stroke((int)(x*0.6375)*widthScale);
      line(x*widthScale, 400*heightScale, x*widthScale, 800*heightScale);

      
    }
  
  }
    // define other methods down here.
}