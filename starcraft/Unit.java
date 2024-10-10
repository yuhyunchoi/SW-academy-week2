public abstract class Unit{
    protected String name; //이름
    protected int dmg; // 공격력
    protected int def; //방어력

    public Unit(String name, int dmg, int def){
        this.name = name;
        this.dmg = dmg;
        this.def = def;
    }

    public String getName(){
        return this.name;
    }
    public int getDmg(){
        return this.dmg;
    }
    public int getDef(){
        return this.def;
    }
    public void setDef(int def){
        this.def = def;
    }
    
    public void takeDamage(int damage) {
        def -= damage;
    }

    public void attack(Unit target) {
        if (target != null) {
            target.takeDamage(dmg);
        }
    }

    public abstract boolean canAttackFlyingUnits();

    public abstract boolean flyable();


}