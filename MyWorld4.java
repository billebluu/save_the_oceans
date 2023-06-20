import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld4 extends World
{
static Counter score = new Counter("Score : ");
    SimpleTimer timer = new SimpleTimer();
    static Counter time = new Counter("Time : ");
    static Actor choosenChara;
    
    /**
     * Constructor for objects of class MyWorld4.
     * 
     */
    public MyWorld4()
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
        timeIsOut();
    }
    
    private void prepare(){
        Mermaid mermaid = new Mermaid();
        addObject(choosenChara,594,378);

        addObject(score,83,461);
        score.setValue(0);
        
        addObject(time,622,464);
        time.setValue(120);
    }
    
    public void maxScoreIsAchieved(){
        int maxScore = score.getValue();
        if(maxScore == 30){
            Greenfoot.delay(7);
            Greenfoot.setWorld(new MissionCompleted4());
            StartButton.bgm.pause();
            Greenfoot.playSound("SFX_WIN.mp3");
        }
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
            Greenfoot.setWorld(new GameOver());
            StartButton.bgm.pause();
            Greenfoot.playSound("SFX_LOSE.mp3");
        }
    }
}
