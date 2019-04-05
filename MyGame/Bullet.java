import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Bullet 
 * 
 * @J.Huang
 * @version 1.0
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
            Greenfoot.playSound("Explosion.wav");
            Space world = (Space) getWorld();
            world.changeScoreBy(30);
            world.removeObject(this);
        }
    }
}
