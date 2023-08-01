import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class RPG here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class RPG extends World
{

    

    int count = 0;
    int spawnSpeed = 500;
    int randomSpawn;
    int randomCharacter;
    int randomEnemy;
    public character2 maincharacter = new character2();
    HPs healthbar = new HPs();
    
        
    
    
    public RPG()
    {    
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 700, 1); 
        addObject(maincharacter, getWidth()/2, getHeight()/2);
        
        prepare();
        addObject(healthbar, maincharacter.getX(), maincharacter.getY()-50);
        
        
        
    }
    public character2 getcharacter2()
    {
        return maincharacter;
    }

    public void act()
    {
        count++;
        spawnEnemies();
    }

    public void spawnEnemies()

    {
        randomEnemy = Greenfoot.getRandomNumber(20);
        switch(randomEnemy){
        case 0:
        case 1:
        case 2:
        case 4:
        case 3:
        case 5:
        if (count % spawnSpeed == 0)
        {
            randomSpawn = Greenfoot.getRandomNumber(8);

            switch(randomSpawn)
            {
                case 0: addObject(new bat(maincharacter), 0,0); break;
                case 1: addObject(new bat(maincharacter), getWidth()/2,0); break;
                case 2: addObject(new bat(maincharacter), getWidth(),0); break;
                case 3: addObject(new bat(maincharacter), 0, getHeight()/2); break;
                case 4: addObject(new bat(maincharacter), getWidth(), getHeight()/2); break;
                case 5: addObject(new bat(maincharacter), 0, getHeight()); break;
                case 6: addObject(new bat(maincharacter), getWidth()/2, getHeight()); break;
                case 7: addObject(new bat(maincharacter), getWidth(), getHeight()); break;
            }
        }
        case 6:
        case 7:
        case 8:
        case 9:
        if (count % spawnSpeed == 0)
        {
            randomSpawn = Greenfoot.getRandomNumber(8);

            switch(randomSpawn)
            {
                case 0: addObject(new enemy(maincharacter), 0,0); break;
                case 1: addObject(new enemy(maincharacter), getWidth()/2,0); break;
                case 2: addObject(new enemy(maincharacter), getWidth(),0); break;
                case 3: addObject(new enemy(maincharacter), 0, getHeight()/2); break;
                case 4: addObject(new enemy(maincharacter), getWidth(), getHeight()/2); break;
                case 5: addObject(new enemy(maincharacter), 0, getHeight()); break;
                case 6: addObject(new enemy(maincharacter), getWidth()/2, getHeight()); break;
                case 7: addObject(new enemy(maincharacter), getWidth(), getHeight()); break;
            }
        }
        case 10:
        case 11:
        case 12:
        case 13:
        if (count % spawnSpeed == 0)
        {
            randomSpawn = Greenfoot.getRandomNumber(8);

            switch(randomSpawn)
            {
                case 0: addObject(new eye(maincharacter), 0,0); break;
                case 1: addObject(new eye(maincharacter), getWidth()/2,0); break;
                case 2: addObject(new eye(maincharacter), getWidth(),0); break;
                case 3: addObject(new eye(maincharacter), 0, getHeight()/2); break;
                case 4: addObject(new eye(maincharacter), getWidth(), getHeight()/2); break;
                case 5: addObject(new eye(maincharacter), 0, getHeight()); break;
                case 6: addObject(new eye(maincharacter), getWidth()/2, getHeight()); break;
                case 7: addObject(new eye(maincharacter), getWidth(), getHeight()); break;
            }
        }
        case 14:
        case 15:
        if (count % spawnSpeed == 0)
        {
            randomSpawn = Greenfoot.getRandomNumber(8);

            switch(randomSpawn)
            {
                case 0: addObject(new ghost(maincharacter), 0,0); break;
                case 1: addObject(new ghost(maincharacter), getWidth()/2,0); break;
                case 2: addObject(new ghost(maincharacter), getWidth(),0); break;
                case 3: addObject(new ghost(maincharacter), 0, getHeight()/2); break;
                case 4: addObject(new ghost(maincharacter), getWidth(), getHeight()/2); break;
                case 5: addObject(new ghost(maincharacter), 0, getHeight()); break;
                case 6: addObject(new ghost(maincharacter), getWidth()/2, getHeight()); break;
                case 7: addObject(new ghost(maincharacter), getWidth(), getHeight()); break;
            }
        }
        case 16:
        case 17:
        if (count % spawnSpeed == 0)
        {
            randomSpawn = Greenfoot.getRandomNumber(8);

            switch(randomSpawn)
            {
                case 0: addObject(new monster(maincharacter), 0,0); break;
                case 1: addObject(new monster(maincharacter), getWidth()/2,0); break;
                case 2: addObject(new monster(maincharacter), getWidth(),0); break;
                case 3: addObject(new monster(maincharacter), 0, getHeight()/2); break;
                case 4: addObject(new monster(maincharacter), getWidth(), getHeight()/2); break;
                case 5: addObject(new monster(maincharacter), 0, getHeight()); break;
                case 6: addObject(new monster(maincharacter), getWidth()/2, getHeight()); break;
                case 7: addObject(new monster(maincharacter), getWidth(), getHeight()); break;
            }
        }
        case 18:
        case 19:
        if (count % spawnSpeed == 0)
        {
            randomSpawn = Greenfoot.getRandomNumber(8);

            switch(randomSpawn)
            {
                case 0: addObject(new spider(maincharacter), 0,0); break;
                case 1: addObject(new spider(maincharacter), getWidth()/2,0); break;
                case 2: addObject(new spider(maincharacter), getWidth(),0); break;
                case 3: addObject(new spider(maincharacter), 0, getHeight()/2); break;
                case 4: addObject(new spider(maincharacter), getWidth(), getHeight()/2); break;
                case 5: addObject(new spider(maincharacter), 0, getHeight()); break;
                case 6: addObject(new spider(maincharacter), getWidth()/2, getHeight()); break;
                case 7: addObject(new spider(maincharacter), getWidth(), getHeight()); break;
            }
        }
    }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
