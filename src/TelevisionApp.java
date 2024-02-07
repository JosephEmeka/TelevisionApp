public class TelevisionApp {
    private boolean isOn;
    private int volume;
    private int channel;

    public TelevisionApp() {
        this.isOn = false;
        this.channel = 0;
        this.volume = 0;
    }


    public boolean checkIfTelevisionIsOn() {
        return isOn;
    }

    public void turnPowerOn() {
        this.isOn = true;
    }

    public void turnPowerOff() {
        this.isOn = false;
    }


    public void increaseTelevisonVolume() {
        if (isOn) {
            if (volume >= 0 && volume < 100)
                volume += 1;
        }
            else volume = 0;
    }

    public void decreaseTelevisonVolume() {
        if (isOn){
            if (volume > 0 && volume <= 100) volume -= 1;
        }
        else volume = 0;
    }

        public int getVolume() {
            return volume;
        }

        public void setVolume(int volume){
            this.volume = volume;
        }

        public int getChannel() {
            return channel;
        }

        public void setChannel(int channel){
            this.channel = channel;
        }


}