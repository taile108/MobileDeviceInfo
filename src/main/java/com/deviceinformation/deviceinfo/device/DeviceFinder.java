package com.deviceinformation.deviceinfo.device;

import com.deviceinformation.deviceinfo.exception.DeviceNotFoundException;
import com.deviceinformation.deviceinfo.model.Device;
import com.deviceinformation.deviceinfo.model.DeviceInfoModel;

import java.io.IOException;
import java.util.Map;

public interface DeviceFinder<S extends Device> {

    default DeviceInfoModel<S> findDevices()
            throws IOException, DeviceNotFoundException {
        return findDevices("");
    }

    DeviceInfoModel<S> findDevices(String localPath) throws IOException, DeviceNotFoundException;

    default Map<String, Object> readDeviceInfo() throws IOException {
        return readDeviceInfo("");
    }

    Map<String, Object> readDeviceInfo(String localPath) throws IOException;
}
