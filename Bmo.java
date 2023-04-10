import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Bmo {
		
		private static int width = 800;
	    private static int height = 800;
	    
	    private static int PIXEL_SIZE = 40;
	    private static Graphics2D g;
	    
	   
	    static Color white = Color.white;
	    static Color azul = new Color(29,6,158,255);
	    static Color amarillo = new Color(229,203,80,255);
	    static Color verde = new Color(206,253,209,255);
	    static Color verdeExrt = new Color(113,165,152,255);
	    static Color rojo = new Color(218,47,91,255);
	    static Color celeste = new Color(91,197,211,255);
	    static Color boton = new Color(105,229,83,255);
	    static Color black = Color.black;
	    
	    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
	    
	    public static void paint() {
	    	drawBackground(PIXEL_SIZE, Color.white);  
	    	
	    	
	  
	       
	        fillRect(4, 5, 11, 14, verdeExrt);
	        
	        fillRect(4, 4, 11, 1, black);
	        fillRect(3, 5, 1, 14, black);
	        fillRect(15, 5, 1, 14, black);
	        fillRect(4, 19, 11, 1, black);
	        fillRect(5, 6, 9, 6, verde);
	        fillRect(6, 8, 1, 1, black);
	        fillRect(8, 9, 3, 1, black);
	        fillRect(12, 8, 1, 1, black);
	        fillRect(5, 13, 5, 1, black);
	        fillRect(12, 13, 1, 1, azul);
	        fillRect(5, 16, 3, 1, amarillo);
	        fillRect(6, 15, 1, 3, amarillo);
	        fillRect(11, 17, 1, 1, rojo);
	        fillRect(10, 16, 1, 1, celeste);
	        fillRect(12, 16, 1, 1, boton);
	        
	        drawSquareGrid(PIXEL_SIZE, Color.white);
	        
	        try {       
	            ImageIO.write(image, "jpg", new File("Bmo.jpg"));
	            System.out.println("EXITO !!!");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    
	    private static void putPixel(int x, int y, Color c){       
		   g.setColor(c);
		   g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);    
	    }
	    
	    private static void fillRect(int x, int y, int width, int height, Color c){
	    	g.setColor(c);
	    	g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, width*PIXEL_SIZE, height*PIXEL_SIZE);
	    }
	    
	    private static void drawSquareGrid(int size, Color c) {
	    	g.setColor(c);
	        for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size; j++) { 
	                g.drawRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
	            }
	        }
	    }
	    private static void drawBackground(int size, Color c) {
	    	g.setColor(c);
	    	for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size; j++) {
	                g.fillRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);                
	            }
	        }
	    }    
	    
	    public static void main(String[] args) {
	        g = image.createGraphics();        
	        paint();
	    }
	}

