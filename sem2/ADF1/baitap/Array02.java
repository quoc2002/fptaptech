
public class Array02 {
    public static void main(String[] args) {
        
        //Co 2 chieu 4 dong va 6 cot
        int[][] arrayDemo = new int[4][6];//24 items of array
        System.out.println("Mang co so pt la:"+ arrayDemo.length);

        for(int row = 0;row < 4; row++){
            for(int col=0;col<6;col++){
                System.out.println("arrayDemo ["+ row +","+col+"]"+arrayDemo[row][col]);
        }
    }
    
  }
}
