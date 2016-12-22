package ol.gwt.event;

public interface Listener<T extends Event> {

	public void onEvent(T e);

}
