# ValadoFitnessHack
Repositorio para la tarea de Desarrollo de Interfaces - 2ºDAM
Realizado por Albert Valado Pujol

Se ha resuelto un primer problema de conexión entre Netbeans y la base de datos buscando el error arrojado por la build en Google
y usando el siguiente enlace: https://es.stackoverflow.com/questions/32148/error-al-conectar-netbeans-con-una-base-de-datos-de-sql-server-2008

Otra problemática recurrente ha sido la comunicación entre las distintas views y sus respectivos dialogs, en particular
a la hora de pasar información. En general, esto ha sido resuelto a través de la parametrización de la información y el uso de getters/setters. 
El principal punto en el que se ha tenido este problema ha sido a la hora de mantener un único JDialog para los métodos de crear una
review y de actualizarla, para pasar información acerca de qué botones mostrar. La solución fue usar un parámetro de la ventana padre. 
