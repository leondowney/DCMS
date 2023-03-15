/**
 * Created by Administrator on 2017/6/12.
 */
var ID;
function tableLoad(){
    $('#table').bootstrapTable({
        method: "get",
        url: "json/数据源管理.json",
        striped: true,
        singleSelect: false,
        dataType: "json",
        pagination: true, //分页
        pageSize: 10,
        pageNumber: 1,
        search: false, //显示搜索框
        contentType: "application/x-www-form-urlencoded",
        queryParams: queryParams,
        columns: [

            {
                checkbox: "true",
                field: 'check',
                align: 'center',
                valign: 'middle'
            }
            ,
            {
                title: '序号',
                field: 'id',
                align: 'center',
                valign: 'middle'
            },

            {
                title: '数据源名称',
                field: 'name',
                align: 'center',
                valign: 'middle'
            },
            {
                title: '类型',
                field: 'type',
                align: 'center',
                valign: 'middle'
            },
            {
                title: '数据源地址',
                field: 'host',
                align: 'center',
                valign: 'middle'
            },
            {
                title: '端口',
                field: 'port',
                align: 'center',
                valign: 'middle'
            },
            {
                title: '数据库名称',
                field: 'dbname',
                align: 'center',
                valign: 'middle'
            },
            {
                title: '用户名',
                field: 'username',
                align: 'center'
            },
            {
                title: '密码',
                field: 'password',
                align: 'center'
            },
            {
                title: '操作',
                field: '',
                align: 'center',
                formatter: function (value, row) {
                    var  e = '<a  id="add" data-id="98"  onclick="edit(\'' + row.id + '\')">编辑</a> ';
                    var  c = '<a  id="add" data-id="98" onclick="testdel(\'' + row.id + '\')">删除</a> ';
                    return e+c;
                }
            }
        ]
    });
}

function queryParams(params) {
    return {
        page: params.pageNumber,
        rows: params.limit,//页码大小
        order: params.order,
        sort: params.sort,
        SendPeople: $("#person").val(),
        Title: $("#tit").val(),
        BeginSendTime: $("#beginSendTime").val(),
        EndSendTime: $("#endSendTime").val()
    };
}

//数据的查询
function checkPersonData() {
    $("#table").bootstrapTable('refresh');
}

//数据的删除
function del(id){
    if(confirm("你确定要删除吗？")){
        var personId = id;
        $.ajax({
            url: '/OAMessagePush/Delete?Ids=' + personId,
            type: 'post',
            dataType: 'json',
            success: function (result) {
                var result = handleError(result);
                if (result.IsError) {
                    return;
                }
                else {
                    checkPersonData();
                }
            }
        })
    }

}


//批量数据的删除
function delAll(){
    var idArray = $('#table').bootstrapTable('getSelections');
    if(idArray == null || idArray.length ==0){
        alert("请选择你要删除的类容!");
        return false;
    }else {
        var personID = [];
        for(var i=0;i<idArray.length;i++){
            personID.push(idArray[i].id);
        }
        //$.each(idArray, function (index, row) {
        //    personID.push(row.Id);
        //});
        if(confirm("删除将无法恢复，你确定删除吗？")){
            $.ajax({
                url: '/OAMessagePush/Delete?Ids=' + personID.join(","),
                type: 'post',
                dataType: 'json',
                success: function (result) {
                    var result = handleError(result);
                    if (result.IsError) {
                        return;
                    }
                    else {
                        checkPersonData();
                    }
                }
            })
        }
    }


}


function add() {
    openlayer();
    ID = "";
}
//编辑操作
function edit(id) {
    ID = id;
    openlayer()
}

function openlayer() {
    layer.open({
        type: 2,
        title: '数据源信息',
        shade: 0.5,
        skin: 'layui-layer-rim',
        area: ['700px', '350px'],
        shadeClose: true,
        closeBtn: 1,
        content: 'dataSourceTail.html'
    });
}

//取消操作
function cancel() {
    var index = parent.layer.getFrameIndex(window.name);
    parent.layer.close(index);
}


// 测试删除全部
function testdelAll(){
    var idArray = $('#table').bootstrapTable('getSelections');
    if(idArray == null || idArray.length ==0){
        alert("请选择你要删除的类容!");
        return false;
    }else {
        var personID = [];
        for(var i=0;i<idArray.length;i++){
            personID.push(idArray[i].id);
        }
        //$.each(idArray, function (index, row) {
        //    personID.push(row.Id);
        //});
        if(confirm("删除将无法恢复，你确定删除吗？")){
            alert("删除成功");
        }
    }


}
//测试数据的删除
function testdel(id){
    if(confirm("你确定要删除吗？")){
        alert("删除成功");
    }

}