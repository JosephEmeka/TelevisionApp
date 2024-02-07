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


    public void increaseTelevisionVolume() {
        if (isOn) {
            if (volume >= 0 && volume < 100)
                volume += 1;
        }
            else volume = 0;
    }

    public void decreaseTelevisionVolume() {
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

    public void positiveTelevisionChannelChange() {
        if (isOn) {
            if (channel >= 0 && channel < 50) {
                channel += 1;
            }
            if (channel == 50) {channel = 0;}
        }
        else channel = 0;
    }

    public void negativeTelevisionChannelChange() {
        if (isOn){
            if (channel > 0 && channel <= 50) {channel -= 1;}
            if (channel == 0) {channel = 50;}
        }
        else channel = 0;
    }

}