import java.awt.event.*;
/**Objects that implement this interface will 
 * be told to update themselves.  They will be given
 * the ActionEvent that may be used to help determine 
 * what to do.  The ActionEvent does not need  to be used.
 */
public interface Updateable {
    /**@param a the ActionEvent that cause this update request.
     * This will usually be called based on a Timer event occurring.
     */
    void update(ActionEvent a);
}
