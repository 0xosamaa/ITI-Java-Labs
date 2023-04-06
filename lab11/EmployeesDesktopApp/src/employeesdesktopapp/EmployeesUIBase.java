package employeesdesktopapp;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;

public class EmployeesUIBase extends GridPane {

    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final RowConstraints rowConstraints2;
    protected final RowConstraints rowConstraints3;
    protected final RowConstraints rowConstraints4;
    protected final RowConstraints rowConstraints5;
    protected final RowConstraints rowConstraints6;
    protected final Label label;
    protected final Label label0;
    protected final Label label1;
    protected final Label label2;
    protected final Label label3;
    protected final Label label4;
    protected final Label label5;
    protected final Button newBtn;
    protected final Button updateBtn;
    protected final Button deleteBtn;
    protected final Button nextBtn;
    protected final Button prevBtn;
    protected final Button firstBtn;
    protected final Button lastBtn;
    protected final TextField idText;
    protected final TextField fNameText;
    protected final TextField mNameText;
    protected final TextField lNameText;
    protected final TextField emailText;
    protected final TextField phoneText;

    public EmployeesUIBase() {

        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        rowConstraints2 = new RowConstraints();
        rowConstraints3 = new RowConstraints();
        rowConstraints4 = new RowConstraints();
        rowConstraints5 = new RowConstraints();
        rowConstraints6 = new RowConstraints();
        label = new Label();
        label0 = new Label();
        label1 = new Label();
        label2 = new Label();
        label3 = new Label();
        label4 = new Label();
        label5 = new Label();
        newBtn = new Button();
        updateBtn = new Button();
        deleteBtn = new Button();
        nextBtn = new Button();
        prevBtn = new Button();
        firstBtn = new Button();
        lastBtn = new Button();
        idText = new TextField();
        fNameText = new TextField();
        mNameText = new TextField();
        lNameText = new TextField();
        emailText = new TextField();
        phoneText = new TextField();

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMaxWidth(295.199951171875);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(111.2000244140625);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMaxWidth(511.00004882812505);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(488.7999755859375);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(30.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints3.setMinHeight(10.0);
        rowConstraints3.setPrefHeight(30.0);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints4.setMinHeight(10.0);
        rowConstraints4.setPrefHeight(30.0);
        rowConstraints4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints5.setMinHeight(10.0);
        rowConstraints5.setPrefHeight(30.0);
        rowConstraints5.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints6.setMinHeight(10.0);
        rowConstraints6.setPrefHeight(30.0);
        rowConstraints6.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        label.setPrefHeight(18.0);
        label.setPrefWidth(86.0);
        label.setText("Personal Details");
        GridPane.setMargin(label, new Insets(0.0, 0.0, 0.0, 15.0));

        GridPane.setRowIndex(label0, 1);
        label0.setText("ID");
        GridPane.setMargin(label0, new Insets(0.0, 0.0, 0.0, 15.0));

        GridPane.setRowIndex(label1, 2);
        label1.setText("First Name");
        GridPane.setMargin(label1, new Insets(0.0, 0.0, 0.0, 15.0));

        GridPane.setRowIndex(label2, 3);
        label2.setText("Middle Name");
        GridPane.setMargin(label2, new Insets(0.0, 0.0, 0.0, 15.0));

        GridPane.setRowIndex(label3, 4);
        label3.setText("Last Name");
        GridPane.setMargin(label3, new Insets(0.0, 0.0, 0.0, 15.0));

        GridPane.setRowIndex(label4, 5);
        label4.setText("Email");
        GridPane.setMargin(label4, new Insets(0.0, 0.0, 0.0, 15.0));

        GridPane.setRowIndex(label5, 6);
        label5.setText("Phone");
        GridPane.setMargin(label5, new Insets(0.0, 0.0, 0.0, 15.0));

        GridPane.setColumnIndex(newBtn, 1);
        GridPane.setRowIndex(newBtn, 7);
        newBtn.setMnemonicParsing(false);
        newBtn.setText("New");
        GridPane.setMargin(newBtn, new Insets(0.0));

        GridPane.setColumnIndex(updateBtn, 1);
        GridPane.setRowIndex(updateBtn, 7);
        updateBtn.setMnemonicParsing(false);
        updateBtn.setText("Update");
        GridPane.setMargin(updateBtn, new Insets(0.0, 0.0, 0.0, 345.0));

        GridPane.setColumnIndex(deleteBtn, 1);
        GridPane.setRowIndex(deleteBtn, 7);
        deleteBtn.setMnemonicParsing(false);
        deleteBtn.setText("Delete");
        GridPane.setMargin(deleteBtn, new Insets(0.0, 0.0, 0.0, 297.0));
        
        
        GridPane.setColumnIndex(nextBtn, 1);
        GridPane.setRowIndex(nextBtn, 7);
        nextBtn.setLayoutX(99.0);
        nextBtn.setLayoutY(375.0);
        nextBtn.setMnemonicParsing(false);
        nextBtn.setText("Next");
        GridPane.setMargin(nextBtn, new Insets(0.0, 0.0, 0.0, 227.0));

        GridPane.setColumnIndex(prevBtn, 1);
        GridPane.setRowIndex(prevBtn, 7);
        prevBtn.setMnemonicParsing(false);
        prevBtn.setText("Previous");
        GridPane.setMargin(prevBtn, new Insets(0.0, 0.0, 0.0, 175.0));

        DataSource("mysql");
        System.out.println("**********");

        GridPane.setColumnIndex(firstBtn, 1);
        GridPane.setRowIndex(firstBtn, 7);
        firstBtn.setMnemonicParsing(false);
        firstBtn.setText("First");
        GridPane.setMargin(firstBtn, new Insets(0.0, 0.0, 0.0, 115.0));

        GridPane.setColumnIndex(lastBtn, 1);
        GridPane.setRowIndex(lastBtn, 7);
        lastBtn.setMnemonicParsing(false);
        lastBtn.setText("Last");
        GridPane.setMargin(lastBtn, new Insets(0.0, 0.0, 0.0, 50.0));

        GridPane.setColumnIndex(idText, 1);
        GridPane.setRowIndex(idText, 2);
        idText.setMaxWidth(USE_PREF_SIZE);
        idText.setPrefHeight(26.0);
        idText.setPrefWidth(470.0);

        GridPane.setColumnIndex(fNameText, 1);
        GridPane.setRowIndex(fNameText, 1);
        fNameText.setEditable(false);
        fNameText.setMaxWidth(USE_PREF_SIZE);
        fNameText.setPrefHeight(26.0);
        fNameText.setPrefWidth(470.0);

        GridPane.setColumnIndex(mNameText, 1);
        GridPane.setRowIndex(mNameText, 3);
        mNameText.setMaxWidth(USE_PREF_SIZE);
        mNameText.setPrefHeight(26.0);
        mNameText.setPrefWidth(470.0);

        GridPane.setColumnIndex(lNameText, 1);
        GridPane.setRowIndex(lNameText, 4);
        lNameText.setMaxWidth(USE_PREF_SIZE);
        lNameText.setPrefHeight(26.0);
        lNameText.setPrefWidth(470.0);

        GridPane.setColumnIndex(emailText, 1);
        GridPane.setRowIndex(emailText, 5);
        emailText.setMaxWidth(USE_PREF_SIZE);
        emailText.setPrefHeight(26.0);
        emailText.setPrefWidth(470.0);

        GridPane.setColumnIndex(phoneText, 1);
        GridPane.setRowIndex(phoneText, 6);
        phoneText.setMaxWidth(USE_PREF_SIZE);
        phoneText.setPrefHeight(26.0);
        phoneText.setPrefWidth(470.0);

        getColumnConstraints().add(columnConstraints);
        getColumnConstraints().add(columnConstraints0);
        getRowConstraints().add(rowConstraints);
        getRowConstraints().add(rowConstraints0);
        getRowConstraints().add(rowConstraints1);
        getRowConstraints().add(rowConstraints2);
        getRowConstraints().add(rowConstraints3);
        getRowConstraints().add(rowConstraints4);
        getRowConstraints().add(rowConstraints5);
        getRowConstraints().add(rowConstraints6);
        getChildren().add(label);
        getChildren().add(label0);
        getChildren().add(label1);
        getChildren().add(label2);
        getChildren().add(label3);
        getChildren().add(label4);
        getChildren().add(label5);
        getChildren().add(newBtn);
        getChildren().add(updateBtn);
        getChildren().add(deleteBtn);
        getChildren().add(nextBtn);
        getChildren().add(prevBtn);
        getChildren().add(firstBtn);
        getChildren().add(lastBtn);
        getChildren().add(idText);
        getChildren().add(fNameText);
        getChildren().add(mNameText);
        getChildren().add(lNameText);
        getChildren().add(emailText);
        getChildren().add(phoneText);

    }

    private static void DataSource(String dbType) {
        DataSource ds = null;
        if ("mysql".equals(dbType)) {
            ds = DataSourceFactory.getMySQLDataSource();
        } else {
            System.out.println("invalid db type");
            return;
        }

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            con = ds.getConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery("select id, first_name, middle_name, last_name, email, phone_number from employees");
            if (rs.next()) {
                System.out.println("Employee ID=" + rs.getInt("id") +
                        ", FirstName=" + rs.getString("first_name") +
                        ", MiddleName=" + rs.getString("middle_name") +
                        ", LastName=" + rs.getString("last_name") +
                        ", Email=" + rs.getString("email") + ", PhoneNumber=" +
                        rs.getString("phone_number"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
