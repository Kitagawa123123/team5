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
      setRotation(180);
      move(3);
      Actor C = getOneIntersectingObject( B.class );
if( C != null ){
    
    System.out.println("GAVE OVER");
     getWorld().removeObject( B );
    // TARO とぶつかった時の処理を書く
}

    }
}
