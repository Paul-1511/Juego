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
    int health = 15;
    int healthBarWidth = 80;
    int healthBarHeight = 10;
    int pixelsPerHealthPoint = (int) healthBarWidth/health;
    public HPs() {
        update();
    }
    public void act()
    {
        // Add your action code here.
        
    }
    public void update() {
        setImage(new GreenfootImage(healthBarWidth +2, healthBarHeight+2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.BLACK);
        myImage.drawRect(0,0,healthBarWidth + 1, healthBarHeight +1);
        myImage.setColor(Color.WHITE);
        myImage.fillRect(1, 1, health*pixelsPerHealthPoint, healthBarHeight);
    }
    public void loseHealth() {
        health--;
        
    }
}
