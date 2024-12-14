public class Ital extends Etel{
    private String meret;

    public Ital(String nev, int ar, String meret){
        super(nev, ar);
        this.meret = meret;
    }
    @Override
    public void leiras(){
        System.out.println(getNev()+" "+getAr()+"Ft  -  Méret: "+meret);
    }
}