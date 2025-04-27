public class CoffeeMaker extends Appliance{
    private double temperature;
    private double volume;
    private double waterLeft;
    private boolean isFiltered;
    private String mode;


    public CoffeeMaker(double inputPower,double outputPower, String parentCompany, String mode){
        super(inputPower, outputPower, parentCompany);
        this.mode = mode;
    }

    public String getMode(){
        return mode;
    }

/******************************************************************************/

    public static void main(String[] args) {
        
    }

/******************************************************************************/

    public static void operate(double inputPower,double outputPower,String parentCompany,String mode){

    }







}
