/**
 * Created by Administrator on 2017/9/12.
 */
/**
 * Created by Administrator on 2017/4/25.
 */

function endLimit(){
    var end = $("#end").val();
    $("#begin").attr("max",end);
}
function beginLimit(){
    var begin = $("#begin").val();
    $("#end").attr("min",begin);
}

    function personAnalysis() {
       var type =  $("#type").val()
       var begin =  $("#begin").val()
       var end =  $("#end").val()
    console.log("type~~~"+type)
    console.log("begin~~~"+begin)
    console.log("end~~~"+end)

    $.ajax({
        url: "persons/analyze",
        type: "post",
        data: {type: type, begin: begin, end: end},
        success: function (res) {
            console.log(res);
            var result = JSON.parse(res);
            console.log(result);
            console.log(result.data1)
            // data1 危险品
            // data2 年龄
            // data3 区域
            // data4 公司性质

            var arr1 = [];//危险品名
            for (var i = 0; i < result.data1.length; i++) {
                arr1.push(result.data1[i].name);
            }
            var arr1value = [];
            var arr1sum = 0
            for (var i = 0; i < result.data1.length; i++) {
                arr1value.push(result.data1[i].value);
                // arr1sum +=result.data3[i].value
                arr1sum += parseInt(result.data1[i].value)
            }
            $("#sum").text(arr1sum)//人员总和
            $("#type01sum").text( arr1.length)//危险品总和



            var arr2 = [];//年龄名字
            for (var i = 0; i < result.data2.length; i++) {
                arr2.push(result.data2[i].name);
            }
            var arr2value = [];
            var arr2sum = 0
            for (var i = 0; i < result.data2.length; i++) {
                arr2value.push(result.data2[i].value);
                // arr3sum +=result.data3[i].value
                arr2sum += parseInt(result.data2[i].value)
            }

            //区域饼图
            var arr3 = [];//区域名
            console.log(result.data3);
            for (var i = 0; i < result.data3.length; i++) {
                arr3.push(result.data3[i].name);
            }
            var arr3value = [];
            var arr3sum = 0
            for (var i = 0; i < result.data3.length; i++) {
                arr3value.push(result.data3[i].value);
                // arr3sum +=result.data3[i].value
                arr3sum += parseInt(result.data3[i].value)
            }

            var myChart = echarts.init($("#container2")[0]);
            var option = {
                tooltip: {
                    trigger: 'item',
                    formatter: "{a} <br/>{b} : {c} ({d}%)"
                },
                legend: {
                    orient: 'vertical',
                    x: 'left',
                    data: arr3 //['东区','西区','南区','北区',"其他"]
                },

                calculable: false,
                series: [
                    {
                        name: '各区域人员占比',
                        type: 'pie',
                        radius: '55%',
                        center: ['50%', '60%'],
                        data: result.data3
                    }
                ]
            };
            myChart.setOption(option);

            //区域表格
            $("#t31 *:not(.first_td)").remove();
            $("#t32 *:not(.first_td)").remove();
            $("#t33 *:not(.first_td)").remove();
            for (var i = 0; i <= arr3.length - 1; i++) {

                // var td1 = "<td>"+ss.data[i].name+"</td>";
                var td1 = "<td>" + arr3[i] + "</td>";
                $("#t31").append(td1)
            }
            maxindex = 0
            minindex = 0
            for (var i = 0; i <= arr3value.length - 1; i++) {

                if (i > 0) {
                    if (arr3value[i] > arr3value[maxindex]) {
                        maxindex = i;
                    }

                    if (arr3value[i] < arr3value[minindex]) {
                        minindex = i;
                    }
                }


                var td2 = "<td>" + arr3value[i] + "</td>";
                $("#t32").append(td2)
                // var td3 = "<td>"+arr3value[i]/arr3sum+"</td>";
                var c = arr3value[i] / arr3sum
                console.log("arr3value:" + arr3value)
                console.log("arr3sum:" + arr3sum)
                var td3 = "<td>" + (c * 100).toFixed(2) + "%</td>";
                $("#t33").append(td3)

                var maxarea = arr3[maxindex] + ":" + arr3value[maxindex] + "(人)"
                var minarea = arr3[minindex] + ":" + arr3value[minindex] + "(人)"

                $("#maxarea").text(maxarea)
                $("#minarea").text(minarea)

            }


            //年龄饼图
            var myChart = echarts.init($("#container3")[0]);
            var option = {
                tooltip: {
                    trigger: 'item',
                    formatter: "{a} <br/>{b} : {c} ({d}%)"
                },
                legend: {
                    orient: 'vertical',
                    x: 'left',
                    data: arr2
                },

                calculable: false,
                series: [
                    {
                        name: '人员年龄段分析',
                        type: 'pie',
                        radius: '55%',
                        center: ['50%', '60%'],
                        data: result.data2

                    }
                ]
            };
            myChart.setOption(option);
            //年龄表格
            $("#t41 *:not(.first_td)").remove();
            $("#t42 *:not(.first_td)").remove();
            $("#t43 *:not(.first_td)").remove();
            for (var i = 0; i <= arr2.length - 1; i++) {
                var td1 = "<td>" + arr2[i] + "</td>";
                $("#t41").append(td1)
            }

            maxindex = 0
            minindex = 0
            for (var i = 0; i <= arr2value.length - 1; i++) {
                if (i > 0) {
                    if (arr2value[i] > arr2value[maxindex]) {
                        maxindex = i;
                    }

                    if (arr2value[i] < arr2value[minindex]) {
                        minindex = i;
                    }
                }

            }
            var td2 = "<td>" + arr2value[i] + "</td>";
            $("#t42").append(td2)
            // var td3 = "<td>"+arr3value[i]/arr3sum+"</td>";
            var c = arr2value[i] / arr2sum
            console.log("arr2value:" + arr2value)
            console.log("arr2sum:" + arr2sum)
            var td3 = "<td>" + (c * 100).toFixed(2) + "%</td>";
            $("#t43").append(td3)

            var maxage = arr2[maxindex] + ":" + arr2value[maxindex] + "(人)"
            var minage = arr2[minindex] + ":" + arr2value[minindex] + "(人)"

            $("#maxage").text(maxage)
            $("#minage").text(minage)











            //危险品分类饼图
            var myChart = echarts.init($("#container")[0]);
            var option = {
                tooltip: {
                    trigger: 'item',
                    formatter: "{a} <br/>{b} : {c} ({d}%)"
                },
                legend: {
                    orient: 'vertical',
                    x: 'left',
                    data: arr1
                },

                series: [
                    {
                        name: '不同类型危险品占比',
                        type: 'pie',
                        radius: '55%',
                        center: ['50%', '60%'],
                        data: result.data1
                    }
                ]
            };
            myChart.setOption(option);
            //危险品表格
            $("#t11 *:not(.first_td)").remove();
            $("#t12 *:not(.first_td)").remove();
            $("#t13 *:not(.first_td)").remove();
            for (var i = 0; i <= arr1.length - 1; i++) {
                var td1 = "<td>" + arr1[i] + "</td>";
                $("#t11").append(td1)
            }
            for (var i = 0; i <= arr1value.length - 1; i++) {
                var td2 = "<td>" + arr1value[i] + "</td>";
                $("#t12").append(td2)
                // var td3 = "<td>"+arr3value[i]/arr3sum+"</td>";
                var c = arr1value[i] / arr1sum
                console.log("arr1value:" + arr1value)
                console.log("arr1sum:" + arr1sum)
                var td3 = "<td>" + (c * 100).toFixed(2) + "%</td>";
                $("#t13").append(td3)
            }


            //公司表格
            $("#t21 *:not(.first_td)").remove();
            $("#t22 *:not(.first_td)").remove();
            $("#t23 *:not(.first_td)").remove();
            var arr4 = [];
            for (var i = 0; i < result.data4.length; i++) {
                arr4.push(result.data4[i].name);
            }
            var arr4value = [];
            var arr4sum = 0
            for (var i = 0; i < result.data4.length; i++) {
                arr4value.push(result.data4[i].value);
                // arr3sum +=result.data3[i].value
                arr4sum += parseInt(result.data4[i].value)
            }
            for (var i = 0; i <= arr4.length - 1; i++) {
                var td1 = "<td>" + arr4[i] + "</td>";
                $("#t21").append(td1)
            }

            maxindex=0
            minindex=0
            for (var i = 0; i <= arr4value.length - 1; i++) {
                if (i > 0) {
                    if (arr4value[i] > arr4value[maxindex]) {
                        maxindex = i;
                    }

                    if (arr4value[i] < arr4value[minindex]) {
                        minindex = i;
                    }
                }

                var td2 = "<td>" + arr4value[i] + "</td>";
                $("#t22").append(td2)
                // var td3 = "<td>"+arr3value[i]/arr3sum+"</td>";
                var c = arr4value[i] / arr1sum
                console.log("arr4value:" + arr4value)
                console.log("arr4sum:" + arr4sum)
                var td3 = "<td>" + (c * 100).toFixed(2) + "%</td>";
                $("#t23").append(td3)
                var maxtype  = arr4[maxindex] + ":" + arr4value[maxindex] + "(人)"
                var mintype = arr4[minindex] + ":" + arr4value[minindex] + "(人)"

                $("#maxtype").text(maxtype)
                $("#mintype").text(mintype)


            }

            //公司类型分类柱图

            var myChart = echarts.init($("#container1")[0]);
            var option = {
                tooltip: {
                    trigger: 'axis',
                    axisPointer: {            // 坐标轴指示器，坐标轴触发有效
                        type: 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
                    }
                },
                legend: {
                    data: []
                },

                calculable: true,//true
                xAxis: [
                    {
                        type: 'category',
                        data: arr4,
                        rotate: 40, interval: 0
                    }
                ],

                yAxis: [
                    {
                        type: 'value'
                    }
                ],
                series: [
                    {
                        name: '从业人员数量（个）',
                        type: 'bar',
                        barWidth: '30',
                        data: arr4value,
                        itemStyle: {
                            normal: {
                                color: "#269fec"
                            }
                        }

                    }
                ]
            };
            myChart.setOption(option);
        }
    })

}



