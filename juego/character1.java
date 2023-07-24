import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class character1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class character1 extends Actor
{
    int speed =3;
    
    private GreenfootImage right = new GreenfootImage("character1.png");
    private GreenfootImage left = new GreenfootImage("character1.2.png");
    
    /**
     * Act - do whatever the character1 wants to do. This method is called whenever
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
