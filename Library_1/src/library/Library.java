/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author mikeross
 *took this segment from your notes 
 * 
 */
public class Library {
    private int[] numbers;
    private int[][] twoDimension;
    private Book[] book;    
    
    
    private static int number = 0;
    private static Role role = Role.user;
    
    public static void main(String[] args) {
       Library library = new Library();
        library.initializeArray();
        library.writeBook();
        library.initializeTwoDimension();
        
        
        switch(number) {
          case 0: 
          case 2:
              System.out.println("Number is 0");
              break;
          case 1: 
              System.out.println("Number is 1");
//              break;
          default: 
              System.out.println("Default");
      }
      
      switch(role) {
          case Admin:
              System.out.println("ADMIN");
              break;
          case user:
              System.out.println("USER");
              break;
      }
    }

      public void initializeArray() {
        numbers = new int[10];
        
        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Index = " + i);
            numbers[i] = i * 2;
        }
        
        for(int number: numbers) {
            System.out.print(number + " ");
        }
    }

    private void writeBook() {
        book = new Book[2];
        
        Book book = new Book("Fares", "Bouchedid");
        Book bookTwo = new Book("John", "Smith");
        book[0] = book;
        book[1] = booktwo;
        
        for(Book tempBook: book) {
            System.out.println(tempBook);
        }
    }
    
    private void initializeTwoDimension() {
        this.twoDimension = new int[5][5];
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                twoDimension[i][j] = i + j;
            }
        }
        
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.println(twoDimension[i][j]);
            }
        }
    }  








}







