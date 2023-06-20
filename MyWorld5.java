import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld5 extends World
{
    static Counter score = new Counter("Score : ");
    static Counter HP = new Counter("HP : ");
    static Actor choosenChara;
    
    /**
     * Constructor for objects of class MyWorld3.
     * 
     */
    public MyWorld5()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1); 
        prepare();
    }

    public void act(){
        Bottle bottle = new Bottle();
        bottle.setSpeed(2);
        if(Greenfoot.getRandomNumber(500)<3){
            addObject(bottle, Greenfoot.getRandomNumber(700), 1);
        }
        
        Can can = new Can();
        can.setSpeed(2);
        if(Greenfoot.getRandomNumber(500)<3){
            addObject(can, Greenfoot.getRandomNumber(700), 1);
        }
        
        Poison poison = new Poison();
        poison.setSpeed(1);
        if(Greenfoot.getRandomNumber(1000)<3){
            addObject(poison, Greenfoot.getRandomNumber(700), 1);
        }

        Trap trap = new Trap();
        trap.setSpeed(1);
        if(Greenfoot.getRandomNumber(1000)<3){
            addObject(trap, Greenfoot.getRandomNumber(700),1);
        }
        
        maxScoreIsAchieved();
        hpIsOut();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Mermaid mermaid = new Mermaid();
        addObject(choosenChara,594,378);

        addObject(score,83,461);
        score.setValue(0);
        
        addObject(HP,622,464);
        HP.setValue(3);
    }
    
    public void maxScoreIsAchieved(){
        int maxScore = score.getValue();
        if(maxScore == 40){
            Greenfoot.delay(7);
            Greenfoot.setWorld(new Congratulating());
            StartButton.bgm.pause();
            Greenfoot.playSound("SFX_WIN.mp3");
        }
    }
    
    public void hpIsOut(){
        int healthPoints = HP.getValue();
        if(healthPoints == 0){
            Greenfoot.delay(7);
            Greenfoot.setWorld(new GameOver());
            StartButton.bgm.pause();
            Greenfoot.playSound("SFX_LOSE.mp3");
        }
    }
}
