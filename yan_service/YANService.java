package yan_service;

import java.text.*;
import java.util.*;

import static java.lang.Character.*;
import static java.lang.Double.*;
import static java.lang.Integer.*;
import static java.lang.String.valueOf;
import static java.lang.System.*;
import static yan_service.YANConstant.*;

public class YANService {
    // Fields
    private static final Scanner mScan = new Scanner(in);

    // Parse int advanced
    public static int parseIntAdv(Character c) {
        return parseInt(valueOf(c));
    }

    // Try parse int
    public static boolean tryParseInt(Character c) {
        var isSuccess = true;
        try {
            parseInt(valueOf(c));
        } catch (Exception e) {
            isSuccess = false;
        }
        return isSuccess;
    }

    // Try parse int
    public static boolean tryParseInt(String s) {
        var isSuccess = true;
        try {
            parseInt(s);
        } catch (Exception e) {
            isSuccess = false;
        }
        return isSuccess;
    }

    // Scan int
    public static int scanInt() {
        var n = 0;
        var s = mScan.nextLine();
        if (tryParseInt(s)) {
            n = parseInt(s);
        } else {
            printAdv(RED, "Dữ liệu bạn nhập không phải số nguyên, xin nhập lại: ", RESET);
            n = scanInt();
        }
        return n;
    }

    // Number limit int
    public static int numLimit(int min, int max) {
        var n = scanInt();
        if (n < min || n > max) {
            printAdv(RED, "Không xác định, xin nhập lại: ", RESET);
            n = numLimit(min, max);
        }
        return n;
    }

    // Number limit int
    public static int numLimitEx(int min, int max) {
        var n = scanInt();
        if (n <= min || n >= max) {
            printAdv(RED, "Không xác định, xin nhập lại: ", RESET);
            n = numLimit(min, max);
        }
        return n;
    }

    // Parse double advanced
    public static double parseDubAdv(Character c) {
        return parseDouble(valueOf(c));
    }

    // Try parse double
    public static boolean tryParseDub(Character c) {
        var isSuccess = true;
        try {
            parseDouble(valueOf(c));
        } catch (Exception e) {
            isSuccess = false;
        }
        return isSuccess;
    }

    // Try parse double
    public static boolean tryParseDub(String s) {
        var isSuccess = true;
        try {
            parseDouble(s);
        } catch (Exception e) {
            isSuccess = false;
        }
        return isSuccess;
    }

    // Scan double
    public static double scanDub() {
        var n = 0d;
        var s = mScan.nextLine();
        if (tryParseDub(s)) {
            n = parseDouble(s);
        } else {
            printAdv(RED, "Dữ liện bạn nhập không phải số, xin nhập lại: ", RESET);
            n = scanDub();
        }
        return n;
    }

    // Number limit double
    public static double numLimit(double min, double max) {
        var n = scanDub();
        if (n < min || n > max) {
            printAdv(RED, "Không xác định, xin nhập lại: ", RESET);
            n = numLimit(min, max);
        }
        return n;
    }

    // Number limit double
    public static double numLimitEx(double min, double max) {
        var n = scanDub();
        if (n <= min || n >= max) {
            printAdv(RED, "Không xác định, xin nhập lại: ", RESET);
            n = numLimit(min, max);
        }
        return n;
    }

    // Double to perfect number
    public static String writePerfectDub(double n) {
        return n == (int) n ? String.valueOf((int) n) : String.valueOf(n);
    }

    // Try parse date exact
    public static boolean tryParseDateExact(String strDate, String strFormat) {
        var isSuccess = true;
        try {
            var dateFormat = new SimpleDateFormat(strFormat);
            dateFormat.setLenient(false);
            dateFormat.parse(strDate);
        } catch (Exception e) {
            isSuccess = false;
        }
        return isSuccess;
    }

    // Parse date exact
    public static Date parseDateExact(String strDate, String strFormat) {
        var dateFormat = new SimpleDateFormat(strFormat);
        dateFormat.setLenient(false);
        try {
            return dateFormat.parse(strDate);
        } catch (ParseException e) {
            return new Date();
        }
    }

