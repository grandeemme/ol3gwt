package ol.gwt.source;

import com.google.gwt.core.client.JavaScriptObject;

public class Params extends JavaScriptObject {

	protected Params() {
	}

	public static native Params create()/*-{
		return {};
	}-*/;

	public native final void set(String parameter, String value)/*-{
		this[parameter] = value;
	}-*/;
}
