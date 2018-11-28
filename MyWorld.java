
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *
 * @author R. Springer
 */
public class MyWorld extends World {

    private CollisionEngine ce;
    
    /**
     * Constructor for objects of class MyWorld.
     *
     */
    public MyWorld() {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1, false);
        this.setBackground("bg.png");

        int[][] map = {           
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1}, 
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1}, 
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},           
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},            
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{260,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,276,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,282,-1,-1,-1,-1,-1,-1},
{259,-1,281,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,83,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,30,27,27,29,-1,-1,-1,-1,-1,-1,-1,-1,-1,31,33,-1,-1,31,33,-1,-1},
{32,32,32,32,33,-1,-1,-1,-1,32,-1,-1,32,32,32,32,32,32,32,32,32,32,29,276,282,-1,-1,-1,30,24,281,281,23,29,-1,-1,-1,-1,-1,276,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,32,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,35,35,23,32,33,-1,-1,31,24,253,253,253,253,253,253,253,253,253,253,33,-1,-1,-1,-1,-1,-1,-1,-1,-1,254},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,30,32,32},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,30,24,35,35},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,235,-1,-1,-1,-1,-1,83,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,30,24,35,35,35},
{300,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,30,32,29,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,30,24,35,35,35,35},
{300,-1,-1,-1,-1,-1,-1,254,-1,-1,283,-1,-1,30,24,35,23,29,-1,-1,-1,-1,-1,-1,-1,283,-1,31,33,252,31,33,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,30,24,35,35,35,35,35},
{300,-1,283,277,-1,-1,32,32,32,32,32,32,32,24,35,35,35,23,29,-1,-1,277,-1,-1,31,33,-1,-1,-1,-1,-1,-1,-1,-1,32,-1,-1,277,-1,283,-1,-1,30,24,35,35,35,35,35,35},
{19,32,32,20,-1,-1,35,35,35,35,35,35,35,35,35,35,35,35,23,32,32,32,32,32,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,31,32,32,32,32,32,24,35,35,35,35,35,35,35},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,35,35,35,35,35,35,35,35},
{228,228,228,228,228,228,228,228,228,228,228,228,228,228,228,228,228,228,228,228,228,228,228,228,228,228,228,228,228,228,228,228,228,228,228,228,228,228,228,228,228,228,35,35,35,35,35,35,35,35},
{299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,35,35,35,35,35,35,35,35},
{299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,35,35,35,35,35,35,35,35},
{299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,35,35,35,35,35,35,35,35},
{299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,35,35,35,35,35,35,35,35},
{299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,299,35,35,35,35,35,35,35,35},


    };

        // Declareren en initialiseren van de TileEngine klasse om de map aan de world toe te voegen
        TileEngine te = new TileEngine(this, 60, 60, map);
        // Declarenre en initialiseren van de camera klasse met de TileEngine klasse 
        // zodat de camera weet welke tiles allemaal moeten meebewegen met de camera
        Camera camera = new Camera(te);
        // Declareren en initialiseren van een main karakter van het spel mijne heet Hero. Deze klasse 
        // moet de klasse Mover extenden voor de camera om te werken
        Hero hero = new Hero();

        // Laat de camera een object volgen. Die moet een Mover instatie zijn of een extentie hiervan.
        camera.follow(hero);

        // Alle objecten toevoegen aan de wereld: camera, main karakter en mogelijke enemies
        addObject(camera, 0, 0);
        addObject(hero, 96, 915);
        addObject(new Enemy(), 1300, 830);
        
        // Initialiseren van de CollisionEngine zodat de speler niet door de tile heen kan lopen.
        // De collision engine kijkt alleen naar de tiles die de variabele solid op true hebben staan.
        ce = new CollisionEngine(te, camera);
        // Toevoegen van de mover instantie of een extentie hiervan
        ce.addCollidingMover(hero);
    }
        
    @Override
    public void act() {
        ce.update();
    }
}
