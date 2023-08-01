import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fireball1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class fireball1 extends Actor
{
    int speed = 5;
    /**
     * Act - do whatever the fireball1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(speed);
        checkWalls();
    }
    public void checkWalls() {
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
