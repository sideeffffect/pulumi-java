// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Trigger based on request execution time.
 * 
 */
public final class SlowRequestsBasedTriggerResponse extends com.pulumi.resources.InvokeArgs {

    public static final SlowRequestsBasedTriggerResponse Empty = new SlowRequestsBasedTriggerResponse();

    /**
     * Request Count.
     * 
     */
    @Import(name="count")
    private @Nullable Integer count;

    public Optional<Integer> count() {
        return Optional.ofNullable(this.count);
    }

    /**
     * Request Path.
     * 
     */
    @Import(name="path")
    private @Nullable String path;

    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * Time interval.
     * 
     */
    @Import(name="timeInterval")
    private @Nullable String timeInterval;

    public Optional<String> timeInterval() {
        return Optional.ofNullable(this.timeInterval);
    }

    /**
     * Time taken.
     * 
     */
    @Import(name="timeTaken")
    private @Nullable String timeTaken;

    public Optional<String> timeTaken() {
        return Optional.ofNullable(this.timeTaken);
    }

    private SlowRequestsBasedTriggerResponse() {}

    private SlowRequestsBasedTriggerResponse(SlowRequestsBasedTriggerResponse $) {
        this.count = $.count;
        this.path = $.path;
        this.timeInterval = $.timeInterval;
        this.timeTaken = $.timeTaken;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SlowRequestsBasedTriggerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SlowRequestsBasedTriggerResponse $;

        public Builder() {
            $ = new SlowRequestsBasedTriggerResponse();
        }

        public Builder(SlowRequestsBasedTriggerResponse defaults) {
            $ = new SlowRequestsBasedTriggerResponse(Objects.requireNonNull(defaults));
        }

        public Builder count(@Nullable Integer count) {
            $.count = count;
            return this;
        }

        public Builder path(@Nullable String path) {
            $.path = path;
            return this;
        }

        public Builder timeInterval(@Nullable String timeInterval) {
            $.timeInterval = timeInterval;
            return this;
        }

        public Builder timeTaken(@Nullable String timeTaken) {
            $.timeTaken = timeTaken;
            return this;
        }

        public SlowRequestsBasedTriggerResponse build() {
            return $;
        }
    }

}
