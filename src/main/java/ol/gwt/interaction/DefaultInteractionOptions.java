package ol.gwt.interaction;

import com.google.gwt.core.client.JavaScriptObject;

public class DefaultInteractionOptions extends JavaScriptObject {

	protected DefaultInteractionOptions() {
		super();
	}

	public static final native DefaultInteractionOptions create()/*-{
		return {};
	}-*/;

	public static final native DefaultInteractionOptions createAllFalse()/*-{
		return {
			altShiftDragRotate : false,
			doubleClickZoom : false,
			keyboard : false,
			mouseWheelZoom : false,
			shiftDragZoom : false,
			dragPan : false,
			pinchRotate : false,
			pinchZoom : false
		};
	}-*/;

	public final native void setAltShiftDragRotate(boolean value)/*-{
		this.altShiftDragRotate = value;
	}-*/;

	public final native void setDoubleClickZoom(boolean value)/*-{
		this.doubleClickZoom = value;
	}-*/;

	public final native void setKeyboard(boolean value)/*-{
		this.keyboard = value;
	}-*/;

	public final native void setMouseWheelZoom(boolean value)/*-{
		this.mouseWheelZoom = value;
	}-*/;

	public final native void setShiftDragZoom(boolean value)/*-{
		this.shiftDragZoom = value;
	}-*/;

	public final native void setDragPan(boolean value)/*-{
		this.dragPan = value;
	}-*/;

	public final native void setPinchRotate(boolean value)/*-{
		this.pinchRotate = value;
	}-*/;

	public final native void setPinchZoom(boolean value)/*-{
		this.pinchZoom = value;
	}-*/;

	public final native void setZoomDelta(double value)/*-{
		this.zoomDelta = value;
	}-*/;

	public final native void setZoomDuration(double value)/*-{
		this.zoomDuration = value;
	}-*/;

}
