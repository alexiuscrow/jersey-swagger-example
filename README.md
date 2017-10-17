# Jersey 2 &amp; Swagger example project :punch:
 This repository contains the project that demonstrates how to use [Jersey 2][jersey2] &amp; [Swagger][swagger] 
 frameworks together.<br>
 More about Jersey &amp; Swagger configuration you can find [here][jersey-doc] and [here][swagger-doc] respectively.
 
 ## Run it
 Just run `gradle war` to generate war file. It will be in `./build/lib` directory. Then deploy war file to your 
 servlet container (e.g. [Tomcat][tomcat]).<br>
 To get resource u can use next curl command: <br>
 `curl -X GET "http://<host>:<port>/jersey-swagger-exmpl/info" -w "\nResponse code: %{http_code}"`.<br>
 To get swagger api scheme: <br>
 `curl -X GET "http://<host>:<port>/jersey-swagger-exmpl/swagger.json" -w "\nResponse code: %{http_code}"`.
 
 
 [jersey2]: https://jersey.java.net/
 [swagger]: http://swagger.io/
 [jersey-doc]: https://jersey.java.net/documentation/2.25.1/index.html
 [swagger-doc]: https://github.com/swagger-api/swagger-core/wiki/Swagger-Core-Jersey-2.X-Project-Setup-1.5
 [tomcat]: http://tomcat.apache.org/
