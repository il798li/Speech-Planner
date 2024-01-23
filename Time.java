public static class Time {
    public static int time = 0;

    public static int pass (int skip) {
        time += skip;
        return time;
    }

    public static int pass () {
        pass (1);
        return time;
    }
}