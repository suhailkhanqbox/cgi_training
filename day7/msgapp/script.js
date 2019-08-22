var message= document.getElementById("message");
var input= document.getElementById("input");
var button = document.getElementById("button");

button.addEventListener("click", function(){

    var newmsg= document.createElement("li");
    newmsg.innerHTML=input.value;
    message.appendChild(newmsg);
    input.value="";
});