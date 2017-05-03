package decorator;

/**
 * Concrete Decorator with extended state 
 * 
 *  Scrollable window creates a window that is scrollable
 * 
 *
 */
public class ScrollableWindow extends DecoratedWindow{

	/**
	 * Additional State 
	 */
	private String scrollBarObjectRepresentation;
	
	public ScrollableWindow(Window windowRefernce) {

		super(windowRefernce);
		// Initialize scrollbar object
		scrollBarObjectRepresentation =  "myscroll";
	}
	
	@Override
	public void renderWindow(String prefix) {
		System.out.println(prefix+"ScrollableWindow:render");
		// render scroll bar 
		renderScrollBarObject(prefix+"  ");
		
		// render decorated window
		super.renderWindow(prefix+"  ");
	}

	private void renderScrollBarObject(String prefix) {	
		// render scrollbar 
		System.out.println(prefix+"ScrollableWindow:renderScrollBar: "+scrollBarObjectRepresentation);
		
	}	
}