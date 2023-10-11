let args=process.argv;
//input 
// console.log(args);

//for taking input in console line write node file_name.js and then pass the input

// let i=args[2];
// console.log(i);

let i=args[2];
console.log(i);
console.log(typeof i );//console or command always //take the value in string form
i=i+30;
console.log(i);


let j=parseInt(args[2],10);
//parseInt for to convert string to number
console.log(j);
console.log(typeof j );
j=j+30;
console.log(j);
