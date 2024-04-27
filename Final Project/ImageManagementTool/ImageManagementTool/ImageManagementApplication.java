package ImageManagementTool;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.fxml.FXMLLoader;



public class ImageManagementApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException{
//      called when application launched. initialize primary stage and set up the user interface using an FXML file.

        FXMLLoader fxmlLoader = new FXMLLoader(ImageManagementApplication.class.getResource("ImageManagementView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle("Image Management Tool");
        stage.setScene(scene);
        stage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
