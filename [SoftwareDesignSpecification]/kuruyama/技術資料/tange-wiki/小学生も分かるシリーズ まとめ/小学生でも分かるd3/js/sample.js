//データセット
var dataSet = [ 300, 130, 5, 60, 240 ];
// データに基づいて描写
d3.select("#myGraph")                 // SVG要素を指定
.selectAll("rect")                    // SVGでの四角形を表す要素を指定
.data(dataSet)                        // データを指定
.enter()                              // データに応じてrect要素を生成
.append("rect")                       // SVGの四角形を生成
.attr("x", 10)                         // 横棒グラフなのでX座標を0にする
.attr("y", function(d, i) {           // Y座標を配列の順序に応じて計算
	return i * 25;                    // 棒グラフのY座標を25px単位で計算
})
.attr("height", "20px")               // 棒グラフの高さを20pxで指定
.attr("width", "0px")                 // 最初の棒グラフの横幅を0pxに指定
.transition()                         // アニメーションに
.duration(1000)                       // 1秒かけてアニメーション
.attr("width", function(d, i) {       // 棒グラフの横幅を配列の内容に応じて計算
	return d + "px";                  // データの値をそのまま値とする
})

d3.select("#upDateButton")                 //button要素を指定
  .on("click",function(){                  //動作を指定
	  dataSet = [20, 130, 150, 10, 120];   //新しいデータにする
	  d3.select("#myGraph")
	    .selectAll("rect")
	    .data(dataSet)
	    .transition()
	    .duration(1000)                       // 1秒かけてアニメーション
	    .attr("width", function(d, i){
	    	return d + "px";
	    });
  });

// メモリを表示するためにリニアスケールを設定
var xScale = d3.scale.linear()         //リニアスケールを設定
  .domain([0, 300])                    //元のデータ範囲
  .range([0, 300])                     //実際の出力サイズ
// メモリを表示する
d3.select("#myGraph")
  .append("g")
  .attr("class", "axis")
  .attr("transform", "translate(10,"+((1+dataSet.length) * 20+5)+")")
.call(d3.svg.axis()                    //call()でメモリを表示する関数を呼び出す
		.scale(xScale)                 //スケールを適用
	    .orient("bottom")
      )