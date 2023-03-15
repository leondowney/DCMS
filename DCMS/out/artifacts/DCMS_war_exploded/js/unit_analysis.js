/**
 * Created by Administrator on 2017/9/12.
 */
/**
 * Created by Administrator on 2017/4/25.
 */

function companyAnalysis(){
    var type = $("#type").val();
    var begin = $("#begin").val();
    var end = $("#end").val();

    //危化品类型分类饼图
    $.ajax({
        url:"company/analysisType01",
        type:"post",
        data:{type:type,begin:begin,end:end},
        success:function (res){

            var ss = JSON.parse(res);
            var nameArr = [];
            var anny1 = "";
            var sum = 0;
            for(var i = 0;i<ss.data.length;i++) {
                nameArr.push(ss.data[i].name);
                sum += ss.data[i].value;

                if (i == ss.data.length - 1) {
                    anny1 += ss.data[i].name + "等";
                }else {
                    anny1 += ss.data[i].name + "、";
                }
            }
            $("#anny1").text(anny1);
            $("#anny2").text(sum+"个");

            $("#t11 *:not(.first_td)").remove();
            $("#t12 *:not(.first_td)").remove();
            $("#t13 *:not(.first_td)").remove();

            var max = 0;
            var min = 0;
            for(var i = 0;i<ss.data.length;i++) {
                var c =ss.data[i].value/sum;
                var td1 = "<td>"+ss.data[i].name+"</td>";
                var td2 = "<td>"+ss.data[i].value+"</td>";
                var td3 = "<td>"+(c*100).toFixed(2)+"%</td>";
                $("#t11").append(td1);
                $("#t12").append(td2);
                $("#t13").append(td3);

                if (i > 0) {
                    if (ss.data[i].value > ss.data[max].value) {
                        max = i;
                    }

                    if (ss.data[i].value < ss.data[min].value) {
                        min = i;
                    }
                }
            }

            $("#anny3").text(ss.data[max].name + "(" + ss.data[max].value + "个,占比" + (ss.data[max].value/sum * 100).toFixed(2) + "%)");
            $("#anny4").text(ss.data[min].name + "(" + ss.data[min].value + "个,占比" + (ss.data[min].value/sum * 100).toFixed(2) + "%)");

            var myChart = echarts.init($("#container")[0]);
            var option = {
                tooltip : {
                    trigger: 'item',
                    formatter: "{a} <br/>{b} : {c} ({d}%)"
                },
                legend: {
                    orient : 'vertical',
                    x : 'left',
                    data:nameArr
                },

                series : [
                    {
                        name:'不同类型单位占比',
                        type:'pie',
                        radius : '55%',
                        center: ['50%', '60%'],
                        data:ss.data
                    }
                ]
            };
            myChart.setOption(option);
        }
    });

    //区域分类饼图
    $.ajax({
        url:"company/analysisLocation",
        type:"post",
        data:{type:type,begin:begin,end:end},
        success:function (res){
            var ss = JSON.parse(res);
            var nameArr = [];

            var sum = 0;
            for(var i = 0;i<ss.data.length;i++) {
                nameArr.push(ss.data[i].name);
                sum += ss.data[i].value;
            }

            $("#t21 *:not(.first_td)").remove();
            $("#t22 *:not(.first_td)").remove();
            $("#t23 *:not(.first_td)").remove();

            $("#t41 *:not(.first_td)").remove();
            $("#t42 *:not(.first_td)").remove();
            $("#t43 *:not(.first_td)").remove();

            for(var i = 0;i<ss.data.length;i++) {
                var c =ss.data[i].value/sum;
                var td1 = "<td>"+ss.data[i].name+"</td>";
                var td2 = "<td>"+ss.data[i].value+"</td>";
                var td3 = "<td>"+(c*100).toFixed(2)+"%</td>";
                $("#t21").append(td1);
                $("#t22").append(td2);
                $("#t23").append(td3);

                $("#t41").append(td1);
                $("#t42").append(td2);
                $("#t43").append(td3);
            }

            var myChart = echarts.init($("#container2")[0]);
            var option = {
                tooltip : {
                    trigger: 'item',
                    formatter: "{a} <br/>{b} : {c} ({d}%)"
                },
                legend: {
                    orient : 'vertical',
                    x : 'left',
                    data:nameArr
                },

                series : [
                    {
                        name:'不同类型单位占比',
                        type:'pie',
                        radius : '55%',
                        center: ['50%', '60%'],
                        data:ss.data
                    }
                ]
            };
            myChart.setOption(option);
        }
    });

    //危化品分类柱状图
    $.ajax({
        url: "company/analysisType01",
        type: "post",
        data: {type:type, begin:begin, end:end},
        success: function (res) {
            var ss = JSON.parse(res);

            var nameArr = [];
            var valueArr = [];

            var sum = 0;
            for (var i = 0; i < ss.data.length; i++) {
                nameArr.push(ss.data[i].name);
                valueArr.push(ss.data[i].value);
                sum += ss.data[i].value;
            }

            $("#t31 *:not(.first_td)").remove();
            $("#t32 *:not(.first_td)").remove();
            $("#t33 *:not(.first_td)").remove();

            for(var i = 0;i<ss.data.length;i++) {
                var c =ss.data[i].value/sum;
                var td1 = "<td>"+ss.data[i].name+"</td>";
                var td2 = "<td>"+ss.data[i].value+"</td>";
                var td3 = "<td>"+(c*100).toFixed(2)+"%</td>";
                $("#t31").append(td1);
                $("#t32").append(td2);
                $("#t33").append(td3);
            }

            var myChart = echarts.init($("#container1")[0]);
            var option = {
                tooltip : {
                    trigger: 'axis',
                    axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                        type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
                    }
                },
                legend: {
                    data:[]
                },
                calculable : true,
                xAxis : [
                    {
                        type : 'category',
                        data:nameArr,
                        rotate:40,interval:0
                    }
                ],

                yAxis : [
                    {
                        type : 'value'
                    }
                ],
                series : [
                    {
                        name:'单位数量（个）',
                        type:'bar',
                        barWidth:'30',
                        data:valueArr,
                        itemStyle: {
                            normal: {
                                color:"#269fec"
                            }
                        }

                    }
                ]
            };
            myChart.setOption(option);
        }
    });

    //区域危化品叠加柱状图
    $.ajax({
        url: "company/analysisTAndL",
        type: "post",
        data: {type:type, begin:begin, end:end},
        success: function (res) {
            var rs = JSON.parse(res);
            var ss = rs.data[0];
            var ssl = rs.data[1];
            var series = [];
            var nameArr = [];
            var locationArr = [];
            for (var i = 0; i < ss.length; i++) {
                var data = {
                    name:ss[i].type01,
                    type:'bar',
                    barWidth:'15',
                    stack: '总量',
                    itemStyle : { normal: {label : {show: true, position: 'insideRight'}}},
                    data:ss[i].count,
                };
                series.push(data);
                nameArr.push(ss[i].type01);
            }

            for (var i = 0; i < ssl.length; i++) {
                locationArr.push(ssl[i].location);
            }

            var myChart = echarts.init($("#container3")[0]);
            var option = {
                tooltip : {
                    trigger: 'axis',
                    axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                        type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
                    }
                },
                symbolSize:1,
                legend: {
                    data:nameArr
                },

                calculable : true,
                xAxis : [
                    {
                        type : 'category',
                        data : locationArr,
                    }

                ],
                yAxis : [
                    {
                        type : 'value'
                    }

                ],

                series : series
            };
            myChart.setOption(option);
        }
    });

    //折线趋势图
    $.ajax({
        url: "company/analysisLineChart",
        type: "post",
        data: {type: type, begin: begin, end: end},
        success: function (res) {

            $("#t51 *:not(.first_td)").remove();
            $("#t52 *:not(.first_td)").remove();
            $("#t53 *:not(.first_td)").remove();

            var rs = JSON.parse(res);
            var ss = rs.data[0];
            var ssl = rs.data[1];
            var series = [];
            var nameArr = [];
            var monthArr = [];

            var sum = 0;
            for (var i = 0; i < ss.length; i++) {
                var data = {
                    name:ss[i].type01,
                    type:'line',
                    data:ss[i].count
                };
                series.push(data);
                nameArr.push(ss[i].type01);

                for (var j=0;j<ss[i].count.length;j++) {
                    sum += ss[i].count[j];
                }
            }

            for (var i = 0; i < ssl.length; i++) {
                monthArr.push(ssl[i].month);
                var td1 = "<td>"+ssl[i].month+"</td>";
                $("#t51").append(td1);

                var iSum = 0;
                for (var j = 0; j<ss.length;j++) {
                    iSum += ss[j].count[i];
                }
                var td2 = "<td>"+iSum+"</td>";
                var per = iSum/sum;
                var td3 = "<td>"+(per*100).toFixed(2)+"%</td>";
                $("#t52").append(td2);
                $("#t53").append(td3);
            }


            var myChart = echarts.init($("#container4")[0]);
            var option = {

                tooltip : {
                    trigger: 'axis'
                },
                legend: {
                    data:nameArr
                },

                calculable : true,
                xAxis : [
                    {
                        type : 'category',
                        boundaryGap : false,
                        data : monthArr
                    }
                ],
                yAxis : [
                    {
                        type : 'value'
                    }
                ],
                series : series
            };
            myChart.setOption(option);
        }
    })
}


