package ol.gwt.source;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

import ol.gwt.format.FeatureFormat;
import ol.gwt.tilegrid.TileGrid;

/**
 * Options for the TileVectorSource
 */
public class TileVectorSourceOptions extends AbstractVectorSourceOptions{

    protected TileVectorSourceOptions() {
    }

    public static final native TileVectorSourceOptions create()/*-{
        return {};
    }-*/;

    /** URL template. . Must include {x}, {y} or {-y}, and {z} placeholders
     *
     * @param url
     */
    public native final void setUrl(String url)/*-{
        this.url = url;
    }-*/;

    /**
     * An array of URL templates
     *
     * @param urls
     */
    public native final void setUrls(JsArrayString urls)/*-{
        this.urls = urls;
    }-*/;

    public final native void setDefaultProjection(String defaultProjection)/*-{
        this.defaultProjection=defaultProjection;
    }-*/;

    public final native void setFormat(FeatureFormat format)/*-{
        this.format=format;
    }-*/;

    public final native void setObject(JavaScriptObject object)/*-{
        this.object=object;
    }-*/;

    public final native void setTileGrid(TileGrid tileGrid)/*-{
        this.tileGrid=tileGrid;
    }-*/;
}

