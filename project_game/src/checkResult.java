public class checkResult {

    public boolean checkResult(char [] arrayChar) {
        for (int i = 0; i < arrayChar.length; i++) {
            if (arrayChar[i] == '_') {
                return false;
            }

        }
        return true;
    }
}
