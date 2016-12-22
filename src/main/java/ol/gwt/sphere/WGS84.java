package ol.gwt.sphere;

public class WGS84 extends Sphere {

	protected WGS84() {
	}

	public native static WGS84 getInstance()/*-{
		return new $wnd.ol.Sphere(6378137);
	}-*/;

}