//初始化危化品分类饼图
$(function(){

    $.ajax({
        url:"company/analysisType01",
        type:"post",
        data:{type:"",begin:"",end:""},
        success:function (res){
            var ss = JSON.parse(res);
            var nameArr = [];
            var anny1 = "";
            var sum = 0;
            for(var i = 0;i<ss.data.length;i++) {
                nameArr.push(ss.data[i].name);

                if (i == ss.data.length - 1) {
                    anny1 += ss.data[i].name + "等";
                }else {
                    anny1 += ss.data[i].name + "、";
                }

                sum += ss.data[i].value;
            }

            $("#anny1").text(anny1);
            $("#anny2").text(sum+"个");

            var max = 0;
            var min = 0;
            for(var i = 0;i<ss.data.length;i++) {

                var c =ss.data[i].value/sum;
                var td1 = "<td>"+ss.data[i].name+"</td>";
                var td2 = "<td>"+ss.data[i].value+"</td>";
                var td3 = "<td>"+(c*100).toFixed(2)+"%</td>";
                $("#t11").append(td1);
                $("#t12").append(td2);
                $("#t13").append(td3);

                if (i > 0) {
                    if (ss.data[i].value > ss.data[max].value) {
                        max = i;
                    }

                    if (ss.data[i].value < ss.data[min].value) {
                        min = i;
                    }
                }
            }

            $("#anny3").text(ss.data[max].name + "(" + ss.data[max].value + "个,占比" + (ss.data[max].value/sum * 100).toFixed(2) + "%)");
            $("#anny4").text(ss.data[min].name + "(" + ss.data[min].value + "个,占比" + (ss.data[min].value/sum * 100).toFixed(2) + "%)");


            var myChart = echarts.init($("#container")[0]);
            var option = {
                tooltip : {
                    trigger: 'item',
                    formatter: "{a} <br/>{b} : {c} ({d}%)"
                },
                legend: {
                    orient : 'vertical',
                    x : 'left',
                    data:nameArr
                },

                series : [
                    {
                        name:'不同类型单位占比',
                        type:'pie',
                        radius : '55%',
                        center: ['50%', '60%'],
                        data:ss.data
                    }
                ]
            };
            myChart.setOption(option);
        }
    })




});

