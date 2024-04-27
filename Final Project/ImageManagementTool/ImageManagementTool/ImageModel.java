package ImageManagementTool;

import javafx.scene.image.Image;

public class ImageModel {
    private Image image;
    private String height;
    private String location;
    private String width;
    private String pixels;

//    ImageModel class is an image and its metadata,


    public ImageModel(Image image, String height, String width, String location, String pixels) {

    //     Constructs an ImageModel instance with the specified image and metadata.
    //
    //         image:       The image object.
    //         height:      The image height.
    //         width:      The image width.
    //         location:    The location where the image was saved.
    //         pixels:        The pixels of the image.

        this.image = image;
        this.height = height;
        this.location = location;
        this.width = width;
        this.pixels = pixels;
    }

    public Image getImage() {

    //        Returns the image object.

        return image;
    }

    public String getHeight() {

        return height;
    }

    public String getLocation() {

    //        Returns the location where the image was captured.

        return location;
    }

    public String getWidth() {

        return width;
    }

    public String getPixels() {

    //        Returns the size of the image

        return pixels;
    }
}
