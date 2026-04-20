// PILA - STACK

public boolean isEmpty() {
    return top == null;
}

public void push(T dato) {
    Nodo<T> nodo = new Nodo<>(dato);

    if (top == null) {
        top = nodo;
    } else {
        nodo.next = top;
        top = nodo;
    }
}

public T pop() {
    if (top == null) {
        throw new NoSuchElementException("Pila vuota");
    }

    T dato = top.dato;
    top = top.next;
    return dato;
}

public T peek() {
    if (top == null) {
        throw new NoSuchElementException("Pila vuota");
    }

    return top.dato;
}

public String toString() {
    StringBuilder sb = new StringBuilder();

    Pila<T> pilaB = pila; // copia (presunta)

    try {
        while (true) {
            T dato = pilaB.pop();
            sb.append(dato);
            sb.append(" --> ");
        }
    } catch (Exception e) {
        sb.append("NULL");
    }

    return sb.toString();
}

public int size() {
    Pila<T> pilaB = pila; // copia (presunta)
    int cont = 0;

    try {
        while (true) {
            T dato = pilaB.pop();
            cont++;
        }
    } catch (Exception e) {
        return cont;
    }
}