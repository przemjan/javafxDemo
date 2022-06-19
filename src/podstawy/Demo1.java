package podstawy;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Demo1 extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Label helloLabel = new Label("Witaj świecie");


        Scene scene = new Scene(helloLabel);


        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args){
        launch(args);
    }
}
