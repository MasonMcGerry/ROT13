// ROT 13, replace ROT 13 cipher with unciphered
// change this to decipher anything, with GUI drop down selectiona and input box

public class ROT13 {

    // ROT13 algo
    public StringBuilder rot13Decipher(String input){
        StringBuilder output = new StringBuilder();
        int n = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if      (c >= 'a' && c <= 'm') c += 13;
            else if (c >= 'A' && c <= 'M') c += 13;
            else if (c >= 'n' && c <= 'z') c -= 13;
            else if (c >= 'N' && c <= 'Z') c -= 13;
            else if (c >= 'N' && c <= 'Z') c -= 13;
            else c = c;

            // concatenate
            output.append(c);  
        }
        return output;
   }

}

/*
SOURCES:
https://stackoverflow.com/questions/21997130/how-to-use-keylistener-with-jframe
 
 */