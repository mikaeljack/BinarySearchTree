package no.mikaelaj.hiof.oblig4;

public class Node {

        String data;
        Node left, right;
        int count =1;

        // Constructor, sets pointers to null
        public Node(String word) {
            data = word;
            left = right = null;
        }

    public void write() {
        System.out.println(data + " counted " + count+ " times");
    }

    public void incrementCount(){
            count++;
    }
}
