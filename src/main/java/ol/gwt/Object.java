package ol.gwt;

import com.google.gwt.core.client.JavaScriptObject;

public abstract class Object extends Observable {

	protected Object() {
	}

	public native final JavaScriptObject get(String key)/*-{
		return this.get(key);
	}-*/;

	public native final void set(String key, JavaScriptObject prop)/*-{
		this.set(key , prop);
	}-*/;

	public native final void set(String key, String prop)/*-{
		this.set(key, prop);
	}-*/;

	public final String getString(String key) {
		JavaScriptObject j = get(key);
		return j != null ? j.toString() : null;
	}
}
