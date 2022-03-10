// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sqs.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class QueueState extends io.pulumi.resources.ResourceArgs {

    public static final QueueState Empty = new QueueState();

    /**
     * The ARN of the SQS queue
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Enables content-based deduplication for FIFO queues. For more information, see the [related documentation](http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing)
     * 
     */
    @InputImport(name="contentBasedDeduplication")
      private final @Nullable Input<Boolean> contentBasedDeduplication;

    public Input<Boolean> getContentBasedDeduplication() {
        return this.contentBasedDeduplication == null ? Input.empty() : this.contentBasedDeduplication;
    }

    /**
     * Specifies whether message deduplication occurs at the message group or queue level. Valid values are `messageGroup` and `queue` (default).
     * 
     */
    @InputImport(name="deduplicationScope")
      private final @Nullable Input<String> deduplicationScope;

    public Input<String> getDeduplicationScope() {
        return this.deduplicationScope == null ? Input.empty() : this.deduplicationScope;
    }

    /**
     * The time in seconds that the delivery of all messages in the queue will be delayed. An integer from 0 to 900 (15 minutes). The default for this attribute is 0 seconds.
     * 
     */
    @InputImport(name="delaySeconds")
      private final @Nullable Input<Integer> delaySeconds;

    public Input<Integer> getDelaySeconds() {
        return this.delaySeconds == null ? Input.empty() : this.delaySeconds;
    }

    /**
     * Boolean designating a FIFO queue. If not set, it defaults to `false` making it standard.
     * 
     */
    @InputImport(name="fifoQueue")
      private final @Nullable Input<Boolean> fifoQueue;

    public Input<Boolean> getFifoQueue() {
        return this.fifoQueue == null ? Input.empty() : this.fifoQueue;
    }

    /**
     * Specifies whether the FIFO queue throughput quota applies to the entire queue or per message group. Valid values are `perQueue` (default) and `perMessageGroupId`.
     * 
     */
    @InputImport(name="fifoThroughputLimit")
      private final @Nullable Input<String> fifoThroughputLimit;

    public Input<String> getFifoThroughputLimit() {
        return this.fifoThroughputLimit == null ? Input.empty() : this.fifoThroughputLimit;
    }

    /**
     * The length of time, in seconds, for which Amazon SQS can reuse a data key to encrypt or decrypt messages before calling AWS KMS again. An integer representing seconds, between 60 seconds (1 minute) and 86,400 seconds (24 hours). The default is 300 (5 minutes).
     * 
     */
    @InputImport(name="kmsDataKeyReusePeriodSeconds")
      private final @Nullable Input<Integer> kmsDataKeyReusePeriodSeconds;

    public Input<Integer> getKmsDataKeyReusePeriodSeconds() {
        return this.kmsDataKeyReusePeriodSeconds == null ? Input.empty() : this.kmsDataKeyReusePeriodSeconds;
    }

    /**
     * The ID of an AWS-managed customer master key (CMK) for Amazon SQS or a custom CMK. For more information, see [Key Terms](http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-sse-key-terms).
     * 
     */
    @InputImport(name="kmsMasterKeyId")
      private final @Nullable Input<String> kmsMasterKeyId;

    public Input<String> getKmsMasterKeyId() {
        return this.kmsMasterKeyId == null ? Input.empty() : this.kmsMasterKeyId;
    }

    /**
     * The limit of how many bytes a message can contain before Amazon SQS rejects it. An integer from 1024 bytes (1 KiB) up to 262144 bytes (256 KiB). The default for this attribute is 262144 (256 KiB).
     * 
     */
    @InputImport(name="maxMessageSize")
      private final @Nullable Input<Integer> maxMessageSize;

    public Input<Integer> getMaxMessageSize() {
        return this.maxMessageSize == null ? Input.empty() : this.maxMessageSize;
    }

    /**
     * The number of seconds Amazon SQS retains a message. Integer representing seconds, from 60 (1 minute) to 1209600 (14 days). The default for this attribute is 345600 (4 days).
     * 
     */
    @InputImport(name="messageRetentionSeconds")
      private final @Nullable Input<Integer> messageRetentionSeconds;

    public Input<Integer> getMessageRetentionSeconds() {
        return this.messageRetentionSeconds == null ? Input.empty() : this.messageRetentionSeconds;
    }

    /**
     * The name of the queue. Queue names must be made up of only uppercase and lowercase ASCII letters, numbers, underscores, and hyphens, and must be between 1 and 80 characters long. For a FIFO (first-in-first-out) queue, the name must end with the `.fifo` suffix. If omitted, this provider will assign a random, unique name. Conflicts with `name_prefix`
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`
     * 
     */
    @InputImport(name="namePrefix")
      private final @Nullable Input<String> namePrefix;

    public Input<String> getNamePrefix() {
        return this.namePrefix == null ? Input.empty() : this.namePrefix;
    }

    /**
     * The JSON policy for the SQS queue.
     * 
     */
    @InputImport(name="policy")
      private final @Nullable Input<String> policy;

    public Input<String> getPolicy() {
        return this.policy == null ? Input.empty() : this.policy;
    }

    /**
     * The time for which a ReceiveMessage call will wait for a message to arrive (long polling) before returning. An integer from 0 to 20 (seconds). The default for this attribute is 0, meaning that the call will return immediately.
     * 
     */
    @InputImport(name="receiveWaitTimeSeconds")
      private final @Nullable Input<Integer> receiveWaitTimeSeconds;

    public Input<Integer> getReceiveWaitTimeSeconds() {
        return this.receiveWaitTimeSeconds == null ? Input.empty() : this.receiveWaitTimeSeconds;
    }

    /**
     * The JSON policy to set up the Dead Letter Queue redrive permission, see [AWS docs](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html).
     * 
     */
    @InputImport(name="redriveAllowPolicy")
      private final @Nullable Input<String> redriveAllowPolicy;

    public Input<String> getRedriveAllowPolicy() {
        return this.redriveAllowPolicy == null ? Input.empty() : this.redriveAllowPolicy;
    }

    /**
     * The JSON policy to set up the Dead Letter Queue, see [AWS docs](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html). **Note:** when specifying `maxReceiveCount`, you must specify it as an integer (`5`), and not a string (`"5"`).
     * 
     */
    @InputImport(name="redrivePolicy")
      private final @Nullable Input<String> redrivePolicy;

    public Input<String> getRedrivePolicy() {
        return this.redrivePolicy == null ? Input.empty() : this.redrivePolicy;
    }

    /**
     * Boolean to enable server-side encryption (SSE) of message content with SQS-owned encryption keys. Defaults to `false`. See [Encryption at rest](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html).
     * 
     */
    @InputImport(name="sqsManagedSseEnabled")
      private final @Nullable Input<Boolean> sqsManagedSseEnabled;

    public Input<Boolean> getSqsManagedSseEnabled() {
        return this.sqsManagedSseEnabled == null ? Input.empty() : this.sqsManagedSseEnabled;
    }

    /**
     * A map of tags to assign to the queue. If configured with a provider `default_tags` configuration block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider.
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * Same as `id`: The URL for the created Amazon SQS queue.
     * 
     */
    @InputImport(name="url")
      private final @Nullable Input<String> url;

    public Input<String> getUrl() {
        return this.url == null ? Input.empty() : this.url;
    }

    /**
     * The visibility timeout for the queue. An integer from 0 to 43200 (12 hours). The default for this attribute is 30. For more information about visibility timeout, see [AWS docs](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html).
     * 
     */
    @InputImport(name="visibilityTimeoutSeconds")
      private final @Nullable Input<Integer> visibilityTimeoutSeconds;

    public Input<Integer> getVisibilityTimeoutSeconds() {
        return this.visibilityTimeoutSeconds == null ? Input.empty() : this.visibilityTimeoutSeconds;
    }

    public QueueState(
        @Nullable Input<String> arn,
        @Nullable Input<Boolean> contentBasedDeduplication,
        @Nullable Input<String> deduplicationScope,
        @Nullable Input<Integer> delaySeconds,
        @Nullable Input<Boolean> fifoQueue,
        @Nullable Input<String> fifoThroughputLimit,
        @Nullable Input<Integer> kmsDataKeyReusePeriodSeconds,
        @Nullable Input<String> kmsMasterKeyId,
        @Nullable Input<Integer> maxMessageSize,
        @Nullable Input<Integer> messageRetentionSeconds,
        @Nullable Input<String> name,
        @Nullable Input<String> namePrefix,
        @Nullable Input<String> policy,
        @Nullable Input<Integer> receiveWaitTimeSeconds,
        @Nullable Input<String> redriveAllowPolicy,
        @Nullable Input<String> redrivePolicy,
        @Nullable Input<Boolean> sqsManagedSseEnabled,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<String> url,
        @Nullable Input<Integer> visibilityTimeoutSeconds) {
        this.arn = arn;
        this.contentBasedDeduplication = contentBasedDeduplication;
        this.deduplicationScope = deduplicationScope;
        this.delaySeconds = delaySeconds;
        this.fifoQueue = fifoQueue;
        this.fifoThroughputLimit = fifoThroughputLimit;
        this.kmsDataKeyReusePeriodSeconds = kmsDataKeyReusePeriodSeconds;
        this.kmsMasterKeyId = kmsMasterKeyId;
        this.maxMessageSize = maxMessageSize;
        this.messageRetentionSeconds = messageRetentionSeconds;
        this.name = name;
        this.namePrefix = namePrefix;
        this.policy = policy;
        this.receiveWaitTimeSeconds = receiveWaitTimeSeconds;
        this.redriveAllowPolicy = redriveAllowPolicy;
        this.redrivePolicy = redrivePolicy;
        this.sqsManagedSseEnabled = sqsManagedSseEnabled;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.url = url;
        this.visibilityTimeoutSeconds = visibilityTimeoutSeconds;
    }

    private QueueState() {
        this.arn = Input.empty();
        this.contentBasedDeduplication = Input.empty();
        this.deduplicationScope = Input.empty();
        this.delaySeconds = Input.empty();
        this.fifoQueue = Input.empty();
        this.fifoThroughputLimit = Input.empty();
        this.kmsDataKeyReusePeriodSeconds = Input.empty();
        this.kmsMasterKeyId = Input.empty();
        this.maxMessageSize = Input.empty();
        this.messageRetentionSeconds = Input.empty();
        this.name = Input.empty();
        this.namePrefix = Input.empty();
        this.policy = Input.empty();
        this.receiveWaitTimeSeconds = Input.empty();
        this.redriveAllowPolicy = Input.empty();
        this.redrivePolicy = Input.empty();
        this.sqsManagedSseEnabled = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.url = Input.empty();
        this.visibilityTimeoutSeconds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueueState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<Boolean> contentBasedDeduplication;
        private @Nullable Input<String> deduplicationScope;
        private @Nullable Input<Integer> delaySeconds;
        private @Nullable Input<Boolean> fifoQueue;
        private @Nullable Input<String> fifoThroughputLimit;
        private @Nullable Input<Integer> kmsDataKeyReusePeriodSeconds;
        private @Nullable Input<String> kmsMasterKeyId;
        private @Nullable Input<Integer> maxMessageSize;
        private @Nullable Input<Integer> messageRetentionSeconds;
        private @Nullable Input<String> name;
        private @Nullable Input<String> namePrefix;
        private @Nullable Input<String> policy;
        private @Nullable Input<Integer> receiveWaitTimeSeconds;
        private @Nullable Input<String> redriveAllowPolicy;
        private @Nullable Input<String> redrivePolicy;
        private @Nullable Input<Boolean> sqsManagedSseEnabled;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<String> url;
        private @Nullable Input<Integer> visibilityTimeoutSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(QueueState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.contentBasedDeduplication = defaults.contentBasedDeduplication;
    	      this.deduplicationScope = defaults.deduplicationScope;
    	      this.delaySeconds = defaults.delaySeconds;
    	      this.fifoQueue = defaults.fifoQueue;
    	      this.fifoThroughputLimit = defaults.fifoThroughputLimit;
    	      this.kmsDataKeyReusePeriodSeconds = defaults.kmsDataKeyReusePeriodSeconds;
    	      this.kmsMasterKeyId = defaults.kmsMasterKeyId;
    	      this.maxMessageSize = defaults.maxMessageSize;
    	      this.messageRetentionSeconds = defaults.messageRetentionSeconds;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.policy = defaults.policy;
    	      this.receiveWaitTimeSeconds = defaults.receiveWaitTimeSeconds;
    	      this.redriveAllowPolicy = defaults.redriveAllowPolicy;
    	      this.redrivePolicy = defaults.redrivePolicy;
    	      this.sqsManagedSseEnabled = defaults.sqsManagedSseEnabled;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.url = defaults.url;
    	      this.visibilityTimeoutSeconds = defaults.visibilityTimeoutSeconds;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder contentBasedDeduplication(@Nullable Input<Boolean> contentBasedDeduplication) {
            this.contentBasedDeduplication = contentBasedDeduplication;
            return this;
        }

        public Builder contentBasedDeduplication(@Nullable Boolean contentBasedDeduplication) {
            this.contentBasedDeduplication = Input.ofNullable(contentBasedDeduplication);
            return this;
        }

        public Builder deduplicationScope(@Nullable Input<String> deduplicationScope) {
            this.deduplicationScope = deduplicationScope;
            return this;
        }

        public Builder deduplicationScope(@Nullable String deduplicationScope) {
            this.deduplicationScope = Input.ofNullable(deduplicationScope);
            return this;
        }

        public Builder delaySeconds(@Nullable Input<Integer> delaySeconds) {
            this.delaySeconds = delaySeconds;
            return this;
        }

        public Builder delaySeconds(@Nullable Integer delaySeconds) {
            this.delaySeconds = Input.ofNullable(delaySeconds);
            return this;
        }

        public Builder fifoQueue(@Nullable Input<Boolean> fifoQueue) {
            this.fifoQueue = fifoQueue;
            return this;
        }

        public Builder fifoQueue(@Nullable Boolean fifoQueue) {
            this.fifoQueue = Input.ofNullable(fifoQueue);
            return this;
        }

        public Builder fifoThroughputLimit(@Nullable Input<String> fifoThroughputLimit) {
            this.fifoThroughputLimit = fifoThroughputLimit;
            return this;
        }

        public Builder fifoThroughputLimit(@Nullable String fifoThroughputLimit) {
            this.fifoThroughputLimit = Input.ofNullable(fifoThroughputLimit);
            return this;
        }

        public Builder kmsDataKeyReusePeriodSeconds(@Nullable Input<Integer> kmsDataKeyReusePeriodSeconds) {
            this.kmsDataKeyReusePeriodSeconds = kmsDataKeyReusePeriodSeconds;
            return this;
        }

        public Builder kmsDataKeyReusePeriodSeconds(@Nullable Integer kmsDataKeyReusePeriodSeconds) {
            this.kmsDataKeyReusePeriodSeconds = Input.ofNullable(kmsDataKeyReusePeriodSeconds);
            return this;
        }

        public Builder kmsMasterKeyId(@Nullable Input<String> kmsMasterKeyId) {
            this.kmsMasterKeyId = kmsMasterKeyId;
            return this;
        }

        public Builder kmsMasterKeyId(@Nullable String kmsMasterKeyId) {
            this.kmsMasterKeyId = Input.ofNullable(kmsMasterKeyId);
            return this;
        }

        public Builder maxMessageSize(@Nullable Input<Integer> maxMessageSize) {
            this.maxMessageSize = maxMessageSize;
            return this;
        }

        public Builder maxMessageSize(@Nullable Integer maxMessageSize) {
            this.maxMessageSize = Input.ofNullable(maxMessageSize);
            return this;
        }

        public Builder messageRetentionSeconds(@Nullable Input<Integer> messageRetentionSeconds) {
            this.messageRetentionSeconds = messageRetentionSeconds;
            return this;
        }

        public Builder messageRetentionSeconds(@Nullable Integer messageRetentionSeconds) {
            this.messageRetentionSeconds = Input.ofNullable(messageRetentionSeconds);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder namePrefix(@Nullable Input<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        public Builder namePrefix(@Nullable String namePrefix) {
            this.namePrefix = Input.ofNullable(namePrefix);
            return this;
        }

        public Builder policy(@Nullable Input<String> policy) {
            this.policy = policy;
            return this;
        }

        public Builder policy(@Nullable String policy) {
            this.policy = Input.ofNullable(policy);
            return this;
        }

        public Builder receiveWaitTimeSeconds(@Nullable Input<Integer> receiveWaitTimeSeconds) {
            this.receiveWaitTimeSeconds = receiveWaitTimeSeconds;
            return this;
        }

        public Builder receiveWaitTimeSeconds(@Nullable Integer receiveWaitTimeSeconds) {
            this.receiveWaitTimeSeconds = Input.ofNullable(receiveWaitTimeSeconds);
            return this;
        }

        public Builder redriveAllowPolicy(@Nullable Input<String> redriveAllowPolicy) {
            this.redriveAllowPolicy = redriveAllowPolicy;
            return this;
        }

        public Builder redriveAllowPolicy(@Nullable String redriveAllowPolicy) {
            this.redriveAllowPolicy = Input.ofNullable(redriveAllowPolicy);
            return this;
        }

        public Builder redrivePolicy(@Nullable Input<String> redrivePolicy) {
            this.redrivePolicy = redrivePolicy;
            return this;
        }

        public Builder redrivePolicy(@Nullable String redrivePolicy) {
            this.redrivePolicy = Input.ofNullable(redrivePolicy);
            return this;
        }

        public Builder sqsManagedSseEnabled(@Nullable Input<Boolean> sqsManagedSseEnabled) {
            this.sqsManagedSseEnabled = sqsManagedSseEnabled;
            return this;
        }

        public Builder sqsManagedSseEnabled(@Nullable Boolean sqsManagedSseEnabled) {
            this.sqsManagedSseEnabled = Input.ofNullable(sqsManagedSseEnabled);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }

        public Builder url(@Nullable Input<String> url) {
            this.url = url;
            return this;
        }

        public Builder url(@Nullable String url) {
            this.url = Input.ofNullable(url);
            return this;
        }

        public Builder visibilityTimeoutSeconds(@Nullable Input<Integer> visibilityTimeoutSeconds) {
            this.visibilityTimeoutSeconds = visibilityTimeoutSeconds;
            return this;
        }

        public Builder visibilityTimeoutSeconds(@Nullable Integer visibilityTimeoutSeconds) {
            this.visibilityTimeoutSeconds = Input.ofNullable(visibilityTimeoutSeconds);
            return this;
        }
        public QueueState build() {
            return new QueueState(arn, contentBasedDeduplication, deduplicationScope, delaySeconds, fifoQueue, fifoThroughputLimit, kmsDataKeyReusePeriodSeconds, kmsMasterKeyId, maxMessageSize, messageRetentionSeconds, name, namePrefix, policy, receiveWaitTimeSeconds, redriveAllowPolicy, redrivePolicy, sqsManagedSseEnabled, tags, tagsAll, url, visibilityTimeoutSeconds);
        }
    }
}
