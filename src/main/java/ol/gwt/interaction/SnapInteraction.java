package ol.gwt.interaction;

public class SnapInteraction extends Interaction{
	
    protected SnapInteraction() {
    }

    public static final native SnapInteraction create()/*-{
        return new $wnd.ol.interaction.Snap({});
    }-*/;

    public static final native SnapInteraction create(SnapInteractionOptions options)/*-{
        return new $wnd.ol.interaction.Snap(options);
    }-*/;

}
