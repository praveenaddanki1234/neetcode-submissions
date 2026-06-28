class Solution {

    public String encode(List<String> strs) {
        String delimiter = "\u001F"; // ASCII Unit Separator
       if (strs == null || strs.isEmpty()) {
            return "";
        }
        

// Encodes to: "Apple\u001FBanana\u001FCherry"
String encodedString = "A"+String.join(delimiter, strs);
return encodedString;
    }

    public List<String> decode(String str) {
        if(str.length()==0 ||str.isEmpty()){
            return new ArrayList<>();
        }
        String delimiter = "\u001F";
         String cleanStr = str.substring(1);
        String[] decodedArray = cleanStr.split(delimiter, -1);
List<String> decodedList = Arrays.asList(decodedArray);
return decodedList;

    }
}
