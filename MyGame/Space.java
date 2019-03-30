import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space extends World
{

    /**
     * Constructor for objects of class Space.
     * 
     */
    public Space()
    {    
        super(600, 400, 1); 
        Spaceship spaceship = new Spaceship();
        addObject(spaceship, 50, 200);
    }
    
    public void act()
    {
        if (Greenfoot.getRandomNumber(100) < 1)
        {
            addObject(new Asteroid(), 779, Greenfoot.getRandomNumber(360));
        }
    }
}
