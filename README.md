#COMPILE DEFAULT Y EJECUTA PRUEBAS
mvn clean install


#COMPILE ESCAPANDO PRUEBAS
mvn -U clean install -DskipTests

#LEVCANTAR EL WEB 
mvn tomcat7:run -P snapshot


#HERRAMIENTAS UTILIZADAS
postgres,
,web primefaces
,java
,springbook

#UTILERIAS
adjunto el modelo en el folder databasemodel.

#AdjuntoL respuestas de javaScrip
3.¿cómo harías una función en donde multipliques dos números dados sin USAR "*"
como operador?, es decir, sin USAR por ejemplo let resultado = numero1 * numero2
BigInteger método multiply()
 Ej. abonoNormal = Precio.multiply(TasaNormal)ad(Precio)

4.¿Que son los parámetros nombrados en JavaScript y para qué sirven?, da un
ejemplo de cómo los usarías.
permiten que los parámetros con nombre se inicien con valores predeterminados si no se pasa ningún valor o undefined

function multiplica(va1, var2 = 1) {
  return var1 * var2;
}

console.log(multiply(5, 8));
// expected output: 40

console.log(multiply(5));
// expected output: 5

5.¿qué métodos de un array en JavaScript conoces?
indexof()
Busca un elemento en el array y devuelve su posición. Busca desde el principio y a partir de la primera posición si no se especifica nada
Ej. var a = casilla.indexOf(«Kiwi»); Devuelve -1 si no lo encuentra

pop()
 Borra el último elemento del array y devuelve su contenido
Ej. var a = casilla.pop();

toString()
 Convierte un array en string y devuelve el resultado(entre comas)
Ej. casillas.toString();

concat()
Une dos o más arrays
Ej. var tablatotal = tabla1.concat( tabla2 );

sort()
Ordena los elementos del array. Los ordena como strings
Ej. arrayCasillas.sort(function(a,b){return a-b});

push()	
Añade nuevos elementos al array y devuelve su nueva longitud
Ej. a = casilla.push(“limón”);




