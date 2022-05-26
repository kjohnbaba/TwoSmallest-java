/*************************************************************************
 *  The program TwoSmallest takes a set of double command-line
 *  arguments and prints the smallest and second-smallest number, in that
 *  order. It is possible for the smallest and second-smallest numbers to
 *  be the same (if the sequence contains duplicate numbers).
 *
 *  Note: display one number per line
 *
 *  % java TwoSmallest 17.0 23.0 5.0 1.1 6.9 0.3
 *  0.3
 *  1.1

 *************************************************************************/

public class TwoSmallest {

    public static void main(String[] args) {
    
    double[] numbers = new double[args.length];
 
    for(int i = 0; i<args.length;  i++){
        numbers[i] =  Double.parseDouble(args[i]) ;     

    }

    double smallest = 0 ;
    double small =0;

    if (numbers[0]<numbers[1]){
        smallest = numbers[0] ;
        small = numbers[1];
    }
    else{
        smallest = numbers[1] ;
        small = numbers[0];
    }

    for(int i = 2; i<numbers.length;  i++){
        if(numbers[i] < smallest){
            small = smallest;
            smallest = numbers[i];                 
        } else if (numbers[i] < small)
        {
            small = numbers[i];
            
        }     
    }

    System.out.println(smallest);
    System.out.println(small);
    }

}
