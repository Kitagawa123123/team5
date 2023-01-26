import greenfoot.*;  // (World;, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

        super(1600, 1000, 1);
        addObject( new B(), 100, 500 );
        
        
        addObject( new C(), 0, 0 );
       
        
    }
    public int timer = 5000;
    public void act() {
    timer--;
    if(timer==4500)
    {addObject( new C(), 0, 0 );
     addObject( new C(), 0, 0 );}
    if(timer==4000)
    {addObject( new C(), 0, 0 );
     addObject( new C(), 0, 0 );}
     if(timer==3500)
    {addObject( new C(), 0, 0 );
     addObject( new C(), 0, 0 );}
   if(timer==3000)
    {addObject( new C(), 0, 0 );
     addObject( new C(), 0, 0 );}
     if(timer==2500)
    {addObject( new C(), 0, 0 );
     addObject( new C(), 0, 0 );}
     if(timer==2000)
    {addObject( new C(), 0, 0 );
     addObject( new C(), 0, 0 );}
     if(timer==1500)
    {addObject( new C(), 0, 0 );
     addObject( new C(), 0, 0 );}
    if(timer==1000)
    {addObject( new C(), 0, 0 );
     addObject( new C(), 0, 0 );}
     if(timer==500)
    {addObject( new C(), 0, 0 );
     addObject( new C(), 0, 0 );}
   
    if (timer <= 0) {
        Greenfoot.stop();
        showText( "GAME CLEAR", 800, 500 );
        showText( "Your Score = 5000", 800, 600 );
        // pause the execution of the program if 'timer' is less than or equal to 0
    }
    showText(""+timer, 1550, 30);
}
}