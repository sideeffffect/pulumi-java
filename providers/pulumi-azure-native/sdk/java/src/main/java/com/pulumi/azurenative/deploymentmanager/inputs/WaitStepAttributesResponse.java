// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.deploymentmanager.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The parameters for the wait step.
 * 
 */
public final class WaitStepAttributesResponse extends com.pulumi.resources.InvokeArgs {

    public static final WaitStepAttributesResponse Empty = new WaitStepAttributesResponse();

    /**
     * The duration in ISO 8601 format of how long the wait should be.
     * 
     */
    @Import(name="duration", required=true)
    private String duration;

    public String duration() {
        return this.duration;
    }

    private WaitStepAttributesResponse() {}

    private WaitStepAttributesResponse(WaitStepAttributesResponse $) {
        this.duration = $.duration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WaitStepAttributesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WaitStepAttributesResponse $;

        public Builder() {
            $ = new WaitStepAttributesResponse();
        }

        public Builder(WaitStepAttributesResponse defaults) {
            $ = new WaitStepAttributesResponse(Objects.requireNonNull(defaults));
        }

        public Builder duration(String duration) {
            $.duration = duration;
            return this;
        }

        public WaitStepAttributesResponse build() {
            $.duration = Objects.requireNonNull($.duration, "expected parameter 'duration' to be non-null");
            return $;
        }
    }

}
