// camel-k: language=java

import org.apache.camel.builder.RouteBuilder;

public class DebeziumConsumerRoute extends RouteBuilder {
  @Override
  public void configure() throws Exception {

      from("kafka:{{kafka.uri}}")
        .routeId("debezium-consumer")
        .log("${body}");

  }
}
