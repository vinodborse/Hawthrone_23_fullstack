// document.getElementById('btn').addEventListener('click',  
// function () {
//     var name = document.getElementById('inp').value;
    
//     document.getElementById('dt').innerText = '<h1>' + name + ' FROM d-14 </h1>';
//     document.getElementById('dv').innerHTML = '<h1>' + name + ' FROM d-14 </h1>';

// })

// document.getElementById('btn-2').addEventListener('mouseover', function (){
//     document.getElementById('dv-2').innerHTML = '<h1 style="color: red"> WE ARE IN TS... </h1>';
// });


// document.getElementById('btn-2').addEventListener('mouseout', function () {
//     document.getElementById('dv-2').innerHTML = '<h1 style="color: aqua"> WE ARE IN TS... </h1>';
// })

// document.getElementById('btn-2').addEventListener('click', function () {
//     document.getElementById('dv-2').innerHTML = '<h1 style="color: white"> WE ARE IN TS... </h1>';
// })

// document.getElementById('btn-2').addEventListener('dblclick', function () {
//     document.getElementById('dv-2').innerHTML = '<h1 style="color: pink"> WE ARE IN TS... </h1>';
// })



async function searchFromAPI() {
    const id = document.getElementById('p-inp').value

    if(id > 10) {

    }

    const url = 'https://dummyjson.com/products/'+id; // API
    
   const data = await fetch(url, {method: 'GET'});
   const finalData = await data.json();
   if(id > 10) {
        
       document.getElementById('p-div').innerHTML = '<h1 style="color: red"> '+ finalData.title +' </h1> <h1 style="color: red"> '+ finalData.price +' </h1>'
    } else {
       document.getElementById('p-div').innerHTML = '<h1> '+ finalData.title +' </h1> <h1> '+ finalData.price +' </h1>'

   }
}

