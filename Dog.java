public class Dog {
    private String name;
    private String breed;

    public Dog(String name,String breed){
        this.name=name;
        this.breed=breed;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setBreed(String breed){
    this.breed=breed;
    }

    public String getName(){
        return this.name;
    }

    public String getbreed(){
        return this.breed;
    }
}

class execute{
    public static void main(String[] args){
        Dog a=new Dog("bob","German Sheperd");
        Dog b=new Dog("blacky","husky");
        System.out.println(a.getName()+a.getbreed());
        System.out.println(b.getName()+b.getbreed());
        a.setBreed("cottlie");
        a.setName("Bob");
        a.setName("Blackie");
        b.setBreed("golden retriever");
        System.out.println(a.getName()+a.getbreed());
        System.out.println(b.getName()+b.getbreed());
        
    }
}