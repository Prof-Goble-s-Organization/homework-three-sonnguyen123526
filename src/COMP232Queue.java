/**
 * Interface specifying a Queue ADT
 * 
 * @author William Goble
 * @author Dickinson College
 * @version Feb 8, 2024
 */
public interface COMP232Queue<U> {
    /**
     * Add the provided Object to the end of the Queue.
     * 
     * @param obj 
     *              the Object to add
     */
    public void add(U obj);

    /**
     * Remove and return the Object at the head of the Queue.
     * 
     * @return 
     *          the Object at the head of the Queue or null
     *          if the Queue is empty.
     */
    public U remove();

    /**
     * Return a reference to the Object at the head of the Queue without 
     * removing it from the Queue.
     * 
     * @return 
     *          a reference to the Object at the head of the Queue or
     *          null if the Queue is empty.
     */
    public U peek();

    /**
     * Return the number of elements in the Queue.
     * 
     * @return 
     *          the size of the Queue.
     */
    public int size();
}