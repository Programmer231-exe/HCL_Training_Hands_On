window.onload = function () {
    const products = [];
    let btn = document.getElementById('add');
    btn.addEventListener('click', addPrice);
    let eventId = document.getElementById('eventId');
    let eventName = document.getElementById('eventName');
    let price = document.getElementById('price');
    let result = document.getElementById('result');
    let total = document.getElementById('total');
    let errormessage = document.getElementById('error-message');

    function product(id, name, price) {
        this.id = id;
        this.name = name;
        this.price = price;
        return this;
    }

    function addPrice() {
        errormessage.innerHTML = "";
        console.log(parseInt(eventId.value));
        let item;
        console.log(new product(23, 'siva', 52525));
        console.log(new product(23, 'siva', 52525));
        if (!isNaN(parseInt(eventId.value)) && typeof eventName.value === 'string' && !isNaN(parseInt(price.value))) {
            console.log(product);
            item = new product(parseInt(eventId.value), eventName.value, parseInt(price.value));
            products.push(item);
            eventId.value = '';
            eventName.value = '';
            price.value = '';
            console.log(products);
        } else {
            console.log(false);
            errormessage.innerHTML = '<p>Enter the details in valid format. Event Id - number, Event name - string ,price-amount -number</p>';
            
        }


        addProductToCart();

    }

    function addProductToCart() {
        let str;
        let quantity;
        let link;
        if (products !== null) {

            str = '<table class = "result-table"><thead><th>ID</th><th>Product Name</th><th>Price</th><th>Quantity</th><th>Remove From Cart</th></thead><tbody>';
            let index = 0;
            for (item of products) {
                str += '<tr><td>' + item.id + '</td><td>' + item.name + '</td><td>' + item.price + '</td><td id = "select' + index + '"></td><td id = "link' + index + '">';
                index++;
            }
            str += '</tbody></table>';
            result.innerHTML = str;


            for (let i = 0; i < products.length; i++) {
                quantity = document.createElement('input');
                quantity.setAttribute('type', 'number');
                quantity.setAttribute('min', '1');
                quantity.setAttribute('max', '10');
                quantity.setAttribute('value','1');
                console.log(quantity);
                link = document.createElement('a');
                
                link.setAttribute('href', '#');
                link.innerText = 'remove';
                console.log("*******");
                console.log(i);
                console.log(document.getElementById('select' + i));
                console.log(document.getElementById('select' + i));
                console.log(document.getElementById('link' + i));
                quantity.addEventListener('change',(event) => {
                    displayPrice();});
                link.addEventListener('click', (str) =>{
                   let id = str.target.parentElement.id;
                   let mas = id.length - 1;
                   let index = id[mas];
                   products.splice(index,1);
                   addProductToCart();
                    });
                    
                document.getElementById('select' + i).appendChild(quantity);
                document.getElementById('link' + i).appendChild(link);

            }
            displayPrice();
            result.style.display = "block";
        }



        console.log(product);

    }

    function displayPrice(){
        let totalprice = 0;   
        for(i in products){  
                 totalprice = totalprice + ( (products[i].price) * parseInt(document.getElementById('select'+i).getElementsByTagName('input')[0].value));
           }

           total.innerHTML = '<p>The total cost is ' + totalprice + '</p>';
    }

   
}