//初始化区域分类饼图
$(function(){

    $.ajax({
        url:"company/analysisLocation",
        type:"post",
        data:{type:"",begin:"",end:""},
        success:function (res){
            var ss = JSON.parse(res);
            var nameArr = [];

            var sum = 0;
            for(var i = 0;i<ss.data.length;i++) {
                nameArr.push(ss.data[i].name);
                sum += ss.data[i].value;
            }

            var max = 0;
            var min = 0;
            for(var i = 0;i<ss.data.length;i++) {
                var c =ss.data[i].value/sum;
                var td1 = "<td>"+ss.data[i].name+"</td>";
                var td2 = "<td>"+ss.data[i].value+"</td>";
                var td3 = "<td>"+(c*100).toFixed(2)+"%</td>";
                $("#t21").append(td1);
                $("#t22").append(td2);
                $("#t23").append(td3);

                $("#t41").append(td1);
                $("#t42").append(td2);
                $("#t43").append(td3);

                if (i > 0) {
                    if (ss.data[i].value > ss.data[max].value) {
                        max = i;
                    }
                    if (ss.data[i].value < ss.data[min].value) {
                        min = i;
                    }
                }
            }

            $("#anny5").text(ss.data[max].name + "(" + ss.data[max].value + "个)");
            $("#anny6").text(ss.data[min].name + "(" + ss.data[min].value + "个)");

            var myChart = echarts.init($("#container2")[0]);
            var option = {
                tooltip : {
                    trigger: 'item',
                    formatter: "{a} <br/>{b} : {c} ({d}%)"
                },
                legend: {
                    orient : 'vertical',
                    x : 'left',
                    data:nameArr
                },

                series : [
                    {
                        name:'不同类型单位占比',
                        type:'pie',
                        radius : '55%',
                        center: ['50%', '60%'],
                        data:ss.data
                    }
                ]
            };
            myChart.setOption(option);
        }
    })
});

