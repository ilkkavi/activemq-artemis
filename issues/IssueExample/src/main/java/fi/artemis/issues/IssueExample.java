package fi.artemis.issues;

import java.io.Console;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.artemis.api.jms.ActiveMQJMSClient;
import org.apache.activemq.artemis.jms.client.ActiveMQConnectionFactory;
import org.apache.commons.lang3.StringUtils;

public class DLQIssueExample {

    public static void main(final String[] args) throws Exception {
        Queue queue = ActiveMQJMSClient.createQueue("ExampleQueue");
        ConnectionFactory cf = new ActiveMQConnectionFactory("(tcp://localhost:61616,tcp://localhost:61618)?reconnectAttempts=5");
    }
}
