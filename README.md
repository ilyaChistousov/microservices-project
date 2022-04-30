# microservices-project
Учебный проект с исользованием микросервисной архитектуры
- converter-service принимает json следующего формата: 
> {
   "file":{
      "fileId":"320a4a79-80a5-4756-bd68-a572027131be",
      "version":"1.0",
      "sendingDateTime":"2020-10-17T09:30:47Z",
      "document":{
         "mainInfo":{
            "reason":"2",
            "participantInfo":{
               "participantName":"ООО Мадела",
               "participantIdentificationCode":"080740000861"
            },
            "originalDocInfo":{
               "docName":"Журнал инвентарной описи товаров",
               "docNumber":"88е",
               "docDate":"16.10.2020"
            }
         },
         "productList":{
            "iCode":[
               {
                  "count":"1",
                  "text":"0487000001002842fuSo1"
               },
               {
                  "count":"1",
                  "text":"04870000010028\"kkQZK6"
               },
               {
                  "count":"1",
                  "text":"048700000100288YKxa6d"
               },
               {
                  "count":"2",
                  "text":"048700000100280lIG5VE"
               },
               {
                  "count":"12",
                  "text":"(01)04870000010028JhWDeJQ"
               }
            ]
         }
      }
   }
}
- затем конвертирует его в xml и отправляет запрос с помощью feign client на receive-service
- receive-service принимает xml и отправляет его в виде String в топик кафки
- kafka-consumer-service читает с топика String, конвертирует его в объект и сохраняет в базу данных
## Используемые технологии:
- Spring Core
- Spring Data
- Spring Cloud(Eureka Server, Eureka Client, Gateway Api, Feign Client)
- Apache Kafka
- PostgreSQL
- Docker для использования базы данных и кафки в контейнерах
