public class Main {
    public static void main(String[] args) {
        Student kanat = new Student("kanat", 38, 1.50, 90);
        Student bektur = new Student("Bektur", 27, 1.70, 75);
        Student nurbolsun = new Student("Nurbolsun", 17, 1.95, 60);
       if (kanat.getWeight()> bektur.getWeight() && kanat.getWeight()> nurbolsun.getWeight()){
           System.out.println(kanat.getName());
       } else if  (bektur.getWeight()> kanat.getWeight() && bektur.getWeight()> nurbolsun.getWeight()) {
           System.out.println(bektur.getName());
       }
        else
           System.out.println(nurbolsun.getName());

    }
}