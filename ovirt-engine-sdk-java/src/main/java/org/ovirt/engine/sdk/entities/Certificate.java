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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Certificate complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Certificate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="organization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Certificate", propOrder = {
    "organization",
    "subject"
})
public class Certificate {

    protected String organization;
    protected String subject;

    /**
     * Gets the value of the organization property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOrganization(String value) {
        this.organization = value;
    }

    public boolean isSetOrganization() {
        return (this.organization!= null);
    }

    /**
     * Gets the value of the subject property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    public boolean isSetSubject() {
        return (this.subject!= null);
    }

}

