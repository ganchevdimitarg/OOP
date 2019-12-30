import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import p03_IteratorTest.ListIterator;

import javax.naming.OperationNotSupportedException;
import java.util.List;

public class ListIteratorTest {

    private static final String[] INITIAL_DATA =
            new String[]{"One", "Two", "Tree"};

    private ListIterator listIterator;

    @Before
    public void constructorCreateListInterator() throws OperationNotSupportedException {
        this.listIterator = new ListIterator(INITIAL_DATA);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void constructorShouldThrowExceptionWithNullParam() throws OperationNotSupportedException {
        ListIterator li = new ListIterator( null);
    }

    @Test
    public void printShouldSetElementCorrectly(){
        Assert.assertEquals(INITIAL_DATA[0], this.listIterator.print());
    }

    @Test(expected = IllegalStateException.class)
    public void printShouldTrowExceptionWhenHaventElement() throws OperationNotSupportedException {
        ListIterator li = new ListIterator();
        li.print();
    }

    @Test
    public void hasNextShouldReturnFalseOnEmptyList() throws OperationNotSupportedException {
        ListIterator li = new ListIterator();
        Assert.assertFalse(li.hasNext());
    }

    @Test
    public void hasNextShouldReturnTrueOnList() throws OperationNotSupportedException {
        Assert.assertTrue(this.listIterator.hasNext());
    }

    @Test
    public void moveShouldMoveCorrectlyToNextElement() throws OperationNotSupportedException {
        Assert.assertTrue(this.listIterator.move());
    }

    @Test
    public void moveShouldDoNotMove() throws OperationNotSupportedException {
        ListIterator listIterator = new ListIterator("Element");
        Assert.assertFalse(listIterator.move());

    }
}
