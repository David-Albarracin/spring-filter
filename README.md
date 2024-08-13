![](https://raw.githubusercontent.com/David-Albarracin/README_MATERIALS/main/spring.png)

# Spring Boot Hospital API

Este es el proyecto de examen spring boot se crea orientada al dominio enfocada en la Tabla **Customer** estos son los endPoints a consultar 

**Nota: Recuerde Tener la Base de Datos hospital**

## EndPoints

La URL principal es http://localhost:8080/

##### Tabla Customer

1. **GET** -  http://localhost:8080/customer

   * Lista todos los clientes

2. **POST** - http://localhost:8080/customer 

   * Crear un Cliente Requiere un Body de Tipo JSON con las Siguientes Características 

     ```json
     {
     	    "idcustomer": "123456789", 
     	    "namecustomer": "carlos",
     		"lastnamecustomer": "sanabria",
     		"emailcustomer": "testuser@campuslands.com",
     		"birthdate": "2000-04-30",
     		"lon": 23.0,
     		"latitud": 1.6,
     		"codecitycustomer": {
     			"codecity": "BU"
     		}
     }
     
     ```

3. **PUT** -  http://localhost:8080/customer/{idcustomer}

   * http://localhost:8080/customer/123456789

   * Actualizar cliente  Requiere un Body de Tipo JSON con las Siguientes Características 

     ```json
     {
     	    "namecustomer": "carlos david",
     		"lastnamecustomer": "sanabria perez",
     		"emailcustomer": "testuser@campuslands.com",
     		"birthdate": "2000-04-30",
     		"lon": 22,
     		"latitud": 1.7,
     		"codecitycustomer": {
     			"codecity": "FO"
     		}
     }
     ```

     

4. **DELETE** - http://localhost:8080/customer/{idcustomer}

   * http://localhost:8080/customer/123456789

   * Borrar Cliente

## SQL

1. **Comandos Para la Incersion de Datos**

   ```sql
   INSERT INTO country (codecountry, namecountry) VALUES('CO', 'COLOMBIA');
   
   INSERT INTO region (codecountry, codereg, namereg) VALUES('CO', 'SAN', 'SANTANDER');
   
   INSERT INTO city (codecity, codereg, namecity) VALUES('BU', 'SAN', 'BUCARAMANGA');
   INSERT INTO city (codecity, codereg, namecity) VALUES('FO', 'SAN', 'FLORIDABLANCA');
   
   INSERT INTO customer (latitud, lon, birthdate, codecity, emailcustomer, idcustomer, lastnamecustomer, namecustomer) VALUES(1.6, 23.0, '2000-04-30', 'BU', 'admin@campuslands.com', '1007456897', 'perez', 'pepe');
   ```



