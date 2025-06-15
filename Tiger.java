public class Tiger extends Animal implements Walk{
    private int numberOfStripes;
    private int speed;
    private int soundLevelOfRoar;

    //Getter Method
    public int getNumberOfStripes(){
        return numberOfStripes;
    }

    //Setter Method
    public void setNumberOfStripes(int numberOfStripes){

    }

    //Getter Method
    public int getSpeed() {
        return speed;
    }

    //Setter Method
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    //Getter Method
    public int getSoundLevelOfRoar() {
        return soundLevelOfRoar;
    }

    //Setter Method
    public void setSoundLevelOfRoar(int soundLevelOfRoar) {
        this.soundLevelOfRoar = soundLevelOfRoar;
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Tiger: I have eaten meat");

    }

    @Override
    public void walking() {
        System.out.println("I am walking at the speed "+speed+" mph");
    }
}
