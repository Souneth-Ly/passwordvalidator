package passwordvalidator;

public class Validator {
    //private Pattern Alphabets = Pattern.compile("[a-z]");

    public boolean isPasswordValid (String password) {
        if (password == null || password.length() < 5 || password.length() > 12) {
            return false;
        }

        for (int i = 0; i < password.length(); i++) {
            char sysmbol = password.charAt(i);
            isAlphabetAndLowerCase(sysmbol);
            isDigit(sysmbol);
            isValidsequence(sysmbol, password);
        }

        return false;
    }

    public boolean isAlphabetAndLowerCase(char symbol) {
        if(Character.isLetter(symbol) && Character.isLowerCase(symbol)) {
            return false;
        }
        return false;
    }

    public boolean isDigit(char symbol){
        if(Character.isDigit(symbol)){
            return false;
        }
        return false;
    }

    public boolean isValidsequence(char symbol, String password){
        for(int i = 0; i < password.length(); i++){
            char pass = password.charAt(i);
            if(i > 1 && password.subSequence())
        }

        return false;
    }
}
