package textadventure;

public class Parser {

    private static final String[] commands = {"USE", "TAKE", "GO", "MOVE", "SAY", "DROP", "INV", "ON", "WITH", "EXAMINE", "LOOK"},
            items = {"KNIFE", "MATCHES", "MOUSE", "KEYCARD", "CHEESE", "JAR", "AXE", "JDK", "LETTER", "CABLES", "LANTERN", "NORTH", "EAST", "SOUTH", "WEST"},
            targets = {"DAEMON", "TERMINAL", "LANTERN", "JAR", "SELF", "MOUSE"};

    private static String getCommand(String s) {
        s = s.split(" ")[0];
        for (String cmd : commands) {
            if (cmd.equalsIgnoreCase(s)) {
                return cmd;
            }
        }
        return "ERROR:" + s;
    }

    private static String getItem(String s) {
        if (s.split(" ").length > 1) {
            s = s.split(" ")[1];
        }
        for (String i : items) {
            if (s.equalsIgnoreCase(i)) {
                return s;
            }
        }
        return "ERROR:" + s;
    }

    private static String getTarget(String s) {
        boolean onMod = s.toUpperCase().contains(" ON ");
        boolean withMod = s.toUpperCase().contains(" WITH ");
        if (!(onMod || withMod)) {
            return "";
        }
        
        if (s.toUpperCase().split(" ON ").length > 1) {
            s = s.toUpperCase().split(" ")[3];
        }
        for (String t : (onMod) ? targets : (withMod) ? items : new String[0]) {
            if (t.equalsIgnoreCase(s)) {
                return t;
            }
        }
        return "ERROR:" + s;
    }

    public static String[] parse(String s) {
        s = s.trim();
        String cmd = getCommand(s);
        String item = getItem(s);
        String target = getTarget(s);
        if (cmd.startsWith("ERROR")) {
            return new String[]{"ERROR:I don't understand " + cmd.split(":")[1]};
        } else if (item.startsWith("ERROR")) {
            return new String[]{"ERROR:I don't see a(n) " + item.split(":")[1]};
        } else if (target.startsWith("ERROR")) {
            return new String[]{"ERROR:I don't see a(n) " + target.split(":")[1] + " to use " + item + " on."};
        } else {
            String[] parsed = new String[2];
            parsed[0] = cmd;
            parsed[1] = item;
            if (!target.equals("")) {
                String[] temp = parsed;
                parsed = new String[3];
                System.arraycopy(temp, 0, parsed, 0, temp.length);
                parsed[2] = target;
            }
            return parsed;
        }
    }
}
