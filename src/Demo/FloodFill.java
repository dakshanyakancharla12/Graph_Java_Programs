package Demo;

import java.util.*;

public class FloodFill {
	static void dfs(
			int[][] image,
			int row,
			int col,
			int oldColor,
			int newColor) {
		
		if (row < 0 ||
			row >= image.length ||
			col < 0 ||
			col >= image[0].length) {
			
			return;
		}
		
		if (image[row][col] != oldColor) {
			return;
		}
		
		image[row][col] = newColor;
		
		dfs(image, row + 1, col, oldColor, newColor);
		dfs(image, row - 1, col, oldColor, newColor);
		dfs(image, row, col + 1, oldColor, newColor);
		dfs(image, row, col - 1, oldColor, newColor);
	}
	
	static int[][] floodFill(
			int[][] image,
			int sr,
			int sc,
			int color) {
		
		int oldColor = image[sr][sc];
		
		if (oldColor == color) {
			return image;
		}
		
		dfs(
				image,
				sr,
				sc,
				oldColor,
				color);
		return image;
	}
	
	public static void main(String[] args) {
		int[][] image = {
				{1, 1, 1},
				{1, 1, 0},
				{1, 0, 1}
		};
		floodFill(image, 1, 1, 2); 
		
		for (int[] row : image){
			System.out.println(Arrays.toString(row));
		}
	}
}