
public class  Nodo<V> {
    private V valor ;
    private Nodo<V> izq;
    private Nodo<V> der;

    public Nodo (V valor, Nodo<V> izq,Nodo <V> der ) {
        super();
        this.valor = valor;
        this.izq = izq;
        this.der = der;
    }

    public V getValor() {
        return valor;
    }

    public void setValor(V valor) {
        this.valor = valor;
    }

    public Nodo<V> getIzq() {
        return izq;
    }

    public void setIzq(Nodo<V> izq) {
        this.izq = izq;
    }

    public Nodo<V> getDer() {
        return der;
    }

    public void setDer(Nodo<V> der) {
        this.der = der;
    }

}
