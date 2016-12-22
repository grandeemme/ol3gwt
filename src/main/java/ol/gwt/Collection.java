package ol.gwt;

import java.util.Iterator;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * Wrapper for the ol3 collection
 */
public class Collection<T extends JavaScriptObject> extends JavaScriptObject implements Iterable<T> {

	protected Collection() {
	}

	public static native <C extends JavaScriptObject> Collection<C> create() /*-{
		return new $wnd.ol.Collection();
	}-*/;

	public static native <C extends JavaScriptObject> Collection<C> create(JsArray<C> array) /*-{
		var coll = new $wnd.ol.Collection();
		return coll.extend(array);
	}-*/;

	public native final void clear() /*-{
		this.clear();
	}-*/;

	public native final void setAt(int index, T element) /*-{
		this.setAt(index, element);
	}-*/;

	public native final void removeAt(int index) /*-{
		this.removeAt(index);
	}-*/;

	public native final void remove(T element) /*-{
		this.remove(element);
	}-*/;

	public native final void push(T element) /*-{
		this.push(element);
	}-*/;

	public native final T pop() /*-{
		return this.pop();
	}-*/;

	public native final T item(int index) /*-{
		return this.item(index);
	}-*/;

	public native final void insertAt(int index, T elem) /*-{
		this.insertAt(index, elem);
	}-*/;

	public native final int getLength() /*-{
		return this.getLength();
	}-*/;

	@Override
	public final Iterator<T> iterator() {
		return new CollectionIterator();
	}

	protected class CollectionIterator implements Iterator<T> {

		int actual = 0;

		@Override
		public boolean hasNext() {
			return getLength() - actual > 0;
		}

		@Override
		public T next() {
			return item(actual++);
		}

		@Override
		public void remove() {
			removeAt(actual);
		}

	}

}
