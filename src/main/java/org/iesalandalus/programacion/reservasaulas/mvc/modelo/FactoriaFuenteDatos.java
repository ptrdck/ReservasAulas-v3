package org.iesalandalus.programacion.reservasaulas.mvc.modelo;

import org.iesalandalus.programacion.reservasaulas.mvc.modelo.negocio.ficheros.FactoriaFuenteDatosFicheros;
import org.iesalandalus.programacion.reservasaulas.mvc.modelo.negocio.memoria.FactoriaFuenteDatosMemoria;

public enum FactoriaFuenteDatos {
	
	
	// retorna la interfaz que crear� aulas, profesores y reservas en memoria
	MEMORIA{
		public IFuenteDatos crear() {
			return new FactoriaFuenteDatosMemoria();
		}
	},
	
	// retorna la interfaz que crear� aulas, profesores y reservas en ficheros
	
	FICHEROS{
		public IFuenteDatos crear() {
			return new FactoriaFuenteDatosFicheros();
		}
	};
	public abstract IFuenteDatos crear();
	
}
