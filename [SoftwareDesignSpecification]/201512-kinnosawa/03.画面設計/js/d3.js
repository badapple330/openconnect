(function() {
//データ設定
var dataList = [ 
    {"name": "どら焼き", "value": 10},
    {"name": "福うさぎ", "value": 20},
    {"name": "きんつば", "value": 30},
    {"name": "羊羹", "value": 50},
    {"name": "いちご大福", "value": 80},
    {"name": "餅菓子", "value":130},
    {"name": "その他", "value":210}
];
var barHeight = 30;
var w = 500;
var h = dataList.length * barHeight+50;
var svg = d3.select(".myGraph").append("svg").attr("width", w).attr("height", h);
//棒グラフの描画（縦軸）
svg.selectAll("rect").data(dataList).enter().append("rect")
	.attr("height", "25")
	.attr("width", function(d) { return d["value"]; })
	.attr("x", 80)
	.attr("y", function(d, i) { return i * barHeight; });
//データの名前を表示
svg.selectAll("text").data(dataList).enter().append("text")
	.attr("x", 0)
	.attr("y", function(d, i) { return i * barHeight + barHeight/2 ; })
	.text(function(d) { return d["name"]; });
//棒グラフの描画（横軸）
svg.selectAll("rect").data(dataList)
	.attr("fill",
	      function(d) {
		  return "rgb(0, " + Math.min(255, d["value"]) + ", " + Math.min(255, d["value"] * 2) + ")";
	      });
     var xScale = d3.scale.linear() // スケールを設定
        .domain([0, 2000]) // 表示上のサイズ
        .range([0, 300]); // 実際の出力サイズ
// x軸の描画
svg.append("g")
    .attr("class", "axis")
    .attr("transform", "translate(80, 210)") // 出力起点
    .call(d3.svg.axis()
    .scale(xScale) //スケールを適用する
    .orient("bottom") //下段に描画（bottomはデフォルトなので省略でもよい）
        );
 
})();
