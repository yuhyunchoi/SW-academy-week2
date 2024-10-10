public class Scout extends Unit implements Attackable,Flyable {
    
    public Scout(String name, int dmg, int def){
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
