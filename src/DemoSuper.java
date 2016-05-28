/**
 * Created by igor on 28.05.16.
 */
public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight myBox1 = new BoxWeight(10,20,40,32.23);
        BoxWeight myBox2 = new BoxWeight(2,3,4,32.2332);
        BoxWeight myBox3 = new BoxWeight();
        BoxWeight myCube = new BoxWeight(3,2);
        BoxWeight myClone = new BoxWeight(myBox1);
        double vol;

        vol = myBox1.volume();
        System.out.println("Volume myBox1 = "+vol);
        System.out.println("Weight myBox1 = "+myBox1.weight);
        System.out.println();

        vol = myBox2.volume();
        System.out.println("Volume myBox2 = "+vol);
        System.out.println("Weight myBox2 = "+myBox2.weight);
        System.out.println();

        vol = myBox3.volume();
        System.out.println("Volume myBox3 = "+vol);
        System.out.println("Weight myBox3 = "+myBox3.weight);
        System.out.println();

        vol = myClone.volume();
        System.out.println("Volume myClone = "+vol);
        System.out.println("Weight myClone = "+myClone.weight);
        System.out.println();

        vol = myCube.volume();
        System.out.println("Volume myCube = "+vol);
        System.out.println("Weight myCube = "+myCube.weight);
        System.out.println();

    }
}
