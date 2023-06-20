import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Chara4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chara4 extends Actor
{
    Mermaid mermaid = new Mermaid();
    /**
     * Act - do whatever the Chara4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mousePressed(this)){
            getImage().scale((int)Math.round(getImage().getWidth()*0.9),(int)(Math.round(getImage().getHeight()*0.9)));
        }
        if(Greenfoot.mouseClicked(this)){
            MyWorld.choosenChara = new Mermaid4();
            MyWorld2.choosenChara = new Mermaid4();
            MyWorld3.choosenChara = new Mermaid4();
            MyWorld4.choosenChara = new Mermaid4();
            MyWorld5.choosenChara = new Mermaid4();
            Bonus1.choosenChara = new Mermaid4();
            Bonus2.choosenChara = new Mermaid4();
            Greenfoot.delay(5);
            Greenfoot.setWorld(new Mission1());
        }
    }
}
