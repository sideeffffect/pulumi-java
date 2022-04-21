// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomDomainArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomDomainArgs Empty = new CustomDomainArgs();

    /**
     * Name of the custom domain within an endpoint.
     * 
     */
    @Import(name="customDomainName")
    private @Nullable Output<String> customDomainName;

    public Optional<Output<String>> customDomainName() {
        return Optional.ofNullable(this.customDomainName);
    }

    /**
     * Name of the endpoint under the profile which is unique globally.
     * 
     */
    @Import(name="endpointName", required=true)
    private Output<String> endpointName;

    public Output<String> endpointName() {
        return this.endpointName;
    }

    /**
     * The host name of the custom domain. Must be a domain name.
     * 
     */
    @Import(name="hostName", required=true)
    private Output<String> hostName;

    public Output<String> hostName() {
        return this.hostName;
    }

    /**
     * Name of the CDN profile which is unique within the resource group.
     * 
     */
    @Import(name="profileName", required=true)
    private Output<String> profileName;

    public Output<String> profileName() {
        return this.profileName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private CustomDomainArgs() {}

    private CustomDomainArgs(CustomDomainArgs $) {
        this.customDomainName = $.customDomainName;
        this.endpointName = $.endpointName;
        this.hostName = $.hostName;
        this.profileName = $.profileName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomDomainArgs $;

        public Builder() {
            $ = new CustomDomainArgs();
        }

        public Builder(CustomDomainArgs defaults) {
            $ = new CustomDomainArgs(Objects.requireNonNull(defaults));
        }

        public Builder customDomainName(@Nullable Output<String> customDomainName) {
            $.customDomainName = customDomainName;
            return this;
        }

        public Builder customDomainName(String customDomainName) {
            return customDomainName(Output.of(customDomainName));
        }

        public Builder endpointName(Output<String> endpointName) {
            $.endpointName = endpointName;
            return this;
        }

        public Builder endpointName(String endpointName) {
            return endpointName(Output.of(endpointName));
        }

        public Builder hostName(Output<String> hostName) {
            $.hostName = hostName;
            return this;
        }

        public Builder hostName(String hostName) {
            return hostName(Output.of(hostName));
        }

        public Builder profileName(Output<String> profileName) {
            $.profileName = profileName;
            return this;
        }

        public Builder profileName(String profileName) {
            return profileName(Output.of(profileName));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public CustomDomainArgs build() {
            $.endpointName = Objects.requireNonNull($.endpointName, "expected parameter 'endpointName' to be non-null");
            $.hostName = Objects.requireNonNull($.hostName, "expected parameter 'hostName' to be non-null");
            $.profileName = Objects.requireNonNull($.profileName, "expected parameter 'profileName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
