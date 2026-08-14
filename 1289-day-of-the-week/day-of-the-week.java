class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
       
        int[] monthCodes = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        
      
        int yearLastTwo = year % 100;
        int century = year / 100;
        
       
        int centuryCode = (3 - (century % 4)) * 2;
        
        
        int sum = day;
        sum += monthCodes[month - 1];
        sum += yearLastTwo;
        sum += yearLastTwo / 4;  
        sum += centuryCode;
        
       
        if ((month == 1 || month == 2) && isLeapYear(year)) {
            sum -= 1;
        }
       
        int finalDayIdx = (sum % 7 + 7) % 7; 
        
        return days[finalDayIdx];
    }
    
    
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
