// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Target scaling by request utilization. Only applicable in the App Engine flexible environment.
 * 
 */
public final class RequestUtilizationArgs extends com.pulumi.resources.ResourceArgs {

    public static final RequestUtilizationArgs Empty = new RequestUtilizationArgs();

    /**
     * Target number of concurrent requests.
     * 
     */
    @Import(name="targetConcurrentRequests")
    private @Nullable Output<Integer> targetConcurrentRequests;

    /**
     * @return Target number of concurrent requests.
     * 
     */
    public Optional<Output<Integer>> targetConcurrentRequests() {
        return Optional.ofNullable(this.targetConcurrentRequests);
    }

    /**
     * Target requests per second.
     * 
     */
    @Import(name="targetRequestCountPerSecond")
    private @Nullable Output<Integer> targetRequestCountPerSecond;

    /**
     * @return Target requests per second.
     * 
     */
    public Optional<Output<Integer>> targetRequestCountPerSecond() {
        return Optional.ofNullable(this.targetRequestCountPerSecond);
    }

    private RequestUtilizationArgs() {}

    private RequestUtilizationArgs(RequestUtilizationArgs $) {
        this.targetConcurrentRequests = $.targetConcurrentRequests;
        this.targetRequestCountPerSecond = $.targetRequestCountPerSecond;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RequestUtilizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RequestUtilizationArgs $;

        public Builder() {
            $ = new RequestUtilizationArgs();
        }

        public Builder(RequestUtilizationArgs defaults) {
            $ = new RequestUtilizationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param targetConcurrentRequests Target number of concurrent requests.
         * 
         * @return builder
         * 
         */
        public Builder targetConcurrentRequests(@Nullable Output<Integer> targetConcurrentRequests) {
            $.targetConcurrentRequests = targetConcurrentRequests;
            return this;
        }

        /**
         * @param targetConcurrentRequests Target number of concurrent requests.
         * 
         * @return builder
         * 
         */
        public Builder targetConcurrentRequests(Integer targetConcurrentRequests) {
            return targetConcurrentRequests(Output.of(targetConcurrentRequests));
        }

        /**
         * @param targetRequestCountPerSecond Target requests per second.
         * 
         * @return builder
         * 
         */
        public Builder targetRequestCountPerSecond(@Nullable Output<Integer> targetRequestCountPerSecond) {
            $.targetRequestCountPerSecond = targetRequestCountPerSecond;
            return this;
        }

        /**
         * @param targetRequestCountPerSecond Target requests per second.
         * 
         * @return builder
         * 
         */
        public Builder targetRequestCountPerSecond(Integer targetRequestCountPerSecond) {
            return targetRequestCountPerSecond(Output.of(targetRequestCountPerSecond));
        }

        public RequestUtilizationArgs build() {
            return $;
        }
    }

}
