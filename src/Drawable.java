import java.awt.Graphics;

/** All Objects that might be drawn should implement this 
 * standard interface.  Most GUI elements will be drawn at
 * some point.  These Objects must know their location and
 * how they represent themselves according to their current
 * state.  
 */
public interface Drawable {
    /**
     * This method will be called when this Object must draw itself
     * (potentially from scratch).  This Object must know its own 
     * location.
     * @param g The Graphics context onto which this Object will 
     * display itself.
     */
    void draw(Graphics g);
}
