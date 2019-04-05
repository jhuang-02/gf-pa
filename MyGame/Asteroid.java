import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Asteroid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asteroid extends Actor
{
    /**
     * Act - do whatever the Asteroid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public void act() 
    {
      move(-6); 
      remove();      
    }  

    // remove asteroid when it is out of the screen
     private void remove()
    {
        if (getX() == 0) 
        {
            Space world = (Space) getWorld();
            world.changeScoreBy(-20);
            getWorld().removeObject(this);
        }
    }
    
    
}
