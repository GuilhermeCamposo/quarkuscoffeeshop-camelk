// camel-k: language=java

import org.apache.camel.builder.RouteBuilder;

public class DebeziumConsumerRoute extends RouteBuilder {
  @Override
  public void configure() throws Exception {

      from("kafka:{{kafka.consumer.uri}}")
        .routeId("debezium-consumer")
        .log("${body}")
        .setHeader("kafka.KEY", jsonpath("$.payload.after.order_id") )
        .setBody(jsonpath("$.payload.after"))
        .to("kafka:{{kafka.producer.uri}}");

  }
}
