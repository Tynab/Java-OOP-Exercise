package yan_lib;

import java.text.*;
import java.util.*;

import static java.lang.Character.*;
import static java.lang.Double.*;
import static java.lang.Integer.*;
import static java.lang.String.*;
import static java.lang.System.*;

import static yan_lib.YANConstant.*;

public class YANMethod {
    // Fields
    private static final Scanner _scan = new Scanner(in);

    // Parse int advanced
    public static int ParseIntAdv(Character c) {
        return parseInt(valueOf(c));
    }

    // Try parse int
    public static boolean TryParseInt(Character c) {
        var is_success = true;
        try {
            parseInt(valueOf(c));
        } catch (Exception e) {
            is_success = false;
        }
        return is_success;
    }

    // Try parse int
    public static boolean TryParseInt(String s) {
        var is_success = true;
        try {
            parseInt(s);
        } catch (Exception e) {
            is_success = false;
        }
        return is_success;
    }

    // Scan int
    public static int ScanInt() {
        var n = 0;
        var s = _scan.nextLine();
        if (TryParseInt(s)) {
            n = parseInt(s);
        } else {
            PrintAdv(RED, "Dữ liệu bạn nhập không phải số nguyên, xin nhập lại: ", RESET);
            n = ScanInt();
        }
        return n;
    }

    // Number limit int
    public static int NumLimit(int min, int max) {
        var n = ScanInt();
        if (n < min || n > max) {
            PrintAdv(RED, "Không xác định, xin nhập lại: ", RESET);
            n = NumLimit(min, max);
        }
        return n;
    }

    // Number limit int
    public static int NumLimitEx(int min, int max) {
        var n = ScanInt();
        if (n <= min || n >= max) {
            PrintAdv(RED, "Không xác định, xin nhập lại: ", RESET);
            n = NumLimit(min, max);
        }
        return n;
    }

    // Parse double advanced
    public static double ParseDubAdv(Character c) {
        return parseDouble(valueOf(c));
    }

    // Try parse double
    public static boolean TryParseDub(Character c) {
        var is_success = true;
        try {
            parseDouble(valueOf(c));
        } catch (Exception e) {
            is_success = false;
        }
        return is_success;
    }

    // Try parse double
    public static boolean TryParseDub(String s) {
        var is_success = true;
        try {
            parseDouble(s);
        } catch (Exception e) {
            is_success = false;
        }
        return is_success;
    }

    // Scan double
    public static double ScanDub() {
        var n = 0d;
        var s = _scan.nextLine();
        if (TryParseDub(s)) {
            n = parseDouble(s);
        } else {
            PrintAdv(RED, "Dữ liện bạn nhập không phải số, xin nhập lại: ", RESET);
            n = ScanDub();
        }
        return n;
    }

    // Number limit double
    public static double NumLimit(double min, double max) {
        var n = ScanDub();
        if (n < min || n > max) {
            PrintAdv(RED, "Không xác định, xin nhập lại: ", RESET);
            n = NumLimit(min, max);
        }
        return n;
    }

    // Number limit double
    public static double NumLimitEx(double min, double max) {
        var n = ScanDub();
        if (n <= min || n >= max) {
            PrintAdv(RED, "Không xác định, xin nhập lại: ", RESET);
            n = NumLimit(min, max);
        }
        return n;
    }

    // Double to perfect number
    public static String WritePerfectDub(double n) {
        return n == (int) n ? String.valueOf((int) n) : String.valueOf(n);
    }

    // Try parse date exact
    public static boolean TryParseDateExact(String strDate, String strFormat) {
        var is_success = true;
        try {
            var dateFormat = new SimpleDateFormat(strFormat);
            dateFormat.setLenient(false);
            dateFormat.parse(strDate);
        } catch (Exception e) {
            is_success = false;
        }
        return is_success;
    }

    // Parse date exact
    public static Date ParseDateExact(String strDate, String strFormat) {
        var dateFormat = new SimpleDateFormat(strFormat);
        dateFormat.setLenient(false);
        try {
            return dateFormat.parse(strDate);
        } catch (ParseException e) {
            return new Date();
        }
    }

    // Scan date
    public static Date ScanDate(String strFormat) {
        var date = new Date();
        var s = _scan.nextLine();
        if (TryParseDateExact(s, strFormat)) {
            date = ParseDateExact(s, strFormat);
        } else {
            PrintAdv(RED, "Dữ liệu bạn nhập không đúng định dạng ngày, xin nhập lại: ", RESET);
            date = ScanDate(strFormat);
        }
        return date;
    }

    // Date to string dd/mm/yyyy
    public static String DateToString(Date date) {
        return new SimpleDateFormat("dd/MM/yyyy").format(date);
    }

    // Print advanced
    public static void PrintAdv(String s) {
        for (var i = 1; i <= (WIDTH - s.length()) / 2; i++) {
            out.print(" ");
        }
        out.print(s);
    }

    // Print advanced color
    public static void PrintAdv(String cl, String s) {
        for (var i = 1; i <= (WIDTH - s.length()) / 2; i++) {
            out.print(" ");
        }
        out.print(cl + s);
    }

    // Print advanced multi color
    public static void PrintAdv(String cl, String s, String cl_follow) {
        for (var i = 1; i <= (WIDTH - s.length()) / 2; i++) {
            out.print(" ");
        }
        out.print(cl + s + cl_follow);
    }

    // Print line advanced
    public static void PrintlnAdv(String s) {
        for (var i = 1; i <= (WIDTH - s.length()) / 2; i++) {
            out.print(" ");
        }
        out.println(s);
    }

    // Print line advanced color
    public static void PrintlnAdv(String cl, String s) {
        for (var i = 1; i <= (WIDTH - s.length()) / 2; i++) {
            out.print(" ");
        }
        out.println(cl + s);
    }

    // Print line advanced multi color
    public static void PrintlnAdv(String cl, String s, String cl_follow) {
        for (var i = 1; i <= (WIDTH - s.length()) / 2; i++) {
            out.print(" ");
        }
        out.println(cl + s + cl_follow);
    }

    // Check whitespace
    public static boolean IsWhitespace(String s) {
        var is_success = true;
        for (var i = 0; i < s.length(); i++) {
            if (!isWhitespace(s.charAt(i))) {
                is_success = false;
                break;
            }
        }
        return is_success;
    }

    // Check null or empty
    public static boolean IsNullOrEmpty(String s) {
        return s == null || s.length() == 0;
    }

    // Check null or whitespace
    public static boolean IsNullOrWhitespace(String s) {
        return IsNullOrEmpty(s) || IsWhitespace(s);
    }

    // Covert to title case
    public static String ToTitleCase(String s) {
        List<Character> list = new ArrayList<>();
        var str = "";
        if (!IsNullOrWhitespace(s)) {
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
    public static String ToLowerCaseAdv(String s) {
        return IsNullOrWhitespace(s) ? s : s.toLowerCase();
    }

    // Convert to upper case advanced
    public static String ToUpperCaseAdv(String s) {
        return IsNullOrWhitespace(s) ? s : s.toUpperCase();
    }

    // Convert to title case advanced
    public static String ToTitleCaseAdv(String s) {
        return IsNullOrWhitespace(s) ? s : ToTitleCase(s.toLowerCase());
    }

    // Credit
    public static int Credit() {
        PrintlnAdv(PURPLE, "Bạn có muốn tiếp tục?");
        PrintlnAdv("1. Có   ");
        PrintlnAdv("2. Không");
        PrintAdv("Chọn 1 trong các phương án trên: ");
        out.print(RESET);
        return NumLimit(1, 2);
    }
}
