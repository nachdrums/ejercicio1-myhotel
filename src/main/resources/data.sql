
/*Marca*/
INSERT INTO marca (id,nombre,descripcion,activo) VALUES (1,'Mazda','Marca 1',true);
INSERT INTO marca (id,nombre,descripcion,activo) VALUES (2,'Chevrolet','Marca 2',true);
INSERT INTO marca (id,nombre,descripcion,activo) VALUES (3,'Hyndai','Marca 3',true);
INSERT INTO marca (id,nombre,descripcion,activo) VALUES (4,'KIA','Marca 4',true);
INSERT INTO marca (id,nombre,descripcion,activo) VALUES (5,'Renault','Marca 5',true);

/*Modelo*/
INSERT INTO modelo (id,id_marca,nombre,descripcion,activo) VALUES (1,2,'Spark','Modelo 1',true);
INSERT INTO modelo (id,id_marca,nombre,descripcion,activo) VALUES (2,1,'CX3','Modelo 2',true);
INSERT INTO modelo (id,id_marca,nombre,descripcion,activo) VALUES (3,3,'Elantra','Modelo 3',true);
INSERT INTO modelo (id,id_marca,nombre,descripcion,activo) VALUES (4,4,'Frontier','Modelo 4',true);
INSERT INTO modelo (id,id_marca,nombre,descripcion,activo) VALUES (5,5,'Megane','Modelo 5',true);

/*TipoVehiculo*/
INSERT INTO tipo_vehiculo (id,nombre,descripcion,activo) VALUES (1,'Automovil','Tipo Vehiculo 1',true);
INSERT INTO tipo_vehiculo (id,nombre,descripcion,activo) VALUES (2,'Camión','Tipo Vehiculo 2',true);
INSERT INTO tipo_vehiculo (id,nombre,descripcion,activo) VALUES (3,'Moto','Tipo Vehiculo 3',true);

/*TipoCamion*/
INSERT INTO tipo_camion (id,nombre,descripcion,activo) VALUES (1,'Tolva','Tipo Camión 1',true);
INSERT INTO tipo_camion (id,nombre,descripcion,activo) VALUES (2,'3/4','Tipo Camión 2',true);
INSERT INTO tipo_camion (id,nombre,descripcion,activo) VALUES (3,'Rabón','Tipo Camión 3',true);
INSERT INTO tipo_camion (id,nombre,descripcion,activo) VALUES (4,'Tortón','Tipo Camión 4',true);

/*TipoAutomóvil*/
INSERT INTO tipo_automovil (id,nombre,descripcion,activo) VALUES (1,'City Car','Tipo Automóvil 1',true);
INSERT INTO tipo_automovil (id,nombre,descripcion,activo) VALUES (2,'Sedan','Tipo Automóvil 2',true);
INSERT INTO tipo_automovil (id,nombre,descripcion,activo) VALUES (3,'Suv','Tipo Automóvil 3',true);
INSERT INTO tipo_automovil (id,nombre,descripcion,activo) VALUES (4,'Coupé','Tipo Automóvil 4',true);

/*Vehiculo*/
INSERT INTO vehiculo (id,id_modelo,id_tipo_vehiculo,anio,cilindrada,kilometraje,patente,activo) VALUES (1,1,1,'2020','1400 cc','30000','KLAS90',true);
INSERT INTO automovil (id,cantidad_pasajeros,capacidad_maletero,nro_puertas,id_tipo_automovil) VALUES (1,'4','3000','5',1);
INSERT INTO vehiculo (id,id_modelo,id_tipo_vehiculo,anio,cilindrada,kilometraje,patente,activo) VALUES (2,2,1,'2017','2000 cc','60000','YUUH75',true);
INSERT INTO automovil (id,cantidad_pasajeros,capacidad_maletero,nro_puertas,id_tipo_automovil) VALUES (2,'4','2000','5',2);
INSERT INTO vehiculo (id,id_modelo,id_tipo_vehiculo,anio,cilindrada,kilometraje,patente,activo) VALUES (3,3,1,'2019','1800 cc','40000','GBWE12',true);
INSERT INTO automovil (id,cantidad_pasajeros,capacidad_maletero,nro_puertas,id_tipo_automovil) VALUES (3,'4','2500','5',2);

INSERT INTO vehiculo (id,id_modelo,id_tipo_vehiculo,anio,cilindrada,kilometraje,patente,activo) VALUES (4,4,2,'2021','3000 cc','20000','BVBV65',true);
INSERT INTO camion (id,cantidad_ejes,capacidad_toneladas,id_tipo_camion) VALUES (4,'4','10000',2);
INSERT INTO vehiculo (id,id_modelo,id_tipo_vehiculo,anio,cilindrada,kilometraje,patente,activo) VALUES (5,5,2,'2018','1700 cc','50000','XCDS44',true);
INSERT INTO camion (id,cantidad_ejes,capacidad_toneladas,id_tipo_camion) VALUES (5,'4','15000',3);


/*MantencionVehiculo*/
INSERT INTO mantencion_vehiculo (id,id_vehiculo,fecha,cambio_aceite,parabrisas,frenos,filtro_aire, observacion) VALUES (1,1,'2020-04-06',true,true,true,true,'La mantención fue realizada exitosamente');
INSERT INTO mantencion_vehiculo (id,id_vehiculo,fecha,cambio_aceite,parabrisas,frenos,filtro_aire, observacion) VALUES (2,1,'2021-05-07',true,false,true,false,'La mantención fue realizada con errores');
INSERT INTO mantencion_vehiculo (id,id_vehiculo,fecha,cambio_aceite,parabrisas,frenos,filtro_aire, observacion) VALUES (3,2,'2020-06-08',true,true,true,false,'La mantención fue realizada con observaciones');
INSERT INTO mantencion_vehiculo (id,id_vehiculo,fecha,cambio_aceite,parabrisas,frenos,filtro_aire, observacion) VALUES (4,3,'2021-09-10',true,true,true,true,'La mantención fue realizada exitosamente');
INSERT INTO mantencion_vehiculo (id,id_vehiculo,fecha,cambio_aceite,parabrisas,frenos,filtro_aire, observacion) VALUES (5,4,'2020-10-01',false,false,false,false,'La mantención no fue realizada exitosamente');