/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*$(document).ready(function() {
   alert("jQuery esta funcionando !!");
});*/
$(document).ready(function(){
    $('.menu li:has(ul)').click(function(e){
        alert("Despues del .menu !!");
        e.preventDefault();
        
        /*if($(this).hasClass('activado')){
            $(this).removeClass('activado')
            $(this).children('ul').slideUp();
        } else {
            $('.menu li ul').slideUp();
            $('.menu li').removeClass('activado');
            $(this).addClass('activado');
            $(this).children('ul').slideDown();
        }*/
    })
});
