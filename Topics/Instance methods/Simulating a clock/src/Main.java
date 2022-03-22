class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        // implement me
        if (this.minutes == 59 && this.hours % 12 == 0) {
            this.hours = 1;
            this.minutes = 0;
        } else if (this.minutes == 59) {
            this.hours = this.hours + 1;
            this.minutes = 0;
        } else {
            this.minutes = this.minutes + 1;
        }
    }
}