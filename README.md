# md5-crack-spring-cloud

亿级MD5逆向库系统   

1.将字母，数字，特殊字符组成的1到8位字符串；   
2.将字符串进行1到5次MD5加密；   
3.通过生产者微服务一次发送1000条数据到RabbitMQ（数据压缩传输）；   
4.Feigin微服务作为RabbitMQ消费端接收消息，0前缀的MD5串发送到0所在的微服务集群，1前缀的MD5串发送到1所在的微服务集群，以此类推；   
5.各种的微服务将对应的MD5数据存储；   
6.主库将对应数据自动复制到从库中；   