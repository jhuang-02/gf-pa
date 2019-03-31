import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is where the battle take place
 * 
 * @author J.Huang 
 * @version 1.0
 */
public class Space extends World
{
    
    // Set the area of the space and put the space ship into the world
    public Space()
    {    
        super(600, 400, 1); 
        Spaceship spaceship = new Spaceship();
        addObject(spaceship, 50, 200);
    }
    
    // create asteroid in the space
    public void act()
    {
        putAsteroid();
        showScore();
    }
    
    // Show score on the screen
    private int score;
    private void showScore()
    {
        showText("Score: " + score, getWidth() - 500, 50);
    }
    
    private void putAsteroid()
    {
        if (Greenfoot.getRandomNumber(100) < 1)
        {
            addObject(new Asteroid(), 779, Greenfoot.getRandomNumber(360));
        }
    }
}