//初始化危化品分类柱状图
$(function(){

    $.ajax({
        url: "company/analysisType01",
        type: "post",
        data: {type: "", begin: "", end: ""},
        success: function (res) {
            var ss = JSON.parse(res);

            var nameArr = [];
            var valueArr = [];

            var sum = 0;
            for (var i = 0; i < ss.data.length; i++) {
                nameArr.push(ss.data[i].name);
                valueArr.push(ss.data[i].value);
                sum += ss.data[i].value;
            }

            for(var i = 0;i<ss.data.length;i++) {
                var c =ss.data[i].value/sum;
                var td1 = "<td>"+ss.data[i].name+"</td>";
                var td2 = "<td>"+ss.data[i].value+"</td>";
                var td3 = "<td>"+(c*100).toFixed(2)+"%</td>";
                $("#t31").append(td1);
                $("#t32").append(td2);
                $("#t33").append(td3);
            }



            var myChart = echarts.init($("#container1")[0]);
            var option = {
                tooltip : {
                    trigger: 'axis',
                    axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                        type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
                    }
                },
                legend: {
                    data:[]
                },
                calculable : true,
                xAxis : [
                    {
                        type : 'category',
                        data:nameArr,
                        rotate:40,interval:0
                    }
                ],

                yAxis : [
                    {
                        type : 'value'
                    }
                ],
                series : [
                    {
                        name:'单位数量（个）',
                        type:'bar',
                        barWidth:'30',
                        data:valueArr,
                        itemStyle: {
                            normal: {
                                color:"#269fec"
                            }
                        }

                    }
                ]
            };
            myChart.setOption(option);
        }
    });
});

//初始化区域危化品叠加柱状图
$(function(){

    $.ajax({
        url: "company/analysisTAndL",
        type: "post",
        data: {type: "", begin: "", end: ""},
        success: function (res) {
            var rs = JSON.parse(res);
            var ss = rs.data[0];
            var ssl = rs.data[1];
            var series = [];
            var nameArr = [];
            var locationArr = [];
            for (var i = 0; i < ss.length; i++) {
                var data = {
                    name:ss[i].type01,
                    type:'bar',
                    barWidth:'15',
                    stack: '总量',
                    itemStyle : { normal: {label : {show: true, position: 'insideRight'}}},
                    data:ss[i].count,
                };
                series.push(data);
                nameArr.push(ss[i].type01);
            }

            for (var i = 0; i < ssl.length; i++) {
                locationArr.push(ssl[i].location);
            }

            var myChart = echarts.init($("#container3")[0]);
            var option = {
                tooltip : {
                    trigger: 'axis',
                    axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                        type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
                    }
                },
                symbolSize:1,
                legend: {
                    data:nameArr
                },

                calculable : true,
                xAxis : [
                    {
                        type : 'category',
                        data : locationArr,
                    }

                ],
                yAxis : [
                    {
                        type : 'value'
                    }

                ],

                series : series
            };
            myChart.setOption(option);
        }
    });


});

//初始化折线趋势图
$(function(){
    $.ajax({
        url: "company/analysisLineChart",
        type: "post",
        data: {type: "", begin: "", end: ""},
        success: function (res) {

            var rs = JSON.parse(res);
            var ss = rs.data[0];
            var ssl = rs.data[1];
            var series = [];
            var nameArr = [];
            var monthArr = [];

            var sum = 0;
            for (var i = 0; i < ss.length; i++) {
                var data = {
                    name:ss[i].type01,
                    type:'line',
                    data:ss[i].count
                };
                series.push(data);
                nameArr.push(ss[i].type01);

                for (var j=0;j<ss[i].count.length;j++) {
                    sum += ss[i].count[j];
                }
            }

            for (var i = 0; i < ssl.length; i++) {
                monthArr.push(ssl[i].month);
                var td1 = "<td>"+ssl[i].month+"</td>";
                $("#t51").append(td1);

                var iSum = 0;
                for (var j = 0; j<ss.length;j++) {
                    iSum += ss[j].count[i];
                }
                var td2 = "<td>"+iSum+"</td>";
                var per = iSum/sum;
                var td3 = "<td>"+(per*100).toFixed(2)+"%</td>";
                $("#t52").append(td2);
                $("#t53").append(td3);
            }


            var myChart = echarts.init($("#container4")[0]);
            var option = {

                tooltip : {
                    trigger: 'axis'
                },
                legend: {
                    data:nameArr
                },

                calculable : true,
                xAxis : [
                    {
                        type : 'category',
                        boundaryGap : false,
                        data : monthArr
                    }
                ],
                yAxis : [
                    {
                        type : 'value'
                    }
                ],
                series : series
            };
            myChart.setOption(option);
        }
    })
})


    function endLimit(){
        var end = $("#end").val();
        $("#begin").attr("max",end);
    }
    function beginLimit(){
        var begin = $("#begin").val();
        $("#end").attr("min",begin);
    }

    // function openEcharts(){
    //     layer.open({
    //         type: 2,
    //         title: '各区域从业单位分析图',
    //         shade: 0.5,
    //         skin: 'layui-layer-rim',
    //         area: ['70%', '60%'],
    //         shadeClose: true,
    //         closeBtn: 2,
    //         content: 'echartsDemo.html'
    //     });
    // }