//Make a variable to hold the X co-ordinate of the dot and set it to void setup() {
   
 int x = 45;
void setup(){
 size(800, 200);
}



void draw() {
    //make it a nice color
 background(34, 45, 56);
  fill(#506AAF);
  ellipse(x, 150, 34, 34);
    //if the mouse is pressed...
if(mousePressed){
x=x+123;
}
    //... change the X co-ordinate so that the dot moves to the right
    //Draw an ellipse of height and width 10Make sure to use your variable for the X position.
    //Make your dot move really fast so that it can win the race 
       // (you have to figure out what part of your code to change)
    //Use this method to play a ding when your dot crosses the finish line. 
if(x>800){
playSound();
}
}


import ddf.minim.*;
boolean soundPlayed = false;
void playSound() {
    if (!soundPlayed) {
        Minim minim = new Minim(this);
        AudioSample sound = minim.loadSample("you win.mp3");
        sound.trigger();
        soundPlayed = true;
    }
}