public class KitchenRoomLight implements Light{
    private int brightnessLevel;

    public int getBrightnessLevel(){
        return brightnessLevel;
    }

    @Override
    public void on() {
        brightnessLevel = 100;
        System.out.println("Kitchen Room light is ON at full brightness level");

    }

    @Override
    public void off() {
        brightnessLevel = 0;
        System.out.println("Kitchen Room light is OFF");
    }

    @Override
    public void dim(int level) {
        brightnessLevel = 100;
        System.out.println("Kitchen Room light is dimmed to " + level + "%");
    }

}
