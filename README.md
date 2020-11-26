# Logica Difusa para control de potencia en un sistema de aire acondicionado

# El sistema está hecho en MATLAB y en JAVA 

Se crea un sistema de inferencia difuso para calcular la potencia de un aire acondicionado basándose en 3 variables de entrada:

Medida del cuarto: 
- pequeña: hasta 20 m2
- mediana: desde 15 m2 hasta 35 m2
- grande: 40 m2 o más    

Cantidad de personas en el cuarto: 
- pocas: hasta 4 personas
- algunas: entre 3 y 9 
- muchas: 8 en adelante 

Temperatura del cuarto: hasta 20° frio, entre 18° y 28° templado y de 26 en adelante caliente  

La variable de salida potencia se calcula por medio del método de defuzzificacion "Centro de gravedad" con conjuntos baja (0-10), media (7-23), alta (20-30).



