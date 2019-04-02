import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is where the battle take place
 * 
 * @author J.Huang 
 * @version 1.0
 */
public class Space extends World
{
    public boolean gameOn;
    public int score;
    
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
        changeScoreBy(1);
    }
    
    // Show score on the screen
    public void showScore()
    {
        showText("Score: " + score, 100, 50);
    }
    
    // Change score
    public void changeScoreBy(int thisMuch)
    {
        score += thisMuch;
        showScore();
    }
    
    //Generate new asteroid automaticly
    private void putAsteroid()
    {
        if (Greenfoot.getRandomNumber(100) < 3)
        {
            addObject(new Asteroid(), 779, Greenfoot.getRandomNumber(360));
        }
    }
    
   
}
