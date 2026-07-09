package string;

public class _0459_RepeatedSubstringPattern {

    public boolean repeatedSubstringPattern(String s) {

        String doubled = s + s;

        return doubled.substring(1, doubled.length() - 1).contains(s);
    }
}