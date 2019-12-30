import org.junit.Assert;
import org.junit.Test;
import p01_Database.Database;

import javax.naming.OperationNotSupportedException;

import static org.junit.Assert.assertNull;

public class AddTest {

    @Test
    public void shouldAddElementIfCellFree() throws OperationNotSupportedException {
        Database database = new Database(1,2,3,4,1,5,12,31,23,123,1231,2,312,31,312,3123,3123,2);

        database.add(15);

        assertNull(database);
    }
}
