<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!--[if IE 8]> <html class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html>
<!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
<jsp:include page="fragments/headTag.jsp" />
<spring:url value="/resources/plugins/bootstrap-daterangepicker/daterangepicker-bs3.css" var="daterangecss" />
<link rel="stylesheet" type="text/css" href="${daterangecss}"/>
<spring:url value="/resources/plugins/data-tables/DT_bootstrap.css" var="dtbootcss" />
<link rel="stylesheet" href="${dtbootcss}"/>
<spring:url value="/resources/plugins/data-tables/TableTools/css/dataTables.tableTools.css" var="dtttcss" />
<link rel="stylesheet" href="${dtttcss}"/>
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body class="page-header-fixed page-sidebar-fixed page-footer-fixed">
<!-- BEGIN HEADER -->
<jsp:include page="fragments/bodyHeader.jsp" />
<!-- END HEADER -->
<!-- BEGIN CONTAINER -->
<div class="page-container">
<jsp:include page="fragments/bodyNavigation.jsp" />
<!-- BEGIN CONTENT -->
<div class="page-content-wrapper">
	<div class="page-content-wrapper">
		<div class="page-content">
			<jsp:include page="fragments/bodyCustomizer.jsp" />
			<!-- BEGIN PAGE HEADER-->
			<div class="row">
				<div class="col-md-12">
					<!-- BEGIN PAGE TITLE & BREADCRUMB-->
					<h3 class="page-title">
					<spring:message code="title" /> <small><spring:message code="heading" /></small>
					</h3>
					<ul class="page-breadcrumb breadcrumb">
						<li>
							<i class="fa fa-home"></i>
							<a href="<spring:url value="/" htmlEscape="true "/>"><spring:message code="home" /></a>
							<i class="fa fa-angle-right"></i>
						</li>
						<li class="pull-right">
							<div id="dashboard-report-range" class="dashboard-date-range tooltips" data-placement="top" data-original-title="<spring:message code="heading" />">
								<i class="fa fa-calendar"></i>
								<span>
								</span>
								<i class="fa fa-angle-down"></i>
							</div>
						</li>
					</ul>
					<!-- END PAGE TITLE & BREADCRUMB-->
				</div>
			</div>
			<!-- END PAGE HEADER-->
			<div class="clearfix">
			</div>
			<div class="row">
				<div class="col-md-6 col-sm-12">
					<!-- BEGIN PORTLET-->
					<div id="tamizajes-dia-div" class="portlet">
						<div class="portlet-title">
							<div class="caption">
								<i class="fa fa-bar-chart-o"></i><spring:message code="screenxday" />

							</div>
							<div class="actions">
								<a href="#" onclick="exportTamizajesDia();" class="btn btn-info btn-sm"><i class="fa fa-download"></i></a>
							</div>
						</div>
						<div class="portlet-body">
							<spring:url value="/resources/img/loading.gif" var="loading" />
							<div id="site_statistics_loading">
								<img src="${loading}" alt="loading"/>
							</div>
							<div id="site_statistics_content" class="display-none">
								<div id="site_statistics" class="chart">
								</div>
							</div>
						</div>
					</div>
					<!-- END PORTLET-->
				</div>
				<div class="col-md-6 col-sm-12">
					<div class="portlet">
						<div class="portlet-title">
							<div class="caption">
								<i class="fa fa-table"></i><spring:message code="screenxday" />

							</div>
						</div>
						<div class="portlet-body">
							<div class="table-toolbar1">
							</div>
							<table class="table table-striped table-hover table-bordered" id="tamizajes_dia">
								<thead>
									<tr>
										<th><spring:message code="date" /></th>
										<th><spring:message code="total" /></th>
										<th>CSSFV</th>
										<th>CSVL</th>
										<th>CSFB</th>
										<th>CSEL</th>
									</tr>
								</thead>
								<c:forEach items="${tamizajesDia}" var="tamizajeDia">
									<tr>
										<td><fmt:formatDate value="${tamizajeDia[0]}" pattern="yyyy-MM-dd" /></td>
										<td align="right"><c:out value="${tamizajeDia[1]}" /></td>
										<td align="right"><c:out value="${tamizajeDia[2]}" /></td>
										<td align="right"><c:out value="${tamizajeDia[3]}" /></td>
										<td align="right"><c:out value="${tamizajeDia[4]}" /></td>
										<td align="right"><c:out value="${tamizajeDia[5]}" /></td>
									</tr>
								</c:forEach>
							</table>
						</div>
					</div>
					<!-- END PORTLET-->
				</div>
			</div>
			<div class="clearfix">
			</div>
		</div>
	</div>
