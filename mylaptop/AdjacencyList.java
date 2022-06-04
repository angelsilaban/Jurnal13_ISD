package mylaptop;

import java.util.*;
public class AdjacencyList {
    LinkedList<Integer>[] AdjacencyList;
    int v;
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    AdjacencyList(int v) {
        this.v = v;

        AdjacencyList = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            AdjacencyList[i] = new LinkedList<>();
        }
    }

    public void TambahEdge(String asal, String tujuan) {
        int asalInt = alphabet.indexOf(asal);
        int tujuanInt = alphabet.indexOf(tujuan);
        AdjacencyList[asalInt].add(tujuanInt);
    }

    public void DFS(String asalString) {
        int asal = alphabet.indexOf(asalString);
        int[] dikunjungi = new int[v];
        Stack<Integer> Stack = new Stack<>();

        Stack.push(asal);

        int indeks = 0;
        boolean ada = true;
        while (!Stack.isEmpty()) {
            int vertexSekarang = Stack.pop();

            dikunjungi[indeks] = vertexSekarang;
            indeks++;

            for (int i = 0; i < AdjacencyList[vertexSekarang].size(); i++) {
                int elemeen = AdjacencyList[vertexSekarang].get(i);

                for (int j = 0; j < dikunjungi.length; j++) {
                    if (dikunjungi[j] == elemeen) {
                        ada = true;
                        break;
                    } else {
                        ada = false;
                    }
                }

                if (ada == false && !Stack.contains(elemeen)) {
                    Stack.push(elemeen);
                }
            }
        }

        System.out.println("Hasil dari DFS dimulai dari simpul " + alphabet.charAt(asal) + " adalah : ");
        for (int i : dikunjungi) {
            char output = alphabet.charAt(i);
            System.out.print(" > " + output);
        }
    }

    public void BFS(String asalString) {
        int asal = alphabet.indexOf(asalString);
        int[] dikunjungi = new int[v];
        Queue<Integer> Queue = new LinkedList<>();

        Queue.add(asal);

        int indeks = 0;
        boolean ada = true;
        while (!Queue.isEmpty()) {
            int vertexSekarang = Queue.poll();

            dikunjungi[indeks] = vertexSekarang;
            indeks++;

            for (int i = 0; i < AdjacencyList[vertexSekarang].size(); i++) {
                int elemeen = AdjacencyList[vertexSekarang].get(i);

                for (int j = 0; j < dikunjungi.length; j++) {
                    if (dikunjungi[j] == elemeen) {
                        ada = true;
                        break;
                    } else {
                        ada = false;
                    }
                }
                if (ada == false && !Queue.contains(elemeen)) {
                    Queue.add(elemeen);
                }
            }
        }

        System.out.println("Hasil dari BFS dimulai dari simpul " + alphabet.charAt(asal) + " adalah : ");
        for (int i : dikunjungi) {
            char output = alphabet.charAt(i);
            System.out.print(" > " + output);
        }
    }
}
