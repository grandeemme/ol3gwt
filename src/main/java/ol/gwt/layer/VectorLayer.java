package ol.gwt.layer;

import com.google.gwt.core.client.JsArray;

import ol.gwt.source.VectorSource;
import ol.gwt.style.Style;

/**
 * Basic wrapper for the ol3 vector layer
 */
public class VectorLayer extends Layer {

	protected VectorLayer() {
	}

	public static native VectorLayer create(VectorSource src)
	/*-{
		return new $wnd.ol.layer.Vector({
			source : src
		});
	}-*/;

	/**
	 * Set the style for features. Taking a shortcut here for simplicity. The javascript api would allow also single
	 * style instance and generator function
	 * 
	 * @param styles
	 */
	public native final void setStyles(JsArray<Style> styles)/*-{
		this.setStyle(styles);
	}-*/;

	public native final void setStyle(Style style)/*-{
		this.setStyle(style);
	}-*/;

	public native final JsArray<Style> getStyles()/*-{
		return this.getStyle();
	}-*/;

	/**
	 * Convenience method to avoid casting
	 * @return
	 */
	public final native VectorSource getVectorSource()/*-{
		return this.getSource();
	}-*/;

}
