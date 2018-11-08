/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.upload;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 *
 * @author d732229
 */
public class UploadImagemTest {
    public static void main(String[] args){
    
        BufferedImage image = null;
//        String path = "";
        try {
           
            //URL url = new URL("C:\\Users\\d732229\\Downloads\\teste.jpeg");
            File file = new File("C:\\Users\\d732229\\Downloads\\kleber-180px-width.jpeg");
//            File file = new File(path);
            image = ImageIO.read(file);
             
            ImageIO.write(image, "jpg",new File("C:\\Users\\d732229\\Documents\\out.jpg"));
            ImageIO.write(image, "gif",new File("C:\\Users\\d732229\\Documents\\out.gif"));
            ImageIO.write(image, "png",new File("C:\\Users\\d732229\\Documents\\out.png"));
            ImageIO.write(image, "jpeg", new File("\\\\nas.prodam\\smg_cgpatri\\CGPATRI_GABINETE\\PROJETOS\\test.jpg")); 
             
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Done");
    
    }
    
}
