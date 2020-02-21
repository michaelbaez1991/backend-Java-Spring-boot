# Backend Java Spring + Boot
 Desarrollo de CRUD en java + spring boot 

# Instrucciones 
- Clonar el proyecto: git clone https://github.com/michaelbaez1991/backend.git
- Abrir el proyecto en netbeans o eclipse
- Ejecutar el proyecto para levantar el servidor
- Se iniciara la aplicacion en el puerto :8080, bajo el path '/backend' => http://localhost:8080/backend
- Podemos ejecutar una peticion tipo get de forma manual para validar que la aplicacion esta funcionando correcta => http://localhost:8080/backend/globalTech
- Una vez iniciada la aplicacion backend de Java, necesitaremos levantar el front-end previo de angular (Angular9-Spotify) en el puerto por defecto de angular :4200.

## Nota
De no querer usar el Backend en conjunto del frontend. Puedes realizar la siguientes peticiones para validar todo el funcionamiento

- Ejecutar la aplicacion desde el archivo .jar

###### Consulta de los registros en la tabla (GET)
curl --location --request GET 'http://localhost:8080/backend/globalTech'

###### Guardar nuevos registros (POST)
curl --location --request POST 'http://localhost:8080/backend/globalTech' \
--header 'Content-Type: application/json' \
--data-raw '{"nombre":"Michael","apellido":"Mendoza","email":"michael.baez.mendoza2016@gmail.com","profesion":"Ingeniero De sistemas"}'

###### Consulta un registro por ID (GET)
curl --location --request GET 'http://localhost:8080/backend/globalTech/21'
