class StudentAttendanceRecord{

    public boolean checkRecord(String s) {
        
        int count_A = 0;
        //int count_L = 0;
        
        for(char x : s.toCharArray()){
            if(x == 'A') count_A++;
        }
        if(count_A > 1) return false;
        
        for(int i = 0; i < s.length() - 2; i++){
            if(s.charAt(i) == 'L' && s.charAt(i + 1) == 'L' && s.charAt(i + 2) == 'L') return false;
        }
        
        return true;
    }
}