// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDeleteMarkerReplicationGetArgs;
import com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationGetArgs;
import com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleExistingObjectReplicationGetArgs;
import com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleFilterGetArgs;
import com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleSourceSelectionCriteriaGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketReplicationConfigRuleGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketReplicationConfigRuleGetArgs Empty = new BucketReplicationConfigRuleGetArgs();

    /**
     * Whether delete markers are replicated. This argument is only valid with V2 replication configurations (i.e., when `filter` is used)documented below.
     * 
     */
    @Import(name="deleteMarkerReplication")
    private @Nullable Output<BucketReplicationConfigRuleDeleteMarkerReplicationGetArgs> deleteMarkerReplication;

    public Optional<Output<BucketReplicationConfigRuleDeleteMarkerReplicationGetArgs>> deleteMarkerReplication() {
        return Optional.ofNullable(this.deleteMarkerReplication);
    }

    /**
     * Specifies the destination for the rule documented below.
     * 
     */
    @Import(name="destination", required=true)
    private Output<BucketReplicationConfigRuleDestinationGetArgs> destination;

    public Output<BucketReplicationConfigRuleDestinationGetArgs> destination() {
        return this.destination;
    }

    /**
     * Replicate existing objects in the source bucket according to the rule configurations documented below.
     * 
     */
    @Import(name="existingObjectReplication")
    private @Nullable Output<BucketReplicationConfigRuleExistingObjectReplicationGetArgs> existingObjectReplication;

    public Optional<Output<BucketReplicationConfigRuleExistingObjectReplicationGetArgs>> existingObjectReplication() {
        return Optional.ofNullable(this.existingObjectReplication);
    }

    /**
     * Filter that identifies subset of objects to which the replication rule applies documented below.
     * 
     */
    @Import(name="filter")
    private @Nullable Output<BucketReplicationConfigRuleFilterGetArgs> filter;

    public Optional<Output<BucketReplicationConfigRuleFilterGetArgs>> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * Unique identifier for the rule. Must be less than or equal to 255 characters in length.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Object key name prefix identifying one or more objects to which the rule applies. Must be less than or equal to 1024 characters in length.
     * 
     */
    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    /**
     * The priority associated with the rule. Priority should only be set if `filter` is configured. If not provided, defaults to `0`. Priority must be unique between multiple rules.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * Specifies special object selection criteria documented below.
     * 
     */
    @Import(name="sourceSelectionCriteria")
    private @Nullable Output<BucketReplicationConfigRuleSourceSelectionCriteriaGetArgs> sourceSelectionCriteria;

    public Optional<Output<BucketReplicationConfigRuleSourceSelectionCriteriaGetArgs>> sourceSelectionCriteria() {
        return Optional.ofNullable(this.sourceSelectionCriteria);
    }

    /**
     * The status of the rule. Either `&#34;Enabled&#34;` or `&#34;Disabled&#34;`. The rule is ignored if status is not &#34;Enabled&#34;.
     * 
     */
    @Import(name="status", required=true)
    private Output<String> status;

    public Output<String> status() {
        return this.status;
    }

    private BucketReplicationConfigRuleGetArgs() {}

    private BucketReplicationConfigRuleGetArgs(BucketReplicationConfigRuleGetArgs $) {
        this.deleteMarkerReplication = $.deleteMarkerReplication;
        this.destination = $.destination;
        this.existingObjectReplication = $.existingObjectReplication;
        this.filter = $.filter;
        this.id = $.id;
        this.prefix = $.prefix;
        this.priority = $.priority;
        this.sourceSelectionCriteria = $.sourceSelectionCriteria;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketReplicationConfigRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketReplicationConfigRuleGetArgs $;

        public Builder() {
            $ = new BucketReplicationConfigRuleGetArgs();
        }

        public Builder(BucketReplicationConfigRuleGetArgs defaults) {
            $ = new BucketReplicationConfigRuleGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder deleteMarkerReplication(@Nullable Output<BucketReplicationConfigRuleDeleteMarkerReplicationGetArgs> deleteMarkerReplication) {
            $.deleteMarkerReplication = deleteMarkerReplication;
            return this;
        }

        public Builder deleteMarkerReplication(BucketReplicationConfigRuleDeleteMarkerReplicationGetArgs deleteMarkerReplication) {
            return deleteMarkerReplication(Output.of(deleteMarkerReplication));
        }

        public Builder destination(Output<BucketReplicationConfigRuleDestinationGetArgs> destination) {
            $.destination = destination;
            return this;
        }

        public Builder destination(BucketReplicationConfigRuleDestinationGetArgs destination) {
            return destination(Output.of(destination));
        }

        public Builder existingObjectReplication(@Nullable Output<BucketReplicationConfigRuleExistingObjectReplicationGetArgs> existingObjectReplication) {
            $.existingObjectReplication = existingObjectReplication;
            return this;
        }

        public Builder existingObjectReplication(BucketReplicationConfigRuleExistingObjectReplicationGetArgs existingObjectReplication) {
            return existingObjectReplication(Output.of(existingObjectReplication));
        }

        public Builder filter(@Nullable Output<BucketReplicationConfigRuleFilterGetArgs> filter) {
            $.filter = filter;
            return this;
        }

        public Builder filter(BucketReplicationConfigRuleFilterGetArgs filter) {
            return filter(Output.of(filter));
        }

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        public Builder sourceSelectionCriteria(@Nullable Output<BucketReplicationConfigRuleSourceSelectionCriteriaGetArgs> sourceSelectionCriteria) {
            $.sourceSelectionCriteria = sourceSelectionCriteria;
            return this;
        }

        public Builder sourceSelectionCriteria(BucketReplicationConfigRuleSourceSelectionCriteriaGetArgs sourceSelectionCriteria) {
            return sourceSelectionCriteria(Output.of(sourceSelectionCriteria));
        }

        public Builder status(Output<String> status) {
            $.status = status;
            return this;
        }

        public Builder status(String status) {
            return status(Output.of(status));
        }

        public BucketReplicationConfigRuleGetArgs build() {
            $.destination = Objects.requireNonNull($.destination, "expected parameter 'destination' to be non-null");
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            return $;
        }
    }

}
