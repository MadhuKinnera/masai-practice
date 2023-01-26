document.querySelector("#submit").addEventListener("click",myFunc);

let arr=JSON.parse(localStorage.getItem("dsaArr")) || [];
display(arr);
function myFunc(event){
    event.preventDefault();
    let title=document.querySelector("#title").value;
    let link=document.querySelector("#link").value;
    let difficulty=document.querySelector("#difficulty").value;
    
    let obj={
        name:title,
        lin:link,
        diff:difficulty
    }
    arr.push(obj);

    localStorage.setItem("dsaArr",JSON.stringify(arr));
    document.querySelector("tbody").innerHTML="";
    display(arr);

}

    function display(arr){
       
        arr.forEach(function(ele){
        let tr=document.createElement("tr");
        let td1=document.createElement("td");
        let td2=document.createElement("td");
        let ac=document.createElement("a");
        ac.setAttribute("href",ele.lin);
        td2.append(ac);
        let td3=document.createElement("td");
        let td4=document.createElement("td");
    
        tr.append(td1,td2,td3,td4);
        document.querySelector("tbody").append(tr);
            td1.innerText=ele.name;
            ac.innerText=ele.lin;
            td3.innerText=ele.diff;
            if(ele.diff!=="Easy"){
                td4.innerText="Yes";
            }
            else {
                td4.innerText="No";
            }
           
        })
        
    }
