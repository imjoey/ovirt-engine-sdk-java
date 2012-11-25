//
// Copyright (c) 2012 Red Hat, Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//           http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//

package org.ovirt.engine.sdk.decorators;

import java.io.IOException;
import java.util.List;

import javax.xml.bind.JAXBException;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.ovirt.engine.sdk.entities.Action;
import org.ovirt.engine.sdk.entities.Response;
import org.ovirt.engine.sdk.exceptions.ServerException;
import org.ovirt.engine.sdk.utils.HttpHeaderUtils;
import org.ovirt.engine.sdk.web.HttpProxyBroker;

public class ClusterGlusterVolume extends
        org.ovirt.engine.sdk.entities.GlusterVolume {

    private HttpProxyBroker proxy;

    private ClusterGlusterVolumeGlusterBricks clusterGlusterVolumeGlusterBricks;


    public ClusterGlusterVolume(HttpProxyBroker proxy) {
        this.proxy = proxy;
    }

    private HttpProxyBroker getProxy() {
        return proxy;
    }

    public synchronized ClusterGlusterVolumeGlusterBricks getClusterGlusterVolumeGlusterBricks() {
        if (this.clusterGlusterVolumeGlusterBricks == null) {
            this.clusterGlusterVolumeGlusterBricks = new ClusterGlusterVolumeGlusterBricks(proxy, this);
        }
        return clusterGlusterVolumeGlusterBricks;
    }



   public Action stop(Action action) throws ClientProtocolException, ServerException, IOException, JAXBException {
        String url = this.getHref() + "/stop";
        return getProxy().action(url, action, Action.class, Action.class);
    }

   public Action start(Action action) throws ClientProtocolException, ServerException, IOException, JAXBException {
        String url = this.getHref() + "/start";
        return getProxy().action(url, action, Action.class, Action.class);
    }

   public Action resetalloptions(Action action) throws ClientProtocolException, ServerException, IOException, JAXBException {
        String url = this.getHref() + "/resetalloptions";
        return getProxy().action(url, action, Action.class, Action.class);
    }

   public Action resetoption(Action action) throws ClientProtocolException, ServerException, IOException, JAXBException {
        String url = this.getHref() + "/resetoption";
        return getProxy().action(url, action, Action.class, Action.class);
    }

   public Action setoption(Action action) throws ClientProtocolException, ServerException, IOException, JAXBException {
        String url = this.getHref() + "/setoption";
        return getProxy().action(url, action, Action.class, Action.class);
    }

   public Action rebalance(Action action) throws ClientProtocolException, ServerException, IOException, JAXBException {
        String url = this.getHref() + "/rebalance";
        return getProxy().action(url, action, Action.class, Action.class);
    }


}

