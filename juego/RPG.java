import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class RPG here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RPG extends World
{

    HPs hp = new HPs();

    int count = 0;
    int spawnSpeed = 50;
    int randomSpawn;

    public character2 maincharacter = new character2();

    public RPG()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 700, 1); 
        int randomCharacter = Greenfoot.getRandomNumber(5);

        switch(randomCharacter)
        {
            case 0: addObject(maincharacter, getWidth()/2, getHeight()/2);
            case 1: addObject(maincharacter, getWidth()/2, getHeight()/2);
        }
        prepare();
    }

    public HPs getHPs()
    {
        return hp;
    }

    /*public void act()
    {
        spawnEnemies();
    }


    {
        if (count % spawnSpeed == 0)
        {
            randomSpawn = Greenfoot.getRandomNumber(8);

            switch(randomSpawn)
            {
                case 0: addObject(new bat(), 0,0); break;
                case 1: addObject(new bat(), getWidth()/2,0); break;
                case 2: addObject(new bat(), getWidth(),0); break;
                case 3: addObject(new bat(), 0, getHeight()/2); break;
                case 4: addObject(new bat(), getWidth(), getHeight()/2); break;
                case 5: addObject(new bat(), 0, getHeight()); break;
                case 6: addObject(new bat(), getWidth()/2, getHeight()); break;
                case 7: addObject(new bat(), getWidth(), getHeight()); break;
            }
        }
    } aun no está bien desarrollado el spawn de enemigos/

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
