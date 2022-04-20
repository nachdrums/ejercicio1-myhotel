# Prueba myHotel



## Descripción del proyecto

El proyecto tiene como fin construir una aplicación en Spring Boot para resolver el siguiente problema:

- Una empresa de arriendo de vehículos necesita una aplicación para administrar los distintos
tipos de vehículos que posee. Para ello, se solicita crear la capa de servicios (API) que
permita ingresar nuevos vehículos, editarlos, eliminarlos, listar y/o buscar alguno en
específico (CRUD). Además se requiere que el sistema sea capaz llevar un registro de las
mantenciones realizadas a cada vehículo.

## Configuración de ambiente

- Clone el repositorio en su carpeta de destino.
- Ingrese a su IDE e importe el proyecto a su workspace, para este caso se utilizó la Spring Tool Suite 4 de eclipse.
- Luego en la pestaña Boot Dashboard haga clic derecho en el proyecto y seleccione la opción "(Re)start"
![image](https://user-images.githubusercontent.com/19580361/164142856-6d56561f-3e26-4a96-bc1b-efe1f4b1ec85.png)


## Base de datos
- La base de datos esta embebida en el proyecto, esto quiere decir que al levantar la aplicación, se iniciará la base de datos y se mantendrá viva mientras la aplicación esté levantada.
- Una vez levantada la aplicación, usted podrá ingresar a la consola de la base de datos en el siguiente link:
 ```
http://localhost:8080/api-prueba/h2-console/
```
- Le aparecerá una ventana el cual debe ingresar los datos de sesión que están en el archivo application.properties del proyecto:
 ![image](https://user-images.githubusercontent.com/19580361/164121998-5f5aca9f-2885-47ab-a954-b1416108c1a2.png)
- JDBC URL es la url definida en el atributo spring.datasource.url, para este caso es: jdbc:h2:mem:testdb.
- User Name es el usuario definido en el atributo spring.datasource.username.
- Password es la contraseña definida en el campo spring.datasource.password.


## Endpoints

Para los endpoints de la aplicación se ha usado la herramienta llamada Swagger, para ingresar a la herramienta ingrese al siguiente link:
```
http://localhost:8080/api-prueba/swagger-ui.html#/
```
- La herramienta muestra por cada controlador los endpoints junto con su descripción y parámetros.


