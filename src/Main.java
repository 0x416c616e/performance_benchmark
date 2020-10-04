import javafx.application.Application;
import javafx.geometry.Bounds;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.robot.Robot;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main extends Application {

    @Override
    public void init() throws Exception {
        super.init();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println("--------------------------------");
        System.out.println("Start of benchmark: " + formatter.format(date));
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Benchmark");
        stage.setWidth(500);
        stage.setHeight(500);
        StackPane stacked = new StackPane();
        final int ARR_SIZE = 75_000; //might change back to 110_000
        Button[] buttons = new Button[ARR_SIZE];
        Label[] labels = new Label[ARR_SIZE];
        Car[] cars = new Car[ARR_SIZE];
        for (int i = 0; i < ARR_SIZE; i++) {
            FileInputStream imageSource = new FileInputStream("test2.png");
            Image image = new Image(imageSource);
            ImageView testImageView = new ImageView(image);
            int sum = 0;
            for (int j = 0; j < ARR_SIZE; j++) {
                sum += j;
                String status = "";
                if (sum % 2 == 0) {
                    //just doing random stuff to increase CPU and RAM usage
                    //because this is a benchmark
                    status = "even";
                } else {
                    status = "odd";
                }
            }
            buttons[i] = new Button("Test" + i);
            labels[i] = new Label("Test" + i);
            cars[i] = new Car();
            (new Thread(cars[i])).start();
            //the final button which will be displayed on top
            if (i == (ARR_SIZE - 1)) {
                buttons[i].setText("Click me to end the benchmark!");
                buttons[i].setOnAction( e -> {
                    //stage.close();
                    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                    Date date = new Date();
                    System.out.println("--------");
                    System.out.println("End of benchmark: " + formatter.format(date));
                    System.out.println("--------------------------------");
                    System.exit(0);
                });
                //Bounds lastButtonBounds = buttons[i].localToScene(buttons[i].getBoundsInLocal());
                //System.out.println(lastButtonBounds.getCenterX() + ", " + lastButtonBounds.getCenterY());
                //Robot clicker = new Robot();
                //clicker.mouseMove(lastButtonBounds.getCenterX(),lastButtonBounds.getCenterY());

            }
            stacked.getChildren().addAll(labels[i], testImageView, buttons[i]);

        }

        Scene scene = new Scene(stacked);
        stage.setScene(scene);
        stage.setX(0);
        stage.setY(0);
        stage.setAlwaysOnTop(true);
        stage.show();



    }

    @Override
    public void stop() throws Exception {
        super.stop();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
