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

package org.ovirt.engine.sdk.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuotaStorageLimit complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="QuotaStorageLimit">
 *   &lt;complexContent>
 *     &lt;extension base="{}BaseResource">
 *       &lt;sequence>
 *         &lt;element ref="{}quota" minOccurs="0"/>
 *         &lt;element ref="{}storage_domain" minOccurs="0"/>
 *         &lt;element name="limit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="usage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuotaStorageLimit", propOrder = {
    "quota",
    "storageDomain",
    "limit",
    "usage"
})
public class QuotaStorageLimit
    extends BaseResource
{

    protected Quota quota;
    @XmlElement(name = "storage_domain")
    protected StorageDomain storageDomain;
    protected Long limit;
    protected Double usage;

    /**
     * Gets the value of the quota property.
     *
     * @return
     *     possible object is
     *     {@link Quota }
     *
     */
    public Quota getQuota() {
        return quota;
    }

    /**
     * Sets the value of the quota property.
     *
     * @param value
     *     allowed object is
     *     {@link Quota }
     *
     */
    public void setQuota(Quota value) {
        this.quota = value;
    }

    public boolean isSetQuota() {
        return (this.quota!= null);
    }

    /**
     * Gets the value of the storageDomain property.
     *
     * @return
     *     possible object is
     *     {@link StorageDomain }
     *
     */
    public StorageDomain getStorageDomain() {
        return storageDomain;
    }

    /**
     * Sets the value of the storageDomain property.
     *
     * @param value
     *     allowed object is
     *     {@link StorageDomain }
     *
     */
    public void setStorageDomain(StorageDomain value) {
        this.storageDomain = value;
    }

    public boolean isSetStorageDomain() {
        return (this.storageDomain!= null);
    }

    /**
     * Gets the value of the limit property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setLimit(Long value) {
        this.limit = value;
    }

    public boolean isSetLimit() {
        return (this.limit!= null);
    }

    /**
     * Gets the value of the usage property.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setUsage(Double value) {
        this.usage = value;
    }

    public boolean isSetUsage() {
        return (this.usage!= null);
    }

}