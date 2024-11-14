import java.io.*;
import java.net.*;

public class ImageDownloader {

    public static void saveImage(String imageUrl) {
        try {
            URL url = new URL(imageUrl);

            String fileName = url.getFile();
            String destName = "./figures" + fileName.substring(fileName.lastIndexOf("/"));
            System.out.println("Saving to: " + destName);

            InputStream is = url.openStream();
            OutputStream os = new FileOutputStream(destName);

            byte[] b = new byte[2048];
            int length;

            while ((length = is.read(b)) != -1) {
                os.write(b, 0, length);
            }

            is.close();
            os.close();

            System.out.println("Image saved successfully!");

        } catch (MalformedURLException e) {
            System.err.println("Error: The URL provided is malformed: " + imageUrl);
        } catch (FileNotFoundException e) {
            System.err.println("Error: The file could not be found or created at the destination.");
        } catch (IOException e) {
            System.err.println("I/O Error: An error occurred while reading or writing the file.");
        } catch (SecurityException e) {
            System.err.println("Error: The program does not have permission to access the file or the destination.");
        } catch (Exception e) {
            System.err.println("Unexpected error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String imageUrl = "https://example.com/image.jpg";
        saveImage(imageUrl);
    }
}
