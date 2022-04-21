// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.core_v1.inputs.ScopedResourceSelectorRequirementArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A scope selector represents the AND of the selectors represented by the scoped-resource selector requirements.
 * 
 */
public final class ScopeSelectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScopeSelectorArgs Empty = new ScopeSelectorArgs();

    /**
     * A list of scope selector requirements by scope of the resources.
     * 
     */
    @Import(name="matchExpressions")
    private @Nullable Output<List<ScopedResourceSelectorRequirementArgs>> matchExpressions;

    public Optional<Output<List<ScopedResourceSelectorRequirementArgs>>> matchExpressions() {
        return Optional.ofNullable(this.matchExpressions);
    }

    private ScopeSelectorArgs() {}

    private ScopeSelectorArgs(ScopeSelectorArgs $) {
        this.matchExpressions = $.matchExpressions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScopeSelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScopeSelectorArgs $;

        public Builder() {
            $ = new ScopeSelectorArgs();
        }

        public Builder(ScopeSelectorArgs defaults) {
            $ = new ScopeSelectorArgs(Objects.requireNonNull(defaults));
        }

        public Builder matchExpressions(@Nullable Output<List<ScopedResourceSelectorRequirementArgs>> matchExpressions) {
            $.matchExpressions = matchExpressions;
            return this;
        }

        public Builder matchExpressions(List<ScopedResourceSelectorRequirementArgs> matchExpressions) {
            return matchExpressions(Output.of(matchExpressions));
        }

        public Builder matchExpressions(ScopedResourceSelectorRequirementArgs... matchExpressions) {
            return matchExpressions(List.of(matchExpressions));
        }

        public ScopeSelectorArgs build() {
            return $;
        }
    }

}
