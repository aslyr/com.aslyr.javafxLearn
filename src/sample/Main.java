package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("这是第一个javafx程序");
        primaryStage.show();
        primaryStage.setFullScreen(true);
        primaryStage.setIconified(true);
        primaryStage.setScene(new Scene(new Group()));
        Group g1=new Group();
        Button b1=new Button("高凯");
        b1.setPrefWidth(122);
        b1.setPrefHeight(500);
        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("b1被点击了");
            }
        });
        g1.getChildren().add(b1);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
