class CompareVersion{

    public int compareVersion(String version1, String version2) {
        		String[] v1;
		String[] v2;
		
		v1 = version1.split("\\.");
		if(v1.length == 0 || v1 == null){
			v1 = new String[]{version1};
		}
        
		v2 = version2.split("\\.");
		if(v2.length == 0 || v2 == null){
			v2 = new String[]{version2};
		}
        
        
        int index1 = 0;
        int index2 = 0;
        
        while(index1 < v1.length && index2 < v2.length){
            if(Integer.parseInt(v1[index1]) > Integer.parseInt(v2[index2])) return 1;
            else if(Integer.parseInt(v1[index1]) < Integer.parseInt(v2[index2])) return -1;
            else{
                index1++;
                index2++;
            }
        }
        
        while(index1 < v1.length){
        	if(Integer.parseInt(v1[index1]) != 0) return 1;
        	index1++;
        }
        while(index2 < v2.length){
        	if(Integer.parseInt(v2[index2]) != 0) return -1;
        	index2++;
        }
        
        return 0;
    }
}