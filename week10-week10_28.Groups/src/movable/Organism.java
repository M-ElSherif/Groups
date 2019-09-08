package movable;

/**
 *
 * @author thesh
 */
public class Organism implements Movable {
    
    private int x;
    private int y;
    
    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    // METHOD. moves the object as much as it is specified by the arguments
    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
    
    
    // METHOD. creates and returns a string which represents the object
    public String toString() {
        return "x: " + this.x + "; y: " + this.y;
    }
    
}
