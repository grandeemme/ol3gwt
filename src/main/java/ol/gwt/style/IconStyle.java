package ol.gwt.style;

import com.google.gwt.core.client.JsArrayNumber;
import com.google.gwt.dom.client.ImageElement;

import ol.gwt.Size;

/**
 * IconStyle for a feature
 */
public class IconStyle extends ImageStyle {
    protected IconStyle() {
    }

    /** creates a new IconStyle instance
     *
     * @param options
     * @return
     */
    public static final native IconStyle create(IconStyleOptions options) /*-{
        return new $wnd.ol.style.Icon(options);
    }-*/;

    public final native JsArrayNumber getAnchor() /*-{
        return this.getAnchor;
    }-*/;

    public final native ImageElement getImage(double pixelRatio) /*-{
        return this.getImage(pixelRatio);
    }-*/;

    public final native JsArrayNumber getOrigin() /*-{
        return this.getOrigin();
    }-*/;

    public final native Size getSize() /*-{
        return this.getSize();
    }-*/;

    public final native String getSrc() /*-{
        return this.getSrc();
    }-*/;
}
