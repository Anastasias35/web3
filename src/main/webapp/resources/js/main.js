const arrayx=[-4, -3.5, -3, -2.5, -2, -1.5, -1, -0.5, 0, 0.5,1 ,1.5, 2, 2.5, 3, 3.5 ,4];


function  clickOnGraph(canvas,e){
    let r=PF('radius').inputs.filter(':checked').val();
    if (r!=null){
        let x=(e.offsetX - 225) / 40;
        x=x.toFixed(1);
        let y=(225 - e.offsetY)  / 40;
        y=y.toFixed(5);
        if (y<=-3 || y>=5) return;
        drawPoint(e.offsetX,e.offsetY);
        console.log(x);
        document.getElementById("form:yCanvas").value=y;

      //  document.getElementById("form:y").val=y;
        document.getElementById("form:xCanvas").value=x;
        console.log(document.getElementById("form:yCanvas").value);
        $('.submit_canvas_button').click();
        console.log(document.getElementById("form:yCanvas").value);
        setTimeout(drawResult,100);

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




$(".submit-button").on("click",function (event){
    console.log("yes");
    event.preventDefault();
    if(validateY() && valudateR()){
        console.log("yess");
        setTimeout(drawResult, 1000);
    }
})

function  validate(event){

    console.log("yes");
    event.preventDefault();
    if(validateY() && valudateR()){
        console.log("yess");
        setTimeout(drawResult, 100);
    }
   // return  validateY() && valudateR();
}



