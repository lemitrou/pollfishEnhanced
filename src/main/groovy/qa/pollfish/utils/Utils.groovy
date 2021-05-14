package qa.pollfish.utils

class Utils {

    static String generateId(boolean shortFormat = true) {
        String nanoTime = System.nanoTime().toString()
        return !shortFormat ? nanoTime : nanoTime.substring(nanoTime.length() - 8)
    }
}
