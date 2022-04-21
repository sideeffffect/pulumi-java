// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.worklink.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class FleetIdentityProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final FleetIdentityProviderArgs Empty = new FleetIdentityProviderArgs();

    /**
     * The SAML metadata document provided by the customer’s identity provider.
     * 
     */
    @Import(name="samlMetadata", required=true)
    private Output<String> samlMetadata;

    public Output<String> samlMetadata() {
        return this.samlMetadata;
    }

    /**
     * The type of identity provider.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private FleetIdentityProviderArgs() {}

    private FleetIdentityProviderArgs(FleetIdentityProviderArgs $) {
        this.samlMetadata = $.samlMetadata;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FleetIdentityProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FleetIdentityProviderArgs $;

        public Builder() {
            $ = new FleetIdentityProviderArgs();
        }

        public Builder(FleetIdentityProviderArgs defaults) {
            $ = new FleetIdentityProviderArgs(Objects.requireNonNull(defaults));
        }

        public Builder samlMetadata(Output<String> samlMetadata) {
            $.samlMetadata = samlMetadata;
            return this;
        }

        public Builder samlMetadata(String samlMetadata) {
            return samlMetadata(Output.of(samlMetadata));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public FleetIdentityProviderArgs build() {
            $.samlMetadata = Objects.requireNonNull($.samlMetadata, "expected parameter 'samlMetadata' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
