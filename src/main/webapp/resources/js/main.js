const arrayx=[-4, -3.5, -3, -2.5, -2, -1.5, -1, -0.5, 0, 0.5,1 ,1.5, 2, 2.5, 3, 3.5 ,4];


function  clickOnGraph(canvas,e){
    let r=PF('radius').inputs.filter(':checked').val();
    if (r!=null){
        let x=(e.offsetX - 225) / 40;
        x=x.toFixed(1);
        let y=(225 - e.offsetY)  / 40;
        y=y.toFixed(5);
        drawPoint(e.offsetX,e.offsetY);
        console.log(x);
        document.getElementById("form:yCanvas").value=y;
        document.getElementById("form:y").value=y;
        document.getElementById("form:xCanvas").value=x;

        $('.submit-button').click();

       // console.log(document.getElementById("form:xCanvas").val());
        //$("#submit").click();
        //подумать над отправкой координаты с графика
        //прошлые точки добавлять без ожидания введения радиуса
    }
    else{
        alert("Выберите значение радиуса");
    }

}


function clickOn(){
    clear();
    drawCanvas(PF('radius').inputs.filter(':checked').val());
    drawResult();
}



function validateY(){
    let coordy=document.getElementById("form:y").value
    coordy=coordy.replaceAll(',','.');
    if(coordy.trim()===""){
        alert("Введите значение координаты Y");
        return false;
    }
    else if (isNaN(coordy)){
        alert("Координата Y должна быть числом");
        return false;
    }
    else if(Math.ceil(coordy.substr(0,5)) <= -3 || Math.floor(coordy.substr(0,5))>= 5) {
        alert("координата Y должна быть в диапозоне:(-3;5)");
        return false;
    }
    return true;
}


function valudateR(){
    let radius=PF('radius').inputs.filter(':checked').val();
    if(radius==null){
        alert("Выберите значение R");
        return false;
    }

    return true;
}





function  validate(){
    return  validateY() && valudateR();
}



