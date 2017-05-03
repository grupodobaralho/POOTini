package decorator;

public class GUIDriver {

	public static void main(String[] args) {
		
		// Create a new window 
		
		Window window = new SimpleWindow();
		
		window.renderWindow("");
		
		// At some point later 
		// maybe text size becomes larger than the window... 
		// Thus the scrolling behavior must be added 
		
		System.out.println();
		
		// Decorate old window 
		window = new ScrollableWindow(window);
		
		// Now window object 
		// has additional behavior / state 
		
		window.renderWindow("");		
	}
}
