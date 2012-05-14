<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>


<script src="/js/jquery.bxSlider.min.js"></script>
<style type="text/css">
    body {
        padding-top: 150px;
    }
</style>
<script>
    $(document).ready(function(){
        $('#slider1').bxSlider();
    });
</script> 
<div class="row-fluid">
    <div class="span3 hidden-grid" ></div>
    <div id="wrap" class="span6 ">
        <div id="slider1">
            <div class="bet-block" style="padding-top: 60px">
                <div class="row-fluid">
                    <div class="span4"><img src="/img/algeria.png" width="128px" /></div>
                    <div class="span4" >-------</div>
                    <div class="span4"><img src="/img/algeria.png" width="128px" /></div>
                </div>
                <div class="row-fluid">
                    <div class="span4" >-------</div>
                    <div class="span4"><a style="width: 100px" class="btn btn-primary" />Bite</a> </div>
                    <div class="span4" >-------</div>
                </div>


            </div>
            <div class="bet-block">Slide two content</div>
            <div class="bet-block">Slide three content</div>
            <div class="bet-block">And so on...</div>
        </div>
    </div>
</div>


