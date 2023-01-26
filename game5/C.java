import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class C here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class C extends Actor
{
    /**
     * Act - do whatever the C wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      int i;
      
        
      move(-10);
      
      
      
      Actor actor = getOneIntersectingObject( B.class );
      
       
if( actor != null ){
    getWorld().showText( "GAME OVER", 800, 500 );
     Greenfoot.stop();
    getWorld().removeObject(actor);

    
    MyWorld myworld = (MyWorld) getWorld();
    int timer = myworld.timer;
    getWorld().showText( "Your Score: "+(5000-timer), 800, 600 );
    
    
     
    // TARO とぶつかった時の処理を書く
}
    setLocation(getX() - 1, getY());
         if(getX() <= 1){
            setLocation(getX() + 1600, Greenfoot.getRandomNumber(900)+200);
}
}
        }
    
            


