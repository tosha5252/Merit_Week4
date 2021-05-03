package week4;

import acm.graphics.GImage;
import acm.program.GraphicsProgram;

public class ImageProcessing extends GraphicsProgram {
	

	
	public void run() {
		
		
	GImage image = new GImage("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a8/Vermeer_-_The_Milkmaid.jpg/215px-Vermeer_-_The_Milkmaid.jpg"); 
		
	//test
	add(image, 250, 0); 
	add(flipHorizontally(image), 250, 0); 
	}
	private GImage flipHorizontally(GImage image) {
	
  int[][]array = image.getPixelArray();
	int height = array.length;
	int width = array[0].length;
		
	for (int row = 0; row < height; row++) {
	for (int i = 0; i < width /2; i++) {
		int flipped = width - i - 1;
		   int temp = array[row][i];
				array[row][i] = array[row][flipped];
				
			}
		}		
		return new GImage(array);
	}	
}
