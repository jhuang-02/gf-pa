import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    private boolean hasBeenRemoved;

    /**
     * Constructor
     * 
     * Runs once when object created
     */
    Bullet ()
    {
        hasBeenRemoved = false;
    }

    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Greenfoot.playSound("EnergyGun.wav");
        setLocation(getX()  + speed, getY());
        checkBoundaries();
        if (hasBeenRemoved == false)
        {
            checkCollision();       
        }
    }

    // Remove bullets if they are off screen
    public void checkBoundaries()
    { 
        if (getX() == 599) 
        {
            hasBeenRemoved = true;
            getWorld().removeObject(this);
        }
    }

    // Set the speed of the bullet 
    private int speed = 10;

    // Remove asteroid if touched and add points 
    public void checkCollision()
    {
        if (isTouching(Asteroid.class)) 
        {
            removeTouching(Asteroid.class); 
            Space world = (Space) getWorld();
            world.changeScoreBy(30);
            world.removeObject(this);
        }

    }
}
