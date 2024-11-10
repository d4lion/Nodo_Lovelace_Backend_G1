# 🚧 Database config
Para configurar la persistencia de la aplicacion y la base de datos que va a usar debe crearse
el archivo `application.properties` en la ruta `src/main/resources` puede usar como guia el archivo 
`application.properties_structure` en donde encontrará el siguiente codigo:

```ts
// Este es el codigo que debes modificar

spring.application.name=lovelace
spring.config.import=classpath:.env

spring.datasource.url=jdbc:postgresql://localhost:5432/lovelace
spring.datasource.username=DB_USER_NAME
spring.datasource.password=DB_PASSWORD
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=create-drop
```

## 👷 ¿Que debo modificar?
Para poder lograr que la base de datos corra debes cambiar el `DB_USER_NAME` y `DB_PASSWORD` respectivamente
por las credenciales de tu base de datos. (Por defecto el usuario suele ser postgres)
