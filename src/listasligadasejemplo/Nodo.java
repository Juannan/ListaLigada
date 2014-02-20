

package listasligadasejemplo;


public class Nodo<T> {
    // Valor
    private T valor;
    // Liga
    private Nodo liga;

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Nodo getLiga() {
        return liga;
    }

    public void setLiga(Nodo liga) {
        this.liga = liga;
    }
}
