import java.util.*;

public class Shop {

  private ArrayList<IPlay> stock;
  private String shopName;

  public Shop(String name){
    this.shopName = name;
    this.stock = new ArrayList<IPlay>();
  }

  public void addInstrument(IPlay instrument) {
    this.stock.add(instrument);
  }

  public ArrayList<IPlay> getInstruments(){
    return this.stock;
  }

  public static void main(String[] args){
    Shop soundWorld = new Shop("Sound World");

    Guitar ibenez = new Guitar();
    Piano yamaha = new Piano();

    soundWorld.addInstrument(ibenez);
    soundWorld.addInstrument(yamaha);

    for (int i=0; i<soundWorld.getInstruments().size(); i++ ) {
      System.out.println(soundWorld.getInstruments().get(i).playSound());
    }
  }
}
