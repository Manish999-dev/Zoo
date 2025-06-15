public class Dolphin extends Animal implements Swim{
    private String Color;
    private int swimmingSpeed;
    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }


    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }


    @Override
    public void eatingCompleted() {
        System.out.println("Dolphin: I am eating delicious fish");
    }

    @Override
    public void swimming() {
        System.out.println("Dolphin: I am swimming at the speed of "+swimmingSpeed+" nautical miles per hour");
    }
}
