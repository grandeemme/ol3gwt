package ol.gwt.geom;

import ol.gwt.Coordinate;

public class Circle extends SimpleGeometry {
	protected Circle() {
	}

	public static final native Circle create(Coordinate center, double opt_radius)/*-{
		new $wnd.ol.geom.Circle(center, opt_radius);
	}-*/;

	public final native Coordinate getCenter()/*-{
		return this.getCenter();
	}-*/;

	public final native double getRadius()/*-{
		return this.getRadius();
	}-*/;

}
