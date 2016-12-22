package ol.gwt.layer;

import ol.gwt.Object;

/**
 * Base class for the layers
 */
public abstract class LayerBase extends Object {

	protected LayerBase() {

	}

	public native final double getBrightness()/*-{
		var res = this.getBrightness();
		return res == null ? 0.0 : res;
	}-*/;

	public native final double getContrast()/*-{
		var res = this.getContrast();
		return res == null ? 0.0 : res;
	}-*/;

	public native final double getHue()/*-{
		var res = this.getHue();
		return res == null ? 0.0 : res;
	}-*/;

	public native final double getMaxResolution()/*-{
		var res = this.getMaxResolution();
		return res == null ? 0.0 : res;
	}-*/;

	public native final double getMinResolution()/*-{
		var res = this.getMinResolution();
		return res == null ? 0.0 : res;
	}-*/;

	public native final double getOpacity()/*-{
		var res = this.getOpacity();
		return res == null ? 0.0 : res;
	}-*/;

	public native final double getSaturation()/*-{
		var res = this.getSaturation();
		return res == null ? 0.0 : res;
	}-*/;

	public native final boolean getVisible()/*-{
		var res = this.getVisible();
		return res == null ? false : res;
	}-*/;

	public native final void setBrightness(double brightness)/*-{
		this.setBrightness(brightness);
	}-*/;

	public native final void setContrast(double contrast)/*-{
		this.setContrast(contrast);
	}-*/;

	public native final void setHue(double hue)/*-{
		this.setHue(hue);
	}-*/;

	public native final void setMaxResolution(double maxResolution)/*-{
		this.setMaxResolution(maxResolution);
	}-*/;

	public native final void setMinResolution(double minResolution)/*-{
		this.setMinResolution(minResolution);
	}-*/;

	public native final void setOpacity(double opacity)/*-{
		this.setOpacity(opacity);
	}-*/;

	public native final void setSaturation(double saturation)/*-{
		this.setSaturation(saturation);
	}-*/;

	public native final void setVisible(boolean visible)/*-{
		this.setVisible(visible);
	}-*/;

}
