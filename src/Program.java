import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {
    //Program info
    private static final String PROGRAM_NAME = "Dungeon Crawler";
    private static final String VERSION_NOTATION = "V";
    private static final double VERSION = 0.1;

    //Timestamp related
    private static final String TIMESTAMP_FORMAT = "yyyy-MM-dd HH:mm:ss:S";
    private static final String GENERIC_SEPARATOR = " ";
    private static final String TIMESTAMP_INPUT_SEPARATOR = GENERIC_SEPARATOR + ":" + GENERIC_SEPARATOR;

    public static String getName(){
        return PROGRAM_NAME;
    }
    public static double getVersion(){
        return VERSION;
    }
    public static String getVersionName(){
        return VERSION_NOTATION + getVersion();
    }
    public static String getFullName(){
        return getName() + GENERIC_SEPARATOR + getVersionName();
    }

    static class out{
        private static void defaultPrint(PrintType pt, String input){
            System.out.print(getCurrentTimeStamp() + TIMESTAMP_INPUT_SEPARATOR + pt.name() + GENERIC_SEPARATOR + input);
        }

        public static void print(PrintType pt, String input){
            switch (pt){
                case DEBUG:
                    defaultPrint(pt,input); break;
                case INFO:
                    defaultPrint(pt,input); break;
                case GRAPHIC:
                    defaultPrint(pt,input); break;
            }
        }

        public static void println(PrintType pt, String input){
            print(pt,input + "\n");
        }

        private static String getCurrentTimeStamp() {
            return new SimpleDateFormat(TIMESTAMP_FORMAT).format(new Date());
        }
    }
}
