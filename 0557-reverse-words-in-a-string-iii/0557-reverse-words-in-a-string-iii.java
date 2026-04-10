class Solution {
    public String reverseWords(String s) {
        String[] words=s.split("\\s+");
        StringBuilder result=new StringBuilder();
        for(int i=0;i<words.length;i++){
            StringBuilder reverseword=new StringBuilder(words[i]);
            reverseword.reverse();
            result.append(reverseword);
            if(i!=words.length-1)
            result.append(" ");
        }
        return result.toString();
  }
}