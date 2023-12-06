package org.fiware.tmforum.common.notification.checkers;

import org.fiware.ngsi.model.EntityVO;
import org.fiware.tmforum.common.notification.EventConstants;

public class CreateEventChecker implements EventChecker {
    @Override
    public boolean wasFired(EntityVO entityVO) {
        return false;
    }

    @Override
    public String getEventTypeSuffix() {
        return EventConstants.CHANGE_EVENT_SUFFIX;
    }
}
