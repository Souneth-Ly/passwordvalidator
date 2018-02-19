package passwordvalidator;

public class Validator {
    public boolean isPasswordValid (String password) {
        // Rule #1: Must be non-null, between 5 and 12 characters in length.
        boolean isValid = isLengthValid(password);

        // Rule #2:
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            isValid = isAlphabetAndLowerCase(symbol) && isDigit(symbol) && isValidsequence(password, i);
            if (!isValid) {
                break;
            }
        }

        return isValid;
    }

    private boolean isLengthValid(String password) {
        return !(password == null || password.length() < 5 || password.length() > 12);
    }

    private boolean isAlphabetAndLowerCase(char symbol) {
        if(Character.isLetter(symbol) && Character.isLowerCase(symbol)) {
            return true;
        }
        return false;
    }

    private boolean isDigit(char symbol){
        if(Character.isDigit(symbol)){
            return true;
        }
        return false;
    }

    private boolean isValidsequence(String password, int index) {
        if(index > 0 && password.charAt(index - 1) == password.charAt(index) ) {
            return false;
        }

        if(index > 2 && password.subSequence(index-1, index+1).equals(password.subSequence(index-3, index-1))) {
            return false;
        }

        return true;
    }
}
