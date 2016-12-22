package ol.gwt.geom;

import ol.gwt.Coordinate;

public class Point extends SimpleGeometry {

	protected Point() {
	}

	public static Point create(Coordinate coordinate, String projection) {
		Point p = create(coordinate);
		p.setProjection(projection);
		return p;
	}

	public static Point create(double[] coordinate, String projection) {
		Point p = create(coordinate);
		p.setProjection(projection);
		return p;
	}

	public static Point create(double x, double y, String projection) {
		Point p = create(x, y);
		p.setProjection(projection);
		return p;
	}

	public static native Point create(Coordinate coordinate)/*-{
		return new $wnd.ol.geom.Point(coordinate);
	}-*/;

	public static native Point create(double[] coordinate)/*-{
		return new $wnd.ol.geom.Point(coordinate);
	}-*/;

	public static native Point create(double x, double y)/*-{
		return new $wnd.ol.geom.Point([ x, y ]);
	}-*/;

	public static native Point create(Coordinate coordinate, GeometryLayout layout)/*-{
		var lay = layout.@ol.gwt.geom.GeometryLayout::toString()();
		return new $wnd.ol.geom.Point(coordinate, lay);
	}-*/;

	public static native Point create(double[] coordinate, GeometryLayout layout)/*-{
		var lay = layout.@ol.gwt.geom.GeometryLayout::toString()();
		return new $wnd.ol.geom.Point(coordinate, lay);
	}-*/;

	public native final Coordinate getCoordinates()/*-{
		return this.getCoordinates();
	}-*/;

}
