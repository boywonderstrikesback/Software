/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomarraysearch;
import java.util.Random;
/**
 *
 * @author mikeross
 */


public class Randomarraysearch {

public static int genRandom() {
    // generate random int value between 1 and 54
    int random = 1 + (int) (Math.random() * ((54 - 1) + 1));
    return random;

}

public static boolean containsDuplicates(int[] arr) {
    // check to see if positions have matching values
    if (arr[0] == arr[1] || arr[0] == arr[2] || arr[1] == arr[2]) {
        System.out.println("Duplicates Exist");
        // if matching value is found, randomize the array again
        shuffle(arr);
        return true;
    }
    System.out.println("No duplicates");
    return false;
}

public static void shuffle(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        arr[i] = genRandom();
        System.out.println(arr[i]);
    }
    containsDuplicates(arr);
}

public static void main(String[] args) {

    int[] cards = new int[6];
    shuffle(cards);
}
}
