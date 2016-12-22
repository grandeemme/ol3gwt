package ol.gwt.source;

/**
 * A vector source in one of the supported formats, where the data is divided into tiles in a fixed grid pattern
 */
public class TileVectorSource extends FormatVectorSource{
    protected TileVectorSource() {
    }

    public static final native TileVectorSource create() /*-{
        return new $wnd.ol.source.TileVector();
    }-*/;

    public static final native TileWMSSource create(TileVectorSourceOptions options) /*-{
        return new $wnd.ol.source.TileVector(options);
    }-*/;


}
