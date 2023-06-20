import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bonus1Completed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bonus1Completed extends World
{

    /**
     * Constructor for objects of class Bonus1Completed.
     * 
     */
    public Bonus1Completed()
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
        NextMissionButton3 nextMissionButton3 = new NextMissionButton3();
        addObject(nextMissionButton3,355,354);
    }
}
