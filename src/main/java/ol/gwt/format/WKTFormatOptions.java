package ol.gwt.format;

import com.google.gwt.core.client.JavaScriptObject;

import ol.gwt.proj.Projection;

public class WKTFormatOptions extends JavaScriptObject {

	protected WKTFormatOptions() {
	}

	public static final native WKTFormatOptions create()/*-{
		return {};
	}-*/;

	public static final native WKTFormatOptions create(Projection dataP)/*-{
		return {
			dataProjection : dataP
		};
	}-*/;

	public static final native WKTFormatOptions create(Projection dataP, Projection featureP)/*-{
		return {
			dataProjection : dataP,
			featureProjection : featureP
		};
	}-*/;

	public final native void setDataProjection(Projection dataProjection)/*-{
		this.dataProjection = dataProjection;
	}-*/;

	public final native void setFeatureProjection(Projection featureProjection)/*-{
		this.featureProjection = featureProjection;
	}-*/;
}
