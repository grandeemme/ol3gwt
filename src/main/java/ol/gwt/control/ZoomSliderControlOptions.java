package ol.gwt.control;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Options passed to the ZoomSliderControl on creation
 */
public class ZoomSliderControlOptions extends JavaScriptObject{
    protected ZoomSliderControlOptions() {
    }

    public static final native ZoomSliderControlOptions create()/*-{
        return {};
    }-*/;

    /** Sets the css class name of the control. Default is ol-zoom-slider
     *
     * @param className className
     */
    public final native void setClassName(String className)/*-{
        this.className=className;
    }-*/;

    /** Sets the minimum resolution
     *
     * @param minResolution
     */
    public final native void setMinResolution(double minResolution)/*-{
        this.minResolution=minResolution;
    }-*/;

    /** Sets the maximum resolution
     *
     * @param maxResolution
     */
    public final native void setMaxResolution(double maxResolution)/*-{
        this.maxResolution=maxResolution;
    }-*/;
}
