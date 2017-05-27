class PermutationWithoutDups{

    ArrayList<String> getPerms(String str){
        ArrayList<String> result = new ArrayList<String>();
        getPerms("", str, result);
        return result;
    }

    void getPerms(String prefix, String reminder, ArrayList<String> result){
        if(reminder.length() == 0) result.add(prefix);
        for(int i = 0; i < reminder.length(); i++){
            String before = reminder.substring(0, i);
            String after = reminder.substring(i + 1, reminder.length());
            char c = reminder.charAt(i);
            getPerms(prefix + c, before + after, result);
        }
    }
    
}