import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HPs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HPs extends Actor
{
    /**
     * Act - do whatever the HPs wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int time = 0;
    int health = 200;
    public HPs()
    {
        setImage(new GreenfootImage(52, 12));
        getImage().drawRect(0,0, 51, 11);
        getImage().setColor(Color.WHITE);
        getImage().fillRect(1, 1, health, 10);
    }
    public void act()
    {
        setImage(new GreenfootImage(52, 12));
        getImage().drawRect(0,0, 51, 11);
        getImage().setColor(Color.WHITE);
        getImage().fillRect(1, 1, health, 10);
        World world = getWorld();
        RPG myWorld = (RPG)world;
        setLocation(myWorld.getcharacter2().getX(), myWorld.getcharacter2().getY()-50);
        looseHealth();
        time ++;
         
    }
    public void looseHealth()
    {
        World world= getWorld();
        RPG myWorld = (RPG)world;
        if(myWorld.getcharacter2().hitByBat())
        {
            health--;
        }
        if(myWorld.getcharacter2().hitByEnemy())
        {
            health--;
        }
        if(myWorld.getcharacter2().hitByEye())
        {
            health--;
        }
        if(myWorld.getcharacter2().hitByGhost())
        {
            health--;
        }
        if(myWorld.getcharacter2().hitByMonster())
        {
            health--;
        }
        if(myWorld.getcharacter2().hitBySpider())
        {
            health--;
        }
        if (health <=0)
        {
        getWorld().showText("¡Perdiste! \n duraste:"+ (time/60)+"segundos", getWorld().getWidth()/2, getWorld().getHeight()/2);
        Greenfoot.stop();
    }
        
    }
}
