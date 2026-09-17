class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> remaining = new ArrayList<>();

        for (int i = 0; i < arr2.length; i++) {

            for (int j = 0; j < arr1.length; j++) {

                if (arr2[i] == arr1[j]) {
                    list.add(arr1[j]);
                }
            }
        }

        for (int i = 0; i < arr1.length; i++) {

            if (!list.contains(arr1[i])) {
                remaining.add(arr1[i]);
            }
        }

        Collections.sort(remaining);

        list.addAll(remaining);

        int[] res = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        return res;
    }
}