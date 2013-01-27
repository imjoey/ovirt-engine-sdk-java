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

// *********************************************************************
// ********************* GENERATED CODE - DO NOT MODIFY ****************
// *********************************************************************

package org.ovirt.engine.sdk.decorators;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.ovirt.engine.sdk.common.CollectionDecorator;
import org.ovirt.engine.sdk.exceptions.ServerException;
import org.ovirt.engine.sdk.utils.CollectionUtils;
import org.ovirt.engine.sdk.utils.HttpHeaderBuilder;
import org.ovirt.engine.sdk.utils.HttpHeaderUtils;
import org.ovirt.engine.sdk.utils.UrlBuilder;
import org.ovirt.engine.sdk.utils.UrlBuilder;
import org.ovirt.engine.sdk.utils.UrlHelper;
import org.ovirt.engine.sdk.web.HttpProxyBroker;
import org.ovirt.engine.sdk.web.UrlParameterType;
import org.ovirt.engine.sdk.entities.Action;

/**
 * <p>DomainGroups providing relation and functional services
 * <p>to {@link org.ovirt.engine.sdk.entities.Groups }.
 */
@SuppressWarnings("unused")
public class DomainGroups extends
        CollectionDecorator<org.ovirt.engine.sdk.entities.Group,
                            org.ovirt.engine.sdk.entities.Groups,
                            DomainGroup> {

    private Domain parent;

    /**
     * @param proxy HttpProxyBroker
     * @param parent Domain
     */
    public DomainGroups(HttpProxyBroker proxy, Domain parent) {
        super(proxy, "groups");
        this.parent = parent;
    }

    /**
     * Lists DomainGroup objects.
     *
     * @return
     *     List of {@link DomainGroup }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    @Override
    public List<DomainGroup> list() throws ClientProtocolException,
            ServerException, IOException {
        String url = this.parent.getHref() + SLASH + getName();
        return list(url, org.ovirt.engine.sdk.entities.Groups.class, DomainGroup.class);
    }

    /**
     * Fetches DomainGroup object by id.
     * 
     * @return
     *     {@link DomainGroup }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    @Override
    public DomainGroup get(UUID id) throws ClientProtocolException,
            ServerException, IOException {
        String url = this.parent.getHref() + SLASH + getName() + SLASH + id.toString();
        return getProxy().get(url, org.ovirt.engine.sdk.entities.Group.class, DomainGroup.class);
    }

    /**
     * Lists DomainGroup objects.
     *
     * @param query
     *            search query
     * @param caseSensitive
     *            true|false
     * @param max
     *            max results
     *
     * @return List of {@link DomainGroup }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public List<DomainGroup> list(String query, Boolean caseSensitive, Integer max) throws ClientProtocolException,
            ServerException, IOException {
        String url = new UrlBuilder(this.parent.getHref() + SLASH + getName())
                .add("search", query, UrlParameterType.QUERY)
                .add("case_sensitive", caseSensitive, UrlParameterType.MATRIX)
                .add("max", max, UrlParameterType.MATRIX)
                .build();
        return list(url, org.ovirt.engine.sdk.entities.Groups.class, DomainGroup.class);
    }


}
