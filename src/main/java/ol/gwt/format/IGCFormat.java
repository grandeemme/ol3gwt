package ol.gwt.format;

/**
 * Reader/Writer for IGC features
 */
public class IGCFormat extends FeatureFormat{
    protected IGCFormat() {
    }

    public static final native IGCFormat create()/*-{
        return new $wnd.ol.format.IGC();
    }-*/;

    public static final native IGCFormat create(String altitudeMode)/*-{
        return new $wnd.ol.format.IGC({altitudeMode: altitudeMode});
    }-*/;
}
