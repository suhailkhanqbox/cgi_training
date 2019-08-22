var password="suhailkhan"
var input;
var count=0;
var bool=false;
while(input != password && count <=2)
{
   input= window.prompt("Enter the password:");
    if(input == password)
    {
        alert("Correct password");
    }
    count++;

    if(count>2)
    bool=true;
}
if(bool==true)
alert("Too many attempts");