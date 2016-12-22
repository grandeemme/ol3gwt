package ol.gwt.event;

import com.google.gwt.core.client.JavaScriptObject;

import ol.gwt.Object;

public class ObjectEvent<T extends JavaScriptObject> extends JavaScriptObject implements Event {

	protected ObjectEvent() {
	}

	public final native Object getTarget()/*-{
		return this.target;
	}-*/;

	public final native String getKey()/*-{
		return this.key;
	}-*/;

	public final native T getOldValue()/*-{
		return this.oldValue;
	}-*/;

	public final native T getNewValue()/*-{
		return this.target.get(this.key);
	}-*/;
}
