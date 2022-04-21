// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.timeseriesinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An object that represents the status of warm storage on an environment.
 * 
 */
public final class WarmStorageEnvironmentStatusResponse extends com.pulumi.resources.InvokeArgs {

    public static final WarmStorageEnvironmentStatusResponse Empty = new WarmStorageEnvironmentStatusResponse();

    /**
     * A value that represents the number of properties used by the environment for S1/S2 SKU and number of properties used by Warm Store for PAYG SKU
     * 
     */
    @Import(name="currentCount")
    private @Nullable Integer currentCount;

    public Optional<Integer> currentCount() {
        return Optional.ofNullable(this.currentCount);
    }

    /**
     * A value that represents the maximum number of properties used allowed by the environment for S1/S2 SKU and maximum number of properties allowed by Warm Store for PAYG SKU.
     * 
     */
    @Import(name="maxCount")
    private @Nullable Integer maxCount;

    public Optional<Integer> maxCount() {
        return Optional.ofNullable(this.maxCount);
    }

    /**
     * This string represents the state of warm storage properties usage. It can be &#34;Ok&#34;, &#34;Error&#34;, &#34;Unknown&#34;.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    private WarmStorageEnvironmentStatusResponse() {}

    private WarmStorageEnvironmentStatusResponse(WarmStorageEnvironmentStatusResponse $) {
        this.currentCount = $.currentCount;
        this.maxCount = $.maxCount;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WarmStorageEnvironmentStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WarmStorageEnvironmentStatusResponse $;

        public Builder() {
            $ = new WarmStorageEnvironmentStatusResponse();
        }

        public Builder(WarmStorageEnvironmentStatusResponse defaults) {
            $ = new WarmStorageEnvironmentStatusResponse(Objects.requireNonNull(defaults));
        }

        public Builder currentCount(@Nullable Integer currentCount) {
            $.currentCount = currentCount;
            return this;
        }

        public Builder maxCount(@Nullable Integer maxCount) {
            $.maxCount = maxCount;
            return this;
        }

        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        public WarmStorageEnvironmentStatusResponse build() {
            return $;
        }
    }

}
