<%@ page language="java" errorPage="/sample/common/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" %>
<%@ include file="/taglib/taglibs.jsp"%>
<style>
#mask {    position:absolute;    left:0;  top:0;  z-index:9000;    background-color:#ffffff;    display:none; filter:alpha(opacity=70); opacity:0.7; -moz-opacity:0.7 }
#maskContents { position:absolute; text-align:center; width:100%; font: bold 15px Arial; z-index:9999; }
</style>
<script type="text/javascript">
	onMenu(1);

	$(document).ready(function (){
		
		$('#applyBtn').click(function() { 
			if(!$('#projectNm').val()) {
				alert('Project 명을 입력하세요.');
				$('#projectNm').focus();
				return false;
			} else if(!$('#person').val()) {
				alert('담당자를 입력하세요.');
				$('#person').focus();
				return false;
			} else if((!$('#projectSrc').val()) && (!$('#deploySrc').val())) {
				alert('Project Source 나 Deploy Source 중 한 항목 이상 업로드하세요.');
				$('#projectSrc').focus();
				return false;
			} else {
				wrapWindowByMask();
				
				var form = $("#uploadForm").get(0);
				form.action = "<c:url value='/upload/upload.do' />";
				form.submit();
			}
		});
	});
	
	//진행중 메시지 처리
	function wrapWindowByMask(){
		
		var div = $('	<div id="mask" style="display:none; ">' 
				+ '			<div id="maskContents"> '
				+ '				마이그레이션 진행중입니다..'
				+ '				<br/><br/>' 
				+ '				<img src="<c:url value="/images/spinner.gif"/>"/>' 
				+ '			</div>'
				+ ' 	</div> ');
		
		$('body').append(div);
		
		//화면의 높이와 너비를 구한다.        
		var maskHeight = $(document).height();          
		var maskWidth = $(window).width();           
 		//마스크의 높이와 너비를 화면 것으로 만들어 전체 화면을 채운다.
 		$('#mask').css({'width':maskWidth,'height':maskHeight});

 		//text를 화면 중앙에 구현.
 		var top = (maskHeight / 2) - 70;          
		$('#maskContents').css('top', top);
 		
		//애니메이션 효과        
		$('#mask').fadeIn(1000);    
	}
	
</script>
<form:form modelAttribute="upload" method="post" id="uploadForm" name="uploadForm" enctype="multipart/form-data">
	<div class="tit_box">기본정보 입력</div>
	
	<div class="bg_formbox">
    	<div class="formbox_txt01"><p style="padding-top:11px; padding-left:15px;">Project명</p></div>
        <div class="formbox_form01"><input type="text" size="40" id="projectNm" name="projectNm" title="Project명 입력" value="" class="input_form02"/></div>
        
        <div class="formbox_txt02"><p style="padding-top:11px; padding-left:15px;">담당자</p></div>
        <div class="formbox_form02"><input type="text" id="person" name="person" title="담당자 입력" value="" class="input_form02" /></div>
        
        <div class="formbox_txt02"><p style="padding-top:11px; padding-left:15px;">Project Source</p></div>
        <div class="formbox_form02">
        	<div class="formbox_sub01"><input type="file" name="projectSrc" id="projectSrc" title="찾아보기" class="input_form02"/></div>
        </div>
        
        <div class="formbox_txt02"><p style="padding-top:11px; padding-left:15px;">Deploy Source</p></div>
        <div class="formbox_form02">
        	<div class="formbox_sub01"><input type="file" name="deploySrc" id="deploySrc" title="찾아보기" class="input_form02" /></div>
        </div>
        
        <div class="formbox_txt02"><p style="padding-top:11px; padding-left:15px;">기존 WAS</p></div>
        <div class="formbox_form02">
        	<div class="formbox_radioform" style="margin-left:0"><input type="radio" name="beforeWas" id="beforeWas1" class="regular-radio" value="W" checked /><label for="beforeWas1"></label></div>
            <div class="formbox_radiotxt"><p style="padding-top:11px; padding-left:0;">WEB LOGIC</p></div>
            <div class="formbox_radioform"><input type="radio" name="beforeWas" id="beforeWas2" title="JEUS" class="regular-radio" value="J" /><label for="beforeWas2"></label></div>
            <div class="formbox_radiotxt"><p style="padding-top:11px; padding-left:0;">JEUS</p></div>  	
        </div>
				
        <div class="formbox_txt02"><p style="padding-top:11px; padding-left:15px;">대상 WAS</p></div>
        <div class="formbox_form02">
        	<div class="formbox_radioform" style="margin-left:0"><input type="radio" name="afterWas" id="afterWas1" title="JBoss" value="B" class="regular-radio" checked /><label for="afterWas1"></label></div>
            <div class="formbox_radiotxt"><p style="padding-top:11px; padding-left:0;">JBoss</p></div>
            <div class="formbox_radioform"><input type="radio" name="afterWas" id="afterWas2" title="Tomcat" value="T" class="regular-radio" /><label for="afterWas2"></label></div>
            <div class="formbox_radiotxt"><p style="padding-top:11px; padding-left:0;">Tomcat</p></div>  	
        </div>
        
        <div class="common_btn"><a href="javascript:void(0);" id="applyBtn"><img src="<c:url value='/images/common/bt_apply01.png' />" /></a></div>        
    </div>        
    
 </form:form>
