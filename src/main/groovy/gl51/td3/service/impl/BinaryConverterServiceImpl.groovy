package gl51.td3.service.impl

import gl51.td3.data.Ip
import gl51.td3.service.IPService
import gl51.td3.service.IpConverterService
import javax.inject.Inject

class BinaryConverterServiceImpl implements  IpConverterService{
    @Inject

    IPService service



    @Override

    String getAndConvertIp() {

        Ip ip = service.fetchIp()

        ///

    }

}

