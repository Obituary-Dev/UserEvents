/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userevents;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Obituary
 */
// click the button and perform an action and the program becomes interactive:
// implements EventHandler<>
// different types: mouse events btn click, touch event...
// for btn click it's ActionEvent
public class UserEvents extends Application implements EventHandler<ActionEvent> {

    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
//----------------------------stage part--------------------------------
        primaryStage.setTitle("Title of the window: User Events");
        button = new Button(/*"Click Me !"*/);
        button.setText("Click Me !");
        // whenever they click the btn the code to handle this is in this class
        // redirects to the handle method of this class 
        button.setOnAction(this);

        StackPane Layout = new StackPane();
        Layout.getChildren().add(button);

//---------------------------scene part--------------------------------
        Scene scene = new Scene(Layout, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // alt + insert: implement method, here handle method
    // called whenever the user clicks the btn: event
    // generic method called whenever an event occurs
    @Override
    public void handle(ActionEvent event) {
        // finds the source: which btn or object caused this code to occur 
        if (event.getSource() == button) {
            // appears in the output console
            System.out.println("Oooh Gon, I love it when you touch me there...");
        }
        /* if we had a second button
        if (event.getSource() == button2) {
            System.out.println("You just clicked on button 2");
        }
        */
    }

}
