public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s) {
        int answer = 0;
        String vowels = "aeiou";
        for (int i = 0; i < s.length(); i++) {
            if (vowels.indexOf(s.substring(i, i + 1)) != -1) {
                answer++;
            }

        }
        return answer;
    }
    //Code you problem number two here
    static int problemTwo(String s){
        int answer = 0;
        String bob = "bob";

        if(i = s.length - 2){
        break;}
        
        for(int i = 0; i < s.length(); i++){
            if(bob.contains(s.substring(i, i + 3)){
               answer++;
            }
               
               }

        return answer;
    }
    //Code your solution to problem number 3 here
    static String problemThree(String s){
        //your code here
        return s;
    }
    public static void main(String[] args) {
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */
        String s = "bobjdigid";
        problemTwo(s);
    }
}
