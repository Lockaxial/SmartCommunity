
var requestAddRemoveMsg={
    //url:URL_SUBMIT_ROOMOWNER,
    callbackMethod:submitRemoveResult,
    data:""
};

$(document).ready(function(){
        
    setDatePicker(); //��ʼ��datepicker
    var str = $.getUrlParam('roomnumber'); //����һ�ַ��� 
    var strs = new Array(); //����һ���� 
    strs = str.split("-"); //�ַ��ָ�
    document.getElementById("name").value = strs[3];
    document.getElementById("roomnumber").value = strs[0] + "-" + strs[1] + "-" + strs[2];

		$("#remove_button").click(function (){ 
		removeOwnerData();
		});  
    }); 

	 function setDatePicker()
    {
        var ownerRemoveDatePicker="#removeDate";  //ס��Ǩ��ʱ��
        initDatepicker(ownerRemoveDatePicker);
	}

	 function removeOwnerData()
    {
	    var waterCharge =$("#waterCharge").val(); 
    	var electricCharge =$("#electricCharge").val();
    	var propertyCharge =$("#propertyCharge").val();
    	var removeDate =$("#removeDate").val(); 
    	var operator =$("#operator").val(); 
    
        var urlString=requestAddRemoveMsg.url;
        var callBackName=requestRoomownerMsg.callbackMethod;
        var formData = new FormData($("#uploadForm")[0]);
        requestAddRemoveMsg.data=formData;
    
        getDataWithFileUpload(requestAddRemoveMsg);
    }

	 function submitRemoveResult(result)
	{
		if(result.success == true)
		{
			alert("Ǩ��ҵ���ɹ�");
		} 
		else
		{
			alert("Ǩ������ʧ��,�������ύ" + result.type);
		}
		
	 }

	 (function ($) {
	     $.getUrlParam = function (name) {
	         var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
	         var r = window.location.search.substr(1).match(reg);
	         if (r != null)
	             return unescape(r[2]);
	         return null;
	     }
	 })(jQuery);