import org.junit.Assert;
import org.junit.Test;
import p01_Database.Database;

import javax.naming.OperationNotSupportedException;
import java.lang.reflect.Field;

public class DatabaseTest {

    private static final Integer[] INITIAL_ELEMNTS = new Integer[]{1, 2, 3};

    @Test(expected = OperationNotSupportedException.class)
    public void shouldConstructorThrowExceptionhOneElement() throws OperationNotSupportedException {
        Database db = new Database();
    }

    @Test(expected = OperationNotSupportedException.class)
    public void shouldConstructorThrowExceptionhMoreThanSixteenElements() throws OperationNotSupportedException {
        Database db = new Database(new Integer[17]);
    }

    @Test
    public void shouldConstructorIncreaceElements() throws OperationNotSupportedException, NoSuchFieldException, IllegalAccessException {
        Database db = new Database(INITIAL_ELEMNTS);

        Field elementsCount = Database.class.getDeclaredField("elementsCount");
        elementsCount.setAccessible(true);
        int fieldCurrentValue = elementsCount.getInt(db);

        Assert.assertEquals(INITIAL_ELEMNTS.length, fieldCurrentValue);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void shouldThrowExceptionAddingNullElement() throws OperationNotSupportedException {
        Database db = new Database(INITIAL_ELEMNTS);

        db.add(null);
    }

    @Test
    public void shouldAddingElement() throws OperationNotSupportedException {
        Database db = new Database(INITIAL_ELEMNTS);

        db.add(5);

        Assert.assertEquals(db.getElements().length, INITIAL_ELEMNTS.length +1);
    }

    @Test
    public void shouldRemoveOnlyLastElement() throws OperationNotSupportedException {
        Database db = new Database(INITIAL_ELEMNTS);

        db.remove();

        int lenght = db.getElements().length;

        Assert.assertEquals(lenght, INITIAL_ELEMNTS.length - 1);
    }
}
