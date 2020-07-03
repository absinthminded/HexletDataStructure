

public class Loops {


    static int findIndex(final int[] m, final int target) {

        int result = 0;
        int DEFAULT_RESULT = -1;

        if (m == null) {
            System.out.println("null");
            result = DEFAULT_RESULT;
        } else if (m.length == 0){
            System.out.println("0");
            result = DEFAULT_RESULT;
        }else
            for (int i = 0; i < m.length; i++) {
                if (m[i] == target) {
                    result = i;
                    break;

                } else if (m[i] != target ){
                    result = DEFAULT_RESULT;
                }
            }

        System.out.println(result);
        return result;

    }


    static void replaceElement(final int[] m, final int a, final int b){

        for (int i = 0; i < m.length; i++){

                if (m[i] == a) {
                    m[i] = b;
                }
            }

        }

    static int[][] triangleArray(final int limit) {
        int[][] mass = new int[limit + 1][];

        if (limit < 2) {
            return null;
        }

        for (int i = 0; i < mass.length; i++)
            mass[i] = new int[i];

        for (int i = 0; i < mass.length; i++)
            for (int j = 0; j < mass[i].length; j++)
            {
                mass[0] = null;
                mass[i][j] = i;
            }
        return mass;
        // END
        //
        }
    

       


    






}





 