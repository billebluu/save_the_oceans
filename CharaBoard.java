import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CharaBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CharaBoard extends World
{

    /**
     * Constructor for objects of class CharaBoard.
     * 
     */
    Actor chara1 = new Chara1();
    Actor chara2 = new Chara2();
    Actor chara3 = new Chara3();
    Actor chara4 = new Chara4();
    Actor chara5 = new Chara5();
    public CharaBoard()
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
        Chara1 chara1 = new Chara1();
        addObject(chara1,168,248);
        GreenfootImage image1 = chara1.getImage();
        
        Chara2 chara2 = new Chara2();
        addObject(chara2,344,245);
        GreenfootImage image2 = chara2.getImage();
        
        Chara3 chara3 = new Chara3();
        addObject(chara3,524,245);
        GreenfootImage image3 = chara3.getImage();
        
        Chara4 chara4 = new Chara4();
        addObject(chara4,251,343);
        GreenfootImage image4 = chara4.getImage();
        
        Chara5 chara5 = new Chara5();
        addObject(chara5,451,343);
        GreenfootImage image5 = chara5.getImage();
    }
}
