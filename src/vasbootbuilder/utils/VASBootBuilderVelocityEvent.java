package vasbootbuilder.utils;


import org.apache.velocity.app.event.ReferenceInsertionEventHandler;

public class VASBootBuilderVelocityEvent implements ReferenceInsertionEventHandler {

	@Override
	public Object referenceInsert(String arg0, Object value) {
		return value;
	}

}
