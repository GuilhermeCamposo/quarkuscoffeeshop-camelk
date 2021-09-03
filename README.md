# quarkuscoffeshop-camelk



## Deploy the integration

    oc apply -f k8s/cm.yml
    kamel run --config configmap:debezium-route-cm DebeziumConsumerRoute.java
