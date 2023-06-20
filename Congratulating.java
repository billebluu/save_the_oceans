import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Congratulating here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Congratulating extends World
{

    /**
     * Constructor for objects of class Congratulating.
     * 
     */
    public Congratulating()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        PlayAgainButton playAgainButton = new PlayAgainButton();
        addObject(playAgainButton,478,420);
        BackToMainButton backToMainButton = new BackToMainButton();
        addObject(backToMainButton,230,418);
    }
}
