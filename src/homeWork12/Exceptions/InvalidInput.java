package homeWork12.Exceptions;

public class InvalidInput extends Throwable {
    private String abc;
    private int numbers;
    private static final String MISSING_SEQUENCE = "Missing Sequence %d";
    private static final String MISSING_SEQUENCE_NUMBERS = "Missing Sequence Numbers %d";

    private InvalidInput(String message) {
        super();
    }

    public static InvalidInput createMessage(String abc) {
        return new InvalidInput(String.format(MISSING_SEQUENCE, abc));
    }

    public static InvalidInput createNumbers(int numbers) {
        return new InvalidInput(String.format(MISSING_SEQUENCE_NUMBERS, numbers));
    }
}
