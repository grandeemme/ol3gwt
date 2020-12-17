package ol.gwt;

import com.google.gwt.core.client.JavaScriptObject;

import ol.gwt.event.Event;
import ol.gwt.event.Listener;

public abstract class Observable extends JavaScriptObject {

	protected Observable() {
	}

	public final native void unByKey(String key)/*-{
		this.unByKey(key);
	}-*/;
	
	/**
	* Increases the revision counter and dispatches a 'change' event.
	* @api
	*/
	public final native void changed( )/*-{
		this.changed( );
	}-*/;

	public final <T extends Event> void on(String type, Listener<T> listener) {
		on(type, listener, null);
	}

	public final  <T extends Event> void on(String[] types, Listener<T> listener) {
		on(types, listener, null);
	}

	public final <T extends Event> void once(String type, Listener<T> listener) {
		once(type, listener, null);
	}

	public final <T extends Event> void once(String[] types, Listener<T> listener) {
		once(types, listener, null);
	}

	public final native <T extends Event> void on(String type, Listener<T> listener, Object opt_this)/*-{
		this
				.on(
						type,
						function list(evt) {
							$entry(listener.@ol.gwt.event.Listener::onEvent(Lol/gwt/event/Event;)(evt));
						}, opt_this);

	}-*/;

	public final native <T extends Event> void on(String[] types, Listener<T> listener, Object opt_this)/*-{
		this
				.on(
						types,
						function list(evt) {
							$entry(listener.@ol.gwt.event.Listener::onEvent(Lol/gwt/event/Event;)(evt));
						}, opt_this);

	}-*/;

	public final native <T extends Event> void once(String type, Listener<T> listener, Object opt_this)/*-{
		this
				.once(
						type,
						function list(evt) {
							$entry(listener.@ol.gwt.event.Listener::onEvent(Lol/gwt/event/Event;)(evt));
						}, opt_this);
	}-*/;

	public final native <T extends Event> void once(String[] types, Listener<T> listener, Object opt_this)/*-{
		this
				.once(
						types,
						function list(evt) {
							$entry(listener.@ol.gwt.event.Listener::onEvent(Lol/gwt/event/Event;)(evt));
						}, opt_this);
	}-*/;

	public final native <T extends Event> void un(String type, Listener<T> listener, Object opt_this)/*-{
		this
				.un(
						type,
						function list(evt) {
							$entry(listener.@ol.gwt.event.Listener::onEvent(Lol/gwt/event/Event;)(evt));
						}, opt_this);
	}-*/;
}
