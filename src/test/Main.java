package test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        if (n == 0) {
            System.out.println("N/A");
        } else {
            s.nextLine().trim();
            for (int i = 1; i <= n; i++) {
                String bookname = s.nextLine();
                String authorname = s.nextLine();
                String isbn = s.nextLine();
                Book obj = new Book(String bookname, String authorname, String isbn);
                obj.Bookdetails();

            }
        }

    }
}

class Book {
    String bookname;
    String authorname;
    String isbn;

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String b) {
        bookname = b;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String a) {
        authorname = a;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String i) {
        authorname = i;
    }

    void Bookdetails() {
        System.out.print("-----------------------------" + "\n"
                "Bookname\t" + bookname + "\n"
                "Authorname\t" + authorname + "\n"
                "Isbn\t" + isbn + "\n"
                "-----------------------------");
    }


}
