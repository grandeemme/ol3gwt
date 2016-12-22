package ol.gwt.source;

/**
 * KMLSource
 */
public class KMLSource extends StaticVectorSource{
    protected KMLSource() {
    }

    public static final native KMLSource create() /*-{
        return new $wnd.ol.source.KML();
    }-*/;

    public static final native KMLSource create(KMLSourceOptions options) /*-{
        return new $wnd.ol.source.KML(options);
    }-*/;
}
