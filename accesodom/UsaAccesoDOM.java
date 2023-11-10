
package accesodom;

import java.io.File;
public class UsaAccesoDOM {

    
    public static void main(String[] args) {
      AccesoDOM a=new AccesoDOM();
		File f=new File("Libros.xml");//necesitamos Libros.xml en la ruta correcta
	
              a.abriXMLaDOM(f);
               a.recorreDOMyMuestra();
               a.insertarLibroEnDOM("Yerma", "Lorca", "1935");
              // a.deleteNode("Don Quijote");
               a.guardarDOMcomoArchivo("LibrosDeDOM.XML");
    }
    
}
