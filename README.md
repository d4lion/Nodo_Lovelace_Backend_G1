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


# La estructura utilizada en el proyecto

## 1. Arquitectura de capas
Se desgloza un desarrollo de software por medio de administracion de responsabilidad a diferentes niveles o capas donde cada una posee una funcion especifica. Las capas usadas son:

### 1.1 Capa Modelos
En esta se han definido las entidades principales del proyecto. Aqui se preservan los datos y el ingreso a la base de datos. Algunos de los modelos usados en este:

- Paises

- User

- Suggestions

- Preferencias 


### 1.2 Capa Repository
Es la capa encargada de la interaccion, edicion, actualizacion, eliminacion o consulta de informacion. 

### 1.3 Capa Service
En esta se despliegua la lógica del negocio. En este caso particular se maneja una respuesta ante la busqueda, creacion o respuesta.

### 1.4 Capa Service
En esta capa se definen endpoints para correlacionar las solicitudes del front con el back.


Con este tipo de estructura se puede brindar un mejor mantenimiento, manejar un mejor oden y definir con mayor certeza que las diferentes partes sean independientes.

### Para el manejo de web5
El proyecto se basa en el flujo e ideologia de mantener seguridad, capacidad y encriptacion de la informacion manejada por la pagina, implementando el uso de credenciales verificables.


##Relacion entidad


![Relacion entidad](https://github.com/user-attachments/assets/f3c945db-42f9-41b9-abdb-1c8e3a2e10f1)

