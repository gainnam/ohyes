// var main = {
//     init : function () {
//         var _this = this;
//         $("#btn-save").click(() => {
//             _this.save();
//         });
//     },
//     save: function () {
//         var data = {
//             title: $('#title').val(),
//             author : $('#author').val(),
//             content: $('#content').val()
//         };
//
//         $.ajax({
//             type: 'POST',
//             url: '/board/post',
//             dataType: 'json',
//             contentType: 'application/json; charset=utf-8',
//             data: JSON.stringify(data)
//         }).done(function(){
//             alert("글이 등록되었습니다.");
//             window.location.href = '/board';
//         }).fail(function(error) {
//             alert(JSON.stringify(error));
//         })
//     }
// };
//
// main.init();

$("#btn-save").click(() => {
    alert('111');
})