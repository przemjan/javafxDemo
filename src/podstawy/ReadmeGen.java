package podstawy;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import podstawy.zrodlo.ReadmeSource;

import java.io.*;
import java.io.PrintWriter;

public class ReadmeGen extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        ReadmeSource readmeSource = new ReadmeSource();
        Button clickMeButton = new Button("Kliknij mnie");

        TextArea readMeTextArea = new TextArea();


        readMeTextArea.setPrefColumnCount(50);
        readMeTextArea.setPrefRowCount(400);

        VBox vBox = new VBox(15);

        vBox.setAlignment(Pos.CENTER);
        vBox.setPadding(new Insets(20));
        vBox.getChildren().addAll(clickMeButton,readMeTextArea);

        //PrintWriter pw2 = new PrintWriter("zupa.txt");

        clickMeButton.setOnAction(actionEvent -> {
            readMeTextArea.setText(readmeSource.getText());
            try {
                PrintWriter pw = new PrintWriter("readme.txt");
                pw.println(readmeSource.getText());
                pw.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }

        });

        Scene scene = new Scene(vBox,800,600);

        stage.setTitle("Generator readme");
        stage.setScene(scene);
        stage.show();


    }
}
