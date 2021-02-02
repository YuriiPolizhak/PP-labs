package toy;
import org.apache.commons.lang3.StringUtils;
public class Toy {
    private  int id;
    private  String name;
    private  String size;
    private  String category;
    private double cost;
    private  int amount;
    public Toy(String[] data){
        id=Integer.parseInt(data[0]);
        name=data[1];
        size= data[2];
        category=data[3];
        cost=Integer.parseInt(data[4]);
        amount=Integer.parseInt(data[5]);

    }
    ///////////////
    public String getSize(){ return size;}
    public int getAmount(){return amount;}
    public double getCost(){return cost;}
    public String getCategory(){return category;}
    public  void Print()
    {
        System.out.print(id+".\t");
        System.out.print(StringUtils.rightPad(name+",", 18, ' ')+"\t");
        System.out.print(StringUtils.rightPad(size+",", 20, ' ')+"\t");
        System.out.print(StringUtils.rightPad(category+",", 20, ' ')+"\t");
        System.out.print(cost+";\t");
        System.out.print("\t"+amount+";\t\n");
    }
    public  void Print(int amount)
    {
        System.out.print(id+".\t");
        System.out.print(StringUtils.rightPad(name+",", 18, ' ')+"\t");
        System.out.print(StringUtils.rightPad(size+",", 20, ' ')+"\t");
        System.out.print(StringUtils.rightPad(category+",", 20, ' ')+"\t");
        System.out.print(cost+";\t");
        System.out.print("\t"+amount+";\t\n");
    }
}
