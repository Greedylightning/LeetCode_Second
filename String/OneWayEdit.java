public class OneWayEdit{

    public boolean check(String s1, String s2){
        if(s1.length() == s2.length()) return replace(s1, s2);
        else if(s1.length == s2.length() - 1) return edit(s1, s2);
        else if(s1.length == s2.length() + 1) return edit(s2, s1);
        else return false;
    }

    public boolean replace(String s1, String s2){
        boolean flag = false;
        int index1 = 0;
        while(index1 < s1.length() && index2 < s2.length()){
            if(s1.charAt(index1) != s2.charAt(index1) && flag) return false;
            if(s1.charAt(index1) != s2.charAt(index1)) flag = true;
            index1++;
        }
        return true;
    }

    public boolean edit(String s1, String s2){
        int index1 = index2 = 0;
        while(index1 < s1.length() && index2 < s2.length()){
            if(s1.charAt(index1) != s2.charAt(index1)){
                if(index1 != index2) return false;
                index2++;
            }
            else{
                index1++;
                index2++;
            }
        }
        return true;
}