package ol.gwt.interaction;

public class DragZoomInteraction extends DragBoxInteraction {

	protected DragZoomInteraction() {
	}

	public static native final DragZoomInteraction create(DragZoomOptions opt)/*-{
		return new $wnd.ol.interaction.DragZoom(opt);
	}-*/;
}
