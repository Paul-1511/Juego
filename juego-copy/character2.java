import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class character2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class character2 extends Actor
{
    int speed =5;
    int randomfireball;
    private GreenfootImage right = new GreenfootImage("character2.png");
    private GreenfootImage left = new GreenfootImage("character2.2.png");

    /**
     * Act - do whatever the character2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        moverCharacter();
        shoot();
        hitByBat();
        hitBySpider();
        hitByMonster();
        hitByGhost();
        hitByEye();
        hitByEnemy();
    }
    
    public void moverCharacter()
    {
        if(Greenfoot.isKeyDown("w")) {
            setLocation(getX(),getY() - speed);
        }
        
        if(Greenfoot.isKeyDown("s")) {
            setLocation(getX(),getY() + speed);
        }
        
        if(Greenfoot.isKeyDown("d")) {
            setImage(right);
            setLocation(getX() + speed, getY() );
        }
        
        if(Greenfoot.isKeyDown("a")) {
            setImage(left);
            setLocation(getX() - speed ,getY());
        }
    }
    public void shoot() {
        if(Greenfoot.mouseClicked(getWorld())) {
            randomfireball = Greenfoot.getRandomNumber(2);
            switch(randomfireball) {
            case 0: Actor fireball = new fireball1();
            getWorld().addObject(fireball,getX(), getY());
            
            MouseInfo mouse = Greenfoot.getMouseInfo();
            fireball.turnTowards(mouse.getX(), mouse.getY()); break;
            
            case 1: Actor fireball2 = new fireball2();
            getWorld().addObject(fireball2,getX(), getY());
            
            MouseInfo mouse2 = Greenfoot.getMouseInfo();
            fireball2.turnTowards(mouse2.getX(), mouse2.getY()); break;
            }
        }
    }
    public boolean hitByBat()
    {
              
        Actor bat = getOneObjectAtOffset(0,0,bat.class);
        if(bat !=null)
        {
            return true;    
        }
        else
        return false;
        
    }
    public boolean hitByEnemy()
    {
              
        Actor enemy = getOneObjectAtOffset(0,0,enemy.class);
        if(enemy !=null)
        {
            return true;    
        }
        else
        return false;
        
    }
    public boolean hitByEye()
    {
              
        Actor eye = getOneObjectAtOffset(0,0,eye.class);
        if(eye !=null)
        {
            return true;    
        }
        else
        return false;
        
    }
    public boolean hitByGhost()
    {
              
        Actor ghost = getOneObjectAtOffset(0,0,ghost.class);
        if(ghost !=null)
        {
            return true;    
        }
        else
        return false;
        
    }
    public boolean hitByMonster()
    {
              
        Actor monster = getOneObjectAtOffset(0,0,monster.class);
        if(monster !=null)
        {
            return true;    
        }
        else
        return false;
        
    }
    public boolean hitBySpider()
    {
              
        Actor spider = getOneObjectAtOffset(0,0,spider.class);
        if(spider !=null)
        {
            return true;    
        }
        else
        return false;
        
    }
}
