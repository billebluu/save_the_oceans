import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MissionCompleted5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MissionCompleted5 extends World
{

    /**
     * Constructor for objects of class MissionCompleted5.
     * 
     */
    public MissionCompleted5()
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
        ContinueButton continueButton = new ContinueButton();
        addObject(continueButton,357,353);
    }
}
