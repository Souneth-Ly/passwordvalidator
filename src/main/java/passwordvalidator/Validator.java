package passwordvalidator;

public class Validator {
    private boolean foundAlphabet = false;
    private boolean foundDigit = false;

    public boolean isPasswordValid (String password) {
        // Rule #1: Must be non-null, between 5 and 12 characters in length.
       if ( !isLengthValid(password) ) {
           return false;
       }

        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            // Rule #2: Must consist of a mixture of lowercase letters and numerical digits only, with at least one of each.
            if (!(isAlphabetAndLowerCase(symbol) || isDigit(symbol))) {
                return false;
            }
            // Rule #3:  Must not contain any sequence of characters immediately followed by the same sequence.
            if (!isValidsequence(password, i)) {
                return false;
            }
        }

        // check if both alphabet and digit were found
        return foundAlphabet && foundDigit;
    }

    private boolean isLengthValid(String password) {
        return !(password == null || password.length() < 5 || password.length() > 12);
    }

    private boolean isAlphabetAndLowerCase(char symbol) {
        if(Character.isLetter(symbol) && Character.isLowerCase(symbol)) {
            // an alphabet was found
            foundAlphabet = true;
            return foundAlphabet;
        }
        return false;
    }

    private boolean isDigit(char symbol){
        if(Character.isDigit(symbol)) {
            // a digit was found
            foundDigit = true;
            return foundDigit;
        }
        return false;
    }

    private boolean isValidsequence(String password, int index) {
        if(index > 0 && password.charAt(index - 1) == password.charAt(index) ) {
            return false;
        }
        //consecutive pair
        if(index > 2 && password.subSequence(index-1, index+1).equals(password.subSequence(index-3, index-1))) {
            return false;
        }
        //consecutive triplets
        if(index > 4 && password.subSequence(index-2, index+1).equals(password.subSequence(index-5, index-2))){
            return false;
        }
        //consecutive quadruplets
        if(index > 6 && password.subSequence(index-3, index+1).equals(password.subSequence(index-7, index-3))){
            return false;
        }
        //consecutive quintuplets
        if(index > 8 && password.subSequence(index-4, index+1).equals(password.subSequence(index-9, index-4))){
            return false;
        }
        //consecutive sextuplets
        if(index > 10 && password.subSequence(index-5, index+1).equals(password.subSequence(index-11, index-5))){
            return false;
        }

        return true;
    }
}
