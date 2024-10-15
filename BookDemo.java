class Book {
    String Title;
    String Author;
    String Publisher;
    double Price;
    double Discount;
    double Dprice;
    
    Book(){
        
    }
    Book(String T, String A, String P, double price) {
        Title = T;
        Author = A;
        Publisher = P;
        Price = price;
    }
    void discountPrice() {
        Discount = Price * 0.10;
        Dprice=Price-Discount;
    }
    
    void display() {
        System.out.println("Title: " + Title);
        System.out.println("Author: " + Author);
        System.out.println("Publisher: " + Publisher);
        System.out.println("Price: " + Price);
        System.out.println("Discount: " + Discount);
        System.out.println("Discounted Price: " + Discount);
        System.out.println();

    }
}

class KidsStory extends Book {
    KidsStory(String T, String A, String P, double price) {
        Title = T;
        Author = A;
        Publisher = P;
        Price = price;
    }

    @Override
    void discountPrice() {
        Discount = Price * 0.10;
        Dprice=Price-Discount;
    }
}

class Gk extends Book {
    Gk(String T, String A, String P, double price) {
        Title = T;
        Author = A;
        Publisher = P;
        Price = price;
    }

    @Override
    void discountPrice() {
        Discount = Price * 0.20;
        Dprice=Price-Discount;
    }
}

class Scientific extends Book {
    Scientific(String T, String A, String P, double price) {
        Title = T;
        Author = A;
        Publisher = P;
        Price = price;
    }

    @Override
    void discountPrice() {
       Discount = Price * 0.25;
       Dprice=Price-Discount;
    }
}

class BookDemo {
    public static void main(String[] args) {
        Book t1= new Book("Book", "Name", "PName", 90.0);
        KidsStory ks1 = new KidsStory("Harry", "Abc", "Xyz", 39.99);
        Gk gk1 = new Gk("GK Book", "Author Name", "Publisher Name", 20.0);
        Scientific sci1 = new Scientific("Science Book", "Scientist", "ScienceHub", 55.0);

        ks1.discountPrice();
        gk1.discountPrice();
        sci1.discountPrice();

        ks1.display();
        gk1.display();
        sci1.display();
    }
}


