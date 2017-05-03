package decorator;

/**
*
*/
public class DecoratedWindow implements Window{

	/**
	 * private reference to the window being decorated 
	 */
	private Window privateWindowRefernce = null;
	
	public DecoratedWindow( Window windowRefernce) {
	
		this.privateWindowRefernce = windowRefernce;
	}

	@Override
	public void renderWindow(String prefix) {
		System.out.println(prefix+"DecoratedWindow:render");
		privateWindowRefernce.renderWindow(prefix+"  ");
	}
}