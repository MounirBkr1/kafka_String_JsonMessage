# kafka_String_JsonMessage
kafka with Producer and costumer Sending message 

# Steps to start kafka + zookeeper and read messages from topic 
0- go to folder "kafka" and run cmd: 
C:\Tools\kafka>
 
1- zookeeper:

.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

2- kafka server:

.\bin\windows\kafka-server-start.bat .\config\server.properties

3- read messages for begining
.\bin\windows\kafka-console-consumer.bat --topic topic-example --from-beginning --bootstrap-server localhost:9092

# some usefull commands to run kafka, create producer and costomer:
0- go to folder "kafka" and run cmd: 
C:\Tools\kafka>
 
1- zookeeper:

.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

2- kafka server:

.\bin\windows\kafka-server-start.bat .\config\server.properties

3- create topic
.\bin\windows\kafka-topics.bat --create --topic topic-example --bootstrap-server localhost:9092

4- create producer:
.\bin\windows\kafka-console-producer.bat --topic topic-example --bootstrap-server localhost:9092
    
=> create same messages > ctrl+c (to stop)

5- create consumer:
 .\bin\windows\kafka-console-consumer.bat --topic topic-example --bootstrap-server localhost:9092

6- read messages for begining
.\bin\windows\kafka-console-consumer.bat --topic topic-example --from-beginning --bootstrap-server localhost:9092
