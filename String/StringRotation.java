public class StringRotation{

    public boolean rotateString(String s1, String s2){
        s11 = s1 + s1;
        return isSubstring(s11, s2);
    }
}