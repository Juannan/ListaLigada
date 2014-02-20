package listasligadasejemplo;
/*
 *@param <T> Este es un tipo de dato específico de la lista ligada
 */

public class ListaLigada<T> {

    private Nodo<T> p = null;

    /**
     * Este método recorre la lista, imprimiendo cada valor de la misma en la
     * pantalla
     */
    public void mostrarLista() {
        // Variable Auxiliar
        Nodo<T> q = p;
        // Ciclo que recorra la lista
        while (q != null) {
            System.out.println(q.getValor());
            q = q.getLiga();
        }
    }

    public void insertaInicio(T obj) {
        Nodo<T> t = new Nodo<>();
        t.setValor(obj);
        t.setLiga(p);
        p = t;
    }

    public void insertarFinal(T obj) {
        Nodo<T> q = p;// Nodo auxiliar para recorrer la lista
        Nodo<T> t = new Nodo<>();// El nuevo nodo a insertar
        t.setValor(obj);
        t.setLiga(null);
        // Ciclo que recorra la lista
        if (p == null) {
            p = t;
        } else {
            while (q.getLiga() != null) {
                q = q.getLiga();
            }
            q.setLiga(t); // Asignamos a la liga del último elemento, el nuevo elemento
        }
    }

    public ListaLigada<T> invierteLista() {
        ListaLigada<T> ListaRetorno = new ListaLigada<>();
        Nodo<T> q = p;
        while(q!=null){
            ListaRetorno.insertaInicio(q.getValor());
            q=q.getLiga();
        }
        
        return ListaRetorno;
    }
}
