package com.oshovskii.practice.leetcode.easy.lesson49;

public class Solution {
//     In this We will traverse the whole grid and select the box which has value = 1 , then
//     we will assign that box as val = 4 and we will go in all 4 directions and
//     check if there is a neighbour with 1 in any of the box then i.e. they have a common wall between them so we will decrement that and add total to the ans value
    public int islandPerimeter(int[][] grid) {
        int ans = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    int val = 4;
                    if(i - 1 >= 0 && grid[i - 1][j] == 1){ // top
                        val--;
                    } if(j + 1 < grid[0].length && grid[i][j + 1] == 1){ // right
                        val--;
                    } if(i + 1 < grid.length && grid[i + 1][j] == 1){ // down
                        val--;
                    } if(j - 1 >= 0 && grid[i][j - 1] == 1){ // left
                        val--;
                    }
                    ans += val;
                }
            }
        }
        return ans;
    }
}
