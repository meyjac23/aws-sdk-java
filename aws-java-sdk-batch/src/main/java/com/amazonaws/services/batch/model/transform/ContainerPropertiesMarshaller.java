/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.batch.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.batch.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ContainerPropertiesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ContainerPropertiesMarshaller {

    private static final MarshallingInfo<String> IMAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("image").build();
    private static final MarshallingInfo<Integer> VCPUS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("vcpus").build();
    private static final MarshallingInfo<Integer> MEMORY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("memory").build();
    private static final MarshallingInfo<List> COMMAND_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("command").build();
    private static final MarshallingInfo<String> JOBROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("jobRoleArn").build();
    private static final MarshallingInfo<String> EXECUTIONROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("executionRoleArn").build();
    private static final MarshallingInfo<List> VOLUMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("volumes").build();
    private static final MarshallingInfo<List> ENVIRONMENT_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("environment").build();
    private static final MarshallingInfo<List> MOUNTPOINTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("mountPoints").build();
    private static final MarshallingInfo<Boolean> READONLYROOTFILESYSTEM_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("readonlyRootFilesystem").build();
    private static final MarshallingInfo<Boolean> PRIVILEGED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("privileged").build();
    private static final MarshallingInfo<List> ULIMITS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ulimits").build();
    private static final MarshallingInfo<String> USER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("user").build();
    private static final MarshallingInfo<String> INSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceType").build();
    private static final MarshallingInfo<List> RESOURCEREQUIREMENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceRequirements").build();
    private static final MarshallingInfo<StructuredPojo> LINUXPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("linuxParameters").build();
    private static final MarshallingInfo<StructuredPojo> LOGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("logConfiguration").build();
    private static final MarshallingInfo<List> SECRETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("secrets").build();
    private static final MarshallingInfo<StructuredPojo> NETWORKCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("networkConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> FARGATEPLATFORMCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fargatePlatformConfiguration").build();

    private static final ContainerPropertiesMarshaller instance = new ContainerPropertiesMarshaller();

    public static ContainerPropertiesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ContainerProperties containerProperties, ProtocolMarshaller protocolMarshaller) {

        if (containerProperties == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(containerProperties.getImage(), IMAGE_BINDING);
            protocolMarshaller.marshall(containerProperties.getVcpus(), VCPUS_BINDING);
            protocolMarshaller.marshall(containerProperties.getMemory(), MEMORY_BINDING);
            protocolMarshaller.marshall(containerProperties.getCommand(), COMMAND_BINDING);
            protocolMarshaller.marshall(containerProperties.getJobRoleArn(), JOBROLEARN_BINDING);
            protocolMarshaller.marshall(containerProperties.getExecutionRoleArn(), EXECUTIONROLEARN_BINDING);
            protocolMarshaller.marshall(containerProperties.getVolumes(), VOLUMES_BINDING);
            protocolMarshaller.marshall(containerProperties.getEnvironment(), ENVIRONMENT_BINDING);
            protocolMarshaller.marshall(containerProperties.getMountPoints(), MOUNTPOINTS_BINDING);
            protocolMarshaller.marshall(containerProperties.getReadonlyRootFilesystem(), READONLYROOTFILESYSTEM_BINDING);
            protocolMarshaller.marshall(containerProperties.getPrivileged(), PRIVILEGED_BINDING);
            protocolMarshaller.marshall(containerProperties.getUlimits(), ULIMITS_BINDING);
            protocolMarshaller.marshall(containerProperties.getUser(), USER_BINDING);
            protocolMarshaller.marshall(containerProperties.getInstanceType(), INSTANCETYPE_BINDING);
            protocolMarshaller.marshall(containerProperties.getResourceRequirements(), RESOURCEREQUIREMENTS_BINDING);
            protocolMarshaller.marshall(containerProperties.getLinuxParameters(), LINUXPARAMETERS_BINDING);
            protocolMarshaller.marshall(containerProperties.getLogConfiguration(), LOGCONFIGURATION_BINDING);
            protocolMarshaller.marshall(containerProperties.getSecrets(), SECRETS_BINDING);
            protocolMarshaller.marshall(containerProperties.getNetworkConfiguration(), NETWORKCONFIGURATION_BINDING);
            protocolMarshaller.marshall(containerProperties.getFargatePlatformConfiguration(), FARGATEPLATFORMCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
