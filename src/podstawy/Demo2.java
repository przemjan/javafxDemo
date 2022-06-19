package podstawy;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Demo2 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Label helloLabel = new Label("Witaj świecie");

        Button changeButton = new Button("Zmień język");

        VBox helloVBox = new VBox(helloLabel,changeButton);

        helloVBox.setAlignment(Pos.CENTER);


        changeButton.setOnAction(actionEvent -> {

            helloLabel.setText("Hello World");

        });

        Scene scene = new Scene(helloVBox,800,600);
        stage.setTitle("Program witający");
        stage.setScene(scene);
        stage.show();


    }
}
