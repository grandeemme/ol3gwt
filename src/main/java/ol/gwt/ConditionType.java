package ol.gwt;

import com.google.gwt.core.client.JavaScriptObject;

public class ConditionType extends JavaScriptObject {

	protected ConditionType() {
	}

	public static native ConditionType click()/*-{
		return $wnd.ol.events.condition.click;
	}-*/;

	public static native ConditionType pointerMove()/*-{
		return $wnd.ol.events.condition.pointerMove;
	}-*/;

	public static native ConditionType always()/*-{
		return $wnd.ol.events.condition.always;
	}-*/;

}
