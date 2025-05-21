import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> rom= new HashMap<Character,Integer>();
        rom.put('I',1);
        rom.put('V',5);
        rom.put('X',10);
        rom.put('L',50);
        rom.put('C',100);
        rom.put('D',500);
        rom.put('M',1000);
        int result=0;
        for(int i=0;i<s.length();i++)
        {
            int val=rom.get(s.charAt(i));
            if(i+1<s.length()&& val<rom.get(s.charAt(i+1)))
            {
                result=result-val;
            }
            else
            result=result+val;

        }
return result;
        
    }
}