import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> tokens = new ArrayList<>();
        while (sc.hasNext())
            tokens.add(sc.next());
        int idx = 0;
        List<String> out = new ArrayList<>();
        while (idx < tokens.size()) {
            String tok = tokens.get(idx++);
            int choice;
            try {
                choice = Integer.parseInt(tok);
            } catch (Exception e) {
                break;
            }
            if (choice == 1) {
                if (idx >= tokens.size())
                    break;
                String cardNumber = tokens.get(idx++);
                int expIdx = -1;
                for (int j = idx; j < tokens.size(); j++) {
                    if (tokens.get(j).contains("/")) {
                        expIdx = j;
                        break;
                    }
                }
                if (expIdx == -1)
                    expIdx = tokens.size() - 1;
                String expirationDate = tokens.get(expIdx);
                StringBuilder sb = new StringBuilder();
                for (int j = idx; j < expIdx; j++) {
                    if (sb.length() > 0)
                        sb.append(" ");
                    sb.append(tokens.get(j));
                }
                String cardHolder = sb.toString();
                idx = expIdx + 1;
                out.add("Credit Card");
                out.add(cardHolder);
                out.add(cardNumber);
                out.add(expirationDate);
                out.add("Success");
            } else if (choice == 2) {
                if (idx >= tokens.size())
                    break;
                String email = tokens.get(idx++);
                String transactionId = idx < tokens.size() ? tokens.get(idx++) : "";
                out.add("PayPal");
                out.add(email);
                out.add(transactionId);
                out.add("Success");
            } else
                break;
        }
        for (int i = 0; i < out.size(); i++) {
            if (i > 0)
                System.out.print("\n");
            System.out.print(out.get(i));
        }
    }
}