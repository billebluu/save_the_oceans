import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MissionCompleted4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MissionCompleted4 extends World
{

    /**
     * Constructor for objects of class MissionCompleted4.
     * 
     */
    public MissionCompleted4()
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
        NextMissionButton5 nextMissionButton5 = new NextMissionButton5();
        addObject(nextMissionButton5,372,358);
    }
}
