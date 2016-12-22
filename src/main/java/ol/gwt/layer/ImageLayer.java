package ol.gwt.layer;

import ol.gwt.source.Source;

/**
 * Image layer
 */
public class ImageLayer extends Layer {
    protected ImageLayer() {
    }

    public static native ImageLayer create(Source src)
    /*-{
        return new $wnd.ol.layer.Image({source: src});
    }-*/;

    public static native TileLayer create(ImageOptions options)
    /*-{
        return new $wnd.ol.layer.Image(options);
    }-*/;
}
