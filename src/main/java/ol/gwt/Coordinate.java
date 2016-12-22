package ol.gwt;

import com.google.gwt.core.client.JavaScriptObject;

import ol.gwt.proj.Projection;

/**
 * Coordinate
 */
public class Coordinate extends JavaScriptObject {

	protected Coordinate() {
	}

	public static native Coordinate create(double x, double y)/*-{
		return [ x, y ];
	}-*/;

	public native final double getX()/*-{
		return this[0] == null ? 0 : this[0];
	}-*/;

	public native final double getY()/*-{
		return this[1] == null ? 0 : this[1];
	}-*/;

	public native final Coordinate transform(String source, String destination)/*-{
		return $wnd.ol.proj.transform(this, source, destination)
	}-*/;

	public native final Coordinate transform(Projection source, Projection destination)/*-{
		return $wnd.ol.proj.transform(this, source, destination)
	}-*/;

	public native final Coordinate add(Coordinate delta)/*-{
		return $wnd.ol.coordinate.add(this, delta);
	}-*/;

	public native final Coordinate add(double deltaX, double deltaY)/*-{
		return $wnd.ol.coordinate.add(this, [ deltaX, deltaY ]);
	}-*/;
}
