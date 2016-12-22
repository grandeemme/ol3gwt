package ol.gwt.source;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * Options passed to GeoJSON source on creation
 */
public class GeoJSONSourceOptions extends AbstractVectorSourceOptions{

    protected GeoJSONSourceOptions() {
    }

    public static final native GeoJSONSourceOptions create()/*-{
        return {};
    }-*/;

    public native final void setUrl(String url)/*-{
        this.url = url;
    }-*/;

    public native final void setUrls(JsArrayString urls)/*-{
        this.urls = urls;
    }-*/;

    public final native void setDefaultProjection(String defaultProjection)/*-{
        this.defaultProjection=defaultProjection;
    }-*/;

    public final native void setObject(JavaScriptObject object)/*-{
        this.object=object;
    }-*/;

    public final native void setText(String text)/*-{
        this.text=text;
    }-*/;
}
