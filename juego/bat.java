import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bat extends Actor
{
    int health= 3;
    private GreenfootImage right = new GreenfootImage("bat.png");
    private GreenfootImage left = new GreenfootImage("bat2.png");
    /**
     * Act - do whatever the bat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
     moveEnemy();   
    }
    public void moveEnemy()
    {
        move(1);
        turnTowards(getWorld().getWidth()/2, getWorld().getHeight()/2);
    }
    public void hitByFireBall()
    {
        Actor fireball1 = getOneIntersectingObject(fireball1.class);
        Actor fireball2 = getOneIntersectingObject(fireball2.class);
        if(fireball1 != null)
        {
            health --;
            getWorld().removeObject(fireball1);
        }
        if(fireball2 != null)
        {
            health --;
            getWorld().removeObject(fireball2);
        }
        if(health ==0)
        {
            getWorld().removeObject(this);
        }
    }
}
