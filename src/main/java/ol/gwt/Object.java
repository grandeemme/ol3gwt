package ol.gwt;

import com.google.gwt.core.client.JavaScriptObject;

public abstract class Object extends Observable {

	protected Object() {
	}

	public native final JavaScriptObject get(String key)/*-{
		return this.get(key);
	}-*/;

	public native final void set(String key, JavaScriptObject prop)/*-{
		this.set(key, prop);
	}-*/;

	public native final void set(String key, String prop)/*-{
		this.set(key, prop);
	}-*/;

	public native final String getString(String key)/*-{
		var value = this.get(key);
		return  typeof value === 'string' ? value : null ;
	}-*/;
}
