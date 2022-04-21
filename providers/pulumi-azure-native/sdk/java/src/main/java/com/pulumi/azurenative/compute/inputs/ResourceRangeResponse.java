// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the resource range.
 * 
 */
public final class ResourceRangeResponse extends com.pulumi.resources.InvokeArgs {

    public static final ResourceRangeResponse Empty = new ResourceRangeResponse();

    /**
     * The maximum number of the resource.
     * 
     */
    @Import(name="max")
    private @Nullable Integer max;

    public Optional<Integer> max() {
        return Optional.ofNullable(this.max);
    }

    /**
     * The minimum number of the resource.
     * 
     */
    @Import(name="min")
    private @Nullable Integer min;

    public Optional<Integer> min() {
        return Optional.ofNullable(this.min);
    }

    private ResourceRangeResponse() {}

    private ResourceRangeResponse(ResourceRangeResponse $) {
        this.max = $.max;
        this.min = $.min;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceRangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceRangeResponse $;

        public Builder() {
            $ = new ResourceRangeResponse();
        }

        public Builder(ResourceRangeResponse defaults) {
            $ = new ResourceRangeResponse(Objects.requireNonNull(defaults));
        }

        public Builder max(@Nullable Integer max) {
            $.max = max;
            return this;
        }

        public Builder min(@Nullable Integer min) {
            $.min = min;
            return this;
        }

        public ResourceRangeResponse build() {
            return $;
        }
    }

}
