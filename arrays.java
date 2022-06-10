public class arrays{
    public class int Mayor(int n){
        int dig=0;
        int mayor=0;
        while (n>0){
            dig=n%10;
            if(dig>mayor){
                dig=mayor;
            }
            n=n/10;



        }
        return dig;
  }
}