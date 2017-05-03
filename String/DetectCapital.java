class DetectCapital{

    public boolean detectCapitalUse(String word) {
        return word.toUpperCase().equals(word) || word.toLowerCase().equals(word) || (word.length() > 1 && word.substring(1).toLowerCase().equals(word.substring(1)) && (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z'));
    }
}