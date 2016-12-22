package ol.gwt.strategy;

import com.google.gwt.core.client.JavaScriptObject;

import ol.gwt.Extent;
import ol.gwt.tilegrid.TileGrid;

public class LoadingStrategy extends JavaScriptObject {
	
	protected LoadingStrategy(){}

	public static native LoadingStrategy all(Extent extent, double resolution)/*-{
		return $wnd.ol.loadingstrategy.all(extent, resolution);
	}-*/;

	public static native LoadingStrategy bbox(Extent extent, double resolution)/*-{
		return $wnd.ol.loadingstrategy.bbox(extent, resolution);
	}-*/;

	public static native LoadingStrategy tile(TileGrid grid)/*-{
		return $wnd.ol.loadingstrategy.tile(grid);
	}-*/;

}
