<%-- 
    Document   : CalendarioAgendamento
    Created on : 06/06/2019, 13:37:26
    Author     : x369482
--%>
<!DOCTYPE html>
<html lang="en">

    <jsp:include page = "include/head.jsp" />

    <head>
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
        <meta charset="utf-8" />
        <title>Calendário</title>

        <meta name="description" content="with draggable and editable events" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

        <!-- bootstrap & fontawesome -->
        <link rel="stylesheet" href="assets/css/bootstrap.min.css" />
        <link rel="stylesheet" href="assets/font-awesome/4.5.0/css/font-awesome.min.css" />

        <!-- page specific plugin styles -->
        <link rel="stylesheet" href="assets/css/jquery-ui.custom.min.css" />
        <link rel="stylesheet" href="assets/css/fullcalendar.min.css" />

        <!-- text fonts -->
        <link rel="stylesheet" href="assets/css/fonts.googleapis.com.css" />

        <!-- ace styles -->
        <link rel="stylesheet" href="assets/css/ace.min.css" class="ace-main-stylesheet" id="main-ace-style" />

        <!--[if lte IE 9]>
                <link rel="stylesheet" href="assets/css/ace-part2.min.css" class="ace-main-stylesheet" />
        <![endif]-->
        <link rel="stylesheet" href="assets/css/ace-skins.min.css" />
        <link rel="stylesheet" href="assets/css/ace-rtl.min.css" />

        <!--[if lte IE 9]>
          <link rel="stylesheet" href="assets/css/ace-ie.min.css" />
        <![endif]-->

        <!-- inline styles related to this page -->

        <!-- ace settings handler -->
        <script src="assets/js/ace-extra.min.js"></script>

        <!-- HTML5shiv and Respond.js for IE8 to support HTML5 elements and media queries -->

        <!--[if lte IE 8]>
        <script src="assets/js/html5shiv.min.js"></script>
        <script src="assets/js/respond.min.js"></script>
        <![endif]-->
    </head>

    <body class="no-skin">
        <jsp:include page = "include/top.jsp"/>

        <div class="main-container ace-save-state" id="main-container">
            <jsp:include page = "include/nav.jsp" />

            <script type="text/javascript">
                try {
                    ace.settings.loadState('main-container')
                } catch (e) {
                }
            </script>

            <div class="main-content">
                <div class="main-content-inner">
                    <div class="breadcrumbs ace-save-state" id="breadcrumbs">
                        <ul class="breadcrumb">
                            <li>
                                <i class="ace-icon fa fa-home home-icon"></i>
                                <a href="#">Home</a>
                            </li>
                            <li class="active">Calendário</li>
                        </ul><!-- /.breadcrumb -->
                    </div>
                    <div class="page-content">
                        <div class="row">
                            <div class="col-xs-12">
                                <!-- PAGE CONTENT BEGINS -->
                                <div class="row">
                                    <div class="col-sm-9">
                                        <div class="space"></div>
                                        <div id="" class="fc fc-ltr fc-unthemed">
                                            <div class="fc-toolbar">
                                                <div class="fc-left">
                                                    <div class="fc-button-group">
                                                        <button type="button" class="fc-prev-button fc-button fc-state-default fc-corner-left">
                                                            <span class="fc-icon fc-icon-left-single-arrow"></span>
                                                        </button>
                                                        <button type="button" class="fc-next-button fc-button fc-state-default fc-corner-right">
                                                            <span class="fc-icon fc-icon-right-single-arrow"></span>
                                                        </button>
                                                    </div>
                                                    <button type="button" class="fc-today-button fc-button fc-state-default fc-corner-left fc-corner-right fc-state-disabled" disabled="disabled">P</button>
                                                </div>
                                                <div class="fc-right">
                                                    <div class="fc-button-group">
                                                        <button type="button" class="fc-month-button fc-button fc-state-default fc-corner-left fc-state-active">month</button>
                                                        <button type="button" class="fc-agendaWeek-button fc-button fc-state-default">week</button>
                                                        <button type="button" class="fc-agendaDay-button fc-button fc-state-default fc-corner-right">day</button>
                                                    </div>
                                                </div>
                                                <div class="fc-center">
                                                    <h2>June 2019</h2>
                                                </div>
                                                <div class="fc-clear">                                                    
                                                </div>

                                            </div>
                                            <div class="fc-view-container" style="">
                                                <div class="fc-view fc-month-view fc-basic-view" style="">
                                                    <table>
                                                        <thead class="fc-head">
                                                            <tr>
                                                                <td class="fc-head-container fc-widget-header">
                                                                    <div class="fc-row fc-widget-header">
                                                                        <table>
                                                                            <thead>
                                                                                <tr>
                                                                                    <th class="fc-day-header fc-widget-header fc-sun">Sun</th>
                                                                                    <th class="fc-day-header fc-widget-header fc-mon">Mon</th>
                                                                                    <th class="fc-day-header fc-widget-header fc-tue">Tue</th>
                                                                                    <th class="fc-day-header fc-widget-header fc-wed">Wed</th>
                                                                                    <th class="fc-day-header fc-widget-header fc-thu">Thu</th>
                                                                                    <th class="fc-day-header fc-widget-header fc-fri">Fri</th>
                                                                                    <th class="fc-day-header fc-widget-header fc-sat">Sat</th>
                                                                                </tr>
                                                                            </thead>
                                                                        </table>
                                                                    </div>
                                                                </td>
                                                            </tr>
                                                        </thead>
                                                        <tbody class="fc-body">
                                                            <tr>
                                                                <td class="fc-widget-content">
                                                                    <div class="fc-day-grid-container" style="">
                                                                        <div class="fc-day-grid">
                                                                            <div class="fc-row fc-week fc-widget-content" style="height: 78px;">
                                                                                <div class="fc-bg">
                                                                                    <table>
                                                                                        <tbody>
                                                                                            <tr>
                                                                                                <td class="fc-day fc-widget-content fc-sun fc-other-month fc-past" data-date="2019-05-26">

                                                                                                </td>
                                                                                                <td class="fc-day fc-widget-content fc-mon fc-other-month fc-past" data-date="2019-05-27">

                                                                                                </td>
                                                                                                <td class="fc-day fc-widget-content fc-tue fc-other-month fc-past" data-date="2019-05-28">

                                                                                                </td>
                                                                                                <td class="fc-day fc-widget-content fc-wed fc-other-month fc-past" data-date="2019-05-29">

                                                                                                </td>
                                                                                                <td class="fc-day fc-widget-content fc-thu fc-other-month fc-past" data-date="2019-05-30">

                                                                                                </td>
                                                                                                <td class="fc-day fc-widget-content fc-fri fc-other-month fc-past" data-date="2019-05-31">

                                                                                                </td>
                                                                                                <td class="fc-day fc-widget-content fc-sat fc-past" data-date="2019-06-01">

                                                                                                </td>
                                                                                            </tr>
                                                                                        </tbody>
                                                                                    </table>
                                                                                </div>
                                                                                <div class="fc-content-skeleton">
                                                                                    <table>
                                                                                        <thead>
                                                                                            <tr>
                                                                                                <td class="fc-day-number fc-sun fc-other-month fc-past" data-date="2019-05-26">26</td>
                                                                                                <td class="fc-day-number fc-mon fc-other-month fc-past" data-date="2019-05-27">27</td>
                                                                                                <td class="fc-day-number fc-tue fc-other-month fc-past" data-date="2019-05-28">28</td>
                                                                                                <td class="fc-day-number fc-wed fc-other-month fc-past" data-date="2019-05-29">29</td>
                                                                                                <td class="fc-day-number fc-thu fc-other-month fc-past" data-date="2019-05-30">30</td>
                                                                                                <td class="fc-day-number fc-fri fc-other-month fc-past" data-date="2019-05-31">31</td>
                                                                                                <td class="fc-day-number fc-sat fc-past" data-date="2019-06-01">1</td>
                                                                                            </tr>
                                                                                        </thead>
                                                                                        <tbody>
                                                                                            <tr>
                                                                                                <td rowspan="2"></td>
                                                                                                <td rowspan="2"></td>
                                                                                                <td rowspan="2"></td>
                                                                                                <td rowspan="2"></td>
                                                                                                <td rowspan="2"></td>
                                                                                                <td class="fc-event-container" rowspan="2">
                                                                                                    <a class="fc-day-grid-event fc-h-event fc-event fc-start fc-end label-grey  fc-draggable" style="">
                                                                                                        <div class="fc-content">
                                                                                                            <span class="fc-time">teste</span> 
                                                                                                            <span class="fc-title">My Event 1</span>
                                                                                                        </div>
                                                                                                    </a>
                                                                                                </td>
                                                                                                <td class="fc-event-container">
                                                                                                    <a class="fc-day-grid-event fc-h-event fc-event fc-start fc-not-end label-success fc-draggable">
                                                                                                        <div class="fc-content"> 
                                                                                                            <span class="fc-title">Long Event</span>
                                                                                                        </div>
                                                                                                    </a>
                                                                                                </td>
                                                                                            </tr>
                                                                                            <tr>
                                                                                                <td class="fc-event-container">
                                                                                                    <a class="fc-day-grid-event fc-h-event fc-event fc-start fc-end label-important fc-draggable">
                                                                                                        <div class="fc-content">
                                                                                                            <span class="fc-time">12a</span> 
                                                                                                            <span class="fc-title">All Day Event</span>
                                                                                                        </div>
                                                                                                    </a>
                                                                                                </td>
                                                                                            </tr>
                                                                                        </tbody>
                                                                                    </table>
                                                                                </div>
                                                                            </div>
                                                                            <div class="fc-row fc-week fc-widget-content" style="height: 78px;">
                                                                                <div class="fc-bg">
                                                                                    <table>
                                                                                        <tbody>
                                                                                            <tr>
                                                                                                <td class="fc-day fc-widget-content fc-sun fc-past" data-date="2019-06-02"></td>
                                                                                                <td class="fc-day fc-widget-content fc-mon fc-past" data-date="2019-06-03"></td>
                                                                                                <td class="fc-day fc-widget-content fc-tue fc-past" data-date="2019-06-04"></td>
                                                                                                <td class="fc-day fc-widget-content fc-wed fc-past" data-date="2019-06-05"></td>
                                                                                                <td class="fc-day fc-widget-content fc-thu fc-today fc-state-highlight" data-date="2019-06-06"></td>
                                                                                                <td class="fc-day fc-widget-content fc-fri fc-future" data-date="2019-06-07"></td>
                                                                                                <td class="fc-day fc-widget-content fc-sat fc-future" data-date="2019-06-08"></td>
                                                                                            </tr>
                                                                                        </tbody>
                                                                                    </table>
                                                                                </div>
                                                                                <div class="fc-content-skeleton">
                                                                                    <table>
                                                                                        <thead>
                                                                                            <tr>
                                                                                                <td class="fc-day-number fc-sun fc-past" data-date="2019-06-02">2</td>
                                                                                                <td class="fc-day-number fc-mon fc-past" data-date="2019-06-03">3</td>
                                                                                                <td class="fc-day-number fc-tue fc-past" data-date="2019-06-04">4</td>
                                                                                                <td class="fc-day-number fc-wed fc-past" data-date="2019-06-05">5</td>
                                                                                                <td class="fc-day-number fc-thu fc-today fc-state-highlight" data-date="2019-06-06">6</td>
                                                                                                <td class="fc-day-number fc-fri fc-future" data-date="2019-06-07">7</td>
                                                                                                <td class="fc-day-number fc-sat fc-future" data-date="2019-06-08">8</td>
                                                                                            </tr>
                                                                                        </thead>
                                                                                        <tbody>
                                                                                            <tr>
                                                                                                <td class="fc-event-container" colspan="3">
                                                                                                    <a class="fc-day-grid-event fc-h-event fc-event fc-not-start fc-end label-success fc-draggable fc-resizable">
                                                                                                        <div class="fc-content"> 
                                                                                                            <span class="fc-title">Long Event</span>
                                                                                                        </div>
                                                                                                        <div class="fc-resizer fc-end-resizer"></div>
                                                                                                    </a>
                                                                                                </td>
                                                                                                <td rowspan="2"></td>
                                                                                                <td rowspan="2"></td>
                                                                                                <td rowspan="2"></td>
                                                                                                <td rowspan="2"></td>
                                                                                            </tr>
                                                                                            <tr>
                                                                                                <td>

                                                                                                </td>
                                                                                                <td class="fc-event-container">
                                                                                                    <a class="fc-day-grid-event fc-h-event fc-event fc-start fc-end label-info fc-draggable">
                                                                                                        <div class="fc-content">
                                                                                                            <span class="fc-time">4p</span> 
                                                                                                            <span class="fc-title">Some Event</span>
                                                                                                        </div>
                                                                                                    </a>
                                                                                                </td>
                                                                                                <td>

                                                                                                </td>
                                                                                            </tr>
                                                                                        </tbody>
                                                                                    </table>
                                                                                </div>
                                                                            </div>
                                                                            <div class="fc-row fc-week fc-widget-content" style="height: 78px;">
                                                                                <div class="fc-bg">
                                                                                    <table>
                                                                                        <tbody>
                                                                                            <tr>
                                                                                                <td class="fc-day fc-widget-content fc-sun fc-future" data-date="2019-06-09">

                                                                                                </td>
                                                                                                <td class="fc-day fc-widget-content fc-mon fc-future" data-date="2019-06-10">

                                                                                                </td>
                                                                                                <td class="fc-day fc-widget-content fc-tue fc-future" data-date="2019-06-11">

                                                                                                </td>
                                                                                                <td class="fc-day fc-widget-content fc-wed fc-future" data-date="2019-06-12">

                                                                                                </td>
                                                                                                <td class="fc-day fc-widget-content fc-thu fc-future" data-date="2019-06-13">

                                                                                                </td>
                                                                                                <td class="fc-day fc-widget-content fc-fri fc-future" data-date="2019-06-14">

                                                                                                </td>
                                                                                                <td class="fc-day fc-widget-content fc-sat fc-future" data-date="2019-06-15">

                                                                                                </td>
                                                                                            </tr>
                                                                                        </tbody>
                                                                                    </table>
                                                                                </div>
                                                                                <div class="fc-content-skeleton">
                                                                                    <table>
                                                                                        <thead>
                                                                                            <tr>
                                                                                                <td class="fc-day-number fc-sun fc-future" data-date="2019-06-09">9</td>
                                                                                                <td class="fc-day-number fc-mon fc-future" data-date="2019-06-10">10</td>
                                                                                                <td class="fc-day-number fc-tue fc-future" data-date="2019-06-11">11</td>
                                                                                                <td class="fc-day-number fc-wed fc-future" data-date="2019-06-12">12</td>
                                                                                                <td class="fc-day-number fc-thu fc-future" data-date="2019-06-13">13</td>
                                                                                                <td class="fc-day-number fc-fri fc-future" data-date="2019-06-14">14</td>
                                                                                                <td class="fc-day-number fc-sat fc-future" data-date="2019-06-15">15</td>
                                                                                            </tr>
                                                                                        </thead>
                                                                                        <tbody>
                                                                                            <tr>
                                                                                                <td></td>
                                                                                                <td></td>
                                                                                                <td></td>
                                                                                                <td></td>
                                                                                                <td></td>
                                                                                                <td></td>
                                                                                                <td></td>
                                                                                            </tr>
                                                                                        </tbody>
                                                                                    </table>
                                                                                </div>
                                                                            </div>
                                                                            <div class="fc-row fc-week fc-widget-content" style="height: 78px;">
                                                                                <div class="fc-bg">
                                                                                    <table>
                                                                                        <tbody>
                                                                                            <tr>
                                                                                                <td class="fc-day fc-widget-content fc-sun fc-future" data-date="2019-06-16"></td>
                                                                                                <td class="fc-day fc-widget-content fc-mon fc-future" data-date="2019-06-17"></td>
                                                                                                <td class="fc-day fc-widget-content fc-tue fc-future" data-date="2019-06-18"></td>
                                                                                                <td class="fc-day fc-widget-content fc-wed fc-future" data-date="2019-06-19"></td>
                                                                                                <td class="fc-day fc-widget-content fc-thu fc-future" data-date="2019-06-20"></td>
                                                                                                <td class="fc-day fc-widget-content fc-fri fc-future" data-date="2019-06-21"></td>
                                                                                                <td class="fc-day fc-widget-content fc-sat fc-future" data-date="2019-06-22"></td>
                                                                                            </tr>
                                                                                        </tbody>
                                                                                    </table>
                                                                                </div>
                                                                                <div class="fc-content-skeleton">
                                                                                    <table>
                                                                                        <thead>
                                                                                            <tr>
                                                                                                <td class="fc-day-number fc-sun fc-future" data-date="2019-06-16">16</td>
                                                                                                <td class="fc-day-number fc-mon fc-future" data-date="2019-06-17">17</td>
                                                                                                <td class="fc-day-number fc-tue fc-future" data-date="2019-06-18">18</td>
                                                                                                <td class="fc-day-number fc-wed fc-future" data-date="2019-06-19">19</td>
                                                                                                <td class="fc-day-number fc-thu fc-future" data-date="2019-06-20">20</td>
                                                                                                <td class="fc-day-number fc-fri fc-future" data-date="2019-06-21">21</td>
                                                                                                <td class="fc-day-number fc-sat fc-future" data-date="2019-06-22">22</td>
                                                                                            </tr>
                                                                                        </thead>
                                                                                        <tbody>
                                                                                            <tr>
                                                                                                <td></td>
                                                                                                <td></td>
                                                                                                <td></td>
                                                                                                <td></td>
                                                                                                <td></td>
                                                                                                <td></td>
                                                                                                <td></td>
                                                                                            </tr>
                                                                                        </tbody>
                                                                                    </table>
                                                                                </div>
                                                                            </div>
                                                                            <div class="fc-row fc-week fc-widget-content" style="height: 78px;">
                                                                                <div class="fc-bg">
                                                                                    <table>
                                                                                        <tbody>
                                                                                            <tr>
                                                                                                <td class="fc-day fc-widget-content fc-sun fc-future" data-date="2019-06-23"></td>
                                                                                                <td class="fc-day fc-widget-content fc-mon fc-future" data-date="2019-06-24"></td>
                                                                                                <td class="fc-day fc-widget-content fc-tue fc-future" data-date="2019-06-25"></td>
                                                                                                <td class="fc-day fc-widget-content fc-wed fc-future" data-date="2019-06-26"></td>
                                                                                                <td class="fc-day fc-widget-content fc-thu fc-future" data-date="2019-06-27"></td>
                                                                                                <td class="fc-day fc-widget-content fc-fri fc-future" data-date="2019-06-28"></td>
                                                                                                <td class="fc-day fc-widget-content fc-sat fc-future" data-date="2019-06-29"></td>
                                                                                            </tr>
                                                                                        </tbody>
                                                                                    </table>
                                                                                </div>
                                                                                <div class="fc-content-skeleton">
                                                                                    <table>
                                                                                        <thead>
                                                                                            <tr>
                                                                                                <td class="fc-day-number fc-sun fc-future" data-date="2019-06-23">23</td>
                                                                                                <td class="fc-day-number fc-mon fc-future" data-date="2019-06-24">24</td>
                                                                                                <td class="fc-day-number fc-tue fc-future" data-date="2019-06-25">25</td>
                                                                                                <td class="fc-day-number fc-wed fc-future" data-date="2019-06-26">26</td>
                                                                                                <td class="fc-day-number fc-thu fc-future" data-date="2019-06-27">27</td>
                                                                                                <td class="fc-day-number fc-fri fc-future" data-date="2019-06-28">28</td>
                                                                                                <td class="fc-day-number fc-sat fc-future" data-date="2019-06-29">29</td>
                                                                                            </tr>
                                                                                        </thead>
                                                                                        <tbody>
                                                                                            <tr>
                                                                                                <td></td>
                                                                                                <td></td>
                                                                                                <td></td>
                                                                                                <td></td>
                                                                                                <td></td>
                                                                                                <td></td>
                                                                                                <td></td>
                                                                                            </tr>
                                                                                        </tbody>
                                                                                    </table>
                                                                                </div>
                                                                            </div>
                                                                            <div class="fc-row fc-week fc-widget-content" style="height: 83px;">
                                                                                <div class="fc-bg">
                                                                                    <table>
                                                                                        <tbody>
                                                                                            <tr>
                                                                                                <td class="fc-day fc-widget-content fc-sun fc-future" data-date="2019-06-30"></td>
                                                                                                <td class="fc-day fc-widget-content fc-mon fc-other-month fc-future" data-date="2019-07-01"></td>
                                                                                                <td class="fc-day fc-widget-content fc-tue fc-other-month fc-future" data-date="2019-07-02"></td>
                                                                                                <td class="fc-day fc-widget-content fc-wed fc-other-month fc-future" data-date="2019-07-03"></td>
                                                                                                <td class="fc-day fc-widget-content fc-thu fc-other-month fc-future" data-date="2019-07-04"></td>
                                                                                                <td class="fc-day fc-widget-content fc-fri fc-other-month fc-future" data-date="2019-07-05"></td>
                                                                                                <td class="fc-day fc-widget-content fc-sat fc-other-month fc-future" data-date="2019-07-06"></td>
                                                                                            </tr>
                                                                                        </tbody>
                                                                                    </table>
                                                                                </div>
                                                                                <div class="fc-content-skeleton">
                                                                                    <table>
                                                                                        <thead>
                                                                                            <tr>
                                                                                                <td class="fc-day-number fc-sun fc-future" data-date="2019-06-30">30</td>
                                                                                                <td class="fc-day-number fc-mon fc-other-month fc-future" data-date="2019-07-01">1</td>
                                                                                                <td class="fc-day-number fc-tue fc-other-month fc-future" data-date="2019-07-02">2</td>
                                                                                                <td class="fc-day-number fc-wed fc-other-month fc-future" data-date="2019-07-03">3</td>
                                                                                                <td class="fc-day-number fc-thu fc-other-month fc-future" data-date="2019-07-04">4</td>
                                                                                                <td class="fc-day-number fc-fri fc-other-month fc-future" data-date="2019-07-05">5</td>
                                                                                                <td class="fc-day-number fc-sat fc-other-month fc-future" data-date="2019-07-06">6</td>
                                                                                            </tr>
                                                                                        </thead>
                                                                                        <tbody>
                                                                                            <tr>

                                                                                                <td></td>
                                                                                                <td></td>
                                                                                                <td></td>
                                                                                                <td></td>
                                                                                                <td></td>
                                                                                                <td></td>
                                                                                                <td></td>
                                                                                            </tr>
                                                                                        </tbody>
                                                                                    </table>
                                                                                </div>
                                                                            </div>
                                                                        </div>
                                                                    </div>
                                                                </td>
                                                            </tr>
                                                        </tbody>
                                                    </table>
                                                </div>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="col-sm-3">
                                        <div class="widget-box transparent">
                                            <div class="widget-header">
                                                <h4>Eventos Arrastaveis</h4>
                                            </div>

                                            <div class="widget-body">
                                                <div class="widget-main no-padding">
                                                    <div id="external-events">
                                                        <div class="external-event label-grey ui-draggable ui-draggable-handle" data-class="label-grey" style="position: relative; z-index: auto; width: 311px; right: auto; height: 32px; bottom: auto; left: 0px; top: 0px;">
                                                            <i class="ace-icon fa fa-arrows"></i>
                                                            Arrastar para o dia
                                                        </div>

                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <!-- PAGE CONTENT ENDS -->
                            </div><!-- /.col -->
                        </div><!-- /.row -->
                    </div><!-- /.page-content -->
                </div>
            </div><!-- /.main-content -->

            <a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
                <i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
            </a>
        </div><!-- /.main-container -->

        <!-- basic scripts -->

        <!--[if !IE]> -->
        <script src="assets/js/jquery-2.1.4.min.js"></script>

        <!-- <![endif]-->

        <!--[if IE]>
