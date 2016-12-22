package ol.gwt.source;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

import ol.gwt.feature.Feature;

/**
 * Abstract base class for vector sources in one of the supported formats
 */
public abstract class FormatVectorSource extends AbstractVectorSource{
    protected FormatVectorSource() {
    }

    /** Reads the features from given source
     *
     * @param featureSource the source for features (ArrayBuffer | Document | node | object | string)
     * @return
     */
    public final native JsArray<Feature> readFeatures(JavaScriptObject featureSource)/*-{
        return this.readFeatures(featureSource);
    }-*/;

}
