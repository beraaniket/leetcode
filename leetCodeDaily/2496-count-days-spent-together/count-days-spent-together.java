class Solution {

    private int findDayOfYear(String day, int[] comeMonthDays) {
        int month = Integer.parseInt(day.substring(0, 2));
        int date  = Integer.parseInt(day.substring(3));
        return comeMonthDays[month - 1] + date;
    }

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int[] comeMonthDays = new int[13];
        comeMonthDays[1] = 31;
        for (int i = 1; i <= 12; i++) {
            comeMonthDays[i] = comeMonthDays[i - 1] + monthDays[i - 1];
        }

        int arriveAliceDay = findDayOfYear(arriveAlice, comeMonthDays);
        int leaveAliceDay  = findDayOfYear(leaveAlice, comeMonthDays);
        int arriveBobDay   = findDayOfYear(arriveBob, comeMonthDays);
        int leaveBobDay    = findDayOfYear(leaveBob, comeMonthDays);

        int overlapDays = Math.min(leaveAliceDay, leaveBobDay) - Math.max(arriveAliceDay, arriveBobDay) + 1;

        return Math.max(overlapDays, 0);
    }
}