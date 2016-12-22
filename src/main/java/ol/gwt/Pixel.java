package ol.gwt;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Wrapper for a pixel
 */
public class Pixel extends JavaScriptObject {
	protected Pixel() {
	}

	public static native Pixel create(double x, double y)/*-{
		return [ x, y ];
	}-*/;

	public native final double x()/*-{
		return this[0];
	}-*/;

	public native final double y()/*-{
		return this[1];
	}-*/;
}
