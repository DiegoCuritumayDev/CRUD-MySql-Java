var state= false;
function toggle(){
    if(state){
        document.getElementById("password")
        .setAttribute("type","password");
        document.getElementById("eye").style.color='#fff';
        state=false;
    } else {
        document.getElementById("password").setAttribute("type","text");
        document.getElementById("eye").style.color='#03e9f4';
        state=true;
    }
}