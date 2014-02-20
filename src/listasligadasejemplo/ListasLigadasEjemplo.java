
package listasligadasejemplo;

public class ListasLigadasEjemplo {

    private static Nodo<String> p = null;
    
    public static void main(String[] args) {
        //Definir el inicio de la lista
        ListaLigada<String> lista = new ListaLigada<>();
        lista.mostrarLista();
        lista.insertaInicio("1");
        lista.insertaInicio("2");
        lista.insertaInicio("3");
        lista.insertarFinal("4");
        lista.mostrarLista();
        lista.invierteLista().mostrarLista();
    }
    
  
}
