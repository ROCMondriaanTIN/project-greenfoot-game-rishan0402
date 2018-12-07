import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{

    private int counter;
    
    public TitleScreen()
    {    
        super(1000, 800, 1);
        Greenfoot.start();
        this.setBackground("beginscherm1.jpg");
    }

    
    public void act()
    {
        if (Greenfoot.isKeyDown("enter")) Greenfoot.setWorld(new MyWorld());
    }
}