package Day6;

import java.util.Arrays;

public class ReverseViaREcurssion {
    public static void reverse(String[] orgs, int start, int end) {
        if (start < end) {
            String third = orgs[start];
            orgs[start] = orgs[end];
            orgs[end] = third;
            reverse(orgs, start + 1, end - 1);
        } else
            return;
    }

    public static void main(String[] args) {
        String[] campus = { "TCS", "INFOSYS", "IBM", "ZOHO", "LTI" };
        reverse(campus, 0, campus.length - 1);
        System.out.println(Arrays.toString(campus));
    }
}
