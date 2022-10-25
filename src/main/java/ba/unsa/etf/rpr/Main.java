package ba.unsa.etf.rpr;
// u komandnoj pokrenuti sa npr. java -jar rpr-t2-z1-1.0.jar sin 90
public class Main {
    public static void main(String[] args) {
        try{
            if(args[0].equals("sin")){
                System.out.println(Math.dajSinus(Double.parseDouble(args[1])));
            }
            else
                System.out.println(Math.faktorijel(Integer.parseInt(args[1])));
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
