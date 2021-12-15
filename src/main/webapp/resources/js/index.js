const interval = 9000
function clock(){
    let date=new Date();
    let second = date.getSeconds();
    let minute = date.getMinutes();
    let hour = date.getHours();
    if (hour<10){
        hour="0" + hour;
    }
    if(minute<10){
        minute="0" + minute;
    }
    if (second<10) {
        second="0" + second;
    }

    document.getElementById("time").innerHTML =  hour + ":" + minute + ":" + second ;

}
clock();
window.setInterval(clock,interval);