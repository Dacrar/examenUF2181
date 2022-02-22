/**
 * @author David Cruz Aranda
 */
package libs;


public class Funciones {
	/**
	 * Funcion que pide 3 numeros enteros y nos devuelve el numero central de los 3 valores.
	 * Por ejemplo si le damos los numeros 3, 5, 10 la funcion nos devolvera en numero 5,
	 * si especificamos valores como -1, -10, -4 tambien nos devolvera el numero -4 como central. 
	 * @param num1 int, primer valor de los 3 numeros que pide la funcion.
	 * @param num2 int, segundo valor de los 3 numeros que pide la funcion.
	 * @param num3 int, tercer valor de los 3 numeros que pide la funcion
	 * @return int, devuevle el numero central de los 3 parametros añadidos.
	 */
	public int devuelveCentral(int num1, int num2, int num3) {
		
		int enMedio;
		
		if ((num1>num2) && (num1<num3)) {
			enMedio=num1;
		}  else if  ((num2>num1) && (num2<num3)) {
			enMedio= num2;
		} else {
			enMedio = num3;
		}
		return enMedio;
	}
	
	/**
	 * Funcion que pide un año como numero entero y devuelve si este es bisiesto mediante true o false,
	 * true = bisiesto, false = no bisiesto.
	 * Si por ejemplo colocamos el año 1996 nos tendra que dar valor true(Bisiesto)
	 * si por lo contrario colocamos el año 1997 nos tendra que dar valor false(No Bisiesto)
	 * @param año int, valor que le damos del año que queremos comprobar.
	 * @return boolean, nos devolvera true si es bisiesto y false si es No Bisiesto.
	 */
	public boolean esBisiesto(int año) {
		boolean bisiesto =false;
		if (año %4 == 0 ) {
			if (año%100==0 && año%400!=0) {
				bisiesto=false;
			} else {
				bisiesto=true;
			}
		} else  {
			bisiesto=false;
		}
		return bisiesto;
	}
	
	/**
	 * Funcion que pide añadir numeros enteros a un vector, este nos devolvera true o false,
	 * true = es capicua, false = no es capicua.
	 * Si por ejempolo añadimos al vector los numeros 1,2,3,2,1 nos devolvera valor true "es capicua".
	 * Si por lo contrario añadimos al vector los numeros 1,2,3,4,5 nos devolvera valor false "no es capicua"
	 * @param v int, valor entero que le vas añadiendo al vector para determinar si es capicua o no.
	 * @return boolean, nos devolveria un valor true o false dependiendo de los valores añadidos.
	 */
	public boolean esCapicua(int v[]) {
		boolean capicua = true;
		
		for (int i=0, j=v.length-1; i<v.length/2; i++,j--) {
			if (v[i]!=v[j]) {
				capicua=false;
			}
		}
		return capicua;
	}

	
	/**
	 * Funcion que nos pide añadir valores enteros para dos vectores(v[],v2[]) y nos devuelve 
	 * un tercer vector (vector_suma []) con la suma de los dos primeros. Se añade un 
	 * ArithmeticException si los vectores no tienen el mismo tañamo.
	 * @param v int, valor entero que le damos el primer vector.
	 * @param v2 int, valor entero que le damos al segundo vector.
	 * @return int, nos devuelve la suma de los dos primeros vectores.
	 * @throws ArithmeticException cuando los vectores no tienen el mismo tamaño.
	 */
	public int [] suma_vectores(int v[], int v2[]) {
		int vector_suma [] = new int[v.length];
		
		if (v.length!=v2.length) 
		   throw new ArithmeticException("Los vectores deben tener el mismo tamaño");
		
		for (int i = 0; i < vector_suma.length; i++) {
			vector_suma[i]=v[i]+v2[i];
		}
		return vector_suma;
	}
	
	
}
