window.onload = function(){

    let buttons = document.querySelectorAll(".btn");
    buttons.forEach((str) =>{
        str.addEventListener('mousedown',pushed);
        str.addEventListener('mouseup',released);
    })

    const eventName = [];
    document.getElementById('push').addEventListener('click', pushEvent);
    document.getElementById('pop').addEventListener('click',popElement)
    document.getElementById('display').addEventListener('click', displayElement);
    
    let add = document.getElementById('input');
    let successmessage = document.getElementById("successmessage");
    let result = document.getElementById("result");
    let resultList = document.getElementById('eventList');
    
    function pushEvent() {
        let name = add.value;
        let h3child = result.getElementsByTagName('h3');
        if(h3child !== null){
            for(child of h3child)
                child.remove();
        }
        
        resultList.innerHTML = "";
        if (name === "") {
            successmessage.innerText = "Please Enter a valid event name";
    
        } else {
            if (checkEvents(name)) {
                eventName.push(name);
                add.value = "";
                successmessage.innerText = "Added Successfully!";
            } else {
                successmessage.innerText = "Event name already Exists.Try with different name";
            }
        }
    
    
    }
    
    function checkEvents(eventname) {
        let result = true;
        for (let events of eventName) {
            if (events === eventname) {
                
                result = false;
                break;
            }
        }
    
        return result;
    }
    
    function displayElement() {
        let sortedeventName = eventName.sort();
        successmessage.innerText = "";
        let h3child = result.getElementsByTagName('h3');
        if(h3child !== null){
            for(child of h3child)
                child.remove();
        }
        if(eventName.length === 0 ){
            successmessage.innerText = "There is no valid List to display";
        }
        else{
            let childnode = document.createElement('h3');
            let textnode = document.createTextNode("The Events in the array");
            childnode.appendChild(textnode);
            result.insertBefore(childnode,result.childNodes[0]);
            let str = "";
            for (let event of sortedeventName) {
                str += "<li>" + event + "</li>";
             }
             resultList.innerHTML = str;
        }
    
    
       
    
    }
    
    let textBox = document.getElementById('input');
    textBox.addEventListener('click', () => {
        let h3child = result.getElementsByTagName('h3');
        if(h3child !== null){
            for(child of h3child)
                child.remove();
        }
        textBox.style.border = "2px solid red";
        successmessage.innerText = "";
        resultList.innerHTML = "";
        textBox.value = "";
    
    });
    textBox.addEventListener('blur', () => {
        textBox.style.border = "1px solid black";
    });

    
    function pushed(){
        this.classList.add("pushed");
    }
    function released(){
        this.classList.remove("pushed");
    }

    function popElement(){
        let h3child = result.getElementsByTagName('h3');
        if(h3child !== null){
            for(child of h3child)
                child.remove();
        }
        textBox.style.border = "2px solid red";
        successmessage.innerText = "";
        resultList.innerHTML = "";
        textBox.value = "";
        let str = eventName.pop();
        if(str == null){
            successmessage.innerHTML = "Event List is empty";
        }else{
            successmessage.innerHTML = str + " is removed successfully";
        }
    }
}
