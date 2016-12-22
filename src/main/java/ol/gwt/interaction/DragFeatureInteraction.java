package ol.gwt.interaction;

import com.google.gwt.dom.client.Element;

import ol.gwt.Coordinate;
import ol.gwt.FeatureCallback;
import ol.gwt.Map;
import ol.gwt.event.MapBrowserEvent;
import ol.gwt.feature.Feature;
import ol.gwt.geom.SimpleGeometry;
import ol.gwt.layer.Layer;

/**
 * Fires:
 * 
 * dragend: when drag a feature is end
 * 
 * @author Miranda Mauro
 *
 */
public abstract class DragFeatureInteraction {

	protected Coordinate coordinate_;

	protected String cursor_ = "pointer";

	protected Feature feature_ = null;

	protected String previousCursor_ = null;

	public DragFeatureInteraction(Map map) {
		PointerInteraction drag = PointerInteraction.createPointer();
		init(drag);
		map.addInteraction(drag);
		drag.setActive(true);
	}

	protected native void init(PointerInteraction drag)/*-{
		var self = this;

		$wnd.ol.interaction.Pointer
				.call(
						drag,

						{
							handleDownEvent : function(evt) {
								return self.@ol.gwt.interaction.DragFeatureInteraction::handleDownEvent(Lol/gwt/event/MapBrowserEvent;)(evt);
							},
							handleDragEvent : function(evt) {
								return self.@ol.gwt.interaction.DragFeatureInteraction::handleDragEvent(Lol/gwt/event/MapBrowserEvent;)(evt);

							},
							handleMoveEvent : function(evt) {
								return self.@ol.gwt.interaction.DragFeatureInteraction::handleMoveEvent(Lol/gwt/event/MapBrowserEvent;)(evt);

							},
							handleUpEvent : function(evt) {
								return self.@ol.gwt.interaction.DragFeatureInteraction::handleUpEvent(Lol/gwt/event/MapBrowserEvent;)(evt);
							}
						});
	}-*/;

	public abstract void dispatchEvent(DragEvent dragEvent);

	public boolean handleDownEvent(MapBrowserEvent evt) {
		Map map = evt.getMap();

		Feature feature = map.forEachFeatureAtPixel(evt.getPixel(), new FeatureCallback() {

			@Override
			public Feature onFeature(Feature feature, Layer layer) {
				return feature;
			}
		});

		if (feature != null) {
			this.coordinate_ = evt.getCoordinate();
			this.feature_ = feature;
		}

		return feature != null;
	}

	public void handleDragEvent(MapBrowserEvent evt) {
		double deltaX = evt.getCoordinate().getX() - this.coordinate_.getX();
		double deltaY = evt.getCoordinate().getY() - this.coordinate_.getY();

		SimpleGeometry geometry = (SimpleGeometry) this.feature_.getGeometry();
		geometry.translate(deltaX, deltaY);

		this.coordinate_ = evt.getCoordinate();
	}

	public void handleMoveEvent(MapBrowserEvent evt) {
		if (this.cursor_ != null) {
			Map map = evt.getMap();

			Feature feature = map.forEachFeatureAtPixel(evt.getPixel(), new FeatureCallback() {

				@Override
				public Feature onFeature(Feature feature, Layer layer) {
					return feature;
				}
			});
			Element element = evt.getMap().getTargetElement();
			if (feature != null) {
				if (element.getStyle().getCursor() != this.cursor_) {
					this.previousCursor_ = element.getStyle().getCursor();
					element.getStyle().setProperty("cursor", this.cursor_);
				}
			} else if (this.previousCursor_ != null) {
				element.getStyle().setProperty("cursor", this.previousCursor_);
				this.previousCursor_ = null;
			}
		}
	}

	public boolean handleUpEvent(MapBrowserEvent evt) {
		this.dispatchEvent(new DragEvent(this.feature_));
		this.coordinate_ = null;
		this.feature_ = null;
		return false;
	}

}
