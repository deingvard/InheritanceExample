/**
 * Created by igor on 28.05.16.
 */
public class BoxWeight extends Box {
    double weight;

    BoxWeight(BoxWeight ob){
        super(ob);
        weight = ob.weight;
    }

    public BoxWeight(double width, double height, double depth, double weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    public BoxWeight() {
        super();
        weight = -1;
    }

    BoxWeight(double len,double m){
        super(len);
        this.weight = weight;
    }
}
