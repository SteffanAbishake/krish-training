
//declaring array
var a = [21,25,29,28,22,24,27,26,30];

a.sort(); //sorting the array


var view= [];

//creating  the for  loop a checking with the arraylenth
    for(var i = 1; i < a.length; i++) 
    {     
      //comparing the 2 arrays if not equals to 1 then code will run according to the condition
        if(a[i] - a[i-1] != 1)  

        { 
          // declaring variable x and assigning value for x and j=1 
            var x = a[i] - a[i-1];
            var j = 1;

            //condition to check the x and y
            if (j<x)
            {
              //if the checked value is missed ush the value
                view.push(a[i-1]+j);
                j++;
            }else if(j==x)
            {
              j++;

            }
        }
    }
console.log(view) 