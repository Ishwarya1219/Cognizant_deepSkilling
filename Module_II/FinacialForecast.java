public class FinacialForecast {
    public static double futureVallue(double inital,double growth,int years){
        if(years==0) return inital;

        return futureVallue(inital, growth, years-1)*(1+growth);
    }
    public static void main(String[] args) {
        double inital=1000.0,growth=0.10;
        int years=5;

        double future=futureVallue(inital, growth, years);
        System.out.printf("Future value after %d years = %.2f\n",years,future);
    }
}
//TC:O(N) SC:O(N)
