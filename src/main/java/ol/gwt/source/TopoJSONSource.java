package ol.gwt.source;

/**
 * TopoJSON layer data source
 */
public class TopoJSONSource extends StaticVectorSource{
    protected TopoJSONSource() {
    }

    public static final native TopoJSONSource create() /*-{
        return new $wnd.ol.source.TopoJSON();
    }-*/;

    public static final native TopoJSONSource create(TopoJSONSourceOptions options) /*-{
        return new $wnd.ol.source.TopoJSON(options);
    }-*/;
}
