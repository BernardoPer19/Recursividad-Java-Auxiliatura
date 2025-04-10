public class Etimologia {

   public String nuevaPalabra(String s, int k) {
        if (k <= 0){
            return s;
        } else{
            return nuevaPalabra(s + s, 0, "", k);
        }

    }

    private String nuevaPalabra(String s, int i, String res, int k) {
        if (i >= s.length()) {
            return nuevaPalabra(res, k - 1);
        }else{
            if(i%2==0){
                return nuevaPalabra(s, i + 1, res + s.charAt(i), k);
            }else{
                return nuevaPalabra(s, i + 1 , res , k);
            }
        }
    }


}



 

