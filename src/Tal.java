public class Tal {

    double rel;
    double img;

    public Tal(double rel, double img){
        this.rel = rel;
        this.img = img;
    }

    public static Tal add(Tal a, Tal b){
        Tal tmp = new Tal(0.0, 0.0);
        tmp.rel = a.rel + b.rel;
        tmp.img = a.img + a.img;
        return(tmp);
    }

    public static void main(String[] args){

    }

}
