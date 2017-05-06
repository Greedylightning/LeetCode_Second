class ComplexNumberMultiplication{

    public String complexNumberMultiply(String a, String b) {
       String a_real, a_complex;
        if(a.indexOf("+-") != -1){
            a_real = a.split("\\+\\-")[0];
            a_complex = "-"+a.split("\\+\\-")[1];
        }
        else if(a.indexOf("-+") != -1){
            a_real = a.split("\\+\\-")[0];
            a_complex = "-"+a.split("\\+\\-")[1];
        }
        else if(a.indexOf("+") != -1){
            a_real = a.split("\\+")[0];
            a_complex = a.split("\\+")[1];
        }
        else{
            a_real = a.split("\\-")[0];
            a_complex = "-"+a.split("\\-")[1];
        }
        
        String b_real, b_complex;
        if(b.indexOf("+-") != -1){
            b_real = b.split("\\+\\-")[0];
            b_complex = "-"+b.split("\\+\\-")[1];
        }
        else if(b.indexOf("-+") != -1){
            b_real = b.split("\\+\\-")[0];
            b_complex = "-"+b.split("\\+\\-")[1];
        }
        else if(b.indexOf("+") != -1){
            b_real = b.split("\\+")[0];
            b_complex = b.split("\\+")[1];
        }
        else{
            b_real = b.split("\\-")[0];
            b_complex = "-"+b.split("\\-")[1];
        }
        
        int real = Integer.parseInt(a_real) * Integer.parseInt(b_real);
        String one_complex = Integer.parseInt(a_real) * Integer.parseInt(b_complex.split("i")[0]) + "i";
        String two_complex = Integer.parseInt(b_real) * Integer.parseInt(a_complex.split("i")[0]) + "i";
        int complex = (-1) * Integer.parseInt(a_complex.split("i")[0]) * Integer.parseInt(b_complex.split("i")[0]);
        
        return real + complex + "+" + (Integer.parseInt(one_complex.split("i")[0]) + Integer.parseInt(two_complex.split("i")[0])) + "i";
    }
}