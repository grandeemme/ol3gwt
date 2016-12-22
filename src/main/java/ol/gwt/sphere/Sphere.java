package ol.gwt.sphere;

import com.google.gwt.core.client.JavaScriptObject;

import ol.gwt.Coordinate;

public abstract class Sphere extends JavaScriptObject {

	protected Sphere() {
	}

	/**
	 * Returns the distance from c1 to c2 using the spherical law of cosines.
	 *
	 * @param {ol.Coordinate}
	 *            c1 Coordinate 1.
	 * @param {ol.Coordinate}
	 *            c2 Coordinate 2.
	 * @return {number} Spherical law of cosines distance.
	 */
	public final native Double cosineDistance(Coordinate c1, Coordinate c2) /*-{
		return this.cosineDistance(c1, c2);
	}-*/;

	/**
	 * Returns the distance of c3 from the great circle path defined by c1 and c2.
	 *
	 * @param {ol.Coordinate}
	 *            c1 Coordinate 1.
	 * @param {ol.Coordinate}
	 *            c2 Coordinate 2.
	 * @param {ol.Coordinate}
	 *            c3 Coordinate 3.
	 * @return {number} Cross-track distance.
	 */
	public final native Double crossTrackDistance(Coordinate c1, Coordinate c2, Coordinate c3)/*-{
		return this.crossTrackDistance(c1, c2, c3);
	}-*/;

	/**
	 * Returns the distance from c1 to c2 using Pythagoras's theorem on an equirectangular projection.
	 *
	 * @param {ol.Coordinate}
	 *            c1 Coordinate 1.
	 * @param {ol.Coordinate}
	 *            c2 Coordinate 2.
	 * @return {number} Equirectangular distance.
	 */
	public final native Double equirectangularDistance(Coordinate c1, Coordinate c2) /*-{
		return this.equirectangularDistance(c1, c2);
	}-*/;

	/**
	 * Returns the final bearing from c1 to c2.
	 *
	 * @param {ol.Coordinate}
	 *            c1 Coordinate 1.
	 * @param {ol.Coordinate}
	 *            c2 Coordinate 2.
	 * @return {number} Initial bearing.
	 */
	public final native Double finalBearing(Coordinate c1, Coordinate c2)/*-{
		return this.finalBearing(c1, c2);
	}-*/;

	/**
	 * Returns the distance from c1 to c2 using the haversine formula.
	 *
	 * @param {ol.Coordinate}
	 *            c1 Coordinate 1.
	 * @param {ol.Coordinate}
	 *            c2 Coordinate 2.
	 * @return {number} Haversine distance.
	 */
	public final native double haversineDistance(Coordinate c1, Coordinate c2) /*-{
		return this.haversineDistance(c1, c2);
	}-*/;

	/**
	 * Returns the point at `fraction` along the segment of the great circle passing through c1 and c2.
	 *
	 * @param {ol.Coordinate}
	 *            c1 Coordinate 1.
	 * @param {ol.Coordinate}
	 *            c2 Coordinate 2.
	 * @param {number}
	 *            fraction Fraction.
	 * @return {ol.Coordinate} Coordinate between c1 and c2.
	 */
	public final native Coordinate interpolate(Coordinate c1, Coordinate c2, Double fraction) /*-{
		return this.interpolate(c1, c2, fraction);
	}-*/;

	/**
	 * Returns the initial bearing from c1 to c2.
	 *
	 * @param {ol.Coordinate}
	 *            c1 Coordinate 1.
	 * @param {ol.Coordinate}
	 *            c2 Coordinate 2.
	 * @return {number} Initial bearing.
	 */
	public final native Double initialBearing(Coordinate c1, Coordinate c2) /*-{
		return this.initialBearing(c1, c2);
	}-*/;

	/**
	 * Returns the maximum latitude of the great circle defined by bearing and latitude.
	 *
	 * @param {number}
	 *            bearing Bearing.
	 * @param {number}
	 *            latitude Latitude.
	 * @return {number} Maximum latitude.
	 */
	public final native Double maximumLatitude(Double bearing, Double latitude) /*-{
		return this.maximumLatitude(bearing, latitude);
	}-*/;

	/**
	 * Returns the midpoint between c1 and c2.
	 *
	 * @param {ol.Coordinate}
	 *            c1 Coordinate 1.
	 * @param {ol.Coordinate}
	 *            c2 Coordinate 2.
	 * @return {ol.Coordinate} Midpoint.
	 */
	public final native Coordinate midpoint(Coordinate c1, Coordinate c2) /*-{
		return this.midpoint(c1, c2);
	}-*/;

	/**
	 * Returns the coordinate at the given distance and bearing from `c1`.
	 *
	 * @param {ol.Coordinate}
	 *            c1 The origin point (`[lon, lat]` in degrees).
	 * @param {number}
	 *            distance The great-circle distance between the origin point and the target point.
	 * @param {number}
	 *            bearing The bearing (in radians).
	 * @return {ol.Coordinate} The target point.
	 */
	public final native Coordinate offset(Coordinate c1, Double distance, Double bearing) /*-{
		return this.offset(c1, distance, bearing);
	}-*/;

	public final native Double getRadius() /*-{
		return this.radius;
	}-*/;

	public final native double geodesicArea(Coordinate[] coords) /*-{
		var area = this.geodesicArea(coords)
		return area ? area : 0;
	}-*/;

}
