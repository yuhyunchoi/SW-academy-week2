public class Dragoon extends Unit implements Attackable, Flyable{

    public Dragoon(String name, int dmg, int def){
        super(name, dmg, def);
    }

    @Override
    public void attack(Unit unit){
        super.attack(unit);
    }
    @Override
    public boolean flyable(){
        return false;
    }
    @Override
    public boolean canAttackFlyingUnits(){
        return true;
    }
        

}