</div>
<!-- END CONTENT -->
</div>
<!-- END CONTAINER -->
<!-- BEGIN FOOTER -->
<jsp:include page="fragments/bodyFooter.jsp" />
<!-- END FOOTER -->
<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
<jsp:include page="fragments/corePlugins.jsp" />
<jsp:include page="fragments/bodyUtils.jsp" />
<!-- BEGIN PAGE LEVEL PLUGINS -->
<c:choose>
	<c:when test="${cookie.zikaLang.value == null}">
		<c:set var="lenguaje" value="es"/>
	</c:when>
	<c:otherwise>
		<c:set var="lenguaje" value="${cookie.zikaLang.value}"/>
	</c:otherwise>
</c:choose>
<!-- Date Range-->
<spring:url value="/resources/plugins/bootstrap-daterangepicker/moment.min.js" var="DateRangeMoment" />
<script src="${DateRangeMoment}" type="text/javascript"></script>
<spring:url value="/resources/plugins/bootstrap-daterangepicker/daterangepicker.js" var="DateRange" />
<script src="${DateRange}" type="text/javascript"></script>
<!-- Data Tables-->
<spring:url value="/resources/plugins/data-tables/jquery.dataTables.js" var="jQueryDataTables" />
<script type="text/javascript" src="${jQueryDataTables}"></script>
<spring:url value="/resources/plugins/data-tables/DT_bootstrap.js" var="dataTablesBS" />
<script type="text/javascript" src="${dataTablesBS}"></script>
<spring:url value="/resources/plugins/data-tables/TableTools/js/dataTables.tableTools.js" var="dataTablesTT" />
<script type="text/javascript" src="${dataTablesTT}"></script>
<spring:url value="/resources/plugins/data-tables/TableTools/swf/copy_csv_xls_pdf.swf" var="dataTablesTTSWF" />
<spring:url value="/resources/plugins/data-tables/i18n/label_{language}.json" var="dataTablesLang">
	<spring:param name="language" value="${lenguaje}" />
</spring:url>	
<!-- jQuery Flot-->
<spring:url value="/resources/plugins/flot/jquery.flot.js" var="jQFlot" />
<script type="text/javascript" src="${jQFlot}"></script>
<spring:url value="/resources/plugins/flot/jquery.flot.resize.js" var="jQFlotResize" />
<script type="text/javascript" src="${jQFlotResize}"></script>
<spring:url value="/resources/plugins/html2canvas/html2canvas.js" var="html2Canvas" />
<script src="${html2Canvas}"></script>
<spring:url value="/resources/plugins/flot/jquery.flot.categories.js" var="categories" />
<script src="${categories}"></script>
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN PAGE LEVEL SCRIPTS -->
<spring:url value="/resources/scripts/app.js" var="App" />
<script src="${App}" type="text/javascript"></script>
<spring:url value="/resources/scripts/home.js" var="IndexScript" />
<script src="${IndexScript}"></script>
<!-- END PAGE LEVEL SCRIPTS -->
<c:set var="processSuccess"><spring:message code="process.success" /></c:set>
<c:set var="processError"><spring:message code="process.error" /></c:set>
<c:set var="deniedError"><spring:message code="denied" /></c:set>
<c:set var="yesterday"><spring:message code="yesterday" /></c:set>
<c:set var="today"><spring:message code="today" /></c:set>
<c:set var="last7days"><spring:message code="last7days" /></c:set>
<c:set var="last30Days"><spring:message code="last30Days" /></c:set>
<c:set var="tMonth"><spring:message code="tmonth" /></c:set>
<c:set var="lMonth"><spring:message code="lmonth" /></c:set>
<c:set var="applyLabel"><spring:message code="applyLabel" /></c:set>
<c:set var="fromLabel"><spring:message code="fromLabel" /></c:set>
<c:set var="toLabel"><spring:message code="toLabel" /></c:set>
<c:set var="customRangeLabel"><spring:message code="customRangeLabel" /></c:set>
<c:set var="Su"><spring:message code="Su" /></c:set>
<c:set var="Mo"><spring:message code="Mo" /></c:set>
<c:set var="Tu"><spring:message code="Tu" /></c:set>
<c:set var="We"><spring:message code="We" /></c:set>
<c:set var="Th"><spring:message code="Th" /></c:set>
<c:set var="Fr"><spring:message code="Fr" /></c:set>
<c:set var="Sa"><spring:message code="Sa" /></c:set>
<c:set var="january"><spring:message code="january" /></c:set>
<c:set var="february"><spring:message code="february" /></c:set>
<c:set var="march"><spring:message code="march" /></c:set>
<c:set var="april"><spring:message code="april" /></c:set>
<c:set var="may"><spring:message code="may" /></c:set>
<c:set var="june"><spring:message code="june" /></c:set>
<c:set var="july"><spring:message code="july" /></c:set>
<c:set var="august"><spring:message code="august" /></c:set>
<c:set var="september"><spring:message code="september" /></c:set>
<c:set var="october"><spring:message code="october" /></c:set>
<c:set var="november"><spring:message code="november" /></c:set>
<c:set var="december"><spring:message code="december" /></c:set>
<c:set var="total"><spring:message code="total" /></c:set>
<spring:url value="/updateDashboard" var="dashUrl"/>
<c:set var="exportar"><spring:message code="export" /></c:set>
<script>
    $(function () {
        $("li.start").addClass("active");
    });
