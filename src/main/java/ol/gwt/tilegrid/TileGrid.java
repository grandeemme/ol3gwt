package ol.gwt.tilegrid;

import com.google.gwt.core.client.JavaScriptObject;

import ol.gwt.Coordinate;

/**
 * Base class for setting the grid pattern for sources accessing tiled-image servers
 */
public class TileGrid extends JavaScriptObject {

	protected TileGrid() {
	}

	public static final native TileGrid create(String projection, double[] resolutions, double opt_tileSize)/*-{
		projection = $wnd.ol.proj.get(projection);

		var extent = projection.getExtent();
		var corner = 'top-left';

		if (!resolutions) {
			var maxZoom = 42;
			var height = $wnd.ol.extent.getHeight(extent);
			var width = $wnd.ol.extent.getWidth(extent);

			var tileSize = $wnd.ol.size.toSize(opt_tileSize ? opt_tileSize
					: 256);
			var maxResolution = Math.max(width / tileSize[0], height
					/ tileSize[1]);

			var length = maxZoom + 1;
			resolutions = new Array(length);
			for (var z = 0; z < length; ++z) {
				resolutions[z] = maxResolution / Math.pow(2, z);
			}
		}

		return new $wnd.ol.tilegrid.TileGrid({
			extent : extent,
			origin : [ extent[0], extent[3] ],
			resolutions : resolutions,
			tileSize : opt_tileSize
		});
	}-*/;

	public final native Double getMinZoom()/*-{
		var res = this.getMinZoom();
		return res == null ? null : @java.lang.Double::valueOf(D)(res);
	}-*/;

	public final native Coordinate getOrigin(double z)/*-{
		return this.getOrigin();
	}-*/;

	public final native Double getResolution(double z)/*-{
		var res = this.getResolution();
		return res == null ? null : @java.lang.Double::valueOf(D)(res);
	}-*/;

	public final native Double getTileSize()/*-{
		var res = this.getTileSize();
		return res == null ? null : @java.lang.Double::valueOf(D)(res);
	}-*/;

}
