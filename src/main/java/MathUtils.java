public class MathUtils {
    public static int additionner(int a, int b){
        return a+b;
    }

    public static int additionner(int [] tab){
        var sum=0;
        for (int i = 0; i < tab.length; i++) {
            sum=sum+tab[i];
        }
        return sum;
    }

    public static int multiplier(int a, int b){
        return a*b;
    }

    public static int soustraire(int a, int b){
        return a-b;
    }

}
