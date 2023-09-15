package Part2;

import java.util.*;

public class Main {
    static Integer[] value = new Integer[]{12, 5, -3, 5, 42, 37, 5, 0, -21};

    public static void main(String[] args) {
        //TreeSetTest();//trié | pas de doublon
        //HashSetTest();//ordre aléatoire | pas de doublons
        //LIFOTest();//ordre d'arrivé | doublons
        //FIFOTest();//ordre d'arrvié | doublons
        //HeapTest();//ordre aléatoire | doublons
        //ArrayListTest();//ordre d'arrivé | doublons
        //LinkedListTest();//ordre d'arrivé | doublons

        //IMPRIMANTE : FIFO | premier arrivé premier sorti
        //Top-N : SortedMap | bcp de personne vont accéder à ça, alors qu'on peut s'attendre à peut être un changement toute les 24h à cette liste
        //La vitesse d'accès dans l'ordre est une priorité.
        //Liste des étudiants : SortedMap | même argument sauf que ça change tout les ans. L'ordre permet de trouver un élève plus rapidement
        //Liste des onglets navigateur web : HashSet |  Besoin de parcourir, pas de doublons, ordre parcours pas important
        //Liste repésentant ligne image : HashSet | Besoin de parcourir, pas de doublons, ordre parcours pas important


    }
    private static void TreeSetTest(){
        /* ORDERED, UNIQUE */
        Set myTreeSet = new TreeSet<Integer>();
        for (int i : value) {myTreeSet.add(i);}

        System.out.print("Tree set Iterator : ");
        Iterator<Integer> myTreeIterator = myTreeSet.iterator();
        while (myTreeIterator.hasNext()){
            Integer element = myTreeIterator.next();
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.print("Tree set enhanced for: ");
        for(Object i : myTreeSet){ System.out.print(i + " ");}
        System.out.println();
        System.out.println();
    }
    private static void HashSetTest() {
        /* RANDOM, UNIQUE, PERMIT NULL */
        Set myHashSet = new HashSet<Integer>();
        for (int i : value) {myHashSet.add(i);}

        System.out.print("Hash set Iterator : ");
        Iterator<Integer> myTreeIterator = myHashSet.iterator();
        while (myTreeIterator.hasNext()){
            Integer element = myTreeIterator.next();
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.print("Hash set enhanced for: ");
        for(Object i : myHashSet){ System.out.print(i + " ");}
        System.out.println();
        System.out.println();
    }
    private static void LIFOTest(){
        Queue myLIFO = new ArrayDeque<Integer>();
        for (int i : value) {myLIFO.add(i);}

        System.out.print("LIFO queue Iterator : ");
        Iterator<Integer> myTreeIterator = myLIFO.iterator();
        while (myTreeIterator.hasNext()){
            Integer element = myTreeIterator.next();
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.print("LIFO queue enhanced for: ");
        for(Object i : myLIFO){ System.out.print(i + " ");}
        System.out.println();
        System.out.println();
    }
    private static void FIFOTest(){
        Queue myFIFO = new ArrayDeque<Integer>();
        for (int i : value) {myFIFO.add(i);}

        System.out.print("FIFO queue Iterator : ");
        Iterator<Integer> myTreeIterator = myFIFO.iterator();
        while (myTreeIterator.hasNext()){
            Integer element = myTreeIterator.next();
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.print("FIFO queue enhanced for: ");
        for(Object i : myFIFO){ System.out.print(i + " ");}
        System.out.println();
        System.out.println();
    }
    private static void HeapTest(){
        Queue myHeap = new PriorityQueue();
        for (int i : value) {myHeap.add(i);}

        System.out.print("Heap queue Iterator : ");
        Iterator<Integer> myTreeIterator = myHeap.iterator();
        while (myTreeIterator.hasNext()){
            Integer element = myTreeIterator.next();
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.print("Heap queue enhanced for: ");
        for(Object i : myHeap){ System.out.print(i + " ");}
        System.out.println();
        System.out.println();
    }
    private static void ArrayListTest(){
        List myArrayList = new ArrayList<Integer>();
        for (int i : value) {myArrayList.add(i);}

        System.out.print("Array list Iterator : ");
        Iterator<Integer> myTreeIterator = myArrayList.iterator();
        while (myTreeIterator.hasNext()){
            Integer element = myTreeIterator.next();
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.print("Array list enhanced for: ");
        for(Object i : myArrayList){ System.out.print(i + " ");}
        System.out.println();
        System.out.println();
    }
    private static void LinkedListTest(){
        List myLinkList = new LinkedList<Integer>();
        for (int i : value) {myLinkList.add(i);}

        System.out.print("Linked list Iterator : ");
        Iterator<Integer> myTreeIterator = myLinkList.iterator();
        while (myTreeIterator.hasNext()){
            Integer element = myTreeIterator.next();
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.print("Linked list enhanced for: ");
        for(Object i : myLinkList){ System.out.print(i + " ");}
        System.out.println();
        System.out.println();
    }
}
