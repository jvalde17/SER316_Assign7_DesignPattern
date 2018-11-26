package apiary;

/**
 * Interface that implements Visitable 
 * 
 * @author Jess
 * @since 11-25-2018
 * @version 11-25-2018
 *
 */
public interface Visitable {
    public void accept(Visitor visitor);
}
