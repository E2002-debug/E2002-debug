/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Usuario_PC
 */
public class ArbolBinario {
    Nodo raiz;

    public ArbolBinario() {
        raiz = null;
    }
    
     public void insertar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);

        if (raiz == null) {
            raiz = nuevoNodo;
        } else {
            Nodo nodoActual = raiz;
            Nodo padre;

            while (true) {
                padre = nodoActual;

                if (valor < nodoActual.valor) {
                    nodoActual = nodoActual.izquierdo;

                    if (nodoActual == null) {
                        padre.izquierdo = nuevoNodo;
                        return;
                    }
                } else {
                    nodoActual = nodoActual.derecho;

                    if (nodoActual == null) {
                        padre.derecho = nuevoNodo;
                        return;
                    }
                }
            }
        }
    }
    
    public Nodo buscar(int valor) {
        Nodo nodoActual = raiz;

        while (nodoActual.valor != valor) {
            if (valor < nodoActual.valor) {
                nodoActual = nodoActual.izquierdo;
            } else {
                nodoActual = nodoActual.derecho;
            }

            if (nodoActual == null) {
                return null;
            }
       }
        return nodoActual;
    }  
    private void inorderRecorrido(Nodo nodo) {
        if (nodo != null) {
            inorderRecorrido(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            inorderRecorrido(nodo.derecho);
        }
    }
      public void inorder() {
        inorderRecorrido(raiz);
        System.out.println();
    }
    private void preorderRecorrido(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            preorderRecorrido(nodo.izquierdo);
            preorderRecorrido(nodo.derecho);
        }
    }
    public void preorder() {
        preorderRecorrido(raiz);
        System.out.println();
    }
     private void postorderRecorrido(Nodo nodo) {
        if (nodo != null) {
            postorderRecorrido(nodo.izquierdo);
            postorderRecorrido(nodo.derecho);
            System.out.print(nodo.valor + " ");
        }
    }
     public void postorder() {
        postorderRecorrido(raiz);
        System.out.println();
    }
}