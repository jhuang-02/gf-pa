import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spaceship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spaceship extends Actor
{
    /**
     * Act - do whatever the Spaceship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeyPress();
        checkCollision();
        fireBullets();
    }  
    
    // control the spaceship with keys
    private void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("up")) 
        {
            setLocation(getX(), getY()-4);
        }
        
        if (Greenfoot.isKeyDown("down")) 
        {
            setLocation(getX(), getY()+4);
        }
        
        
    }
    
    // If the spaceship collided with an asteroid, the game is over
    private void checkCollision()
    {
        if (isTouching(Asteroid.class)) 
        {
            
            Greenfoot.stop();
        }
    }
    
    // Make the spaceship fire bullets
    private void fireBullets()
    {
        if(Greenfoot.isKeyDown("space")) 
        {
            getWorld().addObject(new Bullet(), getX(), getY());
        }
    }
}
