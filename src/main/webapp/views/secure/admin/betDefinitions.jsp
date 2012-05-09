<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="hero-unit">
    <form:form method="post" action="/secure/admin/addBetDefinition.html">        

        <form:select path="players[0].name">
            <form:option value="" label="-- Choose one--" />
            <form:options items="${players}" itemValue="name" itemLabel="name" />
        </form:select>
        
        <form:select path="players[1].name">
            <form:option value="" label="-- Choose one--" />
            <form:options items="${players}" itemValue="name" itemLabel="name" />
        </form:select>    
        <button  type="submit" class="btn btn-primary">Save</button>
    </form:form>
        
       
</div>
