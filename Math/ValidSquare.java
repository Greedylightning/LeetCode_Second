class ValidSquare{

    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int diff12 = (p1[0] - p2[0]) * (p1[0] - p2[0]) + (p1[1] - p2[1]) * (p1[1] - p2[1]);
        int diff13 = (p1[0] - p3[0]) * (p1[0] - p3[0]) + (p1[1] - p3[1]) * (p1[1] - p3[1]);
        int diff14 = (p1[0] - p4[0]) * (p1[0] - p4[0]) + (p1[1] - p4[1]) * (p1[1] - p4[1]);
        int diff42 = (p4[0] - p2[0]) * (p4[0] - p2[0]) + (p4[1] - p2[1]) * (p4[1] - p2[1]);
        int diff43 = (p4[0] - p3[0]) * (p4[0] - p3[0]) + (p4[1] - p3[1]) * (p4[1] - p3[1]);
        int diff23 = (p2[0] - p3[0]) * (p2[0] - p3[0]) + (p2[1] - p3[1]) * (p2[1] - p3[1]);

        Set<Integer> set = new HashSet();
        if(diff12 == 0 || diff13 == 0 || diff14 == 0 || diff42 == 0 || diff23 == 0 || diff43 == 0) return false;
        set.add(diff12);
        set.add(diff13);
        set.add(diff14);
        set.add(diff23);
        set.add(diff42);
        set.add(diff43);

        return set.size() == 2;
    }
}