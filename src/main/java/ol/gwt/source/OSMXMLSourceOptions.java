package ol.gwt.source;

import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Node;

import ol.gwt.style.Style;

/**
 * Options for the OSMXMLSource
 */
public class OSMXMLSourceOptions extends AbstractVectorSourceOptions{
    protected OSMXMLSourceOptions() {
    }

    public static native final OSMXMLSourceOptions create()/*-{
        return {};
    }-*/;

    public native final void setUrl(String url)/*-{
        this.url = url;
    }-*/;

    public native final void setUrls(JsArrayString urls)/*-{
        this.urls = urls;
    }-*/;

    public final native void setText(String text)/*-{
        this.text=text;
    }-*/;

    public final native void setDoc(Document document)/*-{
        this.doc=doc;
    }-*/;

    public final native void setNode(Node node)/*-{
        this.node=node;
    }-*/;

    public final native void setDefaultStyle(Style defaultStyle)/*-{
        this.defaultStyle=defaultStyle;
    }-*/;

    public final native void setReprojectTo(String reprojectTo)/*-{
        this.reprojectTo=reprojectTo;
    }-*/;

}
