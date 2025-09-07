import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> lines = new ArrayList<>();
        String ln;
        while ((ln = br.readLine()) != null) {
            if (!ln.trim().isEmpty())
                lines.add(ln);
        }
        if (lines.size() == 0) {
            System.out.println("Invalid input");
            return;
        }
        String first = lines.get(0).trim();
        String[] firstTokens = first.split("\\s+");
        int n;
        try {
            n = Integer.parseInt(firstTokens[0]);
        } catch (Exception e) {
            System.out.println("Invalid input");
            return;
        }
        if (n < 1 || n > 10) {
            System.out.println("Invalid input");
            return;
        }
        if (lines.size() < 1 + n + 1) {
            System.out.println("Invalid input");
            return;
        }

        class Emp {
            String name;
            int id;

            Emp(String a, int b) {
                name = a;
                id = b;
            }
        }
        List<Emp> emps = new ArrayList<>();
        int lineIdx = 1;
        for (int i = 0; i < n; i++, lineIdx++) {
            String line = lines.get(lineIdx).trim();
            String[] tok = line.split("\\s+");
            int idPos = -1;
            for (int j = 0; j < tok.length; j++) {
                try {
                    Integer.parseInt(tok[j]);
                    idPos = j;
                    break;
                } catch (Exception ignored) {
                }
            }
            if (idPos == -1 || idPos == 0 || idPos != tok.length - 1) {
                System.out.println("Invalid input");
                return;
            }
            String name = String.join(" ", Arrays.copyOfRange(tok, 0, idPos));
            int id;
            try {
                id = Integer.parseInt(tok[idPos]);
            } catch (Exception e) {
                System.out.println("Invalid input");
                return;
            }
            if (id < 0) {
                System.out.println("Invalid input");
                return;
            }
            emps.add(new Emp(name, id));
        }

        String mgrLine = lines.get(lineIdx++).trim();
        String[] mt = mgrLine.split("\\s+");
        int midPos = -1;
        for (int j = 0; j < mt.length; j++) {
            try {
                Integer.parseInt(mt[j]);
                midPos = j;
                break;
            } catch (Exception ignored) {
            }
        }
        if (midPos == -1 || midPos == 0 || midPos == mt.length - 1) {
            System.out.println("Invalid input");
            return;
        }
        String mgrName = String.join(" ", Arrays.copyOfRange(mt, 0, midPos));
        int mgrId;
        try {
            mgrId = Integer.parseInt(mt[midPos]);
        } catch (Exception e) {
            System.out.println("Invalid input");
            return;
        }
        if (mgrId < 0) {
            System.out.println("Invalid input");
            return;
        }
        String department = String.join(" ", Arrays.copyOfRange(mt, midPos + 1, mt.length));

        for (Emp e : emps) {
            System.out.println("Name: " + e.name);
            System.out.println("ID: " + e.id);
        }
        System.out.println("Name: " + mgrName);
        System.out.println("ID: " + mgrId);
        System.out.println("Department: " + department);
    }
}