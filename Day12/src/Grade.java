class Grade extends Student {
    private int score;

    public Grade(String fname, String lname, int phone, int score) {
        super(fname, lname, phone);
        this.score = score;
    }

    public char calculate() {
        char result = 'O';
        if (score < 40) {
            result = 'D';
        } else if (score >= 40 && score < 60) {
            result = 'B';

        } else if (score >= 60 && score < 75) {
            result = 'A';

        } else if (score >= 75 && score < 90) {
            result = 'E';
        }
        return result;
    }
}