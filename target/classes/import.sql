INSERT INTO country (codecountry, namecountry) VALUES('CO', 'COLOMBIA');

INSERT INTO region (codecountry, codereg, namereg) VALUES('CO', 'SAN', 'SANTANDER');

INSERT INTO city (codecity, codereg, namecity) VALUES('BU', 'SAN', 'BUCARAMANGA');
INSERT INTO city (codecity, codereg, namecity) VALUES('FO', 'SAN', 'FLORIDABLANCA');

INSERT INTO customer (latitud, lon, birthdate, codecity, emailcustomer, idcustomer, lastnamecustomer, namecustomer) VALUES(1.6, 23.0, '2000-04-30', 'BU', 'admin@campuslands.com', '1007456897', 'perez', 'pepe');