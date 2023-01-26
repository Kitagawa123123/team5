import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class B here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class B extends Actor
{
    /**
     * Act - do whatever the B wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setRotation(90);
        move(5);
        
        if( Greenfoot.isKeyDown( "right" ) ){
        setRotation(0);
        move(5);}
        if( Greenfoot.isKeyDown( "up" ) ){
        setRotation(-90);
        move(10);}
        if( Greenfoot.isKeyDown( "left" ) ){
        setRotation(180);
        move(10);}
        
        if( isAtEdge() ){
    getWorld().showText( "GAME OVER", 800, 500 );  
    getWorld().showText( "Your Score:-1", 800, 600 );
    Greenfoot.stop();
    getWorld().removeObject( this );
}
    }
}
        
        /*if(){
            getWorld().removeObject( actor );
            Greenfoot.stop();
        //}//画面外に戦闘機が行った時のゲームオーバー処理
        
}// Add your action code here.
    }*/    

