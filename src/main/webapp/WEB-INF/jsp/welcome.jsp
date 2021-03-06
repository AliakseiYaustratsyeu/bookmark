<%@ include file="/common/taglibs.jsp"%>

Welcome on our site!

<ul class="loginRegistration">
    <security:authorize  access="!isAuthenticated()">
    <li>
        <c:url var="loginUrl"  value="/login" />
        <a href="${loginUrl}"><span class="login"><fmt:message key="menu.login" /></span></a> 
    </li>
    <li>
        <a href="registration.do"><span class="registration"><fmt:message key="menu.registration" /></span></a>
    </li>
    </security:authorize>
    <security:authorize access="isAuthenticated()">
    <li>
        <c:url var="logoutUrl"  value="/j_spring_security_logout" />
        <a href="${logoutUrl}"><fmt:message key="menu.logout" /></a>
    </li>
    </security:authorize>
</ul>