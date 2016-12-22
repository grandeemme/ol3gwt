package ol.gwt.layer;

import ol.gwt.source.Source;

/**
 * Base class for the layers
 */
public abstract class Layer extends LayerBase {

	protected Layer() {
	}

	/**
	 * Gets the source for the layer data
	 *
	 * @return
	 */
	public final  native  Source getSource()/*-{
		return this.getSource();
	}-*/;
}
