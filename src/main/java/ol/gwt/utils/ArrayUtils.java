package ol.gwt.utils;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class ArrayUtils {

	public static <T extends JavaScriptObject> JsArray<T> toJsArray(T... array) {
		JsArray<T> j = JsArray.createArray().cast();
		for (T el : array) {
			j.push(el);
		}
		return j;
	}
}
