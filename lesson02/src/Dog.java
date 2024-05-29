public class Dog {
    private String name;
    private float size;
    private Owner owner;

    public Dog(String name, float size, Owner o) {
        this.name = name;
        this.size = size;
        this.owner = o;
    }
    public Dog(String name, float size) {
        this.name = name;
        this.size = size;
        this.owner = null;
    }
    public boolean isStray(){
        if (owner == null){
            return true;
        }
        else{
            return false;
        }
    }

    public void sayName() {
        System.out.println(name);
    }
    public void sayOwnerName() {
        if (!isStray()) {
            System.out.println(owner.getName());
        }
        else{
            System.out.println("You don't have an owner yet");
        }
    }

    public String getName() {
        return name;
    }
    public float getSize() {
        return size;
    }
    public Owner getOwner() {
        return owner;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
