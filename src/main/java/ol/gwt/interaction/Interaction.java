package ol.gwt.interaction;

import ol.gwt.Collection;
import ol.gwt.Object;

/**
 * Base class for all the interactions
 */
public class Interaction extends Object {

	protected Interaction() {
	}

	public native final boolean getActive()/*-{
		return this.getActive();
	}-*/;

	public native final void setActive(boolean active)/*-{
		this.setActive(active);
	}-*/;

	public static native final Collection<Interaction> defaults(DefaultInteractionOptions opt_options)/*-{
		return $wnd.ol.interaction.defaults(opt_options)
	}-*/;

}
