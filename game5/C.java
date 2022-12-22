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
      
      
        
      move(-5);
      
      
      Actor actor = getOneIntersectingObject( B.class );
       
if( actor != null ){
    getWorld().showText( "GAME OVER", 800, 500 );
     getWorld().removeObject(actor);
     Greenfoot.stop();
    // TARO とぶつかった時の処理を書く
}
            setLocation(getX() - 1, getY());
            if(getX() <= 1){
            setLocation(getX() + 700, Greenfoot.getRandomNumber(250)+100);

    }
}
}
