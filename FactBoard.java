import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FactBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FactBoard extends World
{

    /**
     * Constructor for objects of class FactBoard.
     * 
     */
    public FactBoard()
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
        FactObject1 factObject1 = new FactObject1();
        addObject(factObject1,147,283);
        FactObject2 factObject2 = new FactObject2();
        addObject(factObject2,238,281);
        FactObject3 factObject3 = new FactObject3();
        addObject(factObject3,336,283);
        FactObject4 factObject4 = new FactObject4();
        addObject(factObject4,445,281);
        FactObject5 factObject5 = new FactObject5();
        addObject(factObject5,549,276);
        ExitButton exitButton = new ExitButton();
        addObject(exitButton,603,70);
    }
}
