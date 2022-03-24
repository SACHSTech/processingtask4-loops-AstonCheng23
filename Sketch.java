import processing.core.PApplet;

public class Sketch extends PApplet {
	double widthScale = 1.2;
  double heightScale = 1;

  int x = 0;
  int circleLoopX = (int) (400*widthScale);
  int circleLoopY = 66;

  int rotateVar = 0;
  int rotationT = 0;

  double scaleWidthRatio = (400*widthScale)/9;
  double scaleHeightRatio = (400*heightScale)/9;
  
  boolean stopRotate = false;
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size((int)(800*widthScale), (int)(800*heightScale));
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
    line (0, (int)(400*heightScale), (int)(800*widthScale), (int)(400*heightScale));
    
	  stroke(0);
    line ((int)(400*widthScale), 0, (int)(400*widthScale), (int)(800*heightScale));

    // first quadrant
    for (x = (int)(45*widthScale); ceil(x) < 400*widthScale; x += scaleWidthRatio){
      stroke(0);
      line(x, (float)(0*heightScale), x, (float)(400*heightScale));
    }
    for (x = (int)(45*heightScale); ceil(x) < 400*heightScale; x += scaleHeightRatio){
      stroke(0);
      line((float)(0*widthScale), x, (int)(400*widthScale), x);
    }
    // second quadrant
    for (circleLoopY = 66; circleLoopY < 400*heightScale; circleLoopY += 67*heightScale){
      for (circleLoopX = (int)(466*widthScale); circleLoopX < 800*widthScale; circleLoopX += 67*widthScale){
        stroke(0);
        fill(100, 100, 100);
        ellipse(circleLoopX, circleLoopY, 25, 25);
      }
    }
    // third quadrant
    for (x = 0; x < 400*widthScale; x += 1*widthScale){
      stroke(ceil((float)(((x/widthScale)*(0.6375*widthScale)))));
      line((int)(x*widthScale), (int)(400*heightScale), (int)(x*widthScale), (int)(800*heightScale));
    }
    // fourth quadrant
    stroke(0);
    fill(0);
    ellipse((float)(600*widthScale), (float)(600*heightScale), (float)(25*widthScale), (float)(25*heightScale));
    
    translate((float)(600*widthScale), (float)(600*heightScale));

    stroke(0);
    fill(200, 0, 10);
    ellipse(0, (float)(40*widthScale), 25, 80);

    if (stopRotate == false){
      for (rotationT = 0; rotationT < 9; rotateVar += 45, rotationT ++){
        rotate(radians(rotateVar + 45));

        stroke(0);
        fill(200, 0, 10);
        ellipse(0, (float)(40*widthScale), 25, 80);
        stopRotate = true;
        
      }
    }
  }
    // define other methods down here.
/*    stroke(0);
    line((int)(circleLoop*widthScale), (int)(0*heightScale), (int)(circleLoop*widthScale), (int)(400*heightScale));
    stroke(0);
    line((int)(400*widthScale), (int)((circleLoop - 400)*heightScale), (int)(800*widthScale), (int)((circleLoop - 400)*heightScale));
*/
}