public class Pair<T,U>{
    
    private T first;
    private U second;

    public Pair(T first, U second){
        this.first = first;
        this.second = second;
    }

    public T getFirst(){
        return first;
    }

    public U getSecond(){
        return second;
    }

    public void setFirst(T firstT){
        first = firstT;
    }

    public void setSecond(U secondD){
        second = secondD;
    }

    public static void main(String[] args) {
        Pair<Integer, Integer> intPair = new Pair<>(1, 2);
        System.out.println("The values of intPair are" + " " + intPair.getFirst() + " and " + intPair.getSecond());
        
        Pair<Double, String> mixPair = new Pair<>(1.0, "place");
        System.out.println("The position of mixPair is" + " " + mixPair.getFirst() + "st " + mixPair.getSecond());

        Pair<Pair<Integer, Integer>, Pair<Double, String>> pairPair = new Pair<>(intPair, mixPair);
        System.out.println("The values of pairPair are " + pairPair.getFirst().getFirst() + ", " + pairPair.getFirst().getSecond() + ", and " 
        + pairPair.getSecond().getFirst() + "st " + pairPair.getSecond().getSecond());


    }

}