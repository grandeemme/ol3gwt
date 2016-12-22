package ol.gwt.control;

/**
 * A slider type of control for zooming.
 */
public class ZoomSliderControl extends Control{
    protected ZoomSliderControl() {
    }

    public static final native ZoomSliderControl create()/*-{
        return new $wnd.ol.control.ZoomSlider();
    }-*/;

    public static final native ZoomSliderControl create(ZoomSliderControlOptions options)/*-{
        return new $wnd.ol.control.ZoomSlider(options);
    }-*/;
}
