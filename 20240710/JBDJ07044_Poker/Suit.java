
public enum Suit {
    SPADE("\u2660"),
    DIAMOND("\u25C6"),
    HEART("\u2665"),
    CLUB("\u2663");

    private String simbol;

    Suit(String simbol){
        this.simbol = simbol;
    }

    @Override
    public String toString(){
        return this.simbol;
    }
}
