import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Play{
    private static final Random random = new Random();
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        //사용자 종족 선택
        boolean validChoice = false;
        String userRace = null;
        do{
            try{
                
                System.out.print("종족 선택(1: 테란, 2: 프로토스, 3: 저그)>> ");
                String userChoiceStr = sc.nextLine();
                int userChoiceInt = Integer.parseInt(userChoiceStr);

                userRace = getRace(userChoiceInt);
                validChoice = true;
            }
            catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }while(!validChoice);
        System.out.println("사용지의 종족 : " + userRace);

        //컴퓨터 종족 선택
        int computerChoice = random.nextInt(3) + 1;
        String  computerRace = getRace(computerChoice);

        System.out.println("컴퓨터의 종족 : " + computerRace);

        List<Unit> userUnits = createUnits(userRace);
        List<Unit> computerUnits = createUnits(computerRace);

        //게임 시작

        while(!userUnits.isEmpty() && !computerUnits.isEmpty()){
            System.out.println("사용자의 유닛");
            printUnits(userUnits);
            System.out.println("컴퓨터의 유닛");
            printUnits(computerUnits);

            boolean validAttack = false;

            //사용자 공격
            if(!validAttack){
                System.out.print("공격을 수행할 아군 유닛과 공격할 적군 유닛을 선택 >> ");
                int userUnitIndex = sc.nextInt();
                int computerUnitIndex = sc.nextInt();

                if(isValidIndex(userUnitIndex, userUnits.size()) && isValidIndex(computerUnitIndex, computerUnits.size())){
                    Unit attacker = userUnits.get(userUnitIndex);
                    Unit target = computerUnits.get(computerUnitIndex);

                    if( !target.flyable() || attacker.canAttackFlyingUnits()){
                        attacker.attack(target);
                        validAttack = true;
                        if(target.getDef() <= 0){
                            System.out.println(target.getName() + "이 파괴되었습니다! ");
                            computerUnits.remove(computerUnitIndex);
                        }
                    }else{
                        System.out.println(attacker.getName() + "은(는) 나는 유닛을 공격할 수 없습니다.");
                    }
                    System.out.println("사용자의 " + attacker.getName() + "이(가) " + "컴퓨터의 "+ target.getName() + "을(를) 공격했습니다.");
                }else{
                    System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                }
            }
                //컴퓨터 공격
                if(!computerUnits.isEmpty()){
                int computerAttackerIndex = random.nextInt(computerUnits.size());
                int userTargetIndex = random.nextInt(userUnits.size());

                Unit attacker = computerUnits.get(computerAttackerIndex);
                Unit target = userUnits.get(userTargetIndex);

                if(!target.flyable() || attacker.canAttackFlyingUnits()){
                    attacker.attack(target);
                    if(target.getDef() <= 0 ){
                        System.out.println(target.getName() + "이(가) 파괴되었습니다. ");
                        userUnits.remove(userTargetIndex);
                    }
                }
                System.out.println("컴퓨터의 " + attacker.getName() + "이(가) " + "사용자의 " + target.getName() + "을(를) 공격했습니다.");
            }

            
            if(userUnits.isEmpty()){
                System.out.println("컴퓨터 승리!");
            }else if(computerUnits.isEmpty()){
                System.out.println("사용자 승리!");
            }
            else{
                continue;
            }
        }

        sc.close();
    }


    public static String getRace(int choice){
        switch(choice){
            case 1:
                return "Terran";
            case 2:
                return "Protos";
            case 3:
                return "Zerg";
            default:
                throw new IllegalArgumentException("잘못된 입력입니다. 다시 입력하세요");
        }
    }
    public static List<Unit> createUnits(String race){
        List<Unit> units = new ArrayList<>();
        switch(race){
            case "Terran":
                for(int i = 0 ; i < 5 ; i++){
                    units.add(createTerranUnits());
                }
                break;
            case "Protos":
                for(int i = 0 ; i < 4  ; i++){
                    units.add(createProtosUnits());
                }
                break;
            case "Zerg":
                for(int i = 0 ; i < 8 ; i++){
                    units.add(createZergUnits());
                }
                break;
        }
        return units;
    }

    private static Unit createTerranUnits(){
        switch(random.nextInt(6)){
            case 0:
                return new Marine("Marine", 3,10);
            case 1:
                return new Tank("Tank", 7,15);
            case 2:
                return new Goliath("Goliath" ,5,15);
            case 3:
                return new Wraith("Wraith",3,10);
            case 4:
                return new Valkyrie("Valkyrie", 4,12);
            case 5:
                return new BattleCruzer("Battler Cruzer", 25, 30);
            default:
                throw new IllegalStateException("Unexpected value");
        }
    }

    private static Unit createProtosUnits(){
        switch(random.nextInt(6)){
            case 0:
            return new Zealot("Zealot" , 5, 20);
        case 1:
            return new Dragoon("Dragoon", 3,15);
        case 2:
            return new HighTempler("High Templer", 10,2);
        case 3:
            return new Scout("Scout", 5,10);
        case 4:
            return new Corsair("Corsair", 4, 12);
        case 5:
            return new Carrier("Carrier" , 25,40);
        default:
            throw new IllegalStateException("Unexpected value");
        }
    }

    private static Unit createZergUnits(){ 
        switch(random.nextInt(6)){
        case 0:
            return new Zergling("Zergling", 2, 2);
        case 1:
            return new Hydralisk("Hydralisk", 3, 7);
        case 2:
            return new Ultralisk("Ultralisk", 5, 15);
        case 3:
            return new Mutalisk("Mutalisk", 2, 8);
        case 4:
            return new Guardian("Guardian", 3,6);
        case 5:
            return new Queen("Queen", 15,25);
        default:
            throw new IllegalArgumentException("Unexptected value");
        }
    }

    public static void printUnits(List<Unit> units){
        int i = 0;
        for(Unit unit : units){
            System.out.println(i + ". " + unit.getName() + "(현재 방어력 : " + unit.getDef() + ")");
            i++;
        }
    }
    private static boolean isValidIndex(int index, int size) {
        return index >= 0 && index < size;
    }

}