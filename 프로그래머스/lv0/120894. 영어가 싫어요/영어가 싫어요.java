class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String str = "";
        String temp = "";
        int nextIndex = 0;
        while(nextIndex<numbers.length()){
            if(numbers.length()>3){
                temp = numbers.substring(nextIndex, nextIndex + 3);
            } else {
                temp = numbers.substring(nextIndex);
            }
            switch(temp){
                case "one":
                    str += 1;
                    nextIndex += 3;
                    break;
                case "two":
                    str += 2;
                    nextIndex += 3;
                    break;
                case "six":
                    str += 6;
                    nextIndex += 3;
                    break;
                default:
                    if(numbers.length()>4){
                        temp = numbers.substring(nextIndex, nextIndex + 4);
                    } else {
                        temp = numbers.substring(nextIndex);
                    }
                    switch(temp){
                        case "zero":
                            str += 0;
                            nextIndex += 4;
                            break;
                        case "four":
                            str += 4;
                            nextIndex += 4;
                            break;
                        case "five":
                            str += 5;
                            nextIndex += 4;
                            break;
                        case "nine":
                            str += 9;
                            nextIndex += 4;
                            break;
                        default:
                            if(numbers.length()>5){
                                temp = numbers.substring(nextIndex, nextIndex + 5);
                            } else {
                                temp = numbers.substring(nextIndex);
                            }
                            switch(temp){
                                case "three":
                                    str += 3;
                                    nextIndex += 5;
                                    break;
                                case "seven":
                                    str += 7;
                                    nextIndex += 5;
                                    break;
                                case "eight":
                                    str += 8;
                                    nextIndex += 5;
                                    break;  
                            }
                                
                        }
            }
        }
        answer = Long.parseLong(str);
        return answer;
    }
}