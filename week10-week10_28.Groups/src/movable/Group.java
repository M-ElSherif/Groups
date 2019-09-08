package movable;

import java.util.*;
/**
 *
 * @author thesh
 */
public class Group implements Movable {
    
    private List<Movable> movables = new ArrayList<Movable>();
    
    // METHOD. Adds new parameter objects to movables list
    public void addToGroup(Movable movable) {
        this.movables.add(movable);
    }
    
    // METHOD. Move group by parameter values
    public void move(int dx, int dy) {
        for( Movable movable : this.movables) {
            movable.move(dx, dy);
        }
    } 
    
    // METHOD
    public String toString() {
        String str = "";
        for (Movable movable: this.movables) {
            str += movable + "\n";
        }
        return str;
    }
    
}
