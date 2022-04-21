// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ProviderHubMetadataProviderAuthenticationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderHubMetadataProviderAuthenticationArgs Empty = new ProviderHubMetadataProviderAuthenticationArgs();

    @Import(name="allowedAudiences", required=true)
    private Output<List<String>> allowedAudiences;

    public Output<List<String>> allowedAudiences() {
        return this.allowedAudiences;
    }

    private ProviderHubMetadataProviderAuthenticationArgs() {}

    private ProviderHubMetadataProviderAuthenticationArgs(ProviderHubMetadataProviderAuthenticationArgs $) {
        this.allowedAudiences = $.allowedAudiences;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderHubMetadataProviderAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderHubMetadataProviderAuthenticationArgs $;

        public Builder() {
            $ = new ProviderHubMetadataProviderAuthenticationArgs();
        }

        public Builder(ProviderHubMetadataProviderAuthenticationArgs defaults) {
            $ = new ProviderHubMetadataProviderAuthenticationArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowedAudiences(Output<List<String>> allowedAudiences) {
            $.allowedAudiences = allowedAudiences;
            return this;
        }

        public Builder allowedAudiences(List<String> allowedAudiences) {
            return allowedAudiences(Output.of(allowedAudiences));
        }

        public Builder allowedAudiences(String... allowedAudiences) {
            return allowedAudiences(List.of(allowedAudiences));
        }

        public ProviderHubMetadataProviderAuthenticationArgs build() {
            $.allowedAudiences = Objects.requireNonNull($.allowedAudiences, "expected parameter 'allowedAudiences' to be non-null");
            return $;
        }
    }

}
