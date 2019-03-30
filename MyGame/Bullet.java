import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Spaceship
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       setLocation(getX()  + speed, getY());
       checkBoundaries();
   }
   
   // Remove bullets they are off screen
    public void checkBoundaries()
   {
       if (getX() == 600) 
        {
            getWorld().removeObject(this);
        }
   }
    
   // Set the speed of the bullet 
   private int speed = 10;
}
