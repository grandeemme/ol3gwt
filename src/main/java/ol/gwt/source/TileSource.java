package ol.gwt.source;

import ol.gwt.tilegrid.TileGrid;

/**
 * Abstract base class; normally only used for creating subclasses and not instantiated in apps. Base class for sources
 * providing images divided into a tile grid.
 */
public abstract class TileSource extends Source {

	protected TileSource() {
	}

	public final native TileGrid getTileGrid()/*-{
		return this.getTileGrid();
	}-*/;
	
	public final native void clear()/*-{
		this.clear();
	}-*/;
}
