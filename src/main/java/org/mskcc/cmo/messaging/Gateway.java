package org.mskcc.cmo.messaging;

public interface Gateway {
    void publish(String topic, Object message) throws Exception;
    void subscribe(String topic, Class messageClass, MessageConsumer consumer) throws Exception;
    void shutdown() throws Exception;
}