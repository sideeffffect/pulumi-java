// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketNotificationTopicGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketNotificationTopicGetArgs Empty = new BucketNotificationTopicGetArgs();

    /**
     * [Event](http://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html#notification-how-to-event-types-and-destinations) for which to send notifications.
     * 
     */
    @InputImport(name="events", required=true)
      private final Input<List<String>> events;

    public Input<List<String>> getEvents() {
        return this.events;
    }

    /**
     * Object key name prefix.
     * 
     */
    @InputImport(name="filterPrefix")
      private final @Nullable Input<String> filterPrefix;

    public Input<String> getFilterPrefix() {
        return this.filterPrefix == null ? Input.empty() : this.filterPrefix;
    }

    /**
     * Object key name suffix.
     * 
     */
    @InputImport(name="filterSuffix")
      private final @Nullable Input<String> filterSuffix;

    public Input<String> getFilterSuffix() {
        return this.filterSuffix == null ? Input.empty() : this.filterSuffix;
    }

    /**
     * Unique identifier for each of the notification configurations.
     * 
     */
    @InputImport(name="id")
      private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * SNS topic ARN.
     * 
     */
    @InputImport(name="topicArn", required=true)
      private final Input<String> topicArn;

    public Input<String> getTopicArn() {
        return this.topicArn;
    }

    public BucketNotificationTopicGetArgs(
        Input<List<String>> events,
        @Nullable Input<String> filterPrefix,
        @Nullable Input<String> filterSuffix,
        @Nullable Input<String> id,
        Input<String> topicArn) {
        this.events = Objects.requireNonNull(events, "expected parameter 'events' to be non-null");
        this.filterPrefix = filterPrefix;
        this.filterSuffix = filterSuffix;
        this.id = id;
        this.topicArn = Objects.requireNonNull(topicArn, "expected parameter 'topicArn' to be non-null");
    }

    private BucketNotificationTopicGetArgs() {
        this.events = Input.empty();
        this.filterPrefix = Input.empty();
        this.filterSuffix = Input.empty();
        this.id = Input.empty();
        this.topicArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketNotificationTopicGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> events;
        private @Nullable Input<String> filterPrefix;
        private @Nullable Input<String> filterSuffix;
        private @Nullable Input<String> id;
        private Input<String> topicArn;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketNotificationTopicGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.events = defaults.events;
    	      this.filterPrefix = defaults.filterPrefix;
    	      this.filterSuffix = defaults.filterSuffix;
    	      this.id = defaults.id;
    	      this.topicArn = defaults.topicArn;
        }

        public Builder events(Input<List<String>> events) {
            this.events = Objects.requireNonNull(events);
            return this;
        }

        public Builder events(List<String> events) {
            this.events = Input.of(Objects.requireNonNull(events));
            return this;
        }

        public Builder filterPrefix(@Nullable Input<String> filterPrefix) {
            this.filterPrefix = filterPrefix;
            return this;
        }

        public Builder filterPrefix(@Nullable String filterPrefix) {
            this.filterPrefix = Input.ofNullable(filterPrefix);
            return this;
        }

        public Builder filterSuffix(@Nullable Input<String> filterSuffix) {
            this.filterSuffix = filterSuffix;
            return this;
        }

        public Builder filterSuffix(@Nullable String filterSuffix) {
            this.filterSuffix = Input.ofNullable(filterSuffix);
            return this;
        }

        public Builder id(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder topicArn(Input<String> topicArn) {
            this.topicArn = Objects.requireNonNull(topicArn);
            return this;
        }

        public Builder topicArn(String topicArn) {
            this.topicArn = Input.of(Objects.requireNonNull(topicArn));
            return this;
        }
        public BucketNotificationTopicGetArgs build() {
            return new BucketNotificationTopicGetArgs(events, filterPrefix, filterSuffix, id, topicArn);
        }
    }
}
