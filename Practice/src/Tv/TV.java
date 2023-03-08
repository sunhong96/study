package Tv;

public class TV{
        boolean onoff = true;
        final private String ip = "111.111.111.111";
        final static String MADECOUNTRY = "대한민국";
        String maker = "삼성";
        int channel;
        int volume;


        public TV(String maker, boolean onoff, int channel, int volume) {
            super();
            this.maker = maker;
            this.onoff = onoff;
            this.channel = channel;
            this.volume = volume;

        }

        public TV(){}


        String getIp() {
            return ip;
        }
        void setChannel(int channel){
            this.channel = channel;
        }
        int getChannel(){
            return channel;
        }
        void setOnoff(boolean onoff){
            this.onoff = false;
        }
        boolean isOnoff(){
            return onoff;
        }




        void show(){
            System.out.println("TV [madeCountry=" + MADECOUNTRY + ", maker=" + maker + ", onoff=" + onoff + ", channel=" + channel
                    + ", volume=" + volume + "]");
        }

//    @Override
//    public String toString() {
//        return "TV [madeCountry=" + MADECOUNTRY + ", maker=" + maker + ", onoff=" + onoff + ", channel=" + channel
//                + ", volume=" + volume + "]";
//    }
}