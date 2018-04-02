document.getElementById('btnCarros').addEventListener('click', function(event) {
    event.preventDefault();
    // get data from Server
    ajaxGet('carros');

});

document.getElementById('btnCategorias').addEventListener('click', function(event) {
    event.preventDefault();
    // get data from Server
    ajaxGet('categorias');

});

document.getElementById('btnMarcas').addEventListener('click', function(event) {
    event.preventDefault();
    // get data from Server
    ajaxGet('marcas');

});

// DO GET
function ajaxGet(path) {
    var xmlhttp = new XMLHttpRequest();
    xmlhttp.open('GET', window.location + path, true);
    xmlhttp.onreadystatechange = function() {
        if (this.readyState === 4 && this.status === 200) {
            console.log(this.responseText);
            var jsonData = JSON.parse(this.responseText);
            renderHTML(jsonData);            
        } else if (this.status > 400) {
        	alert('Erro na requisicao: '+ this.responseText);
        }
    };
    
    xmlhttp.onerror = function() {
		alert('Erro na conexao');
	};
    
    xmlhttp.send();
}

function renderHTML (data){
	var htmlString = '';
	for (var i = 0; i < data.length; i++) {
		htmlString += '<p>' + JSON.stringify(data[i]) + '</p>';
	}
	
	document.getElementById('conteudo').innerHTML = htmlString;
		
}

