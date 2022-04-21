// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.networkservices_v1.inputs.EndpointMatcherMetadataLabelMatcherArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A definition of a matcher that selects endpoints to which the policies should be applied.
 * 
 */
public final class EndpointMatcherArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointMatcherArgs Empty = new EndpointMatcherArgs();

    /**
     * The matcher is based on node metadata presented by xDS clients.
     * 
     */
    @Import(name="metadataLabelMatcher")
    private @Nullable Output<EndpointMatcherMetadataLabelMatcherArgs> metadataLabelMatcher;

    public Optional<Output<EndpointMatcherMetadataLabelMatcherArgs>> metadataLabelMatcher() {
        return Optional.ofNullable(this.metadataLabelMatcher);
    }

    private EndpointMatcherArgs() {}

    private EndpointMatcherArgs(EndpointMatcherArgs $) {
        this.metadataLabelMatcher = $.metadataLabelMatcher;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointMatcherArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointMatcherArgs $;

        public Builder() {
            $ = new EndpointMatcherArgs();
        }

        public Builder(EndpointMatcherArgs defaults) {
            $ = new EndpointMatcherArgs(Objects.requireNonNull(defaults));
        }

        public Builder metadataLabelMatcher(@Nullable Output<EndpointMatcherMetadataLabelMatcherArgs> metadataLabelMatcher) {
            $.metadataLabelMatcher = metadataLabelMatcher;
            return this;
        }

        public Builder metadataLabelMatcher(EndpointMatcherMetadataLabelMatcherArgs metadataLabelMatcher) {
            return metadataLabelMatcher(Output.of(metadataLabelMatcher));
        }

        public EndpointMatcherArgs build() {
            return $;
        }
    }

}
