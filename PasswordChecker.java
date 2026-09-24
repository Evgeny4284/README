public class PasswordChecker {

    private int minLength = -1;
    private int maxRepeats = -1;

    public void setMinLength(int minLength) {
        if (minLength < 0) {
            throw new IllegalArgumentException(
                    "Минимальная длина пароля не может быть отрицательной: " + minLength);
        }
        this.minLength = minLength;
    }

    public void setMaxRepeats(int maxRepeats) {
        if (maxRepeats <= 0) {
            throw new IllegalArgumentException(
                    "Максимальное количество повторений символа подряд должно быть больше нуля: " + maxRepeats);
        }
        this.maxRepeats = maxRepeats;
    }

    public boolean verify(String password) {
        if (minLength < 0 || maxRepeats < 0) {
            throw new IllegalStateException(
                    "Перед проверкой пароля нужно задать обе настройки чекера");
        }
        if (password.length() < minLength) {
            return false;
        }
        int repeats = 1;
        for (int i = 1; i < password.length(); i++) {
            if (password.charAt(i) == password.charAt(i - 1)) {
                repeats++;
                if (repeats > maxRepeats) {
                    return false;
                }
            } else {
                repeats = 1;
            }
        }
        return true;
    }
}
