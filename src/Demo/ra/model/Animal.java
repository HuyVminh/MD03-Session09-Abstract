package Demo.ra.model;

public abstract class Animal {
    private String name;
    public void eat(){
        System.out.println("Animal eating...");
    }
   public abstract void makeNoise();
}
