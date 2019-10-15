public class TrafficLight {

    private int id;
    private int numberOfLights;
    private int currentColor;
    private String colorLight;

    //    constructor zonder variabelen
    public TrafficLight() {
        id = 0;
        numberOfLights = 3;
        currentColor = 1;
    }

    //    constructor met variabelen
    public TrafficLight(int id, int numberOfLights) {
        this.id = id;
        this.numberOfLights = numberOfLights;
    }

    //    vertelt welke kleur het is
    public String showColor(int light) {

        String result;
        switch (light) {
            case 1:
                System.out.println("Red");
                result = "Red";
                break;
            case 2:
                System.out.println("Orange");
                result = "Orange";
                break;
            case 3:
                System.out.println("Green");
                result = "Green";
                break;
            default:
                System.out.println("Red");
                result = "red";
                break;
        }
        return result;
    }

    //    vertelt wat de id is
    public int showId() {
       return id;
    }

    //    vertelt wat de kleur en de id is
    public void showColorAndId(int light) {
        String result;
        result = showColor(light);

        System.out.println("My color is "
                + result
                + " and my id is: "
                + showId()
        );
    }

    //    vertelt of het een positief getal is
    public boolean isPositiveNumber(int number) {
        return number >= 0;
    }

    //    vertelt wat de currentColor
    public int getCurrentColor() {
        return currentColor;
    }

    //    past de currentColor aan
    public void setCurrentColor(int defaultColor) {
        this.currentColor = defaultColor;
    }

    //    vertelt wat de numberOfLights is
    public int getNumberOfLights() {
        return numberOfLights;
    }

    //    past de numberOfLights aan
    public void setNumberOfLights(int numberOfLights) {
        this.numberOfLights = numberOfLights;
    }

    public String getColorLight() {
        return colorLight;
    }

    public void setColorLight(String colorLight) {
        this.colorLight = colorLight;
    }
}
