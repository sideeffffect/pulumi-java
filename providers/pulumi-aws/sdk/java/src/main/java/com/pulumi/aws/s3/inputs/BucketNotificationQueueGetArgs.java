// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketNotificationQueueGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketNotificationQueueGetArgs Empty = new BucketNotificationQueueGetArgs();

    /**
     * [Event](http://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html#notification-how-to-event-types-and-destinations) for which to send notifications.
     * 
     */
    @Import(name="events", required=true)
    private Output<List<String>> events;

    public Output<List<String>> events() {
        return this.events;
    }

    /**
     * Object key name prefix.
     * 
     */
    @Import(name="filterPrefix")
    private @Nullable Output<String> filterPrefix;

    public Optional<Output<String>> filterPrefix() {
        return Optional.ofNullable(this.filterPrefix);
    }

    /**
     * Object key name suffix.
     * 
     */
    @Import(name="filterSuffix")
    private @Nullable Output<String> filterSuffix;

    public Optional<Output<String>> filterSuffix() {
        return Optional.ofNullable(this.filterSuffix);
    }

    /**
     * Unique identifier for each of the notification configurations.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * SQS queue ARN.
     * 
     */
    @Import(name="queueArn", required=true)
    private Output<String> queueArn;

    public Output<String> queueArn() {
        return this.queueArn;
    }

    private BucketNotificationQueueGetArgs() {}

    private BucketNotificationQueueGetArgs(BucketNotificationQueueGetArgs $) {
        this.events = $.events;
        this.filterPrefix = $.filterPrefix;
        this.filterSuffix = $.filterSuffix;
        this.id = $.id;
        this.queueArn = $.queueArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketNotificationQueueGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketNotificationQueueGetArgs $;

        public Builder() {
            $ = new BucketNotificationQueueGetArgs();
        }

        public Builder(BucketNotificationQueueGetArgs defaults) {
            $ = new BucketNotificationQueueGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder events(Output<List<String>> events) {
            $.events = events;
            return this;
        }

        public Builder events(List<String> events) {
            return events(Output.of(events));
        }

        public Builder events(String... events) {
            return events(List.of(events));
        }

        public Builder filterPrefix(@Nullable Output<String> filterPrefix) {
            $.filterPrefix = filterPrefix;
            return this;
        }

        public Builder filterPrefix(String filterPrefix) {
            return filterPrefix(Output.of(filterPrefix));
        }

        public Builder filterSuffix(@Nullable Output<String> filterSuffix) {
            $.filterSuffix = filterSuffix;
            return this;
        }

        public Builder filterSuffix(String filterSuffix) {
            return filterSuffix(Output.of(filterSuffix));
        }

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder queueArn(Output<String> queueArn) {
            $.queueArn = queueArn;
            return this;
        }

        public Builder queueArn(String queueArn) {
            return queueArn(Output.of(queueArn));
        }

        public BucketNotificationQueueGetArgs build() {
            $.events = Objects.requireNonNull($.events, "expected parameter 'events' to be non-null");
            $.queueArn = Objects.requireNonNull($.queueArn, "expected parameter 'queueArn' to be non-null");
            return $;
        }
    }

}
