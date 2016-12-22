package ol.gwt.style;

import com.google.gwt.core.client.JsArrayNumber;
import com.google.gwt.dom.client.ImageElement;

import ol.gwt.Size;

/**
 * Circle style for a feature
 */
public class CircleStyle extends ImageStyle{
    protected CircleStyle() {
    }

    /**
     * Initializes CircleStyle
     */
    public static final native CircleStyle create(CircleStyleOptions options)
    /*-{
        return new $wnd.ol.style.Circle(options);
    }-*/;

    public final native JsArrayNumber getAnchor() /*-{
        return this.getAnchor;
    }-*/;

    public final native FillStyle getFill() /*-{
        return this.getFill();
    }-*/;

    public final native ImageElement getImage(double pixelRatio) /*-{
        return this.getImage(pixelRatio);
    }-*/;

    public final native JsArrayNumber getOrigin() /*-{
        return this.getOrigin();
    }-*/;

    public final native Double getRadius() /*-{
        var res = this.getRadius();
        return res == null ? null : @java.lang.Double::valueOf(D)(res);
    }-*/;

    public final native Size getSize() /*-{
        return this.getSize();
    }-*/;

    public final native StrokeStyle getStroke() /*-{
        return this.getStroke();
    }-*/;
}
