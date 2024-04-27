# Image Management Tool

*Author: Mingjun Shen*

## Overview
This JavaFX-based Image Management Tool is designed to implement  the uploading, viewing, converting and storing of images. It supports various image formats and shows attributes.

## Key Features

- Provides a user interface for uploading, viewing images, and converting image formats.
- Displays detailed information about images including height, width, location and pixels.
- Enables image conversion to various formats including png, jpeg, jpg, bmp and gif.

## Prerequisites

Before you begin, ensure you have met the following requirements:
- JVM
- JavaFX SDK is properly configured within project structure.
- Add VM option for JavaFX for the application.
    - For example, in IntelliJ IDEA:
    - Navigate to the 'Run' menu and select 'Edit Configurations'.
    - Find the 'Application' configurations and locate `ImageManagementApplication` class.
    - In the 'VM options' field, input the following:
      ```
      --module-path "/path/to/javafx-sdk/lib" --add-modules javafx.controls,javafx.fxml
      ```
      Replace "/path/to/javafx-sdk/lib" with the actual path to the JavaFX SDK libraries on your machine.

## Instructions

To run the Image Management Tool, follow these steps:

1. Open the project in your Java IDE.
2. Run the `ImageManagementApplication` class to launch the application.
3. Click the ‘Choose Image' button to upload one or more image files.
4. The image information will be displayed within window.
5. Click the box to select a format and click ‘Convert Image’ button to convert and save the images to the raw path.