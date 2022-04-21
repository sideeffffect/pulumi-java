// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a machine that is part of a machine group
 * 
 */
public final class VmRecommendationArgs extends com.pulumi.resources.ResourceArgs {

    public static final VmRecommendationArgs Empty = new VmRecommendationArgs();

    /**
     * The configuration status of the machines group or machine or rule
     * 
     */
    @Import(name="configurationStatus")
    private @Nullable Output<String> configurationStatus;

    public Optional<Output<String>> configurationStatus() {
        return Optional.ofNullable(this.configurationStatus);
    }

    /**
     * The machine supportability of Enforce feature
     * 
     */
    @Import(name="enforcementSupport")
    private @Nullable Output<String> enforcementSupport;

    public Optional<Output<String>> enforcementSupport() {
        return Optional.ofNullable(this.enforcementSupport);
    }

    /**
     * The recommendation action of the machine or rule
     * 
     */
    @Import(name="recommendationAction")
    private @Nullable Output<String> recommendationAction;

    public Optional<Output<String>> recommendationAction() {
        return Optional.ofNullable(this.recommendationAction);
    }

    /**
     * The full resource id of the machine
     * 
     */
    @Import(name="resourceId")
    private @Nullable Output<String> resourceId;

    public Optional<Output<String>> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    private VmRecommendationArgs() {}

    private VmRecommendationArgs(VmRecommendationArgs $) {
        this.configurationStatus = $.configurationStatus;
        this.enforcementSupport = $.enforcementSupport;
        this.recommendationAction = $.recommendationAction;
        this.resourceId = $.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VmRecommendationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VmRecommendationArgs $;

        public Builder() {
            $ = new VmRecommendationArgs();
        }

        public Builder(VmRecommendationArgs defaults) {
            $ = new VmRecommendationArgs(Objects.requireNonNull(defaults));
        }

        public Builder configurationStatus(@Nullable Output<String> configurationStatus) {
            $.configurationStatus = configurationStatus;
            return this;
        }

        public Builder configurationStatus(String configurationStatus) {
            return configurationStatus(Output.of(configurationStatus));
        }

        public Builder enforcementSupport(@Nullable Output<String> enforcementSupport) {
            $.enforcementSupport = enforcementSupport;
            return this;
        }

        public Builder enforcementSupport(String enforcementSupport) {
            return enforcementSupport(Output.of(enforcementSupport));
        }

        public Builder recommendationAction(@Nullable Output<String> recommendationAction) {
            $.recommendationAction = recommendationAction;
            return this;
        }

        public Builder recommendationAction(String recommendationAction) {
            return recommendationAction(Output.of(recommendationAction));
        }

        public Builder resourceId(@Nullable Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        public VmRecommendationArgs build() {
            return $;
        }
    }

}
