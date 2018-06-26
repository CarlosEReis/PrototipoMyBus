var map;

function initMap(){
	console.log("InitiApi2");
	var pos = {lat: -23.5513515,lng: -46.6306537};
	var zoom = 13; 
	map = new google.maps.Map(document.getElementById('map'), {
		center: pos,
		zoom: zoom
	});
	
	if(navigator.geolocation){
		navigator.geolocation.getCurrentPosition(function(position){
			
			pos.lat = position.coords.latitude;
			pos.lng = position.coords.longitude;
			zoom    = 18;
			
			map.setZoom(zoom);
			map.setCenter(pos);
			var marker = new google.maps.Marker({
				position: pos,
				map: map,
			})
		});
	} else {
		alert('Ops, não foi possóvel obter a localização.');
	}

	
}

var search = document.getElementById('search');
var linhas = document.getElementsByClassName('linha');

search.addEventListener('keyup', function(){
	var searchValue = search.value;
	console.log('searchValue: '+ searchValue);
	
	//var s = searchValue;
	var r = /\d+\w+/i;
	var match = r.exec(searchValue);

	var regex = new RegExp(searchValue,'i');
	//console.log('regex: '+regex);
	
	
	if (match != null) {
		console.log('buscar por numero da linha');
		for (let i = 0; i < linhas.length; i++) {
			var numero = linhas[i].getElementsByTagName('span')[0].textContent;
			var test = regex.test(numero);
			if(test == false){
				linhas[i].setAttribute('style', 'display: none');
			}else{
				linhas[i].setAttribute('style', 'display: block');	
			}
		}
	}else{
		console.log('buscar por nome da linha');
		for (let i = 0; i < linhas.length; i++) {
			var nome = linhas[i].getElementsByTagName('a')[0].textContent;				
			var test2 = regex.test(nome);			
			if (test2 == false) {
				linhas[i].setAttribute('style',"display: none");
			}else{
				linhas[i].setAttribute('style', 'display: block');	
			}
		}
	}
	
	

	
})
