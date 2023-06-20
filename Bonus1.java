import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bonus1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bonus1 extends World
{
    static Counter score = new Counter("Score : ");
    SimpleTimer timer = new SimpleTimer();
    static Counter time = new Counter("Time : ");
    static Actor choosenChara;
    
    /**
     * Constructor for objects of class Bonus1.
     * 
     */
    public Bonus1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1); 
        prepare();
    }
    
    public void act(){
        StarfishBubble starfishbubble1 = new StarfishBubble();
        starfishbubble1.setSpeed(4);
        if(Greenfoot.getRandomNumber(200)<3){
            addObject(starfishbubble1, Greenfoot.getRandomNumber(700), 1);
        }
        StarfishBubble starfishbubble2 = new StarfishBubble();
        starfishbubble2.setSpeed(2);
        if(Greenfoot.getRandomNumber(500)<3){
            addObject(starfishbubble2, Greenfoot.getRandomNumber(700), 1);
        }
        
        timeIsOut();
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
        
        addObject(time,622,464);
        time.setValue(30);
    }
    
    public void timeIsOut(){
        int start = 1;
        if(start == 1){
            if(timer.millisElapsed()>1000){
                time.add(-1);
                timer.mark();
            }
        }
        
        int t1 = time.getValue();
        if (t1 == 0){
            Greenfoot.delay(7);
            Greenfoot.setWorld(new Bonus1Completed());
            StartButton.bgm.pause();
            Greenfoot.playSound("SFX_WIN.mp3");
        }
    }
}
