/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author Usuario_PC
 */
public class Main {

    public static void main(String[] args) {
         ArbolBinario arbol = new ArbolBinario();

    arbol.insertar(5);
    arbol.insertar(3);
    arbol.insertar(7);
    arbol.insertar(1);
    arbol.insertar(4);
    arbol.insertar(6);
    arbol.insertar(8);
    
     System.out.print("Recorrido inorder: ");
    arbol.inorder();

    System.out.print("Recorrido preorder: ");
    arbol.preorder();

    System.out.print("Recorrido postorder: ");
    arbol.postorder();

    Nodo nodo = arbol.buscar(6);
    
     if (nodo != null) {
        System.out.println("Nodo encontrado: " + nodo.getValor());
    } else {
        System.out.println("Nodo no encontrado.");
    }
    }
}
