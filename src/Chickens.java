abstract class Money{
    public abstract void compute(byte cock, byte hen, short chicken);
}
abstract class Chickens extends Money{
    public static void main(String[] args) {
        byte cock,hen;
        short chicken;
        for(cock=20; cock>=0; cock--){
            for(hen=33; hen>=0; hen--){
                for(chicken=300; chicken>=0; chicken-=3){
                    if((cock*5+hen*3+chicken/3)==100 && (cock+hen+chicken)==100){
                        System.out.println("You can buy a hundred chickens like this"+" ("+cock+" "+"Roosters)"+" ("+hen+" "+"Hens)"+" ("+chicken+" "+"Chickens)");
                        break;
                    }
                }
            }
        }
    }
}
