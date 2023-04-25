/**
 * @param {string} s
 * @return {number}
 */
var romanToInt = function(s) {
    const arr = s.split('');

    let sum = 0;

    for(let i = 0; i < arr.length; i++){
        switch (arr[i]){
            case 'I':
                if(arr[i+1] === 'V' || arr[i+1] === 'X') {
                    sum -= 1;
                } else {
                    sum += 1;
                }
                break;
            case 'V':
                sum += 5;
                break;
            case 'X':
                if(arr[i+1] === 'L' || arr[i+1] === 'C') {
                    sum -= 10;
                } else {
                    sum += 10;
                }
                break;
            case 'L':
                sum += 50;
                break;
            case 'C':
                if(arr[i+1] === 'D' || arr[i+1] === 'M') {
                    sum -= 100;
                } else {
                    sum += 100;
                }
                break;
            case 'D':
                sum += 500;
                break;
            case 'M':
                sum += 1000;
                break;
        }

    }
    return sum;
};
