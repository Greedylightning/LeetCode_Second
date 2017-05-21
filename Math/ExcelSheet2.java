class ExcelSheet2{

    String[] temp = new String[]{"Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
        "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
    };
    public String convertToTitle(int n) {
        StringBuffer s = new StringBuffer();
        while(n > 26){
            int tail = n % 26;
            s.append(temp[tail]);
            if(tail == 0) n = (n - 26) / 26;
            else n = (n - tail) / 26;
        }
        s.append(temp[n]);
        return s.reverse().toString();
    }
}