package ol.gwt.interaction;

/**
 * Pointer interaction. Base class for the ModifyInteraction
 */
public class PointerInteraction extends Interaction {

	protected PointerInteraction() {
	}

	public static final native PointerInteraction createPointer()/*-{
		return new $wnd.ol.interaction.Pointer();
	}-*/;

	public static final native PointerInteraction createPointer(PointerHandler handler)/*-{
		return new $wnd.ol.interaction.Pointer(
				{
					handleDownEvent : function() {
						return handler.@ol.gwt.interaction.PointerHandler::handleDownEvent()();
					},
					handleDragEvent : function() {
						handler.@ol.gwt.interaction.PointerHandler::handleDragEvent()();
					},
					handleEvent : function() {
						return handler.@ol.gwt.interaction.PointerHandler::handleEvent()();
					},
					handleMoveEvent : function() {
						handler.@ol.gwt.interaction.PointerHandler::handleMoveEvent()();
					},
					handleUpEvent : function() {
						return handler.@ol.gwt.interaction.PointerHandler::handleUpEvent()();
					}
				});
	}-*/;

}
