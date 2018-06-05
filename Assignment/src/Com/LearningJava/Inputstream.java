package Com.LearningJava;

import java.io.File; //to import file class
import java.io.IOException;// to handle errors while reading and writing file
import java.awt.image.BufferedImage;//to hold image in ram for a while
import javax.imageio.ImageIO;//to perform image operation such as write and read

public class Inputstream {

	public static void main(String args[]) throws IOException {
		BufferedImage image = null;
		File f = null;

		// Read the image
		try {
			f = new File("C:\\Users\\Mourya Raj\\Desktop\\mourya.jpg");
			image = new BufferedImage(1000, 1000, BufferedImage.TYPE_INT_ARGB);
			image = ImageIO.read(f);
			System.out.println("Reading completed successfully");

		} catch (IOException e) {
			System.out.println("error at the first catch/read");
		}

		// write
		try {
			f = new File("C:\\Users\\Mourya Raj\\Desktop\\codcores.jpg");
			ImageIO.write(image, "jpg", f);
			System.out.println("writting complete successfully");

		} catch (IOException e) {
			System.out.println("error at the second catch");
		}
	}
}
