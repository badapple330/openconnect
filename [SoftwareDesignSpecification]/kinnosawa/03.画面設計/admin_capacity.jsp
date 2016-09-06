<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>売上管理</title>
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
<style>
    .axis text {
        font-family: sans-serif;
        font-size: 11px;
    }
    .axis path,
    .axis line {
        fill: none;
        stroke: black;
    }
</style>
<script src="js/jquery-1.11.3.min.js"></script> 
<script src="js/bootstrap.js"></script>
<script src="http://d3js.org/d3.v3.min.js" charset="utf-8"></script>
</head>
<body class="bodyBack">
<div class="container">
        <div class="adminBody">
            <h2>売上管理画面</h2>
            <br>
            <div class="text-center">
                <h4>閲覧したい年月を選択して下さい</h4>
                <form action="#" method="post">
                    <select name="year">
                        <option value="">年</option>
                        <option value="1">2016年</option>
                        <option value="2">2017年</option>
                        <option value="3">2018年</option>
                        <option value="4">2019年</option>
                        <option value="5">2020年</option>
                        <option value="6">2021年</option>
                        <option value="7">2022年</option>
                        <option value="8">2023年</option>
                        <option value="9">2024年</option>
                        <option value="10">2025年</option>
                        <option value="11">2026年</option>
                        <option value="12">2027年</option>
                    </select>
            
        	       <select name="month">
                        <option value="">月</option>
                        <option value="1">1月</option>
                        <option value="2">2月</option>
                        <option value="3">3月</option>
                        <option value="4">4月</option>
                        <option value="5">5月</option>
                        <option value="6">6月</option>
                        <option value="7">7月</option>
                        <option value="8">8月</option>
                        <option value="9">9月</option>
                        <option value="10">10月</option>
                        <option value="11">11月</option>
                        <option value="12">12月</option>
                    </select>
        	   <form action="#" method="post">
                       ～ 
                    <select name="year">
                        <option value="">年</option>
                        <option value="1">2016年</option>
                        <option value="2">2017年</option>
                        <option value="3">2018年</option>
                        <option value="4">2019年</option>
                        <option value="5">2020年</option>
                        <option value="6">2021年</option>
                        <option value="7">2022年</option>
                        <option value="8">2023年</option>
                        <option value="9">2024年</option>
                        <option value="10">2025年</option>
                        <option value="11">2026年</option>
                        <option value="12">2027年</option>
                    </select>
        
        	       <select name="month">
                        <option value="">月</option>
                        <option value="1">1月</option>
                        <option value="2">2月</option>
                        <option value="3">3月</option>
                        <option value="4">4月</option>
                        <option value="5">5月</option>
                        <option value="6">6月</option>
                        <option value="7">7月</option>
                        <option value="8">8月</option>
                        <option value="9">9月</option>
                        <option value="10">10月</option>
                        <option value="11">11月</option>
                        <option value="12">12月</option>
                    </select>
                <button class="btn btn-primary ken"> 検索 </button>
          
                </form>
                </form>
            </div>        
            <br>
            
                <div class="graph">
                <div class="myGraph text-left"></div>
                <script src="js/d3.js"></script>
                </div>
            
            <br>
            
                <div class="text-center">
                    <ul class="pagination">
		              <li>
                        <a href="#" aria-label="前のページへ">
                            <span aria-hidden="true">«</span>
                        </a>
		              </li>
                        <li><a href="#">1</a></li>
                        <li class="active"><a href="#">2</a></li>
                        <li><a href="#">3</a></li>
                        <li><a href="#">4</a></li>
                        <li><a href="#">5</a></li>
                        <li>
                            <a href="#" aria-label="次のページへ">
                                <span aria-hidden="true">»</span>
                            </a>
                        </li>
                    </ul>
                </div>
            </div>
        <div class="adminFooter">
        </div>
    </div>        
</body>
</html>