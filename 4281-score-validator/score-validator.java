class Solution {
    public int[] scoreValidator(String[] events) {
        int score = 0;
        int counter = 0;
        for(String a : events){
            if(counter == 10){
                break;
            }
           else if(a.equals("1")){
                score += 1;
            }
           else  if(a.equals("2")){
                score += 2;
            }
            else if(a.equals("3")){
                score += 3;
            }
           else  if(a.equals("4")){
                score += 4;
            }
           else  if(a.equals("5")){
                score += 5;
            }
            else if(a.equals("6")){
                score += 6;
            }
           else if(a.equals("W"))  {
            counter += 1;
           }
           else if(a.equals("WD")){
            score += 1;
           }
           else if(a.equals("NB")){
            score += 1;
           }
        }
        int[] arr =new int[2];
        arr[0] = score;
        arr[1] = counter;
        return arr;
    }
}