/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texteditor;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author m7md
 */
public class TextEditor extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        
        TextEditorViewBase root = new TextEditorViewBase();
        
        Scene scene = new Scene(root, 800, 600);
        
        primaryStage.setTitle("Editorsama");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