</script>
<script>
	jQuery(document).ready(function() {
		App.init();
		var parametrosDateRange = {dashUrl: "${dashUrl}",yesterday: "${yesterday}", today: "${today}", last7days: "${last7days}"
			, last30Days: "${last30Days}",tMonth:"${tMonth}",lMonth: "${lMonth}", applyLabel: "${applyLabel}", fromLabel: "${fromLabel}"
			, toLabel: "${toLabel}",customRangeLabel:"${customRangeLabel}",Su: "${Su}", Mo: "${Mo}", Tu: "${Tu}",We: "${We}", Th: "${Th}", Fr: "${Fr}", Sa: "${Sa}"
			, january: "${january}",february:"${february}",march: "${march}", april: "${april}", may: "${may}",june: "${june}", july: "${july}", august: "${august}"
			, september: "${september}", october: "${october}", november: "${november}", december: "${december}", dataTablesTTSWF: "${dataTablesTTSWF}", exportar: "${exportar}"
			, lenguaje: "${dataTablesLang}", total: "${total}"};
		Index.initDashboardDaterange(parametrosDateRange);
		var totales = [];var cs1 = [];var cs2 = [];var cs3 = [];var cs4 = [];var fechas = [];var sumTotal = 0;var sumCs1 = 0;var sumCs2 = 0;var sumCs3 = 0;var sumCs4 = 0;
		<c:forEach var="tamizaje" items="${tamizajesDia}">
			var d = new Date("${tamizaje[0]}");
			fechas.push([d.yyyymmdd()]);
			totales.push(["${tamizaje[0]}", "${tamizaje[1]}"]);
			sumTotal = sumTotal + parseInt("${tamizaje[1]}");
			cs1.push(["${tamizaje[0]}", "${tamizaje[2]}"]);
			sumCs1 = sumCs1 + parseInt("${tamizaje[2]}");
			cs2.push(["${tamizaje[0]}", "${tamizaje[3]}"]);
			sumCs2 = sumCs2 + parseInt("${tamizaje[3]}");
			cs3.push(["${tamizaje[0]}", "${tamizaje[4]}"]);
			sumCs3 = sumCs3 + parseInt("${tamizaje[4]}");
			cs4.push(["${tamizaje[0]}", "${tamizaje[5]}"]);
			sumCs4 = sumCs4 + parseInt("${tamizaje[5]}");
		</c:forEach>
		var parametrosChart = {fechas: fechas,totales: totales, cs1: cs1, cs2: cs2, cs3:cs3, cs4:cs4
			, sumTotal: sumTotal, sumCs1: sumCs1, sumCs2: sumCs2, sumCs3: sumCs3, sumCs4: sumCs4, total: "${total}"};
		Index.initCharts(parametrosChart);
	});
	
	Date.prototype.yyyymmdd = function() {         
        
        var yyyy = this.getFullYear().toString();                                    
        var mm = (this.getMonth()+1).toString(); // getMonth() is zero-based         
        var dd  = this.getDate().toString();             
                            
        return yyyy + '-' + (mm[1]?mm:"0"+mm[0]) + '-' + (dd[1]?dd:"0"+dd[0]);
    };
    
	function exportTamizajesDia()
	{
		html2canvas($("#tamizajes-dia-div"), {
	        onrendered: function(canvas) {
	            // canvas is the final rendered <canvas> element
	        	var image = canvas.toDataURL("image/png").replace("image/png", "image/octet-stream");  /// here is the most important part because if you dont replace you will get a DOM 18 exception.
	        	document.location.href=image;
	        }
	    });
	}
</script>
<!-- END JAVASCRIPTS -->
</body>
<!-- END BODY -->
</html>