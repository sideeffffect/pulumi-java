// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Trigger based on range of status codes.
 * 
 */
public final class StatusCodesRangeBasedTriggerArgs extends com.pulumi.resources.ResourceArgs {

    public static final StatusCodesRangeBasedTriggerArgs Empty = new StatusCodesRangeBasedTriggerArgs();

    /**
     * Request Count.
     * 
     */
    @Import(name="count")
    private @Nullable Output<Integer> count;

    public Optional<Output<Integer>> count() {
        return Optional.ofNullable(this.count);
    }

    @Import(name="path")
    private @Nullable Output<String> path;

    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * HTTP status code.
     * 
     */
    @Import(name="statusCodes")
    private @Nullable Output<String> statusCodes;

    public Optional<Output<String>> statusCodes() {
        return Optional.ofNullable(this.statusCodes);
    }

    /**
     * Time interval.
     * 
     */
    @Import(name="timeInterval")
    private @Nullable Output<String> timeInterval;

    public Optional<Output<String>> timeInterval() {
        return Optional.ofNullable(this.timeInterval);
    }

    private StatusCodesRangeBasedTriggerArgs() {}

    private StatusCodesRangeBasedTriggerArgs(StatusCodesRangeBasedTriggerArgs $) {
        this.count = $.count;
        this.path = $.path;
        this.statusCodes = $.statusCodes;
        this.timeInterval = $.timeInterval;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StatusCodesRangeBasedTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StatusCodesRangeBasedTriggerArgs $;

        public Builder() {
            $ = new StatusCodesRangeBasedTriggerArgs();
        }

        public Builder(StatusCodesRangeBasedTriggerArgs defaults) {
            $ = new StatusCodesRangeBasedTriggerArgs(Objects.requireNonNull(defaults));
        }

        public Builder count(@Nullable Output<Integer> count) {
            $.count = count;
            return this;
        }

        public Builder count(Integer count) {
            return count(Output.of(count));
        }

        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        public Builder path(String path) {
            return path(Output.of(path));
        }

        public Builder statusCodes(@Nullable Output<String> statusCodes) {
            $.statusCodes = statusCodes;
            return this;
        }

        public Builder statusCodes(String statusCodes) {
            return statusCodes(Output.of(statusCodes));
        }

        public Builder timeInterval(@Nullable Output<String> timeInterval) {
            $.timeInterval = timeInterval;
            return this;
        }

        public Builder timeInterval(String timeInterval) {
            return timeInterval(Output.of(timeInterval));
        }

        public StatusCodesRangeBasedTriggerArgs build() {
            return $;
        }
    }

}
