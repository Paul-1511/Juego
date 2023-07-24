import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class character2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class character3 extends Actor
{
    int speed =3;
    
    private GreenfootImage right = new GreenfootImage("character3.png");
    private GreenfootImage left = new GreenfootImage("character3.2.png");

    /**
     * Act - do whatever the character2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        moverCharacter();
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
}
