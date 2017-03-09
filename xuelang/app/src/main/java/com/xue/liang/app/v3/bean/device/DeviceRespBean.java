package com.xue.liang.app.v3.bean.device;

import java.util.List;

/**
 * Created by jikun on 2016/11/4.
 */

public class DeviceRespBean {


    private int ret_code;
    private String user_tel;

    private String ret_string;


    private List<ResponseBean> response;

    public int getRet_code() {
        return ret_code;
    }

    public void setRet_code(int ret_code) {
        this.ret_code = ret_code;
    }

    public String getUser_tel() {
        return user_tel;
    }

    public void setUser_tel(String user_tel) {
        this.user_tel = user_tel;
    }

    public String getRet_string() {
        return ret_string;
    }

    public void setRet_string(String ret_string) {
        this.ret_string = ret_string;
    }

    public List<ResponseBean> getResponse() {
        return response;
    }

    public void setResponse(List<ResponseBean> response) {
        this.response = response;
    }

    public static class ResponseBean {
        private String dev_url;
        private String dev_name;
        private String dev_id;
        private boolean ischoose=false;

        private CameraInfo camera_info;

        public CameraInfo getCamera_info() {
            return camera_info;
        }

        public void setCamera_info(CameraInfo camera_info) {
            this.camera_info = camera_info;
        }

        public String getDev_url() {
            return dev_url;
        }

        public void setDev_url(String dev_url) {
            this.dev_url = dev_url;
        }

        public String getDev_name() {
            return dev_name;
        }

        public void setDev_name(String dev_name) {
            this.dev_name = dev_name;
        }

        public String getDev_id() {
            return dev_id;
        }

        public void setDev_id(String dev_id) {
            this.dev_id = dev_id;
        }

        public boolean ischoose() {
            return ischoose;
        }

        public void setIschoose(boolean ischoose) {
            this.ischoose = ischoose;
        }
    }

    public static class CameraInfo{
        private String camera_id;
        private  Integer dev_platform_type;

        public String getCamera_id() {
            return camera_id;
        }

        public void setCamera_id(String camera_id) {
            this.camera_id = camera_id;
        }

        public Integer getDev_platform_type() {
            return dev_platform_type;
        }

        public void setDev_platform_type(Integer dev_platform_type) {
            this.dev_platform_type = dev_platform_type;
        }
    }
}