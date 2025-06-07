/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.umg.sudoku;

/**
 *
 * @author Oscar
 */
public class Sudoku {

     public static boolean ValidSudoku(char[][] board) {
        
        for (int i = 0; i < 9; i++) {
            boolean[] row = new boolean[9];
            boolean[] col = new boolean[9];
            boolean[] box = new boolean[9];
            
            for (int j = 0; j < 9; j++) {
                // Valida fila
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1';
                    if (row[num]) return false;
                    row[num] = true;
                }

                // Valida columna
                if (board[j][i] != '.') {
                    int num = board[j][i] - '1';
                    if (col[num]) return false;
                    col[num] = true;
                }

                // Valida subcuadro 3x3
                int rowIndex = 3 * (i / 3);
                int colIndex = 3 * (i % 3);
                int x = rowIndex + j / 3;
                int y = colIndex + j % 3;

                if (board[x][y] != '.') {
                    int num = board[x][y] - '1';
                    if (box[num]) return false;
                    box[num] = true;
                }
            }
        }
        return true;
    }
}
