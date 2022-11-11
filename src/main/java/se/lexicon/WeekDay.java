package se.lexicon;


public enum WeekDay {

    MONDAY(8),
    TUESDAY(7),
    WEDNESDAY(8),
    THURSDAY(7),
    FRIDAY(8),
    SATURDAY(0) {
        public void printInfo() {
            System.out.println("Closed");
        } //Each enum value can also have methods.
    },
    SUNDAY(0) {
        public void printInfo() {
            System.out.println("Closed");
        }
    };

    private int startingHour;


    WeekDay(int StartinhHour) {

        this.startingHour = StartinhHour;
    }


    public void printInfo() {
        System.out.println("Opening hours:\t" + startingHour + " - " + (startingHour + 8));
    }
}





