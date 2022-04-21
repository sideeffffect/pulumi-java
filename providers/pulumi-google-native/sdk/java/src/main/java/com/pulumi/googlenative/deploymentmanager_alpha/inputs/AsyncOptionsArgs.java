// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.deploymentmanager_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.deploymentmanager_alpha.inputs.PollingOptionsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Async options that determine when a resource should finish.
 * 
 */
public final class AsyncOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AsyncOptionsArgs Empty = new AsyncOptionsArgs();

    /**
     * Method regex where this policy will apply.
     * 
     */
    @Import(name="methodMatch")
    private @Nullable Output<String> methodMatch;

    public Optional<Output<String>> methodMatch() {
        return Optional.ofNullable(this.methodMatch);
    }

    /**
     * Deployment manager will poll instances for this API resource setting a RUNNING state, and blocking until polling conditions tell whether the resource is completed or failed.
     * 
     */
    @Import(name="pollingOptions")
    private @Nullable Output<PollingOptionsArgs> pollingOptions;

    public Optional<Output<PollingOptionsArgs>> pollingOptions() {
        return Optional.ofNullable(this.pollingOptions);
    }

    private AsyncOptionsArgs() {}

    private AsyncOptionsArgs(AsyncOptionsArgs $) {
        this.methodMatch = $.methodMatch;
        this.pollingOptions = $.pollingOptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AsyncOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AsyncOptionsArgs $;

        public Builder() {
            $ = new AsyncOptionsArgs();
        }

        public Builder(AsyncOptionsArgs defaults) {
            $ = new AsyncOptionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder methodMatch(@Nullable Output<String> methodMatch) {
            $.methodMatch = methodMatch;
            return this;
        }

        public Builder methodMatch(String methodMatch) {
            return methodMatch(Output.of(methodMatch));
        }

        public Builder pollingOptions(@Nullable Output<PollingOptionsArgs> pollingOptions) {
            $.pollingOptions = pollingOptions;
            return this;
        }

        public Builder pollingOptions(PollingOptionsArgs pollingOptions) {
            return pollingOptions(Output.of(pollingOptions));
        }

        public AsyncOptionsArgs build() {
            return $;
        }
    }

}
