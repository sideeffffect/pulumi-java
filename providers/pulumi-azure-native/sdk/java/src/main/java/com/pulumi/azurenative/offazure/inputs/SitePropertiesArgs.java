// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.offazure.inputs;

import com.pulumi.azurenative.offazure.inputs.SiteAgentPropertiesArgs;
import com.pulumi.azurenative.offazure.inputs.SiteSpnPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Class for site properties.
 * 
 */
public final class SitePropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final SitePropertiesArgs Empty = new SitePropertiesArgs();

    /**
     * On-premises agent details.
     * 
     */
    @Import(name="agentDetails")
    private @Nullable Output<SiteAgentPropertiesArgs> agentDetails;

    public Optional<Output<SiteAgentPropertiesArgs>> agentDetails() {
        return Optional.ofNullable(this.agentDetails);
    }

    /**
     * Appliance Name.
     * 
     */
    @Import(name="applianceName")
    private @Nullable Output<String> applianceName;

    public Optional<Output<String>> applianceName() {
        return Optional.ofNullable(this.applianceName);
    }

    /**
     * ARM ID of migration hub solution for SDS.
     * 
     */
    @Import(name="discoverySolutionId")
    private @Nullable Output<String> discoverySolutionId;

    public Optional<Output<String>> discoverySolutionId() {
        return Optional.ofNullable(this.discoverySolutionId);
    }

    /**
     * Service principal identity details used by agent for communication to the service.
     * 
     */
    @Import(name="servicePrincipalIdentityDetails")
    private @Nullable Output<SiteSpnPropertiesArgs> servicePrincipalIdentityDetails;

    public Optional<Output<SiteSpnPropertiesArgs>> servicePrincipalIdentityDetails() {
        return Optional.ofNullable(this.servicePrincipalIdentityDetails);
    }

    private SitePropertiesArgs() {}

    private SitePropertiesArgs(SitePropertiesArgs $) {
        this.agentDetails = $.agentDetails;
        this.applianceName = $.applianceName;
        this.discoverySolutionId = $.discoverySolutionId;
        this.servicePrincipalIdentityDetails = $.servicePrincipalIdentityDetails;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SitePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SitePropertiesArgs $;

        public Builder() {
            $ = new SitePropertiesArgs();
        }

        public Builder(SitePropertiesArgs defaults) {
            $ = new SitePropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder agentDetails(@Nullable Output<SiteAgentPropertiesArgs> agentDetails) {
            $.agentDetails = agentDetails;
            return this;
        }

        public Builder agentDetails(SiteAgentPropertiesArgs agentDetails) {
            return agentDetails(Output.of(agentDetails));
        }

        public Builder applianceName(@Nullable Output<String> applianceName) {
            $.applianceName = applianceName;
            return this;
        }

        public Builder applianceName(String applianceName) {
            return applianceName(Output.of(applianceName));
        }

        public Builder discoverySolutionId(@Nullable Output<String> discoverySolutionId) {
            $.discoverySolutionId = discoverySolutionId;
            return this;
        }

        public Builder discoverySolutionId(String discoverySolutionId) {
            return discoverySolutionId(Output.of(discoverySolutionId));
        }

        public Builder servicePrincipalIdentityDetails(@Nullable Output<SiteSpnPropertiesArgs> servicePrincipalIdentityDetails) {
            $.servicePrincipalIdentityDetails = servicePrincipalIdentityDetails;
            return this;
        }

        public Builder servicePrincipalIdentityDetails(SiteSpnPropertiesArgs servicePrincipalIdentityDetails) {
            return servicePrincipalIdentityDetails(Output.of(servicePrincipalIdentityDetails));
        }

        public SitePropertiesArgs build() {
            return $;
        }
    }

}
