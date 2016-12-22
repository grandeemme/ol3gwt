package ol.gwt.tilegrid;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayNumber;
import com.google.gwt.core.client.JsArrayString;

import ol.gwt.Coordinate;

/**
 * Options passed to WMTSTileGrid instance on creation
 */
public class WMTSTileGridOptions extends JavaScriptObject{
    protected WMTSTileGridOptions() {
    }

    public static final native WMTSTileGridOptions create()/*-{
        return {};
    }-*/;

    public final native void setOrigin(Coordinate origin)/*-{
        this.origin=origin;
    }-*/;

    public final native void setOrigins(JsArray<Coordinate> origin)/*-{
        this.origins=origins;
    }-*/;

    public final native void setResolutions(JsArrayNumber resolutions)/*-{
        this.resolutions=resolutions;
    }-*/;

    public final native void setMatrixIds(JsArrayString matrixIds)/*-{
        this.matrixIds=matrixIds;
    }-*/;

    public final native void setTileSize(Double tileSize)/*-{
        this.tileSize=tileSize;
    }-*/;

    public final native void setTileSizes(JsArrayNumber tileSizes)/*-{
        this.tileSizes=tileSizes;
    }-*/;
}
