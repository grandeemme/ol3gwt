package ol.gwt.source;

/**
 * Abstract base class; normally only used for creating subclasses and not instantiated in apps. Base class for layer sources.
 */
public abstract class Source extends   ol.gwt.Object{

    public static final String STATE_LOADING="loading";
    public static final String STATE_READY="ready";
    public static final String STATE_ERROR="error";

    protected Source(){

    }

    /** Returns the state of the source (loading, ready, error)
     * @return the state of the source
     */
    public final native String getState()/*-{
        return this.getState();
    }-*/;
}
