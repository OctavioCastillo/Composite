public class Movie implements CatalogComponent{

    private final String name;
    private final int duration;

    public Movie(String name, int duration){
        this.name = name;
        this.duration = duration;
    }

    @Override
    public void print(){
        System.out.println("Movie: " + name + ", Duration(min): " + duration);
    }
}
