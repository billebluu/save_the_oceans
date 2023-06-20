import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bonus2Completed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bonus2Completed extends World
{

    /**
     * Constructor for objects of class Bonus2Completed.
     * 
     */
    public Bonus2Completed()
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
        NextMissionButton6 nextMissionButton6 = new NextMissionButton6();
        addObject(nextMissionButton6,355,354);
    }
}
