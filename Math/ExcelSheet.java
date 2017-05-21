class ExcelSheetColumnNumber{

    public int titleToNumber(String s) {
        char[] temp = s.toCharArray();
        int result = 0;
        for(int i = 0; i < temp.length; i++){
            result = result * 26 + (temp[i] - 'A' + 1);
        }
        return result;
    }
}