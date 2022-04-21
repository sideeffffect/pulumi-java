// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.storagegateway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TapePoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final TapePoolArgs Empty = new TapePoolArgs();

    /**
     * The name of the new custom tape pool.
     * 
     */
    @Import(name="poolName", required=true)
    private Output<String> poolName;

    public Output<String> poolName() {
        return this.poolName;
    }

    /**
     * Tape retention lock time is set in days. Tape retention lock can be enabled for up to 100 years (36,500 days). Default value is 0.
     * 
     */
    @Import(name="retentionLockTimeInDays")
    private @Nullable Output<Integer> retentionLockTimeInDays;

    public Optional<Output<Integer>> retentionLockTimeInDays() {
        return Optional.ofNullable(this.retentionLockTimeInDays);
    }

    /**
     * Tape retention lock can be configured in two modes. When configured in governance mode, AWS accounts with specific IAM permissions are authorized to remove the tape retention lock from archived virtual tapes. When configured in compliance mode, the tape retention lock cannot be removed by any user, including the root AWS account. Possible values are `COMPLIANCE`, `GOVERNANCE`, and `NONE`. Default value is `NONE`.
     * 
     */
    @Import(name="retentionLockType")
    private @Nullable Output<String> retentionLockType;

    public Optional<Output<String>> retentionLockType() {
        return Optional.ofNullable(this.retentionLockType);
    }

    /**
     * The storage class that is associated with the new custom pool. When you use your backup application to eject the tape, the tape is archived directly into the storage class that corresponds to the pool. Possible values are `DEEP_ARCHIVE` or `GLACIER`.
     * 
     */
    @Import(name="storageClass", required=true)
    private Output<String> storageClass;

    public Output<String> storageClass() {
        return this.storageClass;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private TapePoolArgs() {}

    private TapePoolArgs(TapePoolArgs $) {
        this.poolName = $.poolName;
        this.retentionLockTimeInDays = $.retentionLockTimeInDays;
        this.retentionLockType = $.retentionLockType;
        this.storageClass = $.storageClass;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TapePoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TapePoolArgs $;

        public Builder() {
            $ = new TapePoolArgs();
        }

        public Builder(TapePoolArgs defaults) {
            $ = new TapePoolArgs(Objects.requireNonNull(defaults));
        }

        public Builder poolName(Output<String> poolName) {
            $.poolName = poolName;
            return this;
        }

        public Builder poolName(String poolName) {
            return poolName(Output.of(poolName));
        }

        public Builder retentionLockTimeInDays(@Nullable Output<Integer> retentionLockTimeInDays) {
            $.retentionLockTimeInDays = retentionLockTimeInDays;
            return this;
        }

        public Builder retentionLockTimeInDays(Integer retentionLockTimeInDays) {
            return retentionLockTimeInDays(Output.of(retentionLockTimeInDays));
        }

        public Builder retentionLockType(@Nullable Output<String> retentionLockType) {
            $.retentionLockType = retentionLockType;
            return this;
        }

        public Builder retentionLockType(String retentionLockType) {
            return retentionLockType(Output.of(retentionLockType));
        }

        public Builder storageClass(Output<String> storageClass) {
            $.storageClass = storageClass;
            return this;
        }

        public Builder storageClass(String storageClass) {
            return storageClass(Output.of(storageClass));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public TapePoolArgs build() {
            $.poolName = Objects.requireNonNull($.poolName, "expected parameter 'poolName' to be non-null");
            $.storageClass = Objects.requireNonNull($.storageClass, "expected parameter 'storageClass' to be non-null");
            return $;
        }
    }

}
