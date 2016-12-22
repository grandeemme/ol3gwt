package ol.gwt.source;

import java.util.logging.Logger;

/**
 * Layer source for the MapQuest tile server
 */
public class MapQuestSource extends XYZSource {

    private static Logger logger= Logger.getLogger(MapQuestSource.class.getName());

    public static final String LAYER_OSM="osm";
    public static final String LAYER_SAT="sat";
    public static final String LAYER_HYB="hyb";

    protected MapQuestSource() {
    }

    public static final native MapQuestSource create(String layer) /*-{
        return new $wnd.ol.source.MapQuest({layer: layer});
    }-*/;
}
