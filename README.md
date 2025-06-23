El objetivo es desarrollar un software que permita Gestionar contenidos para una Organización, como
aplicación Web. El proyecto contemplará la posibilidad de poder aplicarse a otros tipos de
instituciones, con cambios

error importante 

org.hibernate.StaleObjectStateException: Row was updated or deleted by another transaction (or unsaved-value mapping was incorrect): [ar.com.gestor.entities.Rol#1]

en la primer version no se como solucionar este error, por lo que tengo entendido se genera al todavia detectar un identificador aunque lo haya borrado al objeto,
esta eliminacion se llevo a cabo por medio de postman usando el path (localhost:8090/gestor/api/rol/delete/1) la funcion esta bien declarada en controller, pero no puedo volver a crear un objeto con id:1 
