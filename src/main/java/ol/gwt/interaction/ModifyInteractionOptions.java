package ol.gwt.interaction;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

import ol.gwt.Collection;
import ol.gwt.feature.Feature;
import ol.gwt.style.Style;

/**
 * Options for the modify interaction
 */
public class ModifyInteractionOptions extends JavaScriptObject {
    protected ModifyInteractionOptions() {
    }

    public static final native ModifyInteractionOptions create()/*-{
        return {};
    }-*/;

    /** Pixel tolerance for considering the pointer close enough to a segment or vertex for editing. Default is 10 pixels.
     *
     * @param pixelTolerance
     */
    public final native void setPixelTolerance(double pixelTolerance)/*-{
        this.pixelTolerance=pixelTolerance;
    }-*/;

    /** sets FeatureOverlay style
     *
     * @param styles
     */
    public final native void setStyles(JsArray<Style> styles)/*-{
        this.style=styles;
    }-*/;

    /** Sets the features the modify interaction works on.
     *
     * @param features
     */
    public final native void setFeatures(Collection<Feature> features)/*-{
        this.features=features;
    }-*/;
}