$(function() {
    $.ajax({
        url: "persons/analyze",
        type: "post",
        data: {type:"", begin:"1990-01-01", end:"2025-01-01"},
        success: function (res) {
            console.log(res);
            var result = JSON.parse(res);
            console.log(result);
            console.log(result.data1)
            // data1 危险品
            // data2 年龄
            // data3 区域
            // data4 公司性质

            var arr1 = [];//危险品名
            for (var i = 0; i < result.data1.length; i++) {
                arr1.push(result.data1[i].name);
            }
            var arr1value = [];
            var arr1sum = 0
            for (var i = 0; i < result.data1.length; i++) {
                arr1value.push(result.data1[i].value);
                // arr1sum +=result.data3[i].value
                arr1sum += parseInt(result.data1[i].value)
            }
            $("#sum").text(arr1sum)//人员总和
            $("#type01sum").text( arr1.length)//危险品总和



            var arr2 = [];//年龄名字
            for (var i = 0; i < result.data2.length; i++) {
                arr2.push(result.data2[i].name);
            }
            var arr2value = [];
            var arr2sum = 0
            for (var i = 0; i < result.data2.length; i++) {
                arr2value.push(result.data2[i].value);
                // arr3sum +=result.data3[i].value
                arr2sum += parseInt(result.data2[i].value)
            }

            //危险品分类饼图
            var myChart = echarts.init($("#container")[0]);
            var option = {
                tooltip: {
                    trigger: 'item',
                    formatter: "{a} <br/>{b} : {c} ({d}%)"
                },
                legend: {
                    orient: 'vertical',
                    x: 'left',
                    data: arr1
                },

                series: [
                    {
                        name: '不同类型危险品占比',
                        type: 'pie',
                        radius: '55%',
                        center: ['50%', '60%'],
                        data: result.data1
                    }
                ]
            };
            myChart.setOption(option);
            //危险品表格
            $("#t11 *:not(.first_td)").remove();
            $("#t12 *:not(.first_td)").remove();
            $("#t13 *:not(.first_td)").remove();
            for (var i = 0; i <= arr1.length - 1; i++) {
                var td1 = "<td>" + arr1[i] + "</td>";
                $("#t11").append(td1)
            }
            for (var i = 0; i <= arr1value.length - 1; i++) {
                var td2 = "<td>" + arr1value[i] + "</td>";
                $("#t12").append(td2)
                // var td3 = "<td>"+arr3value[i]/arr3sum+"</td>";
                var c = arr1value[i] / arr1sum
                console.log("arr1value:" + arr1value)
                console.log("arr1sum:" + arr1sum)
                var td3 = "<td>" + (c * 100).toFixed(2) + "%</td>";
                $("#t13").append(td3)
            }


            //区域饼图
            var arr3 = [];//区域名
            console.log(result.data3);
            for (var i = 0; i < result.data3.length; i++) {
                arr3.push(result.data3[i].name);
            }
            var arr3value = [];
            var arr3sum = 0
            for (var i = 0; i < result.data3.length; i++) {
                arr3value.push(result.data3[i].value);
                // arr3sum +=result.data3[i].value
                arr3sum += parseInt(result.data3[i].value)
            }

            var myChart1 = echarts.init($("#container2")[0]);
            var option1 = {
                tooltip: {
                    trigger: 'item',
                    formatter: "{a} <br/>{b} : {c} ({d}%)"
                },
                legend: {
                    orient: 'vertical',
                    x: 'left',
                    data: arr3 //['东区','西区','南区','北区',"其他"]
                },

                calculable: false,
                series: [
                    {
                        name: '各区域人员占比',
                        type: 'pie',
                        radius: '55%',
                        center: ['50%', '60%'],
                        data: result.data3
                    }
                ]
            };
            myChart1.setOption(option1);

            //区域表格
            $("#t31 *:not(.first_td)").remove();
            $("#t32 *:not(.first_td)").remove();
            $("#t33 *:not(.first_td)").remove();
            for (var i = 0; i <= arr3.length - 1; i++) {

                // var td1 = "<td>"+ss.data[i].name+"</td>";
                var td1 = "<td>" + arr3[i] + "</td>";
                $("#t31").append(td1)
            }
            maxindex = 0
            minindex = 0
            for (var i = 0; i <= arr3value.length - 1; i++) {

                if (i > 0) {
                    if (arr3value[i] > arr3value[maxindex]) {
                        maxindex = i;
                    }

                    if (arr3value[i] < arr3value[minindex]) {
                        minindex = i;
                    }
                }


                var td2 = "<td>" + arr3value[i] + "</td>";
                $("#t32").append(td2)
                // var td3 = "<td>"+arr3value[i]/arr3sum+"</td>";
                var c = arr3value[i] / arr3sum
                console.log("arr3value:" + arr3value)
                console.log("arr3sum:" + arr3sum)
                var td3 = "<td>" + (c * 100).toFixed(2) + "%</td>";
                $("#t33").append(td3)

                var maxarea = arr3[maxindex] + ":" + arr3value[maxindex] + "(人)"
                var minarea = arr3[minindex] + ":" + arr3value[minindex] + "(人)"

                $("#maxarea").text(maxarea)
                $("#minarea").text(minarea)

            }


            //年龄饼图
            var myChart2 = echarts.init($("#container3")[0]);
            var option2 = {
                tooltip: {
                    trigger: 'item',
                    formatter: "{a} <br/>{b} : {c} ({d}%)"
                },
                legend: {
                    orient: 'vertical',
                    x: 'left',
                    data: arr2
                },

                calculable: false,
                series: [
                    {
                        name: '人员年龄段分析',
                        type: 'pie',
                        radius: '55%',
                        center: ['50%', '60%'],
                        data: result.data2

                    }
                ]
            };
            myChart2.setOption(option2);
            //年龄表格
            $("#t41 *:not(.first_td)").remove();
            $("#t42 *:not(.first_td)").remove();
            $("#t43 *:not(.first_td)").remove();
            for (var i = 0; i <= arr2.length - 1; i++) {
                var td1 = "<td>" + arr2[i] + "</td>";
                $("#t41").append(td1)
            }

            maxindex = 0
            minindex = 0
            for (var i = 0; i <= arr2value.length - 1; i++) {
                if (i > 0) {
                    if (arr2value[i] > arr2value[maxindex]) {
                        maxindex = i;
                    }

                    if (arr2value[i] < arr2value[minindex]) {
                        minindex = i;
                    }
                }
                var td2 = "<td>" + arr2value[i] + "</td>";
                $("#t42").append(td2)
                // var td3 = "<td>"+arr3value[i]/arr3sum+"</td>";
                var c = arr2value[i] / arr2sum
                console.log("arr2value:" + arr2value)
                console.log("arr2sum:" + arr2sum)
                var td3 = "<td>" + (c * 100).toFixed(2) + "%</td>";
                $("#t43").append(td3)
            }


            var maxage = arr2[maxindex] + ":" + arr2value[maxindex] + "(人)"
            var minage = arr2[minindex] + ":" + arr2value[minindex] + "(人)"

            $("#maxage").text(maxage)
            $("#minage").text(minage)


            //公司表格
            $("#t21 *:not(.first_td)").remove();
            $("#t22 *:not(.first_td)").remove();
            $("#t23 *:not(.first_td)").remove();
            var arr4 = [];
            for (var i = 0; i < result.data4.length; i++) {
                arr4.push(result.data4[i].name);
            }
            var arr4value = [];
            var arr4sum = 0
            for (var i = 0; i < result.data4.length; i++) {
                arr4value.push(result.data4[i].value);
                // arr3sum +=result.data3[i].value
                arr4sum += parseInt(result.data4[i].value)
            }
            for (var i = 0; i <= arr4.length - 1; i++) {
                var td1 = "<td>" + arr4[i] + "</td>";
                $("#t21").append(td1)
            }

            maxindex=0
            minindex=0
            for (var i = 0; i <= arr4value.length - 1; i++) {
                if (i > 0) {
                    if (arr4value[i] > arr4value[maxindex]) {
                        maxindex = i;
                    }

                    if (arr4value[i] < arr4value[minindex]) {
                        minindex = i;
                    }
                }

                var td2 = "<td>" + arr4value[i] + "</td>";
                $("#t22").append(td2)
                // var td3 = "<td>"+arr3value[i]/arr3sum+"</td>";
                var c = arr4value[i] / arr1sum
                console.log("arr4value:" + arr4value)
                console.log("arr4sum:" + arr4sum)
                var td3 = "<td>" + (c * 100).toFixed(2) + "%</td>";
                $("#t23").append(td3)
                var maxtype  = arr4[maxindex] + ":" + arr4value[maxindex] + "(人)"
                var mintype = arr4[minindex] + ":" + arr4value[minindex] + "(人)"

                $("#maxtype").text(maxtype)
                $("#mintype").text(mintype)


            }

            //公司类型分类柱图

            var myChart3 = echarts.init($("#container1")[0]);
            var option3 = {
                tooltip: {
                    trigger: 'axis',
                    axisPointer: {            // 坐标轴指示器，坐标轴触发有效
                        type: 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
                    }
                },
                legend: {
                    data: []
                },

                calculable: true,//true
                xAxis: [
                    {
                        type: 'category',
                        data: arr4,
                        rotate: 40, interval: 0
                    }
                ],

                yAxis: [
                    {
                        type: 'value'
                    }
                ],
                series: [
                    {
                        name: '从业人员数量（个）',
                        type: 'bar',
                        barWidth: '30',
                        data: arr4value,
                        itemStyle: {
                            normal: {
                                color: "#269fec"
                            }
                        }

                    }
                ]
            };
            myChart3.setOption(option3);
        }
    })



    $.ajax({
        url: "persons/line",
        type: "post",

        success: function (res) {
            var result = JSON.parse(res);

            var  arrtime = []
            var  arrname = []
            var  arrcount = []
            var linedata=[]


            for (var i = 0;i<=result.data1.length-1;i++){

                arrtime.push(result.data1[i].time)
                arrname.push(result.data1[i].name)
                arrcount.push(result.data1[i].count)

            }
            var mouth =[]

            for (var i=0;i<=arrcount.length-1;i++){
                a = arrcount[i]
                var b = a.split("-")

            }

            for (var i=0;i<=12;i++){
                mouth.push(arrcount)
            }

            linedata.push(mouth)
            linedata.push(mouth)
            linedata.push(mouth)



            // console.log("arrtime~~~"+arrtime)
            // console.log("arrname~~~"+arrname)
            //  console.log("arrcount~~~"+arrcount);

            console.log("linedata~~~")
            console.log(linedata)




        }
    })

    var myChart = echarts.init($("#container4")[0]);
    var option = {

        tooltip: {
            trigger: 'axis'
        },
        legend: {
            data: ['化学品', '射钉器材', '印章', '机修', '散装加油', '典当', '烟花爆竹'],
        },

        calculable: true,
        xAxis: [
            {
                type: 'category',
                boundaryGap: false,
                data: ['1月', '2月', '3月', '4月', '5月', '6月', '7月', '8月', '9月', '10月', '11月', '12月']
            }
        ],
        yAxis: [
            {
                type: 'value'

            }
        ],
        series: [
            {
                name: '化学品',
                type: 'line',
                data: [310, 302, 301, 34, 390, 330, 320, 10, 302, 201, 334, 190]
            },
            {
                name: '射钉器材',
                type: 'line',
                data: [320, 302, 301, 334, 390, 330, 320, 120, 302, 201, 334, 110]
            },
            {
                name: '印章',
                type: 'line',
                data: [214, 254, 236, 134, 236, 365, 320, 100, 205, 201, 235, 290]
            },
            {
                name: '机修',
                type: 'line',
                data: [222, 253, 301, 334, 254, 356, 421, 254, 302, 235, 235, 457]
            },
            {
                name: '散装加油',
                type: 'line',
                data: [310, 302, 301, 34, 390, 330, 320, 10, 302, 201, 334, 190]
            },
            {
                name: '典当',
                type: 'line',
                data: [222, 253, 301, 334, 254, 356, 421, 254, 302, 235, 235, 457]
            },
            {
                name: '烟花爆竹',
                type: 'line',
                data: [310, 302, 301, 34, 390, 330, 320, 10, 302, 201, 334, 190]
            }

        ]
    };
    myChart.setOption(option);
// });
})