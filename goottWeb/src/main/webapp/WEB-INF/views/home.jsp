<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ include file="include/header.jsp" %>

<!-- write table -->
     <section id="main-content">
          <section class="wrapper">
          	<h3><i class="fa fa-angle-right"></i> 전체 글 페이지</h3>
				<div class="row">
				
	                  <div class="col-ㅣd-12">
	                  	  <div class="content-panel">
	                  	  	  <h4><i class="fa fa-angle-right"></i> 게시판 </h4>
	                  	  	  <hr>
		                      <table class="table">
		                          <thead>
		                          <tr>
		                              <th>글번호</th>
		                              <th>제목</th>
		                              <th>작성자</th>
		                              <th>작성일</th>
		                              <th>조회수</th>
		                              
		                          </tr>
		                          </thead>
		                          <c:forEach var="i" items="${items }"></c:forEach>
		                          <tbody>
		                          <tr>
		                              <th>글번호</th>
		                              <th>제목</th>
		                              <th>작성자</th>
		                              <th>작성일</th>
		                              <th>조회수</th>
		                              
		                          </tr>
		                          </tbody>
		                          
		                      </table>
	                  	  </div>
	                  </div><!-- /col-md-12 -->
	                  
	                  </div>
	                 </section>
	                 </section>
                  			



<%@ include file="include/footer.jsp" %>


















<%-- <html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
 --%>