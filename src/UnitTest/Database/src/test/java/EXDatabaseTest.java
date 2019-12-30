//import org.junit.Assert;
//import org.junit.Test;
//import p02_ExtendedDatabase.Database;
//import p02_ExtendedDatabase.Person;
//
//import javax.naming.OperationNotSupportedException;
//
//public class EXDatabaseTest {
//    @Test(expected = OperationNotSupportedException.class)
//    public void shouldThrowExceptionWhitNullParam() throws OperationNotSupportedException {
//        Database db = new Database(new Person(1, "Name"));
//
//        db.findByUsername(null);
//    }
//
//    @Test(expected = OperationNotSupportedException.class)
//    public void shouldThrowExceptionCantFindPersen() throws OperationNotSupportedException {
//        Database db = new Database(new Person(1, "Name"));
//
//        db.findByUsername("");
//    }
//
//    @Test(expected = OperationNotSupportedException.class)
//    public void shouldThrowExceptionIfMoreByOne() throws OperationNotSupportedException {
//        Database db = new Database(new Person(1, "Name"));
//
//        db.add(new Person(12, "Name"));
//        db.findByUsername("Name");
//    }
//
//    @Test
//    public void shouldFindByUserName() throws OperationNotSupportedException {
//        Database db = new Database(new Person(1, "Name"));
//        Person p =  db.findByUsername("Name");
//
//        Assert.assertEquals( "Name", p.getUsername());
//    }
//}
