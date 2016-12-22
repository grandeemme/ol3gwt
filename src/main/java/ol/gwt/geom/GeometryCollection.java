package ol.gwt.geom;

public class GeometryCollection extends Geometry {

	protected GeometryCollection() {
	}

	public static native GeometryCollection create(Geometry[] geoms) /*-{
		return new $wnd.ol.geom.GeometryCollection(geoms);
	}-*/;
}
