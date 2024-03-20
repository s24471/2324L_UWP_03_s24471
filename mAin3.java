import java.math.BigDecimal;

public class mAin3 {
    public static void main(String[] args) {
        public void buy(){
            System.out.println("&&&&&&&kupowanie&&&&&&&");
            for (Stock stock: stocksarr) {
                if(stock.worth>=0){
                    System.out.print("jest wieksze od zera " + stock);
                    double tmp = Main.equity*stock.worth;
                    double buying =(tmp/(stock.arr.get(stock.arr.size()-1)*100*Main.USD)); // co tu sie dzieje?? bo vol to 100???
                    System.out.println( " buying: " + buying + " eq: " + Main.equity + " worth: " + stock.worth + " name: " + stock.name);
                    if(buying>0){
                        BigDecimal x = new BigDecimal(buying);
                        BigDecimal bdVal = x.subtract( x.remainder( new    BigDecimal(stock.lotStep )   ) );
                        double mod = bdVal.doubleValue();
                        System.out.println("lotStep="+stock.lotStep+" lotMin="+stock.lotMin + " lotMax=" + stock.lotMax+ "  buying - buying%stock.lotStep="+ mod);

                        if(mod> stock.lotMin && mod< stock.lotMax) {
                            mod = (double) (((int) (mod * 10000)) / 10000);
                            buying = mod;
                            if (Messenger2.buy(stock.name, buying)) {
                                stock.bought += buying;
                                if (stock.maxPrice < stock.arr.get(stock.arr.size() - 1))
                                    stock.maxPrice = stock.arr.get(stock.arr.size() - 1);
                            }
                            else{
                                System.out.println("cos poszlo nie tak z kupowaniem " + stock);
                            }
                        }
                    }
                }
            }
            System.out.println("&&&&&&&koniec kupowanie&&&&&&&");
        }
    }
}
