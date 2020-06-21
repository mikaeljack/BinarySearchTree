package no.mikaelaj.hiof.oblig4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write a sentence in English: ");
        String input = scanner.nextLine();
        String upperCase = input.toUpperCase();
        String[] words = upperCase.split("[^\\w]+");
        BinarySearchTree bst = new BinarySearchTree();

        for(int i = 0; i<words.length; i++) {
            bst.insert(words[i]);
        }

        bst.inorder();
    }
}
