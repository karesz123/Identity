package org.identity.entity.generators;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.generator.BeforeExecutionGenerator;
import org.hibernate.generator.EventType;

import java.util.EnumSet;
import java.util.UUID;

import static org.hibernate.generator.EventTypeSets.INSERT_ONLY;

public class EmailUuidGenerator implements BeforeExecutionGenerator {

    private final String UUID_PREFIX = "email-";

    @Override
    public Object generate(SharedSessionContractImplementor session, Object owner, Object currentValue, EventType eventType) {
        return UUID_PREFIX + UUID.randomUUID();
    }

    @Override
    public EnumSet<EventType> getEventTypes() {
        return INSERT_ONLY;
    }
}
