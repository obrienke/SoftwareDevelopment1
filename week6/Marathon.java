public class Marathon {
    public static void main(String[] args) {
        //A marathon is 26.2 miles (more precisely 26 miles 385 yards) or 42.195 kilometres.
        String event = "marathon";
        float distMilesDec = 26.2f;
        int distMiles = 26;
        int yards = 385;
        float kms = 42.195f;

        System.out.println("A " + event + " is " + distMilesDec + " miles (more precisely " + distMiles + " miles " +
                            yards + " yards) or " + kms + " kilometres.");

    }
}
