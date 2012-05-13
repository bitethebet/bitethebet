<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<script src="/js/jquery.roundabout.min.js"></script>
<style type="text/css">
    body {
        padding-top: 150px;
    }
</style>
<script>
    $(document).ready(function() {
        $(".betNavigator").roundabout(
        {       
            btnNext: ".next"
        });
    });
</script> 
    <ul class="betNavigator">
        <li>1</li>
        <li>2</li>
        <li>3</li>
        <li>4</li>
        <li>5</li>
    </ul> 

