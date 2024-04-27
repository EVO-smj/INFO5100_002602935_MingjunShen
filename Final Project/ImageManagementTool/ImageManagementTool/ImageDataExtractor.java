package ImageManagementTool;

import java.io.File;

public abstract class ImageDataExtractor {

//    The ImageDataExtractor is an abstract class for getting metadata from an image file.

    public abstract ImageModel extractData(File file);

//            file： input image file .
//            ImageModel： object containing image file and the extracted metadata.

}
