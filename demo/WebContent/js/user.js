$(document).ready(function() {
	/**
	 * 传普通参数
	 * @calss:User{int id,String name}
	 * @method:public User getUser(int id)
	 * @explain:get one user by id
	 */
	$("#userLoad").bind("click",function(){
		var params = {
				id : $("#userId").val(),
			};
		$.ajax({
			   type: "POST",
			   url: "user/getUser",
			   data: params,
			   dataType: "json",
			   success: function(data){
			     alert( data.id+","+data.name);
			   }
		});
	})
	/**
	 * 传json
	 * @class:User{int id,String name}
	 * @method:public int addUser(User user)
	 * @explain: add one user with the parmeter of name and the field id is generated by incresing
	 */
	$("#userSave").bind("click",function(){
		var params = {
				name: $("#userName").val()
			};
		$.ajax({
			   type: "POST",
			   url: "user/addUser",
			   contentType:'application/json;charset=UTF-8',
			   data: JSON.stringify(params), 
			   dataType: "json",
			   success: function(id){//返回id
			     alert(id);
			   }
		});
	});
	
});