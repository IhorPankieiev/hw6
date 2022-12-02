package Task2;

public enum Animals {DOG(5), PIG(3), SHEEP(4);
    int age;

    Animals(int age){
        this.age = age;
    }

    @Override
    public String toString(){
      return super.toString() + "," + age + " years";
    }
}

class Main{

    public static void main(String[] args) {
        Animals dog = Animals.DOG;
        Animals pig = Animals.PIG;
        Animals sheep = Animals.SHEEP;
        System.out.println(dog.toString() + "\n" + pig.toString() + "\n" + sheep.toString());
    }
}
