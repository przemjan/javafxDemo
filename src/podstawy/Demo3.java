package podstawy;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Demo3 extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        String napisString = "Zmieńmy coś ";
        Label mainLabel = new Label();
        mainLabel.setText(napisString);


        Image sunflowerImage = new Image("file:sunflower.jpg");

        Image roseImage = new Image("file:rose.jpg");

        ImageView imageView1 = new ImageView();
        imageView1.setImage(sunflowerImage);


        ImageView imageView2 = new ImageView();
        imageView2.setImage(roseImage);


        Button changebutton = new Button("Zmień obrazek");


//        changebutton.setOnAction(actionEvent -> {
//
//            imageView1.setImage(roseImage);
//        });






        boolean[] bool= new boolean[1];
        bool[0] =true;

        changebutton.setOnAction(actionEvent -> {

            if(bool[0]) {
                imageView1.setImage(roseImage);
                imageView2.setImage(sunflowerImage);
            }
            else{
                imageView1.setImage(sunflowerImage);
                imageView2.setImage(roseImage);
            }
            bool[0]=!bool[0];
        });



        HBox imageHBox = new HBox(15);

        imageHBox.setAlignment(Pos.CENTER);

        imageHBox.setPadding(new Insets(20));

        imageHBox.getChildren().add(imageView1);
        imageHBox.getChildren().add(imageView2);

        VBox mainVBox = new VBox();
        mainVBox.setSpacing(15);
        mainVBox.setAlignment(Pos.CENTER_LEFT);
        mainVBox.setPadding(new Insets(40));
        mainVBox.getChildren().addAll(mainLabel,imageHBox,changebutton);


        Scene scene = new Scene(mainVBox,800,600);

        stage.setTitle("Photoshop");
        stage.setScene(scene);
        stage.show();

    }
}
