
public class Practica_clase {
         /*             Encapsulacion                   */
	
        private String Nombre_profesor= "Edison Cayambe" ;
        private int edad = 28;
        private String asignatura= "Programacion";
        
        /*                Abtraccion                         */
        
        void ganancias(int quincena, int mensual, String horario) {
        horario = "Matutino";
        quincena = 250;
        mensual = 500;
        int ganancia_anual = mensual * 12;
        
        }
        
    	/*                   polimorfismo                     */
        
    	void ganacias(String horario, int quincena, int mensual) {
    		  horario = "Nocturno"; 
    		  quincena = 195;
    	      mensual = 390;
    	     int ganancia_anual = (quincena * 2) * 12;
    	}
}