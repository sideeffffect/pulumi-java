// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights;

import com.pulumi.azurenative.customerinsights.inputs.HubBillingInfoFormatArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HubArgs extends com.pulumi.resources.ResourceArgs {

    public static final HubArgs Empty = new HubArgs();

    /**
     * Billing settings of the hub.
     * 
     */
    @Import(name="hubBillingInfo")
      private final @Nullable Output<HubBillingInfoFormatArgs> hubBillingInfo;

    public Output<HubBillingInfoFormatArgs> hubBillingInfo() {
        return this.hubBillingInfo == null ? Codegen.empty() : this.hubBillingInfo;
    }

    /**
     * The name of the Hub.
     * 
     */
    @Import(name="hubName")
      private final @Nullable Output<String> hubName;

    public Output<String> hubName() {
        return this.hubName == null ? Codegen.empty() : this.hubName;
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The bit flags for enabled hub features. Bit 0 is set to 1 indicates graph is enabled, or disabled if set to 0. Bit 1 is set to 1 indicates the hub is disabled, or enabled if set to 0.
     * 
     */
    @Import(name="tenantFeatures")
      private final @Nullable Output<Integer> tenantFeatures;

    public Output<Integer> tenantFeatures() {
        return this.tenantFeatures == null ? Codegen.empty() : this.tenantFeatures;
    }

    public HubArgs(
        @Nullable Output<HubBillingInfoFormatArgs> hubBillingInfo,
        @Nullable Output<String> hubName,
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Integer> tenantFeatures) {
        this.hubBillingInfo = hubBillingInfo;
        this.hubName = hubName;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.tenantFeatures = tenantFeatures;
    }

    private HubArgs() {
        this.hubBillingInfo = Codegen.empty();
        this.hubName = Codegen.empty();
        this.location = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.tags = Codegen.empty();
        this.tenantFeatures = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HubArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<HubBillingInfoFormatArgs> hubBillingInfo;
        private @Nullable Output<String> hubName;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Integer> tenantFeatures;

        public Builder() {
    	      // Empty
        }

        public Builder(HubArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hubBillingInfo = defaults.hubBillingInfo;
    	      this.hubName = defaults.hubName;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.tenantFeatures = defaults.tenantFeatures;
        }

        public Builder hubBillingInfo(@Nullable Output<HubBillingInfoFormatArgs> hubBillingInfo) {
            this.hubBillingInfo = hubBillingInfo;
            return this;
        }
        public Builder hubBillingInfo(@Nullable HubBillingInfoFormatArgs hubBillingInfo) {
            this.hubBillingInfo = Codegen.ofNullable(hubBillingInfo);
            return this;
        }
        public Builder hubName(@Nullable Output<String> hubName) {
            this.hubName = hubName;
            return this;
        }
        public Builder hubName(@Nullable String hubName) {
            this.hubName = Codegen.ofNullable(hubName);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tenantFeatures(@Nullable Output<Integer> tenantFeatures) {
            this.tenantFeatures = tenantFeatures;
            return this;
        }
        public Builder tenantFeatures(@Nullable Integer tenantFeatures) {
            this.tenantFeatures = Codegen.ofNullable(tenantFeatures);
            return this;
        }        public HubArgs build() {
            return new HubArgs(hubBillingInfo, hubName, location, resourceGroupName, tags, tenantFeatures);
        }
    }
}
