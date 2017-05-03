class CountSegment{

    public int countSegments(String s) {
        s = s.trim();
        if(s == null || s.length() == 0) return 0;
        String[] temp = s.split("\\s+");
        return temp.length;
    }
}