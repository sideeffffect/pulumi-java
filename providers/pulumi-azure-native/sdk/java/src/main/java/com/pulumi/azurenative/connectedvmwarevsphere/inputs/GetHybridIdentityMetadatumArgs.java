// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.connectedvmwarevsphere.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetHybridIdentityMetadatumArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHybridIdentityMetadatumArgs Empty = new GetHybridIdentityMetadatumArgs();

    /**
     * Name of the HybridIdentityMetadata.
     * 
     */
    @Import(name="metadataName", required=true)
    private String metadataName;

    public String metadataName() {
        return this.metadataName;
    }

    /**
     * The Resource Group Name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the vm.
     * 
     */
    @Import(name="virtualMachineName", required=true)
    private String virtualMachineName;

    public String virtualMachineName() {
        return this.virtualMachineName;
    }

    private GetHybridIdentityMetadatumArgs() {}

    private GetHybridIdentityMetadatumArgs(GetHybridIdentityMetadatumArgs $) {
        this.metadataName = $.metadataName;
        this.resourceGroupName = $.resourceGroupName;
        this.virtualMachineName = $.virtualMachineName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHybridIdentityMetadatumArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHybridIdentityMetadatumArgs $;

        public Builder() {
            $ = new GetHybridIdentityMetadatumArgs();
        }

        public Builder(GetHybridIdentityMetadatumArgs defaults) {
            $ = new GetHybridIdentityMetadatumArgs(Objects.requireNonNull(defaults));
        }

        public Builder metadataName(String metadataName) {
            $.metadataName = metadataName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder virtualMachineName(String virtualMachineName) {
            $.virtualMachineName = virtualMachineName;
            return this;
        }

        public GetHybridIdentityMetadatumArgs build() {
            $.metadataName = Objects.requireNonNull($.metadataName, "expected parameter 'metadataName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.virtualMachineName = Objects.requireNonNull($.virtualMachineName, "expected parameter 'virtualMachineName' to be non-null");
            return $;
        }
    }

}
