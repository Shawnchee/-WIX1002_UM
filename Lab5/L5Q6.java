/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package l5;

/**
 *
 * @author aykay
 */
import java.util.Scanner ;
public class L5Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        int rows = scanner.nextInt();

        int [][] matrix = new int[rows][rows];

        for(int x = 0; x<matrix.length; x++){
            for(int y = 0; y<matrix[x].length; y++)
                matrix[x][y] = 0;
        }

        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<=i; j++){
                if(j == 0 || j == i){
                    matrix[i][j] = 1;
                }
                else{
                    matrix[i][j] = matrix[i-1][j-1] + matrix[i-1][j];
                }
            }
        }

        System.out.println("The pascal Triangle with " + rows + " row(s)");
        for(int i = 0 ; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++)
                System.out.printf("%-5d", matrix[i][j]);

            System.out.println();
        }

    }
}
    
