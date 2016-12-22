package ol.gwt.layer;

import ol.gwt.source.Source;

/**
 * Tile layer. Used for map tile sources
 *
 */
public class TileLayer extends Layer{

    protected TileLayer() {
    }

    public static native TileLayer create(Source src)
    /*-{
        return new $wnd.ol.layer.Tile({source: src});
    }-*/;

    public static native TileLayer create(TileOptions options)
    /*-{
        return new $wnd.ol.layer.Tile(options);
    }-*/;

}