<script src="assets/js/jquery-1.11.3.min.js"></script>
<![endif]-->
        <script type="text/javascript">
                if ('ontouchstart' in document.documentElement)
                    document.write("<script src='assets/js/jquery.mobile.custom.min.js'>" + "<" + "/script>");
        </script>
        <script src="assets/js/bootstrap.min.js"></script>

        <!-- page specific plugin scripts -->
        <script src="assets/js/jquery-ui.custom.min.js"></script>
        <script src="assets/js/jquery.ui.touch-punch.min.js"></script>
        <script src="assets/js/moment.min.js"></script>
        <script src="assets/js/fullcalendar.min.js"></script>
        <script src="assets/js/bootbox.js"></script>

        <!-- ace scripts -->
        <script src="assets/js/ace-elements.min.js"></script>
        <script src="assets/js/ace.min.js"></script>

        <!-- inline scripts related to this page -->
        <script type="text/javascript">
                jQuery(function ($) {

                    /* initialize the external events
                     -----------------------------------------------------------------*/

                    $('#external-events div.external-event').each(function () {

                        // create an Event Object (http://arshaw.com/fullcalendar/docs/event_data/Event_Object/)
                        // it doesn't need to have a start or end
                        var eventObject = {
                            title: $.trim($(this).text()) // use the element's text as the event title
                        };

                        // store the Event Object in the DOM element so we can get to it later
                        $(this).data('eventObject', eventObject);

                        // make the event draggable using jQuery UI
                        $(this).draggable({
                            zIndex: 999,
                            revert: true, // will cause the event to go back to its
                            revertDuration: 0  //  original position after the drag
                        });

                    });




                    /* initialize the calendar
                     -----------------------------------------------------------------*/

                    var date = new Date();
                    var d = date.getDate();
                    var m = date.getMonth();
                    var y = date.getFullYear();


                    var calendar = $('#calendar').fullCalendar({
                        //isRTL: true,
                        //firstDay: 1,// >> change first day of week 

                        buttonHtml: {
                            prev: '<i class="ace-icon fa fa-chevron-left"></i>',
                            next: '<i class="ace-icon fa fa-chevron-right"></i>'
                        },

                        header: {
                            left: 'prev,next today',
                            center: 'title',
                            right: 'month,agendaWeek,agendaDay'
                        },
                        events: [
                            {
                                title: 'All Day Event',
                                start: new Date(y, m, 1),
                                className: 'label-important'
                            },
                            {
                                title: 'Long Event',
                                start: moment().subtract(5, 'days').format('YYYY-MM-DD'),
                                end: moment().subtract(1, 'days').format('YYYY-MM-DD'),
                                className: 'label-success'
                            },
                            {
                                title: 'Some Event',
                                start: new Date(y, m, d - 3, 16, 0),
                                allDay: false,
                                className: 'label-info'
                            }
                        ]
                        ,

                        /**eventResize: function(event, delta, revertFunc) {
                         
                         alert(event.title + " end is now " + event.end.format());
                         
                         if (!confirm("is this okay?")) {
                         revertFunc();
                         }
                         
                         },*/

                        editable: true,
                        droppable: true, // this allows things to be dropped onto the calendar !!!
                        drop: function (date) { // this function is called when something is dropped

                            // retrieve the dropped element's stored Event Object
                            var originalEventObject = $(this).data('eventObject');
                            var $extraEventClass = $(this).attr('data-class');


                            // we need to copy it, so that multiple events don't have a reference to the same object
                            var copiedEventObject = $.extend({}, originalEventObject);

                            // assign it the date that was reported
                            copiedEventObject.start = date;
                            copiedEventObject.allDay = false;
                            if ($extraEventClass)
                                copiedEventObject['className'] = [$extraEventClass];

                            // render the event on the calendar
                            // the last `true` argument determines if the event "sticks" (http://arshaw.com/fullcalendar/docs/event_rendering/renderEvent/)
                            $('#calendar').fullCalendar('renderEvent', copiedEventObject, true);

                            // is the "remove after drop" checkbox checked?
                            if ($('#drop-remove').is(':checked')) {
                                // if so, remove the element from the "Draggable Events" list
                                $(this).remove();
                            }

                        }
                        ,
                        selectable: true,
                        selectHelper: true,
                        select: function (start, end, allDay) {

                            bootbox.prompt("New Event Title:", function (title) {
                                if (title !== null) {
                                    calendar.fullCalendar('renderEvent',
                                            {
                                                title: title,
                                                start: start,
                                                end: end,
                                                allDay: allDay,
                                                className: 'label-info'
                                            },
                                            true // make the event "stick"
                                            );
                                }
                            });


                            calendar.fullCalendar('unselect');
                        }
                        ,
                        eventClick: function (calEvent, jsEvent, view) {

                            //display a modal
                            var modal =
                                    '<div class="modal fade">\
                  <div class="modal-dialog">\
                   <div class="modal-content">\
                         <div class="modal-body">\
                           <button type="button" class="close" data-dismiss="modal" style="margin-top:-10px;">&times;</button>\
                           <form class="no-margin">\
                                  <label>Change event name &nbsp;</label>\
                                  <input class="middle" autocomplete="off" type="text" value="' + calEvent.title + '" />\
                                 <button type="submit" class="btn btn-sm btn-success"><i class="ace-icon fa fa-check"></i> Save</button>\
                           </form>\
                         </div>\
                         <div class="modal-footer">\
                                <button type="button" class="btn btn-sm btn-danger" data-action="delete"><i class="ace-icon fa fa-trash-o"></i> Delete Event</button>\
                                <button type="button" class="btn btn-sm" data-dismiss="modal"><i class="ace-icon fa fa-times"></i> Cancel</button>\
                         </div>\
                  </div>\
                 </div>\
                </div>';


                            var modal = $(modal).appendTo('body');
                            modal.find('form').on('submit', function (ev) {
                                ev.preventDefault();

                                calEvent.title = $(this).find("input[type=text]").val();
                                calendar.fullCalendar('updateEvent', calEvent);
                                modal.modal("hide");
                            });
                            modal.find('button[data-action=delete]').on('click', function () {
                                calendar.fullCalendar('removeEvents', function (ev) {
                                    return (ev._id == calEvent._id);
                                })
                                modal.modal("hide");
                            });

                            modal.modal('show').on('hidden', function () {
                                modal.remove();
                            });


                            //console.log(calEvent.id);
                            //console.log(jsEvent);
                            //console.log(view);

                            // change the border color just for fun
                            //$(this).css('border-color', 'red');

                        }

                    });


                })
        </script>

        <jsp:include page = "include/footer.jsp" />
        <jsp:include page = "javaScritp/carregado.html" />
    </body>
</html>
