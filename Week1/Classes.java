public class Classes {
    public static class Book {
        // Class variables
        String title = "";
        String author = "";
        double price = 0;
        
        // Constructor
        Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }
        // Method that shows all details of the Book Object
        void showDetails() {
            System.out.println("\u001B[35mTitle: " + title + "    Author: " + author + "    Price: " + price);
        }
        // Adjusting the inflation price of the book after n years
        void adjustInflation(int years) {
            double inflationRate = 1.029;
            price = price * Math.pow(inflationRate, years);
        }
    }

    public static class Student{
        String name = "";
        int rollNo = 0;
        String marks = "";
        
        Student(String name, int rollNo, String marks){
            this.name =  name;
            this.rollNo = rollNo;
            this.marks = marks;
        }

        void showDetails() {
            System.out.println("Name: " + name + "    Roll No: " + rollNo + "    Marks: " + marks);
        }
    }


    public static void main (String[] args) {
        Book book1 = new Book ("Van", "Darkholme", 99);
        book1.adjustInflation(10);
        book1.showDetails();

        Student student1 = new Student("Muyuan Li", 114514,"A");
        student1.showDetails();
    }
}