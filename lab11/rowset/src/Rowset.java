import java.sql.SQLException;
import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

// Implemet RowListener
class MyRowSetListener implements RowSetListener {

    @Override
    public void cursorMoved(RowSetEvent event) {
        System.out.println("Cursor Moved");
    }

    @Override
    public void rowChanged(RowSetEvent event) {
        System.out.println("Row Changed");
    }

    @Override
    public void rowSetChanged(RowSetEvent event) {
        System.out.println("RowSet Changed");
    }
}

 class RowSet {

    public void actions(MyRowSetListener rowSetObj) {
        try {
            RowSetFactory factory = RowSetProvider.newFactory();
            JdbcRowSet jdbcSet = factory.createJdbcRowSet();
            jdbcSet.setUrl("jdbc:mysql://localhost:3306/lab10");
            jdbcSet.setUsername("root");
            jdbcSet.setPassword("root");
            jdbcSet.setCommand("SELECT * FROM employees");
            jdbcSet.execute();
            jdbcSet.addRowSetListener(rowSetObj);
            jdbcSet.first();
            jdbcSet.next();
            jdbcSet.deleteRow();
            System.out.println("Student Name : " + jdbcSet.getString(2));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyRowSetListener RowSetListener = new MyRowSetListener();
        RowSet rowSet = new RowSet();
        rowSet.actions(RowSetListener);
    }
}