
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class KiloConverter extends Application {

    private TextField kiloTextField;
    private Label resultLabel;

    public static void main(String[]args){

        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label promptLabel = new Label ("Podaj odległość w kilometrach");

        kiloTextField = new TextField();

        Button calcButton = new Button("Przelicz");

        calcButton.setOnAction(new CalcButtonHandler());

        resultLabel = new Label();

        HBox hBox = new HBox(10,promptLabel,kiloTextField);
        VBox vBox = new VBox(10,hBox,calcButton,resultLabel);

        vBox.setAlignment(Pos.CENTER);
        vBox.setPadding(new Insets(10));

        Scene scene = new Scene(vBox);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Przeliczanie kilometrów");
        primaryStage.show();

    }

    class CalcButtonHandler implements EventHandler<ActionEvent>{


        @Override
        public void handle(ActionEvent actionEvent) {

            double kilometers;


            if(!kiloTextField.getText().isEmpty()) {
                kilometers = Double.parseDouble(kiloTextField.getText());
            }
            else{
                kilometers =0.0;
            }


            double miles = kilometers*0.6214;
            resultLabel.setText(String.format("%,.2f w milach ",miles));


        }
    }


}
