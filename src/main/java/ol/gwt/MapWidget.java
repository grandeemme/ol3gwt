package ol.gwt;

import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.ui.Widget;

/**
 * The GWT widget that shows the map
 */
public class MapWidget extends Widget {

    private Map map;
    private MapOptions options;

    public MapWidget(){
        setElement(Document.get().createDivElement());
        setStylePrimaryName(getElement(), "ol3map");
    }

    public void initMap(MapOptions options){
        map = Map.create(options);
        if(map.getTarget()==null){
            map.setTarget(getElement());
        }
    }

    public boolean isMapInitialized(){
        return map!=null;
    }

    public Map getMap(){
        if(!isMapInitialized()){
            initMap(MapOptions.create());
        }
        return map;
    }
}
