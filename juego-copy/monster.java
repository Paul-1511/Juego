import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class monster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class monster extends Actor
{
    
    int health= 4;
    character2 character;
    public monster(character2 maincharacter){
        character = maincharacter;}
        /**
     * Act - do whatever the bat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
     moveEnemy();   
     hitByFireBall();
    }
    public void moveEnemy()
    {
        move(1);
        turnTowards(character.getX(), character.getY());
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
