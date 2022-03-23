# BufferCucumber

# capNeg.feature
En este feature nos aseguramos que se lance una excepcion Illeg<lArgument al iniciar el buffer con una capacidad negativa

## get.feature    
Comprobamos que se lanza una excepcion si se hace un get en un buffer vacio y nos aseguramos tambien que al hacer un get se decrementa el tamaño del buffer
                                                                          
## put.feature
Comprobamos que se aumenta el tamañoi del buffer y que si intentamos hacer un put cuando el buffer esta lleno, lanza una excepcion   
                                                                          
 ## isFull / isEmpty
Devuelven un boolean segun el estado del buffer                                                                       
                                                                          
