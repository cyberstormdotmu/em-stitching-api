package uk.gov.hmcts.reform.em.bundling.appinsights;

import java.util.Map;

public interface EventRepository {

    void trackEvent(String name, Map<String, String> properties);
}
