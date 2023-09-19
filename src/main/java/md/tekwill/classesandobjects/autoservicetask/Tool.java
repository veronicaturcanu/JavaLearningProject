package md.tekwill.classesandobjects.autoservicetask;

public class Tool {
    public double price;
    public String name;
    public double weight;

    public Tool(String name){
        this.name = name;
        System.out.println("Un obiect de tip Tool a fost creat, nume: " + this.name);
    }

    public Tool(){
        System.out.println("O nouă uneltă a fost creată în cadrul programului. Nu dispunem de detaliile ei " +
                "Pentru detalii, numele este " + this.name + ", pretul este " + this.price + " iar greutatea este " + this.weight);
    }
}
