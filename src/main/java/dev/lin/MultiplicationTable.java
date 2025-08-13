package dev.lin;

public class MultiplicationTable {

    public static String getTable(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            int result = n * i;
            sb.append(n).append(" x ").append(i).append(" = ").append(result);
            if (i < 10) sb.append("\n");
        }
        return sb.toString();
    }
}