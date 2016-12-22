package ol.gwt.source;

import ol.gwt.Attribution;

/**
 * Layer source for the OpenStreetMap tile server
 */
public class OSMSource extends XYZSource {
    protected OSMSource() {
    }

    public static final native OSMSource create() /*-{
        return new $wnd.ol.source.OSM();
    }-*/;

    public static final native OSMSource create(OSMSourceOptions options) /*-{
        return new $wnd.ol.source.OSM(options);
    }-*/;

    public static final native Attribution createDataAttribution() /*-{
        return $wnd.ol.source.OSM.DATA_ATTRIBUTION;
    }-*/;

    public static final native Attribution createTileAttribution() /*-{
        return $wnd.ol.source.OSM.TILE_ATTRIBUTION;
    }-*/;
}
