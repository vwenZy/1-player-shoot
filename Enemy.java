import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX() - 5, getY());
        
        if(getX() <= 70)
        {
            GameOver gameOverWorld = new GameOver();
            Greenfoot.setWorld(gameOverWorld);
        }
        
        if(isTouching(Bullet.class))
        {
            removeTouching(Enemy.class);
            getWorld().removeObject(this);
            MyWorld world = (MyWorld) getWorld();
            world.spawnEnemy();
        }
    }
    
    public Enemy()
    {
        GreenfootImage img = new GreenfootImage("fly.png");
        img.scale(img.getWidth()/2, img.getHeight()/2);
        setImage(img);
    }
    
}