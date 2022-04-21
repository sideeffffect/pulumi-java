// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hanaonazure;

import com.pulumi.azurenative.hanaonazure.inputs.NetworkProfileArgs;
import com.pulumi.azurenative.hanaonazure.inputs.OSProfileArgs;
import com.pulumi.azurenative.hanaonazure.inputs.StorageProfileArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HanaInstanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final HanaInstanceArgs Empty = new HanaInstanceArgs();

    /**
     * Name of the SAP HANA on Azure instance.
     * 
     */
    @Import(name="hanaInstanceName")
    private @Nullable Output<String> hanaInstanceName;

    public Optional<Output<String>> hanaInstanceName() {
        return Optional.ofNullable(this.hanaInstanceName);
    }

    /**
     * Resource location
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies the network settings for the HANA instance.
     * 
     */
    @Import(name="networkProfile")
    private @Nullable Output<NetworkProfileArgs> networkProfile;

    public Optional<Output<NetworkProfileArgs>> networkProfile() {
        return Optional.ofNullable(this.networkProfile);
    }

    /**
     * Specifies the operating system settings for the HANA instance.
     * 
     */
    @Import(name="osProfile")
    private @Nullable Output<OSProfileArgs> osProfile;

    public Optional<Output<OSProfileArgs>> osProfile() {
        return Optional.ofNullable(this.osProfile);
    }

    /**
     * ARM ID of another HanaInstance that will share a network with this HanaInstance
     * 
     */
    @Import(name="partnerNodeId")
    private @Nullable Output<String> partnerNodeId;

    public Optional<Output<String>> partnerNodeId() {
        return Optional.ofNullable(this.partnerNodeId);
    }

    /**
     * Name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Specifies the storage settings for the HANA instance disks.
     * 
     */
    @Import(name="storageProfile")
    private @Nullable Output<StorageProfileArgs> storageProfile;

    public Optional<Output<StorageProfileArgs>> storageProfile() {
        return Optional.ofNullable(this.storageProfile);
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private HanaInstanceArgs() {}

    private HanaInstanceArgs(HanaInstanceArgs $) {
        this.hanaInstanceName = $.hanaInstanceName;
        this.location = $.location;
        this.networkProfile = $.networkProfile;
        this.osProfile = $.osProfile;
        this.partnerNodeId = $.partnerNodeId;
        this.resourceGroupName = $.resourceGroupName;
        this.storageProfile = $.storageProfile;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HanaInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HanaInstanceArgs $;

        public Builder() {
            $ = new HanaInstanceArgs();
        }

        public Builder(HanaInstanceArgs defaults) {
            $ = new HanaInstanceArgs(Objects.requireNonNull(defaults));
        }

        public Builder hanaInstanceName(@Nullable Output<String> hanaInstanceName) {
            $.hanaInstanceName = hanaInstanceName;
            return this;
        }

        public Builder hanaInstanceName(String hanaInstanceName) {
            return hanaInstanceName(Output.of(hanaInstanceName));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder networkProfile(@Nullable Output<NetworkProfileArgs> networkProfile) {
            $.networkProfile = networkProfile;
            return this;
        }

        public Builder networkProfile(NetworkProfileArgs networkProfile) {
            return networkProfile(Output.of(networkProfile));
        }

        public Builder osProfile(@Nullable Output<OSProfileArgs> osProfile) {
            $.osProfile = osProfile;
            return this;
        }

        public Builder osProfile(OSProfileArgs osProfile) {
            return osProfile(Output.of(osProfile));
        }

        public Builder partnerNodeId(@Nullable Output<String> partnerNodeId) {
            $.partnerNodeId = partnerNodeId;
            return this;
        }

        public Builder partnerNodeId(String partnerNodeId) {
            return partnerNodeId(Output.of(partnerNodeId));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder storageProfile(@Nullable Output<StorageProfileArgs> storageProfile) {
            $.storageProfile = storageProfile;
            return this;
        }

        public Builder storageProfile(StorageProfileArgs storageProfile) {
            return storageProfile(Output.of(storageProfile));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public HanaInstanceArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
