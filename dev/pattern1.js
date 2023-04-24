//pattern
let clargs=process.argv;
let n=parseInt(clargs[2]);
for(let i=1;i<=n;i++){
    let line="";
    for(let j=2;j<=i;j++){
        line=line+"*\t";
    }
    console.log(line);
}