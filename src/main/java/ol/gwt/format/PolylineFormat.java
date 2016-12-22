package ol.gwt.format;

/**
 * Reader/Writer for Polyline features
 */
public class PolylineFormat extends FeatureFormat{
    protected PolylineFormat() {
    }

    public static final native PolylineFormat create()/*-{
        return new $wnd.ol.format.Polyline();
    }-*/;

    /** creates a new polyline format
     *
     * @param factor The factor by which the coordinates values will be scaled. Default is 1e5
     * @return
     */
    public static final native PolylineFormat create(String factor)/*-{
        return new $wnd.ol.format.Polyline({factor: factor});
    }-*/;
}
