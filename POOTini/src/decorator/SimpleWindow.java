package decorator;

/**
 * Window implementation 
 * 
 * Concrete implementation
 */
public class SimpleWindow implements Window {

	@Override
	public void renderWindow(String prefix) {
		// implementation of rendering details
		System.out.println(prefix+"SimpleWindow:render");
	}
}