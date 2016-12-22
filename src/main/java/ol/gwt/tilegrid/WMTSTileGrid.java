package ol.gwt.tilegrid;

import com.google.gwt.core.client.JsArrayNumber;

/**
 * The grid pattern for sources accessing WMTS tiled-image servers
 */
public class WMTSTileGrid extends TileGrid {

    protected WMTSTileGrid() {
    }

    public static final native WMTSTileGrid create()/*-{
        return new $wnd.ol.tilegrid.WMTS();
    }-*/;

    public static final native WMTSTileGrid create(WMTSTileGridOptions options)/*-{
        return new $wnd.ol.tilegrid.WMTS(options);
    }-*/;

    public final native JsArrayNumber getMatrixIds()/*-{
        return this.getMatrixIds();
    }-*/;


}
