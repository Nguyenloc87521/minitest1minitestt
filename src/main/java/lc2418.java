package PACKAGE_NAME;public class lc2418 {
    public String[] sortPeople(String[] names, int[] heights) {
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < heights.length-i-1; j++) {
                int target = 0;
                if(heights[j] > heights [j+1]){
                    target = heights[i];
                    heights[j]=heights [j+1];
                    heights [j+1]=target;
                    String swap =names[j];
                    names[j]=names[j+1];
                    names[j+1]=swap;
                }

            }

        }
        return names;
    }
}
