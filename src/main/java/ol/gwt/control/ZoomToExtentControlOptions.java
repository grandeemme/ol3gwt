package ol.gwt.control;

import com.google.gwt.core.client.JavaScriptObject;

import ol.gwt.Extent;

/**
 * Options passed to the ZoomToExtentControl on creation
 */
public class ZoomToExtentControlOptions extends JavaScriptObject{
    protected ZoomToExtentControlOptions() {
    }

    public static final native ZoomToExtentControlOptions create()/*-{
        return {};
    }-*/;

    /** Sets the css class name of the control. Default is ol-zoom-extent
     *
     * @param className className
     */
    public final native void setClassName(String className)/*-{
        this.className=className;
    }-*/;

    /** Text label to use for the button tip. Default is Zoom to extent
     *
     * @param tipLabel
     */
    public final native void setTipLabel(String tipLabel)/*-{
        this.tipLabel=tipLabel;
    }-*/;

    /** The extent to zoom to. If undefined the validity extent of the view projection is used.
     *
     * @param extent
     */
    public final native void setExtent(Extent extent)/*-{
        this.extent=extent;
    }-*/;
}
