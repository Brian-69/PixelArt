import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Wooper {
	
	// Definimos el tamaÃ±o de la imagen en ancho y alto
	private static int width = 800;
    private static int height = 800;
    
    // Definimos el tamaÃƒÂ±o del pixel
    private static int PIXEL_SIZE = 40;
    private static Graphics2D g;
    
    // Definimos los colores a usar
    static Color white 		= Color.white;
    //static Color blue  		= Color.blue;
    static Color red   		= Color.red;
    static Color darkGray = new Color(68,68,68);
    static Color darkBlue = new Color(55,80,110);
    static Color blue 	= new Color(100,148,216);
    static Color softBlue 	= new Color(135,191,241);
    static Color darkPink = new Color(165,122,184);
    static Color softPink = new Color(232,171,221);
    static Color darkCyan = new Color(84,116,140);
    
    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    
    // Definimos la matriz de colores    
    private final static Color[][] PIXELS = {
        {white, white, 	white, 	white, 	white},
        {white, blue, 	blue, 	blue, 	white},
        {white, blue,	red,	blue, 	white},
        {white, blue, 	blue, 	blue, 	white},
        {white, white, 	white, 	white, 	white}
    };
    
    public static void paint() {
    	drawBackground(PIXEL_SIZE, Color.white);     
        drawHorizontalLine(3, 3, 1, Color.black);
        drawHorizontalLine(2, 4, 2, Color.black);
        drawHorizontalLine(6, 11, 2, Color.black);
        drawHorizontalLine(1, 13, 3, Color.black);
        drawHorizontalLine(0, 14, 4, Color.black);
        drawHorizontalLine(1, 15, 5, Color.black);
        drawHorizontalLine(1, 16, 6, Color.black);
        drawHorizontalLine(2, 17, 7, Color.black);
        drawHorizontalLine(3, 18, 8, Color.black);
        drawHorizontalLine(4, 18, 9, Color.black);
        drawHorizontalLine(5, 19, 10, Color.black);
        drawHorizontalLine(7, 11, 11, Color.black);
        drawHorizontalLine(14, 18, 11, Color.black);
        drawHorizontalLine(7, 10, 12, Color.black);
        drawHorizontalLine(13, 14, 12, Color.black);
        drawHorizontalLine(16, 16, 12, Color.black);
        drawHorizontalLine(6, 15, 13, Color.black);
        drawHorizontalLine(5, 15, 14, Color.black);
        drawHorizontalLine(6, 14, 15, Color.black);
        drawHorizontalLine(8, 12, 16, Color.black);
        drawHorizontalLine(10, 11, 17, Color.black);
        drawVerticalLine(2, 3, 3, softPink);
        drawHorizontalLine(6, 11, 3, blue);
        drawHorizontalLine(7, 10, 3, softBlue);
        drawHorizontalLine(1, 3, 4, softPink);
        drawHorizontalLine(3, 3, 4, darkPink);
        drawHorizontalLine(5, 11, 4, softBlue);
        drawHorizontalLine(12, 12, 4, blue);
        drawHorizontalLine(13, 13, 4, darkBlue);
        drawHorizontalLine(4, 12, 5, softBlue);
        drawHorizontalLine(5, 5, 5, Color.black);
        drawVerticalLine(5, 6, 13, blue);
        drawHorizontalLine(14, 14, 5, darkBlue);
        drawHorizontalLine(4, 12, 6, softBlue);
        drawHorizontalLine(5, 12, 7, softBlue);
        drawVerticalLine(6, 7, 14, darkGray);
        drawHorizontalLine(13, 13, 7, darkBlue);
        drawHorizontalLine(9, 9, 7, Color.black);
        drawVerticalLine(6, 8, 15, softPink);
        drawVerticalLine(5, 6, 2, darkPink);
        drawVerticalLine(5, 6, 3, darkGray);
        drawHorizontalLine(4, 4, 7, darkBlue);
        drawHorizontalLine(4, 4, 8, blue);
        drawHorizontalLine(5, 6, 8, darkGray);
        drawHorizontalLine(7, 10, 8, softBlue);
        drawHorizontalLine(11, 11, 8, darkBlue);
        drawHorizontalLine(12, 12, 8, blue);
        drawHorizontalLine(13, 13, 8, darkPink);
        drawHorizontalLine(14, 14, 8, softPink);
        drawHorizontalLine(17, 17, 8, softPink);
        drawHorizontalLine(5, 6, 9, blue);
        drawHorizontalLine(7, 9, 9, darkGray);
        drawHorizontalLine(10, 10, 9, darkBlue);
        drawHorizontalLine(11, 12, 9, blue);
        drawHorizontalLine(13, 13, 9, darkGray);
        drawHorizontalLine(14, 15, 9, darkPink);
        drawHorizontalLine(16, 17, 9, softPink);
        drawHorizontalLine(7, 10, 10, blue);
        drawHorizontalLine(11, 11, 10, darkBlue);
        drawHorizontalLine(14, 17, 10, darkPink);
        drawHorizontalLine(15, 15, 10, darkGray);
        drawHorizontalLine(18, 18, 10, softPink);
        drawHorizontalLine(16, 16, 11, darkPink);
        drawHorizontalLine(8, 8, 12, darkCyan);
        drawHorizontalLine(9, 9, 12, blue);
        drawHorizontalLine(8, 10, 13, blue);
        drawHorizontalLine(13, 14, 13, blue);
        drawHorizontalLine(6, 6, 14, blue);
        drawHorizontalLine(7, 7, 14, darkBlue);
        drawHorizontalLine(8, 9, 14, darkCyan);
        drawHorizontalLine(10, 10, 14, blue);
        drawHorizontalLine(11, 11, 14, darkGray);
        drawHorizontalLine(12, 13, 14, blue);
        drawHorizontalLine(14, 14, 14, darkBlue);
        drawHorizontalLine(8, 9, 15, darkBlue);
        drawHorizontalLine(10, 10, 15, darkGray);
        drawHorizontalLine(10, 11, 16, blue);

        drawSquareGrid(PIXEL_SIZE, Color.black);
        
        // Guardamos la imagen en formato JPG
        try {       
            ImageIO.write(image, "jpg", new File("pixel_art.jpg"));
            System.out.println("EXITO !!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void drawVerticalLine(int a, int b, int x, Color c){
   	    g.setColor(c);
    	for(int i=a;i<=b;i++){
    		 putPixel(x, i, c);
        }
    }
    
    private static void drawHorizontalLine(int a, int b, int y, Color c){
    	g.setColor(c);
        for(int i=a;i<=b;i++){
        	 putPixel(i, y, c);
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