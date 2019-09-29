package Husdjurshotellet;

public class Orm extends Djur {

    public Orm() {
    }

    public Orm(String _namn, double _vikt) {
        this.namn = _namn;
        this.vikt = _vikt;
    }

    @Override
    public double getFoodInGrams() {
        return 20;
    }

    public String getName() {
        return this.namn;
    }

    public double getVikt() {
        return this.vikt;
    }
}