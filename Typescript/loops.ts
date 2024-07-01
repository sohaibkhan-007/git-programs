// for (let i = 0; i < 5; i++) {
//     console.log(i);
// }

// var num = [100, 200, 300, 400, 500];
// num.forEach(function (value) { console.log(value) });

// let i = 0;
// while (i < 5) {
//     console.log(i + " while");
//     i++;
// }

// do{
//     i++;
//     console.log("sohiab");
// }while( i!=5)


for (var i = 1; i < 5; i++) {
    console.log(i + "outer loop");

    for (var j = 1; 1 < 5; j++) {
        console.log(j + "inner loop");
        if (j == 2) {
            break;
        }
    }
}