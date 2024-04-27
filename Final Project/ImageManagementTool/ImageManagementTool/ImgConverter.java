package ImageManagementTool;

import javafx.fxml.FXML;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class ImgConverter implements ImageConverter {

//    The ImageMagickConverter class is an implementation of the ImageConverter interface to convert images.

    @FXML
    @Override
    public void convertImages(List<File> inputFiles, String format) {

//        Converts a list of image files to the specified format using imageIO
//
//        inputFiles: A list of input image files to be converted.
//        format:     The target format to which the input images will be converted.


        for (File file : inputFiles) {
            String outputFilename = removeExtension(file.getName()) + "." + format;
            File outputFile = new File(file.getParent(), outputFilename);
            try {
                BufferedImage image = ImageIO.read(file);
                if (Objects.equals(file.getName().split("\\.")[1], "png")) {
                    BufferedImage rgbImage = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_RGB);
                    rgbImage.getGraphics().drawImage(image, 0, 0, null);
                    image = rgbImage;
                }
                ImageIO.write(image, format, outputFile);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private String removeExtension(String filename) {

//        Remove extension from the input filename.

        int lastDotIndex = filename.lastIndexOf('.');
        if (lastDotIndex == -1) {
            return filename;
        }
        return filename.substring(0, lastDotIndex);


    }
}
