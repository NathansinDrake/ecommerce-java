# ecommerce-java
para inicializar el proyecto debes agregar en el archivo la siguiente configuracion 
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
logging.level.org.hibernate.SQL=DEBUG

spring.jpa.hibernate.naming.physical-strategy=org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl
spring.main.allow-bean-definition-overriding=true
spring.main.allow-circular-references=true

en caso de tener una contraseña diferente en su mysql y un usuario distinto debe actualizarlos respectivamente.

Tambien para que la aplicacion arranque debe dejar prebiamente una base de datos creada

con este comendo dentro de su workbench funcionaria sin problemas:
CREATE SCHEMA `ecommerces` ;

seguidamente solo debe inicar la aplicacion, supondria que iniciara sin problema.
