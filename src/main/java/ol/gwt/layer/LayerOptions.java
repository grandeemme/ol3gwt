package ol.gwt.layer;

import com.google.gwt.core.client.JavaScriptObject;

import ol.gwt.source.Source;

/**
 * Base class for layer options
 */
public abstract class LayerOptions extends JavaScriptObject {
    protected LayerOptions() {
    }

    public native final void setBrightness(double brightness)/*-{
        this.brightness=brightness;
    }-*/;

    public native final void setContrast(double contrast)/*-{
        this.contrast=contrast;
    }-*/;

    public native final void setHue(double hue)/*-{
        this.hue=hue;
    }-*/;

    public native final void setMaxResolution(double maxResolution)/*-{
        this.maxResolution=maxResolution;
    }-*/;

    public native final void setMinResolution(double minResolution)/*-{
        this.minResolution=minResolution;
    }-*/;

    public native final void setOpacity(double opacity)/*-{
        this.opacity=opacity;
    }-*/;

    public native final void setSaturation(double saturation)/*-{
        this.saturation=saturation;
    }-*/;

    public native final void setVisible(boolean visible)/*-{
        this.visible=visible;
    }-*/;

    public final native void setSource(Source source)/*-{
        this.source=source;
    }-*/;
}
