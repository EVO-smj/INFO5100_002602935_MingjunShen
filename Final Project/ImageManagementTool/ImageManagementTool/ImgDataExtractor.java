package ImageManagementTool;


import javafx.scene.image.Image;
import java.io.File;

public class ImgDataExtractor extends ImageDataExtractor {

//    This class extends the ImageDataExtractor and implements the extractData method to extract image metadata.

    @Override
    public ImageModel extractData(File file) {

        //        Extract metadata from the input image file and returns an ImageModel containing metadata.

        Image image = new Image(file.toURI().toString());

        String pixels = String.valueOf(image.getWidth() * image.getHeight());
        String height = String.valueOf(image.getHeight());
        String width = String.valueOf(image.getWidth());
        String location = image.getUrl();
        return new ImageModel(image, height, width, location, pixels);

    }
}


