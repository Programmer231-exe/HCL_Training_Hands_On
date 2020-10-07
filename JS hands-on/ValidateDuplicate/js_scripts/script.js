window.onload = function(){
    const eventName = [];
    document.getElementById("add").addEventListener("click", addEvent);
    document.getElementById('display').addEventListener("click", displayElement);
    
    let add = document.getElementById("eventName");
    let successmessage = document.getElementById("successmessage");
    let result = document.getElementById("result");
    let resultTable = document.getElementById("result-table");
    
    function addEvent() {
        let name = add.value;
        resultTable.innerHTML = "";
        if (name === "") {
            successmessage.innerText = "Please Enter a valid event name";
    
        } else {
            if (checkEvents(name)) {
                eventName.push(name);
                add.value = "";
                successmessage.innerText = "Event name added Successfully!";
            } else {
                successmessage.innerText = "Event name already Exists.Try with different name";
            }
        }
    
    
    }
    
    function checkEvents(eventname) {
        let result = true;
        for (let events of eventName) {
            if (events === eventname) {
                console.log("present");
                result = false;
                break;
            }
        }
    
        return result;
    }
    
    function displayElement() {
        successmessage.innerText = "";
        if(eventName.length === 0 ){
            console.log('list is null');
            resultTable.innerHTML = "<tr><td>There is no valid event list to display</td></tr>";
        }
        else{
            let str = "<tr><th>Event Names</th></tr>";
            for (let event of eventName) {
                str += "<tr><td>" + event + "</td></tr>";
             }
             resultTable.innerHTML = str;
        }
    
    
       
    
    }
    
    let textBox = document.getElementById("eventName");
    textBox.addEventListener('click', () => {
        textBox.style.border = "2px solid red";
        successmessage.innerText = "";
        resultTable.innerHTML = "";
        textBox.value = "";
    
    });
    textBox.addEventListener('blur', () => {
        textBox.style.border = "1px solid black";
    })
    
}
