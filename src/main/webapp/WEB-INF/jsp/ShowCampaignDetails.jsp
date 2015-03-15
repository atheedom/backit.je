<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<!DOCTYPE html>
<!--[if lt IE 7]><html class="no-js lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if (IE 7)&!(IEMobile)]><html class="no-js lt-ie9 lt-ie8" lang="en"><![endif]-->
<!--[if (IE 8)&!(IEMobile)]><html class="no-js lt-ie9" lang="en"><![endif]-->
<!--[if (IE 9)]><html class="no-js ie9" lang="en"><![endif]-->
<!--[if gt IE 8]><!-->
<html lang="en-GB"> <!--<![endif]-->

    
        <jsp:include page="head.jsp"/>
    

<body>
<jsp:include page="header.jsp"/>


        <!-- Project Section -->
        <article class="row section white-bg">
            <section id="projects">
                <!-- Title Page -->
                <div class="section-title">
                    <h1 class="title">Project Name<span>.</span></h1>
                </div>

                <div class="project-img">
                    <img src="${pageContext.request.contextPath}/img/300x300.jpg">
                </div>

                <div class="project-funding">
                    <div class="container">
                        
                            
		            <c:choose>
		        			<c:when test= "${campaign.percentageFunded <= 100 && campaign.timeLeft.timeLeftAsString == 0}"><div class="campaign-funding failed"> </c:when >
		       		 		<c:when test= "${campaign.percentageFunded == 100 && campaign.timeLeft.timeLeftAsString == 0}"><div class="campaign-funding successful"> </c:when >
		        			<c:otherwise><div class="campaign-funding"></c:otherwise>
					</c:choose>
                            
                            
                            <progress value="${campaign.percentageFunded}" max="100"></progress>
                           
                            
                        
                            <!-- 
                               <c:if test ="${campaign.percentageFunded <= 100}" var="var_name" scope= "page" >
                            
                            </c:if>
                            
                            >100% + timeout = success
                            <100% + timeout = fail
                            <100% + time remaining = nothing
                            
                            if hours left RED otherwise nothing
                            
                             -->
                            <ul>
                                <li><strong>${campaign.noBackers}</strong> <span>Backers</span></li>
                                <li><strong>&pound;${campaign.pledged}</strong> <span>Pledged</span></li>
                                <li><strong>&pound;${campaign.targetFunding}</strong> <span>Target</span></li>
                                <li><strong>${campaign.percentageFunded}%</strong> <span>Backed</span></li>
                                <li><strong>${campaign.timeRemaining}</strong> <span>Days Left</span></li>
                            </ul>
                        </div>                        
                        <p>This campaign concludes at: ${campaign.formatedEndDate}.</p>

                    </div>
                    
                </div>

                <form class="backit-but">
                    <button class="button">Back This Project</button>
                </form>


                <div class="project-description">
                    <div id="social-area">
                        <nav id="social">
                            <ul>
                                <li><a href="https://twitter.com/BirdStudiosBtn" title="Follow us on Twitter" target="_blank"><span class="fa fa-twitter"></span></a></li>
                                <li><a href="https://www.facebook.com/BirdStudiosBtn" title="Follow us on Facebook" target="_blank"><span class="fa fa-facebook"></span></a></li>
                            </ul>
                        </nav>

                        <p>${campaign.description}</p>
                    </div>
                </div>


                 <c:forEach items="${campaign.rewards}" var="reward"> 
                   
                                  	       	
      	            <article class="project-backit">
      	           
                    <ul>
                        <li><h3>${reward.title}</h3></li>
                        <li><img style="width: 50px; height:50px;" src="${pageContext.request.contextPath}/img/backitcoin.svg"><span>${reward.totalNumber} Backers</span></li>
                        <li><img style="width: 50px; height:50px;" src="${pageContext.request.contextPath}/img/backitcoin.svg"><span>&pound;${reward.value}</span></li>
                        <li>${reward.description}</li>     
                    </ul>
                                  	
              </article>
                                  	
                    

                    </c:forEach>
                
                <!-- End Title Page -->
            </section>
        </article>
        <!-- Project Section -->





<jsp:include page="footer.jsp"/>

       <script src="js/main-vendors.js"></script>
        <script src="js/main.js"></script>

</body>
</html>