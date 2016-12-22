package ol.gwt.tilegrid;

/**
 * Set the grid pattern for sources accessing XYZ tiled-image servers
 */
public class XYZTileGrid extends TileGrid {
    protected XYZTileGrid() {
    }

    public static final native XYZTileGrid create(double maxZoom)/*-{
        return $wnd.ol.tilegrid.createXYZ({maxZoom: maxZoom});
    }-*/;

}
