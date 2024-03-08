import java.util.Random;

import processing.core.PApplet;

public class Sketch extends PApplet {

	// Variables
  int intHeight;
  int intWidth;

  public void settings() {
	
  // Size of the drawing
  size(600, 400);

  }
  public void setup() {

  // Drag Resizability 
  surface.setResizable(true);

  // Random Int Generation
  Random myRandom = new Random();
  intHeight = myRandom.nextInt((height/4)+1);
  intWidth = myRandom.nextInt((width/4)+1);

  if (intHeight %2 == 1 ){
    intHeight *= -1;
  }
  if (intWidth %2 == 1 ){
    intWidth *= -1;
  }
  
  }
  public void draw() {

  // Ratio Variables 
  float floatWidthRatio = (float)(width)/800;
  float floatHeightRatio = (float)(height)/600;

  // Random Background Colours
  if(intWidth <= 75 && intHeight <= 50)
     {
          background(3, 227, 252);
     }
     else if(intWidth > 75 && intHeight <= 50)
     {
          background(252, 104, 93);
     }
     else if(intWidth <= 75 && intHeight > 50)
     {
          background(160, 146, 240);
     }
     else
          background(147, 250, 219);
     {
}

  // Yellow Sun
  fill(242, 231, 15);
  stroke(0);
  triangle(500, 0, 480, 30, 513, 50);
  triangle(513, 50, 510, 85, 553, 86);
  triangle(550, 85, 568, 115, 600, 100);
  stroke(0);
  ellipse(600, 0, 200, 200);
  
  // Foundation of the house
  stroke(0);
  fill(232, 184, 102);
  rect(100*floatWidthRatio - intWidth, 200*floatHeightRatio - intHeight, 400*floatWidthRatio, 200*floatHeightRatio);  

  // Chimney of the house
  stroke(0);
  fill(145, 144, 122);
  rect(130*floatWidthRatio - intWidth, 75*floatHeightRatio - intHeight, 65*floatWidthRatio, 100*floatHeightRatio);

  // Smoke from the chimney
  stroke(245);
  fill(245);
  ellipse(160*floatWidthRatio - intWidth, 50*floatHeightRatio - intHeight, 35*floatWidthRatio, 35*floatHeightRatio);
  ellipse(150*floatWidthRatio - intWidth, 35*floatHeightRatio - intHeight, 45*floatWidthRatio, 45*floatHeightRatio);
  ellipse(175*floatWidthRatio - intWidth, 10*floatHeightRatio - intHeight, 60*floatWidthRatio, 60*floatHeightRatio);

  // Roof of the house
  stroke(0);
  fill(150, 101, 3);
  triangle(50*floatWidthRatio - intWidth, 200*floatHeightRatio - intHeight, 550*floatWidthRatio - intWidth, 200*floatHeightRatio - intHeight, 300*floatWidthRatio - intWidth, 50*floatHeightRatio - intHeight);
  
  // Windows of the house
  stroke(0);
  fill(125, 192, 240);
  ellipse(175*floatWidthRatio - intWidth, 290*floatHeightRatio - intHeight, 50*floatWidthRatio, 100*floatHeightRatio);
  ellipse(425*floatWidthRatio - intWidth, 290*floatHeightRatio - intHeight, 50*floatWidthRatio, 100*floatHeightRatio);

  // Doors of the house
  stroke(0);
  fill(212, 153, 53);
  rect(250*floatWidthRatio - intWidth, 285*floatHeightRatio - intHeight, 100*floatWidthRatio, 115*floatHeightRatio);
  line(300*floatWidthRatio - intWidth, 285*floatHeightRatio - intHeight, 300*floatWidthRatio - intWidth, 400*floatHeightRatio - intHeight);

  // Time Display
  int intHours = hour();
  int intMinutes = minute();
  fill(0, 0, 0);
  textSize(50);
  text(intHours, 50, 50);
  text(intMinutes, 50, 100);
}
}