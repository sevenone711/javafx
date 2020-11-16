import controllers.Peapl;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;

public class Main extends Application {
    final String PATH_TO_XML = "views/sample.fxml";
    final String PATH_TO_XML_ADD = "views/PeaplAdd.fxml";
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource(PATH_TO_XML));
        primaryStage.setTitle("ChatFx");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
