class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        Arrays.sort(strs);
        char[] pehla = strs[0].toCharArray();
        char[] akhri = strs[strs.length-1].toCharArray();
        for(int i=0;i<pehla.length;i++){
            if(pehla[i] != akhri[i]){
                break;
            }
            else{
                result.append(pehla[i]);
            }
            
        }
        return result.toString();
                
    }
}