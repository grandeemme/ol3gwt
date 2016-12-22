package ol.gwt.style;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;

/**
 * Stroke style for a feature
 */
public class StrokeStyle extends JavaScriptObject {
	protected StrokeStyle() {
	}

	/**
	 * creates a new StrokeStyle instance
	 *
	 * @param options
	 * @return
	 */
	public static final native StrokeStyle create(StrokeStyleOptions options) /*-{
		return new $wnd.ol.style.Stroke(options);
	}-*/;

	public static final native StrokeStyle create(String c, double w) /*-{
		return new $wnd.ol.style.Stroke({
			color : c,
			width : w
		});
	}-*/;

	public static final native StrokeStyle create(String c) /*-{
		return new $wnd.ol.style.Stroke({
			color : c
		});
	}-*/;

	public final native String getColor() /*-{
		return this.getColor();
	}-*/;

	public final native String getLineCap() /*-{
		return this.getLineCap();
	}-*/;

	public final native JsArrayNumber getLineDash() /*-{
		return this.getLineDash();
	}-*/;

	public final native String getLineJoin() /*-{
		return this.getLineJoin();
	}-*/;

	public final native Double getMiterLimit() /*-{
		var res = this.getMiterLimit();
		return res == null ? null : @java.lang.Double::valueOf(D)(res);
	}-*/;

	public final native Double getWidth() /*-{
		var res = this.getWidth();
		return res == null ? null : @java.lang.Double::valueOf(D)(res);
	}-*/;

	public final native void setColor(String color) /*-{
		this.setColor(color);
	}-*/;

	public final native void setLineCap(String lineCap) /*-{
		return this.setLineCap(lineCap);
	}-*/;

	public final native void setLineDash(JsArrayNumber lineDash) /*-{
		return this.setLineDash(lineDash);
	}-*/;

	public final native void setLineJoin(String lineJoin) /*-{
		return this.setLineJoin(lineJoin);
	}-*/;

	public final native void setMiterLimit(double mitterLimit) /*-{
		this.setMiterLimit(mitterLimit);
	}-*/;

	public final native void setWidth(double width) /*-{
		this.setWidth(width);
	}-*/;

}
