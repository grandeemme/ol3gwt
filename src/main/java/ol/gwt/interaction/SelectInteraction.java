package ol.gwt.interaction;

import ol.gwt.Collection;
import ol.gwt.Map;
import ol.gwt.feature.Feature;

/**
 * Interaction that handles selection of vector data
 */
public class SelectInteraction extends Interaction{
    protected SelectInteraction() {
    }

    public static final native SelectInteraction create()/*-{
        return new $wnd.ol.interaction.Select();
    }-*/;

    public static final native SelectInteraction create(SelectInteractionOptions options)/*-{
        return new $wnd.ol.interaction.Select(options);
    }-*/;

    /** Gets the selected features
     *
     * @return the collection of selected features
     */
    public native final Collection<Feature> getFeatures()/*-{
        return this.getFeatures();
    }-*/;

    /** Remove the interaction from its current map, if any, and attach it to a new map, if any. Pass null to just remove the interaction from the current map.
     *
     * @param map
     */
    public native final void setMap(Map map)/*-{
        this.setMap(map);
    }-*/;

    public native final void addSelectionChangeListener(SelectionChangeListener listener)/*-{
        var callback=function(){
            listener.@ol.gwt.interaction.SelectionChangeListener::selectionChanged()();
        };
        this.getFeatures().on("change:length",$entry(callback),this);
    }-*/;
}
