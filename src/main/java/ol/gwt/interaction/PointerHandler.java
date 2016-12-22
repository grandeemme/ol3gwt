package ol.gwt.interaction;

public interface PointerHandler {

	// Function handling "down" events. If the function returns true then a drag sequence is started.
	public boolean handleDownEvent();

	// Function handling "drag" events. This function is called on "move" events during a drag sequence.
	public void handleDragEvent();

	// Method called by the map to notify the interaction that a browser event was dispatched to the map. The function
	// may return false to prevent the propagation of the event to other interactions in the map's interactions chain.
	public boolean handleEvent();

	// Function handling "move" events. This function is called on "move" events, also during a drag sequence (so during
	// a drag sequence both the handleDragEvent function and this function are called).
	public void handleMoveEvent();

	// Function handling "up" events. If the function returns false then the current drag sequence is stopped.
	public boolean handleUpEvent();

}
