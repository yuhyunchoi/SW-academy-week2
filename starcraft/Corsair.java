public class Corsair extends Unit implements Attackable, Flyable {
    
    public Corsair(String name, int dmg, int def){
        super(name, dmg, def);
    }
    @Override
    public void attack(Unit unit){
        super.attack(unit);
    }

    @Override
    public boolean flyable(){
        return true;
    }
    @Override
    public boolean canAttackFlyingUnits(){
        return true;
    }

}
