public class Main {
    public static void main(String[] args) {

        // como Movie es igual a la interface, se puede poner una Movie cuando se pida un CatalogComponent
        Movie batman = new Movie("batman", 120);
        CatalogComponent spiderman = new Movie("spiderman", 123);
        CatalogComponent spiderman2 = new Movie("spiderman2", 96);
        CatalogComponent hachiko = new Movie("hachiko", 105);

        Category action = new Category("action");
        Category drama = new Category("drama");

        action.add(batman);
        action.add(spiderman);
        action.add(spiderman2);

        drama.add(hachiko);

        action.print();
        drama.print();

        }
    }