    // Scan date
    public static Date scanDate(String strFormat) {
        var date = new Date();
        var s = mScan.nextLine();
        if (tryParseDateExact(s, strFormat)) {
            date = parseDateExact(s, strFormat);
        } else {
            printAdv(RED, "Dữ liệu bạn nhập không đúng định dạng ngày, xin nhập lại: ", RESET);
            date = scanDate(strFormat);
        }
        return date;
    }

    // Date to string dd/mm/yyyy
    public static String dateToString(Date date) {
        return new SimpleDateFormat("dd/MM/yyyy").format(date);
    }

    // Print advanced
    public static void printAdv(String s) {
        for (var i = 1; i <= (WIDTH - s.length()) / 2; i++) {
            out.print(" ");
        }
        out.print(s);
    }

    // Print advanced color
    public static void printAdv(String color, String s) {
        for (var i = 1; i <= (WIDTH - s.length()) / 2; i++) {
            out.print(" ");
        }
        out.print(color + s);
    }

    // Print advanced multi color
    public static void printAdv(String colorStart, String s, String colorEnd) {
        for (var i = 1; i <= (WIDTH - s.length()) / 2; i++) {
            out.print(" ");
        }
        out.print(colorStart + s + colorEnd);
    }

    // Print line advanced
    public static void printlnAdv(String s) {
        for (var i = 1; i <= (WIDTH - s.length()) / 2; i++) {
            out.print(" ");
        }
        out.println(s);
    }

    // Print line advanced color
    public static void printlnAdv(String color, String s) {
        for (var i = 1; i <= (WIDTH - s.length()) / 2; i++) {
            out.print(" ");
        }
        out.println(color + s);
    }

    // Print line advanced multi color
    public static void printlnAdv(String colorStart, String s, String colorEnd) {
        for (var i = 1; i <= (WIDTH - s.length()) / 2; i++) {
            out.print(" ");
        }
        out.println(colorStart + s + colorEnd);
    }

    // Check whitespace
    public static boolean isSpace(String s) {
        var isSuccess = true;
        for (var i = 0; i < s.length(); i++) {
            if (!isWhitespace(s.charAt(i))) {
                isSuccess = false;
                break;
            }
        }
        return isSuccess;
    }

    // Check null or empty
    public static boolean isNullOrEmpty(String s) {
        return s == null || s.length() == 0;
    }

    // Check null or whitespace
    public static boolean isNullOrWhitespace(String s) {
        return isNullOrEmpty(s) || isSpace(s);
    }

    // Covert to title case
    public static String toTitleCase(String s) {
        var list = new ArrayList<Character>();
        var str = "";
        if (!isNullOrWhitespace(s)) {
            var cst = s.charAt(0);
            cst = isWhitespace(cst) ? cst : toUpperCase(cst);
            list.add(cst);
            for (var i = 0; i < s.length() - 1; i++) {
                var c = s.charAt(i + 1);
                if (isWhitespace(s.charAt(i)) && !isWhitespace(c)) {
                    list.add(toUpperCase(c));
                } else {
                    list.add(c);
                }
            }
            for (var item : list) {
                str += item;
            }
        }
        return str;
    }

    // Convert to lower case advanced
    public static String toLowerCaseAdv(String s) {
        return isNullOrWhitespace(s) ? s : s.toLowerCase();
    }

    // Convert to upper case advanced
    public static String toUpperCaseAdv(String s) {
        return isNullOrWhitespace(s) ? s : s.toUpperCase();
    }

    // Convert to title case advanced
    public static String toTitleCaseAdv(String s) {
        return isNullOrWhitespace(s) ? s : toTitleCase(s.toLowerCase());
    }

    // Credit
    public static int credit() {
        printlnAdv(PURPLE, "Bạn có muốn tiếp tục?");
        printlnAdv("1. Có   ");
        printlnAdv("2. Không");
        printAdv("Chọn 1 trong các phương án trên: ");
        out.print(RESET);
        return numLimit(1, 2);
    }
}
