package ol.gwt.format;

/**
 * Reader/Writer for GML features
 */
public class GMLFormat extends FeatureFormat {
    protected GMLFormat() {
    }

    public static final native GMLFormat create()/*-{
        return new $wnd.ol.format.GML();
    }-*/;

    public static final native GMLFormat create(GMLFormatOptions options)/*-{
        return new $wnd.ol.format.GML(options);
    }-*/;
}
