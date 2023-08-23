package com.company.netsdk.activity;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.company.NetSDK.NET_OUT_FIND_NEXT_RECORD_PARAM;
import com.company.NetSDK.NET_TIME;
import com.company.NetSDK.NET_TRAFFIC_LIST_RECORD;
import com.company.netsdk.R;
import com.company.netsdk.common.ToolKits;
import com.company.netsdk.common.TrafficAllowListInfo;
import com.company.netsdk.common.TrafficAllowListInputDialog;
import com.company.netsdk.module.TrafficAllowListModule;
import com.lingber.mycontrol.datagridview.DataGridView;

import java.util.ArrayList;
import java.util.List;

public class TrafficAllowListActivity extends AppCompatActivity implements View.OnClickListener{

    private final String TAG = "TrafficAllowListActivity";
    TrafficAllowListModule mTrafficAllowListModule;
    DataGridView dataGridView;
    Button mCreate;
    Button mDelete;
    Button mUpdate;
    Button mQuery;
    Button mClear;
    TextView mInputPlate;
    List<TrafficAllowListInfo> dataSource;
    List<TrafficAllowListInfo> selectedData;
    NET_TRAFFIC_LIST_RECORD tempData;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traffic_allow_list);
        setTitle(R.string.title_traffic_allow_list);
        mTrafficAllowListModule = new TrafficAllowListModule(this);
        setupView();

    }

    private void setupView(){
//        ((Button) findViewById(R.id.subscribeBtn)).setOnClickListener(this);
        dataGridView = (DataGridView) findViewById(R.id.datagridview);
        mCreate = (Button) findViewById(R.id.btn_create);
        mDelete = (Button) findViewById(R.id.btn_delete);
        mUpdate = (Button) findViewById(R.id.btn_update);
        mQuery = (Button) findViewById(R.id.btn_query);
        mClear = (Button) findViewById(R.id.btn_clear);
        mInputPlate = (TextView) findViewById(R.id.input_data);
        mCreate.setOnClickListener(this);
        mDelete.setOnClickListener(this);
        mUpdate.setOnClickListener(this);
        mQuery.setOnClickListener(this);
        mClear.setOnClickListener(this);

        dataSource = new ArrayList();
//        dataSource.add(new TrafficAllowListInfo("1","111","111",
//                new NET_TIME(1,1,1,1,1,1).toString(),
//                new NET_TIME(1,1,1,1,1,1).toString(),"false"));
//        dataSource.add(new TrafficAllowListInfo("2","222","222",
//                new NET_TIME(2,2,2,2,2,2).toString(),
//                new NET_TIME(2,2,2,2,2,2).toString(),"false"));

        dataGridView.setColunms(4);
//        dataGridView.setRowHeight(100);
        dataGridView.setHeaderHeight(100);
        dataGridView.setHeaderContentByStringId(new int[]{R.string.str_num,R.string.str_owner,R.string.str_plate,R.string.str_is_open});
        dataGridView.setFieldNames(new String[]{"nRecordNo","szMasterOfCar","szPlateNumber","bAuthorityEnable"});
        dataGridView.setColunmWeight(new float[]{2,3,3,2});
        dataGridView.setCellContentView(new Class[]{TextView.class,TextView.class,TextView.class,TextView.class});
        dataGridView.setDataSource(dataSource);
        dataGridView.setSelectedMode(1);
        dataGridView.setSlidable(true);
        dataGridView.setFlipOverEnable(false, 11, getFragmentManager());
        dataGridView.initDataGridView();
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id){
            case R.id.btn_query:{
//                Toast.makeText(this, "你点击了查询按钮，输入为\"" + mInputPlate.getText().toString() + "\"", Toast.LENGTH_SHORT).show();
                List<TrafficAllowListInfo> record = mTrafficAllowListModule.queryExOpn(mInputPlate.getText().toString());
                if(null != record && record.size() > 0){
                    Toast.makeText(this, "查询成功", Toast.LENGTH_SHORT).show();
                    dataSource.clear();
                    System.out.println("record.length = " + record.size());
                    dataSource = record;
                    for(int i = 0; i < dataSource.size(); i ++){
                        System.out.println(dataSource.get(i).toString());
                    }
                    dataGridView.setDataSource(dataSource);
                    dataGridView.updateAll(); // 更新所有数据
                } else {
                    Toast.makeText(this, "未查询到数据或是查询失败", Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.btn_delete:{
//                Toast.makeText(this, "你点击了查询按钮，输入为\"" + mInputPlate.getText().toString() + "\"", Toast.LENGTH_SHORT).show();
                selectedData = dataGridView.getSelectedRowsData();

                if(null != selectedData && selectedData.size() > 0){

                    if(mTrafficAllowListModule.deleteOpn(Integer.parseInt(selectedData.get(0).getnRecordNo()))){
                        Toast.makeText(this, "删除成功", Toast.LENGTH_SHORT).show();
                        //刷新数据
                        dataSource.clear();
                        dataSource = mTrafficAllowListModule.queryExOpn("");
//                    for(int i = 0; i < dataSource.size(); i ++){
//                        System.out.println(dataSource.get(i).toString());
//                    }

                        dataGridView.setDataSource(dataSource);
                        dataGridView.updateAll(); // 更新所有数据
                    } else {
                        Toast.makeText(this, "删除失败，" + ToolKits.getLastError(), Toast.LENGTH_SHORT).show();
                    }

                } else {
                    Toast.makeText(this, "请选择要删除的数据", Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.btn_clear: {
//                Toast.makeText(this, "你点击了查询按钮，输入为\"" + mInputPlate.getText().toString() + "\"", Toast.LENGTH_SHORT).show();
                if (mTrafficAllowListModule.clearOpn()){
                    Toast.makeText(this, "清空成功", Toast.LENGTH_SHORT).show();
                    //刷新数据
                    dataSource.clear();
                    dataSource = mTrafficAllowListModule.queryExOpn("");
                    dataGridView.setDataSource(dataSource);
                    dataGridView.updateAll(); // 更新所有数据
                } else {
                    Toast.makeText(this, "清空失败，" + ToolKits.getLastError(), Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.btn_update: {
                selectedData = dataGridView.getSelectedRowsData();

                if(null != selectedData && selectedData.size() > 0){
                    String tempCarNum = selectedData.get(0).getSzPlateNumber();
                    String tempOwner = selectedData.get(0).getSzMasterOfCar();
                    String tempStart = selectedData.get(0).getStBeginTime();
                    String tempEnd = selectedData.get(0).getStCancelTime();
                    boolean tempAuth = false;
                    if(selectedData.get(0).getbAuthorityEnable().equals("是")||selectedData.get(0).getbAuthorityEnable().equals("true")){
                        tempAuth = true;
                    }
                    TrafficAllowListInputDialog trafficAllowListInputDialog = new TrafficAllowListInputDialog(this, tempCarNum, tempOwner, tempStart, tempEnd, tempAuth);
                    trafficAllowListInputDialog.setOnTrafficAllowListInputDialogListener(new TrafficAllowListInputDialog.OnTrafficAllowListInputDialogListener() {
                        @Override
                        public void getIntentData(TrafficAllowListInfo data) {
                            tempData = new NET_TRAFFIC_LIST_RECORD();
                            tempData.nRecordNo = Integer.parseInt(selectedData.get(0).getnRecordNo());
                            System.arraycopy(data.getSzPlateNumber().getBytes(), 0, tempData.szPlateNumber, 0, data.getSzPlateNumber().getBytes().length);
                            System.arraycopy(data.getSzMasterOfCar().getBytes(), 0, tempData.szMasterOfCar, 0, data.getSzMasterOfCar().getBytes().length);
                            tempData.stBeginTime.parseTime(data.getStBeginTime());
                            tempData.stCancelTime.parseTime(data.getStCancelTime());
                            if(data.getbAuthorityEnable().equals("是") || data.getbAuthorityEnable().equals("true")){
                                tempData.stAuthrityTypes[0].bAuthorityEnable = true;
                                tempData.nAuthrityNum = 1;
                                tempData.stAuthrityTypes[0].emAuthorityType = 1;
                            }
                            if(mTrafficAllowListModule.modifyOpn(tempData)){
                                Toast.makeText(context, "修改成功", Toast.LENGTH_SHORT).show();
                                //刷新数据
                                dataSource.clear();
                                dataSource = mTrafficAllowListModule.queryExOpn("");

                                dataGridView.setDataSource(dataSource);
                                dataGridView.updateAll(); // 更新所有数据
                            } else {
                                Toast.makeText(context, "修改失败，" + ToolKits.getLastError(), Toast.LENGTH_SHORT).show();
                            }

                            trafficAllowListInputDialog.dismiss();
                        }
                    });
//                    trafficAllowListInputDialog
                    trafficAllowListInputDialog.show();


                } else {
                    Toast.makeText(this, "请选择要修改的数据", Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.btn_create: {
                TrafficAllowListInputDialog trafficAllowListInputDialog = new TrafficAllowListInputDialog(this);
                trafficAllowListInputDialog.setOnTrafficAllowListInputDialogListener(new TrafficAllowListInputDialog.OnTrafficAllowListInputDialogListener() {
                    @Override
                    public void getIntentData(TrafficAllowListInfo data) {
                        tempData = new NET_TRAFFIC_LIST_RECORD();
                        System.arraycopy(data.getSzPlateNumber().getBytes(), 0, tempData.szPlateNumber, 0, data.getSzPlateNumber().getBytes().length);
                        System.arraycopy(data.getSzMasterOfCar().getBytes(), 0, tempData.szMasterOfCar, 0, data.getSzMasterOfCar().getBytes().length);
                        tempData.stBeginTime.parseTime(data.getStBeginTime());
                        tempData.stCancelTime.parseTime(data.getStCancelTime());
                        if(data.getbAuthorityEnable().equals("是") || data.getbAuthorityEnable().equals("true")){
                            tempData.stAuthrityTypes[0].bAuthorityEnable = true;
                            tempData.nAuthrityNum = 1;
                            tempData.stAuthrityTypes[0].emAuthorityType = 1;
                        }
                        if(mTrafficAllowListModule.createOpn(tempData)){
                            Toast.makeText(context, "添加成功", Toast.LENGTH_SHORT).show();
                            //刷新数据
                            dataSource.clear();
                            dataSource = mTrafficAllowListModule.queryExOpn("");

                            dataGridView.setDataSource(dataSource);
                            dataGridView.updateAll(); // 更新所有数据
                        } else {
                            Toast.makeText(context, "添加失败，" + ToolKits.getLastError(), Toast.LENGTH_SHORT).show();
                        }

                        trafficAllowListInputDialog.dismiss();
                    }
                });
                trafficAllowListInputDialog.show();
                break;
            }
            default:
                break;
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}
