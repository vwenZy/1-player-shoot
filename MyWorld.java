import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Zhang
 * @version May 30
 */
public class MyWorld extends World
{
    public static SimpleTimer shootTime = new SimpleTimer();
    public static SimpleTimer enemySpawnTime = new SimpleTimer();
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        // add bear to the world.
        addObject(new Bear(), 200, 200);
        shootTime.mark();
        
        // add base to the world.
        addObject(new Base(), 70, 200);
        
        enemySpawnTime.mark();
        
        // spawn enemy after 100 millis seconds.    
        spawnEnemy();
    }
    
    public void spawnEnemy()
    {
        Enemy enemy = new Enemy();
        int x = 600;
        int y = Greenfoot.getRandomNumber(600);
        addObject(enemy, x, y);
    }
    
}