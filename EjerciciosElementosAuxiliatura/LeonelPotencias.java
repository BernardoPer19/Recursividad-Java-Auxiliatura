
public class LeonelPotencias{
    public String generarNotacion(int k){

        String res = "2";

        if(k == 1){
            res = "2";
        }else if(k == 0){
            res = "1";
        }else {
            if(k % 2  == 0){
                res  =  "(" + generarNotacion(k / 2) + ")^2"; 
            }else 
                res = "(2"  +"*" + generarNotacion(k-1)+ ")" ;
        }
        return res;
    }

}
