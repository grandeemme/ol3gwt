package ol.gwt.interaction;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

import ol.gwt.ConditionType;
import ol.gwt.style.Style;

/**
 * Options for the select interaction
 */
public class DragZoomOptions extends JavaScriptObject {

	protected DragZoomOptions() {
	}

	public static final native DragZoomOptions create()/*-{
		return {};
	}-*/;

	public final native void duration(double duration)/*-{
		this.duration = duration;
	}-*/;

	public final native void setStyles(JsArray<Style> styles)/*-{
		this.styles = styles;
	}-*/;

	public final native void setCondition(ConditionType condition)/*-{
		this.condition = condition;
	}-*/;
}
