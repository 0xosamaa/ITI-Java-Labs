package texteditor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Optional;
import java.util.Scanner;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCombination;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class TextEditorViewBase extends BorderPane {

    protected final MenuBar menuBar;
    protected final Menu menu;
    protected final MenuItem menuItem;
    protected final MenuItem menuItem0;
    protected final MenuItem menuItem1;
    protected final MenuItem menuItem2;
    protected final Menu menu0;
    protected final MenuItem menuItem3;
    protected final Menu menu1;
    protected final MenuItem menuItem4;
    protected final TextArea textArea;

    public TextEditorViewBase() {

        menuBar = new MenuBar();
        menu = new Menu();
        menuItem = new MenuItem();
        menuItem0 = new MenuItem();
        menuItem1 = new MenuItem();
        menuItem2 = new MenuItem();
        menu0 = new Menu();
        menuItem3 = new MenuItem();
        menu1 = new Menu();
        menuItem4 = new MenuItem();
        textArea = new TextArea();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        BorderPane.setAlignment(menuBar, javafx.geometry.Pos.CENTER);

        menu.setMnemonicParsing(false);
        menu.setText("File");

        menuItem.setMnemonicParsing(false);
        menuItem.setText("New");
        menuItem.setAccelerator(new KeyCodeCombination(KeyCode.N, KeyCombination.CONTROL_DOWN));
        menuItem.setOnAction((ActionEvent e)->{
            textArea.clear();
        });
        

        menuItem0.setMnemonicParsing(false);
        menuItem0.setText("Open");
        menuItem0.setAccelerator(new KeyCodeCombination(KeyCode.O, KeyCombination.CONTROL_DOWN));
        FileChooser fc = new FileChooser();
        menuItem0.setOnAction((ActionEvent event)->{
            Stage oldStage = (Stage) textArea.getScene().getWindow();
            File file = fc.showOpenDialog(oldStage);
            if(file==null||!file.toString().endsWith(".txt")) return;
            try{
                Scanner in = new Scanner(new FileReader(file));
                String outString;
                StringBuilder sb = new StringBuilder();
                while(in.hasNext()) {
                    sb.append(in.next());
                }
                in.close();
                outString = sb.toString();
                
                textArea.setText(outString);
                
            }catch(FileNotFoundException exc){
                System.out.println(exc);
            }
            System.out.println(file);
        });

        menuItem1.setMnemonicParsing(false);
        menuItem1.setText("Save");
        menuItem1.setAccelerator(new KeyCodeCombination(KeyCode.S, KeyCombination.CONTROL_DOWN));
        menuItem1.setOnAction(event->{
        try{
            Stage oldStage = (Stage) textArea.getScene().getWindow();
            File file = fc.showSaveDialog(oldStage);
            Writer wr = new FileWriter(file.toString());
            
            wr.write(textArea.getText()); // write string

            wr.flush();
            wr.close();
        }catch(Exception ex){
            System.out.println(ex);
        }
        });

        
        menuItem2.setMnemonicParsing(false);
        menuItem2.setText("Exit");
        menuItem2.setAccelerator(new KeyCodeCombination(KeyCode.E, KeyCombination.CONTROL_DOWN));
        menuItem2.setOnAction(event->{
            Alert alert = new Alert(AlertType.CONFIRMATION);
            ButtonType dontSaveBtn = new ButtonType("Don't Save");
            ButtonType saveBtn = new ButtonType("Save");
            ButtonType buttonCancel = new ButtonType("Cancel", ButtonData.CANCEL_CLOSE);
            alert.getButtonTypes().setAll(saveBtn, dontSaveBtn, buttonCancel);
            
            Optional<ButtonType> result = alert.showAndWait();
            System.out.println(result);
            
            if (result.get() == saveBtn) {
                try{
                    Stage oldStage = (Stage) textArea.getScene().getWindow();
                    File file = fc.showSaveDialog(oldStage);
                    Writer wr = new FileWriter(file.toString());

                    wr.write(textArea.getText());

                    wr.flush();
                    wr.close();
            }catch(Exception ex){
                System.out.println(ex);
            }
                    textArea.clear();
            } else if (result.get() == dontSaveBtn) {
                    textArea.clear();
                    Platform.exit();
            }

        });

        menu0.setMnemonicParsing(false);
        menu0.setText("Edit");

        menuItem3.setMnemonicParsing(false);
        menuItem3.setText("Delete");

        menu1.setMnemonicParsing(false);
        menu1.setText("Help");

        menuItem4.setMnemonicParsing(false);
        menuItem4.setText("About");
        setTop(menuBar);

        BorderPane.setAlignment(textArea, javafx.geometry.Pos.CENTER);
        textArea.setPrefHeight(200.0);
        textArea.setPrefWidth(200.0);
        setCenter(textArea);

        menu.getItems().add(menuItem);
        menu.getItems().add(menuItem0);
        menu.getItems().add(menuItem1);
        menu.getItems().add(menuItem2);
        menuBar.getMenus().add(menu);
        menu0.getItems().add(menuItem3);
        menuBar.getMenus().add(menu0);
        menu1.getItems().add(menuItem4);
        menuBar.getMenus().add(menu1);

    }
    
    private void save(){
        
    }
    
}
