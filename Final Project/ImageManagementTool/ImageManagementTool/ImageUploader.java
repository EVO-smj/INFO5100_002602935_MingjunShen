package ImageManagementTool;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.TilePane;
import javafx.stage.FileChooser;
import java.io.File;
import java.util.List;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.collections.FXCollections;

public class ImageUploader {
    @FXML
    public Label imageInfo;

    @FXML
    private Button uploadButton;

    @FXML
    private TilePane imagePane;

    @FXML
    private ChoiceBox<String> formatChoiceBox;

    @FXML
    private Button convertButton;

    @FXML
    private List<File> inputFiles;

    private ImageConverter imageConverter = new ImgConverter();
    private ImageDataExtractor metadataExtractor = new ImgDataExtractor();

    @FXML
    public void initialize() {

    //        Initialize JavaFX , set event listeners.

        formatChoiceBox.setItems(FXCollections.observableArrayList("jpeg", "png", "gif", "bmp", "jpg"));
        formatChoiceBox.getSelectionModel().selectFirst();

        // Set up event handler for uploading images
        uploadButton.setOnAction(event -> {
            FileChooser fileChooser = new FileChooser();
            fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Images", "*.png", "*.jpg", "*.jpeg", "*.gif", "*.bmp"));
            inputFiles = fileChooser.showOpenMultipleDialog(null);

            if (inputFiles != null) {
                inputFiles.forEach(this::addImageThumbnail);
            }
        });


        //  converting images
        convertButton.setOnAction(event -> {
            if (inputFiles != null && formatChoiceBox.getValue() != null) {
                imageConverter.convertImages(inputFiles, formatChoiceBox.getValue());
                imageInfo.setText("Converted Successfully");
            }
        });
    }

    private void addImageThumbnail(File file) {

    //        Add an image thumbnail and its metadata

        ImageModel imageModel = metadataExtractor.extractData(file);
        if (imageModel != null) {
            ImageView imageView = new ImageView(imageModel.getImage());
            imageView.setFitWidth(100);
            imageView.setFitHeight(100);
            imageView.setPreserveRatio(true);
            imageView.setSmooth(true);

            Label heightLabel = new Label("Height: " + imageModel.getHeight());
            Label widthLabel = new Label("Width: " + imageModel.getWidth());
            Label pixelsLabel = new Label("Pixels: " + imageModel.getPixels());
            Label locationLabel = new Label("Location: " + imageModel.getLocation());
            //     show imgs properties.

            VBox imageInfo = new VBox(imageView, heightLabel, widthLabel, pixelsLabel, locationLabel);
            imageInfo.getStyleClass().add("image-info");
            imagePane.getChildren().add(imageInfo);
        }
    }
}
