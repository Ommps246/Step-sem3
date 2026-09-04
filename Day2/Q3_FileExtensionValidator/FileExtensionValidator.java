public class FileExtensionValidator {

    static final String[] ACCEPTED = {"pdf", "docx", "zip"};

    public static String validateFileExtension(String filename) {
        int dotIndex = filename.lastIndexOf('.');
        if (dotIndex == -1 || dotIndex == filename.length() - 1) {
            return "Rejected — invalid file type";
        }

        String extension = filename.substring(dotIndex + 1);

        for (int i = 0; i < ACCEPTED.length; i++) {
            if (extension.equalsIgnoreCase(ACCEPTED[i])) {
                return "Accepted";
            }
        }

        return "Rejected — invalid file type";
    }

    public static void main(String[] args) {
        System.out.println("\"Assignment1.PDF\" -> " + validateFileExtension("Assignment1.PDF"));
        System.out.println("\"notes.txt\" -> " + validateFileExtension("notes.txt"));
    }
}
