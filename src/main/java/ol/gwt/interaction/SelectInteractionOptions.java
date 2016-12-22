package ol.gwt.interaction;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

import ol.gwt.ConditionType;
import ol.gwt.layer.Layer;
import ol.gwt.style.Style;

/**
 * Options for the select interaction
 */
public class SelectInteractionOptions extends JavaScriptObject {
	protected SelectInteractionOptions() {
	}

	public static final native SelectInteractionOptions create()/*-{
		return {};
	}-*/;

	/**
	 * Sets the list of layers from which features should be selected. If not defined, all visible layers will be
	 * considered selectable.
	 *
	 * @param layers
	 */
	public final native void setLayers(JsArray<Layer> layers)/*-{
		this.layers = layers;
	}-*/;

	/**
	 * Sets the style used for the selected features
	 *
	 * @param styles
	 */
	public final native void setStyles(JsArray<Style> styles)/*-{
		this.styles = styles;
	}-*/;

	public final native void setCondition(ConditionType condition)/*-{
		this.condition = condition;
	}-*/;
}
