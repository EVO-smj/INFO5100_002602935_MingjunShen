package ImageManagementTool;

import java.io.File;
import java.util.List;

public interface ImageConverter {

//    The ImageConverter interface defines a contract for converting a list of files to target format.

    void convertImages(List<File> inputFiles, String format);

//    convert list of files to target format
//    progress using a Consumer<Double>.
//
//    inputFiles： A list of input image files.
//    format：     The target format .


}
