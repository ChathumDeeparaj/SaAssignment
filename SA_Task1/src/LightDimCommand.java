public class LightDimCommand implements Command{
    private Light light;
    private int previousLevel;
    private int newBrightness;
    public LightDimCommand(Light light,int newBrightness){
        this.light = light;
        this.newBrightness = newBrightness;
    }
    @Override
    public void execute() {
        previousLevel = light.getBrightnessLevel();
        light.dim(newBrightness);
    }

    @Override
    public void undo() {
        light.dim(previousLevel);

    }
}
