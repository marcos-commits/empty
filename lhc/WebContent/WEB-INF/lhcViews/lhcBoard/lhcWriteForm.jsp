<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTf-8">
	<title>��������</title>
	<link href="/lhc/lhcResources/style.css" rel="stylesheet" type="text/css">
	<!-- ������ �α��ε� ��츸 ���� �����ϰ�  -->
</head>
<body>
	<form action="/lhc/lhcBoard/lhcWritePro.lhc" method="post">
		<input type="hidden" name="lhc_num" value="${lhc.lhc_num}" />
	<table>
		<tr>
			<td style="width:150px">�ۼ���</td> <td align="left"><input type="text" name="lhc_writer" style="width:100px"/></td>
		</tr>
		<tr>
			<td>����</td><td><input type="text" name="lhc_subject" style="width:280px" /></td>
		</tr>
		<tr>
			<td colspan="2"><textarea rows="20" cols="70" name="lhc_content" ></textarea></td>
		</tr>
		<tr>
			<td align="right" colspan="2">
				<input type="submit" value="���" /> 
				<input type="reset" value="���ۼ�" />
			</td>
		</tr>
	</table>
	</form>
	
</body>
</html>