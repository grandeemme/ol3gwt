package test.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;

import ol.gwt.Coordinate;
import ol.gwt.MapOptions;
import ol.gwt.MapWidget;
import ol.gwt.View;
import ol.gwt.ViewOptions;
import ol.gwt.event.Listener;
import ol.gwt.event.MapEvent;
import ol.gwt.layer.TileLayer;
import ol.gwt.source.OSMSource;
import ol.gwt.source.Params;
import ol.gwt.source.TileWMSSource;
import ol.gwt.source.TileWMSSourceOptions;

public class Example implements EntryPoint {

	protected TextBox x;
	protected TextBox y;

	protected TextBox resolution;
	protected TextBox zoom;
	protected TextBox scale;
	protected TextBox widthScale;

	protected double dpi = 72;

	protected MapWidget widget;

	@Override
	public void onModuleLoad() {
		addMap();
		addText();
		addControls();

	}

	/*
	 * INCHES_PER_UNIT = { 'inches': 1.0, 'ft': 12.0, 'mi': 63360.0, 'm': 39.37, 'km': 39370, 'dd': 4374754, 'yd': 36 };
	 */

	private void addControls() {

		widget.getMap().on("pointermove", new Listener<MapEvent>() {

			@Override
			public void onEvent(MapEvent e) {
				Coordinate newCoord = e.getCoordinate().transform("EPSG:3857", "EPSG:4326");
				x.setValue(newCoord.getX() + "");
				y.setValue(newCoord.getY() + "");

				widthScale.setValue(widget.getMap().getView().getResolution() + "");

				double scaleValue = widget.getMap().getView().getResolution() * 39.37 * 72;
				scale.setValue(scaleValue + "");
			}
		});

		widget.getMap().on("moveend", new Listener<MapEvent>() {

			@Override
			public void onEvent(MapEvent e) {
				resolution.setValue(widget.getMap().getView().getResolution().toString());

				zoom.setValue(widget.getMap().getView().getZoom().toString());

			}
		});
	}

	private void addText() {
		x = new TextBox();
		y = new TextBox();
		resolution = new TextBox();
		zoom = new TextBox();
		scale = new TextBox();
		widthScale = new TextBox();

		RootPanel.get().add(new Label("X"));
		RootPanel.get().add(x);

		RootPanel.get().add(new Label("Y"));
		RootPanel.get().add(y);

		RootPanel.get().add(new Label("Resolution"));
		RootPanel.get().add(resolution);

		RootPanel.get().add(new Label("zoom"));
		RootPanel.get().add(zoom);

		RootPanel.get().add(new Label("scale 1:"));
		RootPanel.get().add(scale);

		RootPanel.get().add(new Label("original scale 1:"));
		RootPanel.get().add(widthScale);
	}

	public void addMap() {
		widget = new MapWidget();

		widget.setSize("900px", "600px");

		RootPanel.get().add(widget);

		MapOptions options = MapOptions.create();

		ViewOptions viewOptions = ViewOptions.create();
		// viewOptions.setProjection("EPSG:4326");

		View view = View.create(viewOptions);
		view.setCenter(Coordinate.create(11, 45).transform("EPSG:4326", "EPSG:3857"));
		view.setZoom(9);

		options.setView(view);

		options.setRenderer("webgl");

		widget.initMap(options);

		OSMSource src = OSMSource.create();
		TileLayer layer = TileLayer.create(src);
		widget.getMap().addLayer(layer);

		// widget.getMap().addLayer(createWMSLayer("http://ows.terrestris.de/osm/service", "osm_auto:all", "image/png",
		// true));
		widget.getMap().addLayer(createWMSLayer("http://10.118.32.131/geoserver/wms", "Regione_Emilia_Romagna:ORTOFOTO_EMILIA_ROMAGNA", "image/png8", true));

	}

	public TileLayer createWMSLayer(String url, String layers, String format, boolean trasparent) {

		Params params = Params.create();

		params.set("LAYERS", layers);
		params.set("FORMAT", format);
		params.set("TRANSPARENT", trasparent ? "TRUE" : "FALSE");

		TileWMSSourceOptions wmsoptions = TileWMSSourceOptions.create();

		wmsoptions.setParams(params);
		wmsoptions.setUrl(url);

		TileWMSSource wms = TileWMSSource.create(wmsoptions);

		TileLayer wmslayer = TileLayer.create(wms);

		return wmslayer;
	}

}
